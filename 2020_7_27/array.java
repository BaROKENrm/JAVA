import java.util.Arrays;

public class array {
    public static void swap(int[] array1, int[] array2){
        int[] temp = new int[array1.length];
        System.arraycopy(array1,0,temp,0,array1.length);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array2[i];
        }
        for (int j = 0; j < array1.length; j++) {
            array2[j] = temp[j];
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = {8,9,10,11,12,13,14};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        swap(array1,array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
