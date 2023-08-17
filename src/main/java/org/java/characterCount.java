package org.java;

import java.util.HashMap;

public class characterCount {
    public static void main(String[] args){
        String com = "cognizant";
        HashMap<Character,Integer> characterIntegerHashMap = new HashMap<>();
        for(Character chart:com.toCharArray()){
            int charCount = (int) com.chars().filter(ch->(ch==chart)).count();
            if(!characterIntegerHashMap.containsKey(chart))
                characterIntegerHashMap.put(chart,charCount);
        }
        System.out.println(characterIntegerHashMap.entrySet());
    }
}
