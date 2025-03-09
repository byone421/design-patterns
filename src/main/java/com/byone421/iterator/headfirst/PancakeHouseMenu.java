package com.byone421.iterator.headfirst;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addMenuItem("小炒黄牛肉", "好吃", false, 9.9);
        addMenuItem("手撕包菜", "好吃", false, 1.9);

    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }

    public void addMenuItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}