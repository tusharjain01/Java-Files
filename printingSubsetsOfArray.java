package main;

import java.util.Scanner;

public class printingSubsetsOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int limit = (int)Math.pow(2,arr.length);


        for (int i = 0; i < limit; i++) {
            
            //Convert i to binary and use 0's and 1's and its to whether print the element or not ...
            String set = "";
            int temp = i;
            for (int j = arr.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2 ;
                if(r == 0){
                    set = "-\t" + set;
                }
                else{
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }

        scn.close();
    }
}
