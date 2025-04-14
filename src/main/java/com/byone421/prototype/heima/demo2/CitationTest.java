package com.byone421.prototype.heima.demo2;

import java.io.*;

public class CitationTest {
    public static void main(String[] args) throws Exception {

        try {
            //1，创建原型对象
            Citation citation = new Citation();
            //创建张三学生对象
            Student stu = new Student();
            stu.setName("张三");
            citation.setStu(stu);

            //创建对象输出流对象
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
            //写对象
            oos.writeObject(citation);
            //释放资源
            oos.close();

            //创建对象输入流对象
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
            //读取对象
            Citation citation1 = (Citation) ois.readObject();
            //释放资源
            ois.close();
            Student stu1 = citation1.getStu();
            stu1.setName("李四");

            citation.show();
            citation1.show();
        }finally {
            File file = new File("a.txt");
            if(file.exists()){
                file.delete();
            }
        }

    }
}
