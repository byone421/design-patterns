package com.byone421.iterator.headfirst;

import java.util.Iterator;

public class DinerMenu implements Menu{

    MenuItem[] menuItems;
    static final int MAX = 2;
    int numberOfItems= 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX];
        addMenuItem("辣椒炒肉","DinerMenu",false,9.9);
        addMenuItem("西红柿蛋汤","DinerMenu",true,1.9);

    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public  void addMenuItem(String name,String desc,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,desc,vegetarian,price);

        if(numberOfItems >= MAX){
            System.out.println("菜单已经满了，无法添加");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems +1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
