public class max {
    public static int max(int a, int b){
             return a > b ? a : b;
    }
    public static double max(double a, double b){
        return a > b ? a : b;
    }
    public static double max(double a, int  b){
        return a > b ? a : b;
    }
    public static double max(double a, double  b,int c ){
        double max1 = a > b ? a: b;
        return max1 > c ? max1 : c;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double c = 30.0;
        double d = 40.0;
        System.out.println(max(a,b));
        System.out.println(max(a,c));
        System.out.println(max(c,d,a));

    }
}
