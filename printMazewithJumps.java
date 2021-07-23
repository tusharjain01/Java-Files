import java.util.Scanner;
public class printMazewithJumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        mp(1, 1, n, m,"");
    }
    public static void mp(int sr,int sc,int dr,int dc,String ans){
        if(sr == dr && sc == dc) {
            System.out.print(ans+" ");
            return;
        }
        for(int ms = 1;ms<= dr - sr;ms++){
            mp(sr + ms, sc, dr, dc,"v"+ms+ans);
        }
        for(int ms = 1;ms <= dc - sc;ms++){
            mp(sr, sc + ms, dr, dc,"h" +ms+ ans);
        }
        for(int ms = 1;ms<=dc - sc && ms <=dr - sr;ms++){
            mp(sr + ms, sc + ms, dr, dc, "d" + ans);
        }
    }
}
