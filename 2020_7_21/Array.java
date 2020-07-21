/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Administrator
 */
public class Array {
 public static void swap(int[] array){
     int i = 0;
     int j = array.length - 1;
     while(i < j ){
         while(i < j  && array[j] % 2 == 0){
             j--;
         }
         while(i < j && array[i] % 2 != 0){
             i++;
         }
         int temp = array[i];
         array[i] = array[j];
         array[j] = temp;
     }
 }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        swap(array);
        for(int i = 0;i < array.length;i ++){
            System.out.print(array[i] + " ");
        }
    }
    
}
