
import java.util.Scanner;

/**
 * digitFrequency
 */
public class digitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int n = scn.nextInt();
        int count = getDigitFrequency(num,n);
        System.out.println(count);
    }
    public static int getDigitFrequency(int num,int n) {
        int count = 0;
        int rev;
        while(num > 0){
            rev = num%10;
            if(rev == n){
                count++;
            }
            num/=10;
        }
        return count;
    }
}