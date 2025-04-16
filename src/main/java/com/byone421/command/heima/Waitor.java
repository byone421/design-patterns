package com.byone421.command.heima;

import java.util.ArrayList;
import java.util.List;

/**
 * 发起者
 *  持有抽象命令
 * 具体命令
 *    持有接受这
 */
public class Waitor {

    private List<Command> orders  = new ArrayList<>();

    public void setCommand(Command command) {
        this.orders.add(command);
    }

    public void orderUp(){
        orders.forEach(command -> {
            if (command != null) {
                command.execute();
            }
        });
    }
}
