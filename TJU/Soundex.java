import java.util.Scanner;

// Problem set 1326
public class Soundex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        String output;
        int prev;
        String bfpv = "BFPV";
        String cgjkqsxz = "CGJKQSXZ";
        String dt = "DT";
        String mn = "MN";
        String aeiouhwy = "AEIOUHWY";
        
        while (scan.hasNextLine()){
            word = scan.nextLine();
            output = "";
            prev = 0;
            
            for (int i=0; i<word.length(); i++){
                char ch = word.charAt(i);
                
                if (bfpv.indexOf(ch) != -1 && prev != 1){
                    output += "1";
                    prev = 1;
                } else if (cgjkqsxz.indexOf(ch) != -1 && prev != 2){
                    output += "2";
                    prev = 2;
                } else if (dt.indexOf(ch) != -1 && prev != 3){
                    output += "3";
                    prev = 3;
                } else if ('L' == ch && prev != 4){
                    output += "4";
                    prev = 4;
                } else if (mn.indexOf(ch) != -1 && prev != 5){
                    output += "5";
                    prev = 5;
                } else if ('R' == ch && prev != 6){
                    output += "6";
                    prev = 6;
                } else if (aeiouhwy.indexOf(ch) != -1) {
                    prev = 0;
                } 
            }
            
            System.out.println(output);
        }
    }

}
