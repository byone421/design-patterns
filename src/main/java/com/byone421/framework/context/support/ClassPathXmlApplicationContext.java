package com.byone421.framework.context.support;



import com.byone421.framework.beans.BeanDefinition;
import com.byone421.framework.beans.MutablePropertyValues;
import com.byone421.framework.beans.PropertyValue;
import com.byone421.framework.beans.factory.support.BeanDefinitionRegistry;
import com.byone421.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.byone421.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * @version v1.0
 * @ClassName: ClassPathXmlApplicationContext
 * @Description: IOC容器具体的子实现类
 *          用于加载类路径下的xml格式的配置文件
 * @Author: 黑马程序员
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        //构建解析器对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try{
            this.refresh();
        } catch (Exception e) {

        }
    }

    //根据bean对象的名称获取bean对象
    public Object getBean(String name) throws Exception {
        //判断对象容器中是否包含指定名称的bean对象，如果包含，直接返回即可，如果不包含，需要自行创建
        Object obj = singletonObjects.get(name);
        if (obj != null) {
            return obj;
        }

        //获取BeanDefinition对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        //获取bean信息中的className
        String className = beanDefinition.getClassName();
        //通过反射创建对象
        Class<?> clazz = Class.forName(className);
        Object beanObj = clazz.newInstance();

        //进行依赖注入操作
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            //获取name属性值
            String propertyName = propertyValue.getName();
            //获取value属性
            String value = propertyValue.getValue();
            //获取ref属性
            String ref = propertyValue.getRef();
            if(ref != null && !"".equals(ref)) {
                //获取依赖的bean对象
                Object bean = getBean(ref);
                //拼接方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                //获取所有的方法对象
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (methodName.equals(method.getName())) {
                        //执行该setter方法
                        method.invoke(beanObj,bean);
                    }
                }
            }

            if(value != null && !"".equals(value)) {
                //拼接方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                //获取method对象
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(beanObj,value);
            }
        }

        //在返回beanObj对象之前，将该对象存储到map容器中
        singletonObjects.put(name,beanObj);
        return beanObj;
    }

    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if(bean == null) {
            return null;
        }
        return clazz.cast(bean);
    }
}
