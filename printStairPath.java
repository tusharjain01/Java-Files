package main;

import java.util.Scanner;

public class printStairPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        gSP(n, "");
    }

    public static void gSP(int n,String ans){
        if(n == 0){
            System.out.print(ans+" ");
            return;
        }
        else if(n < 0){
            return;
        }
        gSP(n-1, 1 + ans);
        gSP(n-2, 2 + ans);
        gSP(n-3, 3 + ans);
    }
}
