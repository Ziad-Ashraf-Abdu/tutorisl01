import java.util.Scanner;
public class Prop06 {
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
//        for(int i = 0; i<sentence.length(); i++){
//            char c = sentence.charAt(i);
//        }

        String[] words = sentence.split("\\s+");
        System.out.println(words.length);

    }
}
