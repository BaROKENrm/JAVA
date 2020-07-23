public class order {
    public static String order(int[] array){
        for (int i = 0; i < array.length - 2; i++) {
            if(array[i] > array[i+1]){
                return "不是有序数组";
            }
        }
            return "是有序数组";
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(order(array));
    }
}
