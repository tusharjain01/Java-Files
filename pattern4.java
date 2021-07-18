package main;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n;
        int sp = 0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            st--;
            sp++;
            System.out.println("");
        }
    }
}
