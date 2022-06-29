package com.akata.test;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

    public static void main(String[] args) {
        //A static example for the List (Question1)
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        System.out.println(estTrie(L));
    }

    public static boolean estTrie(List<Integer> L){
        boolean result = true;
        for (int i = 0; i < L.size() - 1; i++) {
            if (L.get(i) > L.get(i + 1)) {
                result = false;
                break;
            }
        }
        return result;
    }

}
