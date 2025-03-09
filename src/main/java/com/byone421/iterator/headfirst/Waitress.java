package com.byone421.iterator.headfirst;

import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;


    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator iterator = pancakeHouseMenu.createIterator();
        Iterator iterator1 = dinerMenu.createIterator();
        System.out.println("-------------------------");
        printMenu(iterator);
        System.out.println("-------------------------");
        printMenu(iterator1);

    }
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem next = (MenuItem) iterator.next();
            System.out.println(next.getName());
        }
    }
}
