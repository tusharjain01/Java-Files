import java.util.*;
public class firstIndexInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int firstIndex = fi(arr, 0, d);
        System.out.println(firstIndex);
    }
    public static int fi(int []arr,int idx,int n) {
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == n){
            return idx;
        }
        else{
            int fiisa = fi(arr, idx + 1, n);
            return fiisa;
        }
    }
}
