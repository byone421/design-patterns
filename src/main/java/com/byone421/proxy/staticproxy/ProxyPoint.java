package com.byone421.proxy.staticproxy;

public class ProxyPoint implements SellTickets{

    //声明火车站类对象
    private TrainStation trainStation  = new TrainStation();

    @Override
    public void sell() {
        System.out.println("中间商（ProxyPoint）");
        trainStation.sell();
    }
}
