
import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int nextTerm;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(a+"\t");
                nextTerm = a + b;
                a = b;
                b = nextTerm;
            }
            System.out.println("");
        }
    }
}
