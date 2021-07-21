
import java.util.Scanner;

public class anyBaseMultiplication {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        int n1 = 2156;
        int n2 = 74;
        int b = 8;
        int numb = multiplication(n1,n2,b);
        System.out.println(numb);
    }
    public static int  multiplication(int n1,int n2,int b) {
        int rv = 0;
        int p = 1;
        while(n2 > 0){
            int d1 = n2 % 10;
            n2/=10;
            int sprd = getproductwithsinglenumber(d1, n1, b);
            rv = addition(rv,sprd * p,b);
            p*=10;
        }
        return rv;
    }
    public static int getproductwithsinglenumber(int d1,int n2,int b) {
        int rv = 0;
        int c = 0;
        int d2;
        int p = 1;
        while(n2>0 || c > 0){
            d2 = n2 % 10;
            n2 /= 10;
            int d = d1*d2 + c;
            c = d/b;
            d%=b;
            rv = rv + d*p;
            p*=10;
        }
        return rv;
    }


    public static int addition(int n1,int n2,int b) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n1>0 || n2 > 0 || c > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1/=10;
            n2/=10;
            int d = d1 + d2 + c;
            c = d/b;
            d = d%b;
            rv = rv + (d*p);
            p*=10;
        }
        return rv;
     }
}
