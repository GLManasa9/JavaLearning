package org.java;

public class RotateArray {
    static int[] array = {1,2,3,4,5,6};

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //1,2,3,4 and positions shift - 2
        int position_shift = 3;
        for(int i=1;i<=position_shift;i++){
            rotateArray();
        }

        for(int i:array)
            System.out.println(i);
    }
    static void rotateArray(){
        int last = array[array.length-1];
        for(int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=last;
    }
}