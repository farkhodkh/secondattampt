package ru.haknazarovfarkhod.edisoft.task2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by USER on 05.11.2017.
 */
public class SimpleArrayList {

    public ArrayList<Integer> simpleArrayList (){
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(15);
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(8);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);

        //System.out.println(arrayList.indexOf(15));
        int count = Collections.frequency(arrayList, 15);
       // System.out.println(count);
//        Object listLine = arrayList.get(2);
//        arrayList.remove(listLine);
        return arrayList;
    }



}
