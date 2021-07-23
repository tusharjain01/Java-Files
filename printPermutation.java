
import java.util.Scanner;

public class printPermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printpmt(str, ""); 
    }
    public static void printpmt(String ques,String ans) {
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            // To select the element at the ith index
            char ch = ques.charAt(i);
            // To get the leftover string from 0 to (i-1)th index
            String l = ques.substring(0,i);
            // To get the leftover string from (i + 1) to end of string
            String r =  ques.substring(i+1);
            printpmt(l+r, ch +  ans);
        }
    }
}
