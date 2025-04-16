package com.byone421.command.heima;

public class Client {
    public static void main(String[] args) {

        //创建第一个订单对象
        Order order1 = new Order();
        order1.setTableId("1");
        order1.setFood("西红柿鸡蛋面",1);
        order1.setFood("小杯可乐",2);

        //创建第二个订单对象
        Order order2 = new Order();
        order2.setTableId("2");
        order2.setFood("尖椒肉丝盖饭",1);
        order2.setFood("小杯雪碧",1);

        SeniorChef seniorChef = new SeniorChef();

        OrderCommand orderCommand = new OrderCommand(seniorChef,order1);
        OrderCommand orderCommand2 = new OrderCommand(seniorChef,order2);

        Waitor waitor = new Waitor();
        waitor.setCommand(orderCommand);
        waitor.setCommand(orderCommand2);
        waitor.orderUp();
    }
}
