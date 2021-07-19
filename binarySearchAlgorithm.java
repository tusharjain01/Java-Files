import java.util.Scanner;

public class binarySearchAlgorithm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int key = scn.nextInt();
        int l = 0;
        int h = arr.length - 1;
        boolean check = false;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == key){
                check = true;
                System.out.println(mid);
                break;
            }
            else if(arr[mid] > key){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        
        if(check){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
