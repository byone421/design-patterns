package com.byone421.combination.heima;

public class MenuItem extends MenuComponent{
    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }
    @Override
    public void print() {
        //打印菜单项的名称
        for(int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
