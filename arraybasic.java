package main;

import java.util.Scanner;

public class arraybasic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        //Array intialisation
        int [] arr = new int[5];
        
        //Taking input from the user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        
        //Printing the content of Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
