
import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int on1 = n1;
        int n2 = scn.nextInt();
        int on2 = n2;
        while(n1%n2 != 0){
            int rev = n1%n2;
            n1 = n2;
            n2 = rev;
        }
        System.out.println(n2);
        int lcm = (on1 * on2)/n2;
        System.out.println(lcm);

    }
}
