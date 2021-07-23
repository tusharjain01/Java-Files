
import java.util.Scanner;

public class printMazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        mp(1, 1, n, m,"");
    }
    public static void mp(int sr,int sc,int dr,int dc,String ans){
        if(sr == dr && sc == dc) {
            System.out.print(ans + " ");
            return;
        }
        if(sr < dr){
            mp(sr + 1, sc, dr, dc,"v" + ans);
        }
        if(sc < dc){
            mp(sr, sc + 1, dr, dc,"h" + ans);
        }
    }
}
