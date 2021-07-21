
import java.util.Scanner;

public class printDecreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printd(n);
        scn.close();
    }
    public static void printd(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printd(n-1);
    }
}

