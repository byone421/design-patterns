package com.byone421.command;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private String tableId;

    private Map<String,Integer> foodMap = new HashMap<>();


    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public Map<String, Integer> getFoodMap() {
        return foodMap;
    }

    public void setFood(String name,int num) {
        foodMap.put(name,num);
    }


}
