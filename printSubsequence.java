
import java.util.Scanner;

public class printSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ques = scn.nextLine();
        printSS(ques," ");
    }
    public static void printSS(String ques,String ans) {
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        printSS(roq, ans  + ch);
        printSS(roq, ans  + "");
    }
}
