import java.util.Scanner;

public class printKeypadCombination {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String keys = scn.nextLine();
        Kpc(keys," ");
    }
    static String[] pad = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void Kpc(String ques,String ans){
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        String sop = pad[ch - '0'];
        for (int i = 0; i < sop.length(); i++) {
            char chfpad = sop.charAt(i);
            Kpc(roq, ans + chfpad);
        }
    }
}
