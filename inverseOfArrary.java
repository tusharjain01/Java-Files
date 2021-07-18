package main;
import java.util.*;
public class inverseOfArrary {
    public static void display(int []a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
    public static int []inverse(int []a) {
        int []inv = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            inv[v] = i;
        }
        return inv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int []inv = inverse(arr);
        display(inv);
    }
}
