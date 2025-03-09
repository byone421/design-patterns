package com.byone421.proxy.jdkproxy;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("TrainStation SellTickets");
    }
}
