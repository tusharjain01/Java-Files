
import java.util.ArrayList;
import java.util.Scanner;

public class keypadCombination {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ss = scn.nextLine();
        ArrayList<String> keypad = KPC(ss);
        System.out.println(keypad);
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vw","xyz"};
    public static ArrayList<String> KPC(String ss) {
        if(ss.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        // 678
        char ch = ss.charAt(0); // 6
        String ros = ss.substring(1);// 78
        ArrayList<String> ress = KPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforch = codes[ch - '0'];
        for(int i = 0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(String rstr:ress){
                mres.add(chcode + rstr);
            }
        }
        return mres;
    }
}
