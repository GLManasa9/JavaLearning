package org.example;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a ={3,5,9,10};
        int[] b ={11,2,4,90,7,6};
        int[] mergedArray = new int[a.length+b.length];
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0,j=0;i<mergedArray.length;j++) {
            if(j<a.length)
                mergedArray[i++]=a[j];

            if(j<b.length)
                mergedArray[i++]=b[j];
        }
        Arrays.sort(mergedArray);
        System.out.println("Merged Array : "+Arrays.toString(mergedArray));
    }
}
