package org.java;

public class RotateAndCompare {

    public static void main(String[] args){
        String s1="sample",s2="mplesa";
        RotateAndCompare rotateAndCompare = new RotateAndCompare();
        boolean b = rotateAndCompare.rotateAndComp(s1,s2);
        System.out.println("boolean value:"+b);
    }

    boolean rotateAndComp(String s1,String s2){
        String temp = s1;
        if(s1.length()!=s2.length())
            return false;
        else if(s2.length()==s1.length()){
            for(int i=1;i<s1.length();i++){
                String s3=rotate(temp);
                System.out.println("round "+i+":"+s3);
                if(s3.equals(s2))
                    return true;
                else
                    temp = s3;
            }
        }
        return false;
    }

    String rotate(String s){
        char[] array = s.toCharArray();
        char last = s.charAt(s.length()-1);
        for(int i=s.length()-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=last;
        return String.valueOf(array);
    }
}