
import java.util.ArrayList;
import java.util.Scanner;

public class getMazePathWithJumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePath(1, 1, n, m);
        System.out.println(paths);
    }
    public static ArrayList<String>  getMazePath(int sr,int sc,int dr,int dc) {


        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }


        ArrayList<String> paths = new ArrayList<>();
        //Horizontal paths
        for (int ms = 1; ms <=(dc-sc); ms++) {
            ArrayList<String>hpaths = getMazePath(sr, sc + ms, dr, dc);
            for(String hpath : hpaths){
                paths.add("h" + ms  + hpath);
            }
        }
        //Vertical Paths
        for (int ms = 1; ms <=(dr-sr); ms++) {
            ArrayList<String>vpaths = getMazePath(sr + ms, sc, dr, dc);
            for(String vpath : vpaths){
                paths.add("v" + ms  + vpath);
            }
        }
        //Diagonal Paths
        for (int ms = 1; (ms <=(dr-sr) && ms<=(dc - sc)); ms++) {
            ArrayList<String>dpaths = getMazePath(sr + ms, sc + ms, dr, dc);
            for(String dpath : dpaths){
                paths.add("d" + ms  + dpath);
            }
        }

        return paths;
        

    }    
}
