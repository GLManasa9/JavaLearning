package org.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class FindVowelCount {
    public static void main(String[] args){
        String str = "indium software private limited";
        long vowelsCount = 0,consonantsCount=0,aCount,eCount,iCount,oCount,uCount;
        boolean s = str.chars().anyMatch(ch->ch=='a');
        out.println(s);
        vowelsCount = str.chars().filter(ch -> (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' || ch == 'u')).count();
        consonantsCount = str.chars().filter(ch -> (ch != 'a' && ch != 'e' &&
                        ch != 'i' && ch != 'o' && ch != 'u'))
                .filter(ch -> (ch >= 'a' && ch <= 'z')).count();

        aCount = str.chars().filter(ch -> (ch == 'a')).count();
        eCount = str.chars().filter(ch -> (ch == 'e')).count();
        iCount = str.chars().filter(ch -> (ch == 'i')).count();
        oCount = str.chars().filter(ch -> (ch == 'o')).count();
        uCount = str.chars().filter(ch -> (ch == 'u')).count();
        out.println(aCount);
        out.println(eCount);
        out.println(iCount);
        out.println(oCount);
        out.println(uCount);
        out.println(vowelsCount);
        out.println(consonantsCount);
    }
}
