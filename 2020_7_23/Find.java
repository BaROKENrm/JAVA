import java.util.Scanner;

public class Find {
    public static String find(int n){
        int[] array = {1,2,3,4,6,7,8,9,10};
        int left = 0;
        int right = array.length - 1;
        int mid = array.length/2;
        while(left <= right){
            if(n > array[mid]){
                left = mid + 1;
                mid = (left + right + 1)/2;
            }
            if(n < array[mid]){
                right = mid - 1;
                mid = (left + right + 1)/2;
            }
            if(n == array[mid]){
                return "可以找到";
            }

        }
        return "不可以找到";
    }
    public static void main(String[] args) {

        System.out.println("请输入你要查找的数字:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String ret = find(n);
        System.out.println(ret);
    }
}
