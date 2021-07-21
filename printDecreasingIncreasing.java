import java.util.*;
public class printDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printdecreincre(n);
    }
    public static void printdecreincre(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printdecreincre(n-1);
        System.out.println(n);
    }
}
