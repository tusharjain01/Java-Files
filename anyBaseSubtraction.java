
import java.util.Scanner;

public class anyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int numb = subtraction(n1,n2,b);
        System.out.println(numb);
    }
    public static int  subtraction(int n1,int n2,int b) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n2 > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1/=10;
            n2/=10;
            int d = 0;
            d1 = d1 + c;
            if(d1 >= d2){
                c = 0;
                d = d1 - d2;
            }
            else{
                c = -1;
                d = d1 + 8 - d2;
            }
            rv = rv + d*p;
            p*=10;

        }
        return rv;
    }
}
