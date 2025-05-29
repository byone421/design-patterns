package com.byone421.memento.zst;

/**
 * 备忘录模式：
 *  意图：在不破坏封装性的前提下捕获一个类的内部状态，并在对象之外保存这个状态，这样以后就可以将对象恢复到原先保存的状态。
 *  适用性：
 *      - 必须保存一个对象在某一个时刻的（部分）状态，这样以后需要时它才能恢复到先前的状态。
 *      - 如果一个用接口来让其他对象直接得到这些状态，将会暴露对象的实现细节并破坏对象的封装性。
 *
 */
public class MementoPattern {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("1024");
        Memento backup1 = originator.createMemento();
        caretaker.addMemento(backup1);

        originator.setState("2048");
        Memento backup2 = originator.createMemento();
        caretaker.addMemento(backup2);

        originator.setState("4096");
        Memento backup3 = originator.createMemento();
        caretaker.addMemento(backup3);

        System.out.println(originator.getState());
        caretaker.showMemento();

        Memento memento1 = caretaker.getMemento(2);
        originator.setState(memento1.getState());

        System.out.println("根据第2次备份还原之后的状态为：" + originator.getState());
    }
}
