
import java.util.Scanner;

public class countdigitinnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        int rev;
        while(n>0){
            rev = n%10;
            System.out.println(rev);;
            n/=10;
        }
        System.out.println(count);
    }
}
