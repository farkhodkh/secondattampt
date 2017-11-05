package ru.haknazarovfarkhod.edisoft.tasr1;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by USER on 04.11.2017.
 */
public class TreeControler {

    /**
     *
     * @param level = Number of levels
     * @return
     * @throws Exception
     */
    public Map DefaultTree(Integer level) throws Exception{
        Map treeMap = (Map) new TreeMap<>();
        Integer i = 0;

        addNewLevel(treeMap, level, i);

        return treeMap;
    }

    /**
     *
     * @param treeMap = incoming Map for calculate
     * @param level = max level to be created
     * @param i = current numbers of levelf
     */
    private void addNewLevel(Map treeMap, Integer level, Integer i){

        if (i < level) {
            Map newLevel = (Map) new TreeMap<>();
            i++;
            addNewLevel(newLevel, level, i);

            treeMap.put("key" + i.toString(), newLevel);
        }
    }

    public Integer getHightOfTree(Map simpleTree) {
        Integer maxHight = 0;
        //maxHight = getLevelOfEntry(simpleTree, maxHight);
        maxHight = getMaxLevelOfEntry(simpleTree, maxHight);
        return maxHight;
    }

    public static Integer getMaxLevelOfEntry(Map entries, Integer maxHight){
        Set setEntries = entries.entrySet();
        Integer numberOfCurrentLevels = 0;
        Iterator iterator = setEntries.iterator();
        while (iterator.hasNext()) {
            maxHight++;
            Map.Entry entry = (Map.Entry) iterator.next();
            Object lineValue = entry.getValue();
            if(lineValue instanceof Map){
                maxHight = getMaxLevelOfEntry((Map) entry.getValue(), maxHight);
            }
        }
        return maxHight;
    }
}
