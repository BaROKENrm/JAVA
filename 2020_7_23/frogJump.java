public class frogJump {
    public static int jumpStair(int n){
        if(n==1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return jumpStair(n-1)+jumpStair(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(jumpStair(n));
    }
}
