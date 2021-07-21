
import java.util.Scanner;

public class powerUsingLog {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xpn = power(x,n);
        System.out.println(xpn);
    }
    public static int power(int x ,int n) {
        if(n==0){
            return 1;
        }
        int xpnb2 = power(x,n/2);
        int xn = xpnb2 * xpnb2;
        if(n%2==1){
            xn*=x;
        }
        return xn;
    }
}
