
import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int sp = n/2;
        int str = 1;
        int num = 1;
        for (int i = 1; i <=n; i++) {
            int rv = num;
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= str; j++) {
                System.out.print(rv + "\t");
                if(j<=(str/2)){
                    rv++;
                }
                else{
                    rv--;
                }
            }
            if(i<=(n/2)){
                sp--;
                str+=2;
                num++;
            }
            else{
                sp++;
                str-=2;
                num--;
            }
            System.out.println("");
        }
    }
}
