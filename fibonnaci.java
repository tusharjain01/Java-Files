
import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        for (int i = 0; i < n; i++) {
            System.out.println(firstTerm);
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
