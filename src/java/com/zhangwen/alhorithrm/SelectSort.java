package com.zhangwen.alhorithrm;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr={7,23,4,5,3};
   selectSort(arr);
    }
    public static int[] selectSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int min ;
            min=array[i];
            if (array[i]>array[i+1]){

            min=array[i+1];
            array[i]
            }
            System.out.println(min);
        }
        return array;
    }
}
