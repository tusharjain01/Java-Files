import java.util.*;
public class printIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printin(n);
    }
    public static void printin(int n) {
        if(n==0){
            return;
        }
        printin(n-1);
        System.out.println(n);
    }
}
