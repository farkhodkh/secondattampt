package ru.haknazarovfarkhod.edisoft;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by USER on 04.11.2017.
 */
public class SimpleTreeExample {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of levels:");
        Integer level = scan.nextInt();

//        System.out.println("Input number of child lins:");
//        Integer lines = scan.nextInt();

        SimpleTreeExample simpleTreeExample = new SimpleTreeExample();
        TreeControler treeControler = new TreeControler();
//        Map simpleTree = simpleTreeExample.SimpleTree(level, lines);
//        System.out.println("entrySet: " + simpleTree.entrySet());

        Map defaultTree = treeControler.DefaultTree(level);
        System.out.println("entrySet: " + defaultTree.entrySet());

        Integer maxHight = treeControler.getHightOfTree(defaultTree);
        System.out.println("Hight of tree is " + maxHight.toString());
    }
}
