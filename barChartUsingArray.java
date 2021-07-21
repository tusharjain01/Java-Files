
import java.util.Scanner;

public class barChartUsingArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        //Loop to input elements in an Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        //To check the height of largest tower
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        //First loop  from the largest tower to the ground floor
        for (int i = max; i >= 1; i--) {

            //Second loop for the column
            for (int j = 0; j < arr.length; j++) {

                //Condition to check whether the floor matches or less than that of height 
                if(i<=arr[j]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
