
import java.util.Scanner;
public class num {
    public static int  num(long a){
        int count = 1;
        while((a/10) > 0){
            ++count;
            a /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        System.out.println("数字一共有" + num(n) + "位");
    }
}
