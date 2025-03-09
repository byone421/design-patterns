package com.byone421.decorator.headfirst;

/**
 * 希望在咖啡的容量大小，提供 小杯，中杯，大杯给顾客选择。所以在Beverage类中加上了getSize()和setSize()。
 * 比如小杯1元 中杯2元 大杯3元
 */
//public class Soy extends CondimentDecorator {
////    Beverage beverage;
////
////    public Soy(Beverage beverage) {
////        this.beverage = beverage;
////    }
////
////    @Override
////    public double cost() {
////        double cost = beverage.cost();
////        if (getSize() == Beverage.TALL) {
////            cost += 1;
////        } else if (getSize() == Beverage.GRANDE) {
////            cost += 2;
////        } else if (getSize() == Beverage.VENTI) {
////            cost += 3;
////        }
////
////        return cost;
////    }
////
////    @Override
////    public String getDescription() {
////        return beverage.getDescription() + ", Soy";
////    }
//}
