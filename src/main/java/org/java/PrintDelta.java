package org.java;

import java.util.ArrayList;
import java.util.List;

public class PrintDelta {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {3, 4, 5, 6};
        //1,2,5,6
        printDelta(a1, a2);
        printDelta(a2, a1);
    }

    static void printDelta(int[] a1, int[] a2) {
        List<Integer> delta = new ArrayList<Integer>();
        for (int i : a1) {
            boolean flag = false;
            for (int j : a2) {
                if (i == j)
                    flag = true;
            }
            if (!flag)
                delta.add(i);
        }
        for (int i : delta)
            System.out.println(i);
    }
}