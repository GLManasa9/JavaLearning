package org.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample_3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 35, 42, 54);
        Comparator<Integer> cm = (o1, o2) -> (o1%10>o2%10)?1:-1;
        Collections.sort(nums, cm);
        System.out.println(nums);
    }
}
