import java.util.*;
public class reverseOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []orArr = new int[n];
        for (int i = 0; i < orArr.length; i++) {
            orArr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        // reverse(orArr);
        rotate(orArr,k);
        display(orArr);

    }
    public static void rotate(int []a,int k){
        if(k>0){
            k = k % a.length;
        }
        if(k<0){
            k = k % a.length;
            k = k + a.length;
        }
        //Part 1
        reverse(a,0,a.length - k - 1);

        //Part 2
        reverse(a,a.length - k,a.length - 1);

        //Last
        reverse(a,0,a.length-1);

    }
    public static void reverse(int []a,int i,int j) {
        // int i = 0;
        // int j = a.length - 1;
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    public static void display(int []a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}

