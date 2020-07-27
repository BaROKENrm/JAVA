//给定 array = [2, 7, 11, 15], target = 9
//        因为 array[0] + array[1] = 2 + 7 = 9
//        所以返回 [0, 1]


import java.util.Arrays;

public class twoSum {
    public static int[] twoSum(int[] array,int target){
        int i = 0;
        int j =i + 1;
        //int [] result = {i,j};
        for ( i = 0; i < array.length; i++) {
            for ( j = i+1; j < array.length; j++) {
                if(array[i] + array[j] == target){
                    int [] result = {i,j};
                    return result;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int[] ret = twoSum(array,10);
        System.out.println(Arrays.toString(ret));
    }
}
