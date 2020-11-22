import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        selectSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void selectSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int minIndex = j;
            int min = array[j];
            for (int i = j; i <= array.length - 1; i++) {
                if (min > array[i]) {
                    minIndex = i;
                    min = array[i];
                }
                array[minIndex] = array[j];
                array[j] = min;
            }
        }
    }
}
