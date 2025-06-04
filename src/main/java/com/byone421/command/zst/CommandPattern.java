package com.byone421.command.zst;

/**
 * 命令模式：
 * 意图：将一个请求封装为一个对象，从而使得可以用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。
 * 适用性：
 * - 抽象出待执行的动作以参数化某对象。
 * - 在不同的时刻指定、排列和执行请求。
 * - 支持取消操作。
 * - 支持修改日志。
 * - 用构建在原语操作上的高层操作构造一个系统。
 */
public class CommandPattern {
    public static void main(String[] args) {

        Tv tv = new Tv(); // 接收者 对象 电视机

        Command onCommand = new OnCommand(tv); // 命令对象 开机命令
        Command offCommand = new OnCommand(tv); // 命令对象 关机命令

        Invoker invoker = new Invoker(); //请求者
        invoker.setCommand(onCommand); // 给请求者设置 开机 命令
        invoker.call(); // 请求者去请求命令

        System.out.println("==============分割线===============");

        invoker.setCommand(offCommand); // 给请求者设置 关机命令
        invoker.call(); // 请求者去请求命令
    }

}
