package com.byone421.observer.zst;

public interface Subject {//主题（目标接口）
    void Attach(Observer observer); // 添加观察者

    void Detach(Observer observer); // 删除观察者

    void Notify(); // 状态改变后，通知所有观察者

    void setState(String state); // 设置状态（改变状态）

    String getState(); // 获取状态
}
