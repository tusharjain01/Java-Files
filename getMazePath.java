
import java.util.ArrayList;
import java.util.Scanner;

public class getMazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> path = gMP(1,1,n,m);
        System.out.println(path);
    }
    public static ArrayList<String> gMP(int sr,int sc,int dr,int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sc < dc){
            hpaths = gMP(sr, sc + 1, dr, dc);
        }
        if(sr < dr){
            vpaths = gMP(sr + 1, sc, dr, dc);
        }
        ArrayList<String> paths = new ArrayList<>();
        for(String path : hpaths){
            paths.add("h" + path);
        }
        for(String path : vpaths){
            paths.add("v" + path);
        }
        return paths;
    }
}
