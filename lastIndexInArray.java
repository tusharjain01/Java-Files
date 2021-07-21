import java.util.*;
public class lastIndexInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt(); 
        int li = lastIndex(arr, 0, d);
        System.out.println(li);
    }
    // Here we directly went to the last index of array.
    // If we found the number while returning we just return that index.
    public static int lastIndex(int []arr,int idx,int n) {
        if(idx == arr.length){
            return -1;
        }
        int liisa = lastIndex(arr, idx+1, n);
        if(liisa == -1){
            if(arr[idx] == n){
                return idx;
            }
            else{
                return liisa;
            }
        }
        else{
            return liisa;
        }
    }
}
