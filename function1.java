package main;

import java.util.Scanner;

public class function1 {
    public static int fac(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv*=i;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int facn = fac(n);
        int facnmr = fac(n-r);
        int npr = facn/facnmr;
        System.out.println(n + "p" + r + "=" + npr);
    }
}
