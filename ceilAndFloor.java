import java.util.Scanner;

public class ceilAndFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int num = scn.nextInt();
        int l = 0;
        int h = arr.length - 1;
        int floor = -99999999;
        int ceil = 99999999;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == num){
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
            else if(arr[mid] > num){
                h = mid - 1;
                ceil = arr[mid];
            }
            else{
                l = mid + 1;
                floor = arr[mid];
            }
        }
        System.out.println(floor + " " + ceil);
    }
}
