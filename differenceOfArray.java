package main;
import java.util.*;
public class differenceOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Assumption n2 is greater than n1
        int n1 = scn.nextInt();
        int []a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int []a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }
        int []diff = new int[n2];

        // Main mecchanism
        int c = 0; //For carry
        int i = a1.length - 1; //For pointing the element at the last of array 1
        int j = a2.length - 1; //For pointing the element at the last of array 2
        int k = diff.length - 1; //For pointing the element at the last of resulting Array

        while(k>=0){
            int d = 0;// Digit which is going to be stored at the kth position of resulting Array

            int a1v = i>=0? a1[i] : 0; 
            // To store the value at the present at the ith position of the Array 1 if i>=0 its stores a1[i] else its stores 0.

            if(a2[j] + c >= a1v){
                d = a2[j] + c - a1v;
                c = 0;
            }
            else{
                d = a2[j] + 10 + c - a1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while(idx < diff.length){
            if(diff[idx] == 0){
                idx++;
            }
            else{
                break;
            }
        }
        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }


        scn.close();
    }
}
