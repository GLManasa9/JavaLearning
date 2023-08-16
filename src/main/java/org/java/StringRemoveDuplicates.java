package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringRemoveDuplicates {
    public static void main(String[] args) {
        String mystr = "iiiiii aammmm wwwooorrrkiiinnggg";
        String[] strArray = mystr.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : strArray) {
            char[] ch = s.toCharArray();
            sb.append(removeDuplicates(ch));
            sb.append(" ");
        }
        System.out.println(sb);
    }

    static String removeDuplicates(char[] charArray){
        List<Character> characterArray = new ArrayList<>();
        for(char ch:charArray){
            if(!characterArray.contains(ch))
                characterArray.add(ch);
        }
        System.out.println("s="+ characterArray);
        return characterArray.stream().map(Object::toString).collect(Collectors.joining());
    }
}
