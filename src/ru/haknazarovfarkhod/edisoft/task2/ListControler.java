package ru.haknazarovfarkhod.edisoft.task2;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by USER on 05.11.2017.
 */
public class ListControler {
    public static void main(String[] args) {

        SimpleArrayList simpleArrayList = new SimpleArrayList();

        ArrayList arrayList = simpleArrayList.simpleArrayList();
        System.out.println("Original array list: " + arrayList);

        ListIterator iterator = arrayList.listIterator();

        //Загоняю в HashSet для получения уникальных значений
        HashSet hashSet = new HashSet(arrayList);

        ArrayList firstArrayList = new ArrayList();
        firstArrayList.addAll(arrayList);

        ArrayList secondArrayList = new ArrayList();

        Iterator setIterator = hashSet.iterator();

        //1. Удалить из List числа, повторяющиеся три и больше раз подряд
        HashMap totalFound = new HashMap<Integer, ArrayList>();

        ListIterator arrListIterator = firstArrayList.listIterator();
        while(setIterator.hasNext()){
            Integer currItem = (Integer) setIterator.next();
            //Получить количество повторений значения
            int repeats = Collections.frequency(firstArrayList, currItem);
            //Если повторений больше или равно трем
            if(repeats>=3) {
                ArrayList indexArray = new ArrayList();
                Integer count = 0;
                //++Проверка последовательности повторений
                while (repeats > 0) {
                    if(currItem.equals(arrListIterator.next())) {
                        indexArray.add(arrListIterator.nextIndex());
                        count++;
                        repeats--;
                    }else if(count<3){
                        indexArray.clear();
                        count = 0;
                    }
                }
                //--Проверка последовательности повторений

                //Если найденных повторений больше трех, сохраним в общий список
                if(indexArray.size()>=3){
                    Collections.sort(indexArray,Collections.reverseOrder());
                    totalFound.put(currItem,indexArray);
                }
            }
        }

        //Обход с удалением общего списка повторений
        for (Object value : totalFound.values()) {
            ArrayList valueArrayList = ((ArrayList) value);
            ListIterator valueIterator = valueArrayList.listIterator();

            while(valueIterator.hasNext()){
                Integer index = (Integer) valueIterator.next();
                firstArrayList.remove(index-1);
            }
        }

        System.out.println("Example of first part:" + firstArrayList);

        //2. Удалить из List числа, повторяющиеся три и больше раз не обязательно подряд

        //Обратно копирую из HashSet
        secondArrayList.addAll(hashSet);

        System.out.println("Example of second part:" + secondArrayList);
        Boolean b = true;
    }
}
