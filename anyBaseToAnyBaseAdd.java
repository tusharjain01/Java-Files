package main;

import java.util.Scanner;

public class anyBaseToAnyBaseAdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int numb = addition(n1,n2,b);
        System.out.println(numb);
    }
    public static int addition(int n1,int n2,int b) {
       int rv = 0;
       int c = 0;
       int p = 1;
       while(n1>0 || n2 > 0 || c > 0){
           int d1 = n1 % 10;
           int d2 = n2 % 10;
           n1/=10;
           n2/=10;
           int d = d1 + d2 + c;
           c = d/b;
           d = d%b;
           rv = rv + (d*p);
           p*=10;
       }
       return rv;
    }
}
