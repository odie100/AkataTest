package com.akata.test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Question3 {

    public static void main(String[] args) {
        //Static example for the list L:(Question3)
        List<Integer> L = new ArrayList<>();
        L.add(2);
        L.add(2);
        L.add(4);
        L.add(5);
        L.add(4);
        L.add(6);
        L.add(4);
        System.out.println(duplication(L));
    }

    public static List<Integer> duplication(List<Integer> L){
        List<Integer> result = new ArrayList<>();
        Hashtable<Integer, Integer> dict = new Hashtable<>();
        for (Integer integer : L) {
            if (dict.containsKey(integer)) {
                dict.put(integer, dict.get(integer) + 1);
                if (dict.get(integer) > 0 && !result.contains(integer)) {
                    result.add(integer);
                }
            }else{
                dict.put(integer,0);
            }
        }
        return result;
    }
}
