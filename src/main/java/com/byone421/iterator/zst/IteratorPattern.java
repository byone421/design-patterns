package com.byone421.iterator.zst;


/**
 * 迭代器：
 *   意图：提供一种方式顺序访问聚合对象的各个元素，且无需暴露对象的内部表示
 *   适用性：
 *    - 访问一个聚合对象的内容而无须暴露它的内部表示。
 *    - 支持对聚合对象的多种遍历。
 *    - 为遍历不同的聚合结构提供一个统一的接口。
 */
public class IteratorPattern {

    public static void main(String[] args) {
        BookAggregate bookAggregate = new BookAggregate();

        String[] books = {"数据结构","操作系统","计算机网络","计算机组成原理"};
        double[] prices = {10.24,20.48,40.96,81.92};

        for (int i = 0; i < 4; i++) {
            bookAggregate.Add(new Book(books[i],prices[i]));
        }

        Iterator iterator = bookAggregate.CreateIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("书名：" + book.getName() + " 价格：" + book.getPrice());
        }

    }
}
