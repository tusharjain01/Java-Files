package main;

import java.util.Scanner;

public class printingAllSubarrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        subarrys(arr);
    }

    public static void subarrys(int []a) {


        // First loop targetting element
        for (int i = 0; i < a.length; i++) {

            // Second loop is for upto what element is gonna print
            for (int j = i; j < a.length; j++) {

                // Third loop is for printing the subarrays.
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(a[j2] + "\t");
                }

                System.out.println();
            }
        }
    }
}
