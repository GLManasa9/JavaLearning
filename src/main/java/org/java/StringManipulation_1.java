package org.java;

import static java.lang.System.out;

public class StringManipulation_1 {
    public static void main(String[] args) {
        String s = "santhosh";
        char[] s1 = new char[s.length()/2];
        char[] s2 = new char[s.length()/2];

//        first approach
        for (int i=0,j=0,k=0; i < s.length(); i++) {
            if(i%2==0)
                s1[j++]=s.charAt(i);
            else
                s2[k++]=s.charAt(i);
        }
//        second approach
        for (int i=0,j=1,k=0,l=0; i < s.length(); i+=2,j+=2) {
            s1[k++]=s.charAt(i);
            s2[l++]=s.charAt(j);
        }
        out.println(s1);
        out.println(s2);
    }
}
