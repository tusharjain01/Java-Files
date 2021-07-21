
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fn = fac(n);
        System.out.println(fn);
    }
    public static int fac(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int rv = n;
        int f = fac(n-1);
        return rv * f;
    }
}
