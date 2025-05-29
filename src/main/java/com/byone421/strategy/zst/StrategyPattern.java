package com.byone421.strategy.zst;

/**
 * 策略模式：
 *   意图: 定义一系列算法，把它们一个个封装起来，并且使他们之间可以相互替换。使得算法可以独立于客户而变化
 *   适用性：
 *      -  许多相关的类仅仅是行为有异。
 *      -  需要使用一个算法的不同变体。
 *      -  算法使用客户不应该知道的数据。可使用策略模式以避免暴露复杂的、与算法相关的数据结构。
 *      -  一个类定义了多种行为，并且这些行为在这个类的操作中以多个条件语句的形式出现，将相关的条件分支移入它们各自的 Strategy 类中，以代替这些条 件语句。
 */
public class StrategyPattern {


    public static void main(String[] args) {

        OperationContext context = new OperationContext(new Addstrategy());
        context.Operation(20,17);

        context = new OperationContext(new Substrategy());
        context.Operation(20,17);

        context = new OperationContext(new Multstrategy());
        context.Operation(20,17);
    }

}
