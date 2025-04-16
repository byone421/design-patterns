package com.byone421.proxy.staticproxy;



public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("TrainStation SellTickets");
    }
}
