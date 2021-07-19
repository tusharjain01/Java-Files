import java.util.Scanner;

public class lastIndexAndFirstIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int num = scn.nextInt();
        int lo = 0;
        int hi = arr.length - 1;
        int fi = -1;
        while(lo<=hi){
            int mid = (lo + hi)/2;
            if(num > arr[mid]){
                lo = mid + 1;
            }
            else if(num < arr[mid]){
                hi = mid - 1;
            }
            else{
                fi = mid;
                hi = mid - 1;
            }
        }
        int lo2 = 0;
        int hi2 = arr.length - 1;
        int li = -1;
        while(lo2<=hi2){
            int mid = (lo2 + hi2)/2;
            if(num > arr[mid]){
                lo2 = mid + 1;
            }
            else if(num < arr[mid]){
                hi2 = mid - 1;
            }
            else{
                li = mid;
                lo2 = mid + 1;
            }
        }
        System.out.println(fi + " " + li);
    }
}
