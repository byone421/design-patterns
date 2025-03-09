package com.byone421.command;

import java.util.Map;
import java.util.function.BiConsumer;

public class OrderCommand implements Command{

    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.receiver = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getTableId() + "桌的订单：");
        Map<String, Integer> foodMap = order.getFoodMap();
        foodMap.forEach((BiConsumer<String, Object>) (foodName, object) -> receiver.makeFood(foodName, 10));
        System.out.println(order.getTableId() + "桌的订单完成");
    }
}
