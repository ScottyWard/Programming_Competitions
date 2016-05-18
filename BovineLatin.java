import java.util.Scanner;

// Problem set 2791

public class BovineLatin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        for (int i = 1; i <= testCases; i++){
            String newWord = "";
            String word = in.nextLine();
            char[] cWord = word.toCharArray();
            
            if (cWord[0] == 'a' || cWord[0] == 'e' || cWord[0] == 'i' ||
                    cWord[0] == 'o' || cWord[0] == 'u') {
                newWord = word + "cow";
            } else {
                newWord = word.substring(1) + cWord[0] + "ow";
            }
            
            System.out.println(newWord);
        }
    }

}
