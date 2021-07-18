package main;

import java.util.Scanner;


public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 2*n - 3;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
               System.out.print(j + "\t");
            }
            for (int j = 1; j <= sp; j++) {
               System.out.print("\t");
            }
            if(st==n){
                st--;
            }
            for (int j = st; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            sp-=2;
            st++;
            System.out.println();
        }
        scn.close();
    }
}
