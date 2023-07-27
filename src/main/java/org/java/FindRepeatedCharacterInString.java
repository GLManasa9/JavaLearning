package org.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

public class FindRepeatedCharacterInString {
    public static void main(String[] args){
        String s="selenium";
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//        out.println("Enter name:");
//        s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(characterIntegerMap.containsKey(ch))
                characterIntegerMap.put(ch,characterIntegerMap.get(ch)+1);
            else
                characterIntegerMap.put(ch,1);
        }

        int max1 = 0,max2=0;
        char ch_1 = Character.MIN_VALUE,ch_2=Character.MIN_VALUE;
        for(Map.Entry entry:characterIntegerMap.entrySet()){
            int entryValue = (int) entry.getValue();
            if(entryValue>max1) {
                max1 = entryValue;
                ch_1= (char) entry.getKey();
            }
            else if(entryValue<max1 && entryValue>=max2){
                max2=entryValue;
                ch_2 = (char)entry.getKey();
            }
        }

        out.println("ch_1:"+ch_1);
        out.println("ch_2:"+ch_2);
        out.println(characterIntegerMap);
    }
}
