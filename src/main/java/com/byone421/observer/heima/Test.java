package com.byone421.observer.heima;

public class Test {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();
        //2,订阅公众号
        subject.attach(new WeiXinUser("孙悟空"));
        subject.attach(new WeiXinUser("猪悟能"));
        subject.attach(new WeiXinUser("沙悟净"));
        //3,公众号更新，发出消息给订阅者（观察者对象）
        subject.notify("传智黑马的专栏更新了！");
    }
}
