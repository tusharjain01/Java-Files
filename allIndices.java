import java.util.*;
public class allIndices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int []li = indices(arr,d,0,0);
        for (int i = 0; i < li.length; i++) {
            System.out.print(li[i] + " ");
        }
    }
    public static int[] indices(int []arr,int x,int idx,int fsf) {
        if(idx == arr.length){
            return new int[fsf];
        }
        if(arr[idx] == x){
            int []iarr = indices(arr,x,idx + 1,fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        }
        else{
            int []iarr = indices(arr,x,idx + 1,fsf);
            return iarr;
        }
    }
}
