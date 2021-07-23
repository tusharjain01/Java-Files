package main;

import java.util.ArrayList;
import java.util.Scanner;

public class getStairPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = gSP(n);
        System.out.println(paths);
    }
    public static ArrayList<String> gSP(int n) {

        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n< 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String>paths1 = gSP(n-1);

        ArrayList<String>paths2 = gSP(n-2);

        ArrayList<String>paths3 = gSP(n-3);

        ArrayList<String>paths = new ArrayList<>();

        for(String path : paths1){
            paths.add(1 + path);
        }

        for(String path : paths2){
            paths.add(2 + path);
        }

        for(String path : paths3){
            paths.add(3 + path);
        }

        return paths;
    }
}
