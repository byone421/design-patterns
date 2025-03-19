# 策略模式
该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用
算法的客户。策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分
割开来，并委派给不同的对象对这些算法进行管理。
## 主要角色
- 抽象策略（Strategy）类：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有
的具体策略类所需的接口。
- 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现或行
为。
- 环境（Context）类：持有一个策略类的引用，最终给客户端调
 
  ![img.png](src/main/resources/img/strategy.png)

## 代码和类图文件
代码：com.byone421.strategy

类图源文件：resources/drawio/策略模式.drawio






# 装饰者模式
旨在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式。
## 主要角色
- 抽象构件（Component）角色 ：定义一个抽象接口以规范准备接收附加责任的对象。
- 具体构件（Concrete Component）角色 ：实现抽象构件，通过装饰角色为其添加一些职责。
- 抽象装饰（Decorator）角色 ： 继承或实现抽象构件，并包含具体构件的实例，可以通过其子
类扩展具体构件的功能。
- 具体装饰（ConcreteDecorator）角色 ：实现抽象装饰的相关方法，并给具体构件对象添加附
加的责任。 

  ![img.png](src/main/resources/img/decorator.png)

## 代码和类图文件
代码：com.byone421.decorator

类图源文件：resources/drawio/装饰者模式.drawio


# 工厂模式
## 简单工厂
简单工厂不是一种设计模式，反而比较像是一种编程习惯。
### 主要角色
- 抽象产品 ：定义了产品的规范，描述了产品的主要特性和功能。
- 具体产品 ：实现或者继承抽象产品的子类
- 具体工厂 ：提供了创建产品的方法，调用者通过该方法来获取产品。

  ![img.png](src/main/resources/img/simple_factory.png)

## 工厂方法 
定义一个用于创建对象的接口，让子类决定实例化哪个产品类对象。工厂方法使一个产品类的实例化延
迟到其工厂的子类。
### 主要角色
- 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂
方法来创建产品。
- 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
- 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
- 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同
具体工厂之间一一对应。

![img.png](src/main/resources/img/method_factory.png)

### 抽象工厂
是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就
能得到同族的不同等级的产品的模式结构。
抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生
产多个等级的产品。

### 主要角色
- 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法，可以
创建多个不同等级的产品。
- 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创
建。
- 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多
个抽象产品。
- 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它
同具体工厂之间是多对一的关系。
![img.png](src/main/resources/img/abstract_factory1.png)
![img.png](src/main/resources/img/abstract_factory2.png)
## 代码和类图文件
代码：com.byone421.factory

类图源文件：resources/drawio/工厂模式.drawio

# 模板方法
定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情
况下重定义该算法的某些特定步骤。

## 主要角色
* 抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。

  * 模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法。

  * 基本方法：是实现算法各个步骤的方法，是模板方法的组成部分。基本方法又可以分为三种：

    * 抽象方法(Abstract Method) ：一个抽象方法由抽象类声明、由其具体子类实现。

    * 具体方法(Concrete Method) ：一个具体方法由一个抽象类或具体类声明并实现，其子类可以进行覆盖也可以直接继承。

    * 钩子方法(Hook Method) ：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。

      一般钩子方法是用于判断的逻辑方法，这类方法名一般为isXxx，返回值类型为boolean类型。

* 具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的组成步骤。

![img.png](src/main/resources/img/template.png)

## 代码和类图文件
代码：com.byone421.templatemethod

类图源文件：resources/drawio/模板方法.drawio

# 单例模式

详细请看：resources/md/单件模式.md
