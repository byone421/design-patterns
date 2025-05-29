package com.byone421.combination.zst;

import java.util.List;

/**
 * 组合模式：
 *  意图： 将对象组合成树形结构来表示“部分和整体”的层次结构。Composite模式使得用户对单个对象和组合对象的使用具有一致性
 *  适用性：
 *      - 想表示对象的部分-整体层次结构。
 *      - 希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
 */
public class CompositePattern {
    public static void main(String[] args) {
        // 父类名 对象名 = new 子类名();
        AbstractFile root = new Folder("root");

        AbstractFile folderA = new Folder("folderA");
        AbstractFile folderB = new Folder("folderB");

        AbstractFile fileC = new File("fileC");
        AbstractFile fileD = new File("fileD");
        AbstractFile fileE = new File("fileE");

        root.Add(folderA);
        root.Add(folderB);
        root.Add(fileC);

        folderA.Add(fileD);
        folderA.Add(fileE);

        print(root);
    }

    static void print(AbstractFile file){
        file.printName();

        List<AbstractFile> childrenList = file.getChildren();
        if (childrenList == null){
            return;
        }

        for (AbstractFile children : childrenList) {
            print(children);
        }
    }
}
