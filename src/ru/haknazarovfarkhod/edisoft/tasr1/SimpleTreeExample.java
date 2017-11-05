package ru.haknazarovfarkhod.edisoft.tasr1;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by USER on 04.11.2017.
 */
public class SimpleTreeExample {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of levels of Tree:");
        Integer level = scan.nextInt();

        SimpleTreeExample simpleTreeExample = new SimpleTreeExample();
        TreeControler treeControler = new TreeControler();

        Map defaultTree = treeControler.DefaultTree(level);
        System.out.println("entrySet: " + defaultTree.entrySet());

        Integer maxHight = treeControler.getHightOfTree(defaultTree);
        System.out.println("Hight of tree is " + maxHight.toString());
    }
}
