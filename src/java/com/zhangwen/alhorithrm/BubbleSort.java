package com.zhangwen.alhorithrm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = bubbleSort();

    }
   //冒泡排
   public static int[] bubbleSort(){
     int[] array = {2,4,5,1,3};
       for (int j = 0; j < array.length-1; j++) {

           for (int i = 0; i < array.length - j-1; i++) {
               if (array[i] > array[i + 1]) {
                   int temp;
                   temp = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = temp;
               }

           }

       }
    return array;
    }

}
