package com.byone421.observer.zst;

/**
 * 观察者模式:
 *  意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所以依赖它的对象都会得到通知并且被自动更新。
 *  适用性：
 *      - 当一个抽象模型有两个方面，其中一个方面依赖于另一个方面，将这两者封装在独立的对象中以使它们可以各自独立地改变和复用。
 *      - 当对一个对象的改变需要同时改变其他对象，而不知道具体有多少对象有待改变时。
 *      - 当一个对象必须通知其他对象，而它又不能假定其他对象是谁，即不希望这些对象是紧耦合的。
 */
public class ObserverPattern {
    public static void main(String[] args) {

        Subject subjectA = new ConcreteSubject("目标A");

        Observer observerB = new ConcreteObserver("张三",subjectA);
        Observer observerC = new ConcreteObserver("李四",subjectA);
        Observer observerD = new ConcreteObserver("王五",subjectA);

        subjectA.setState("更新了");
    }
}
