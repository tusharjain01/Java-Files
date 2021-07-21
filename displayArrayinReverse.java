import java.util.*;
public class displayArrayinReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        displayArrRecur(arr, 0);
    }
    public static void displayArrRecur(int []arr,int idx) {
        displayArrRecur(arr,idx + 1);
        System.out.println(arr[idx]);
    }
}
