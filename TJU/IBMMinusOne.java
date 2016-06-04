import java.util.Scanner;


// TJU ACM Problem set 1590

public class IBMMinusOne {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        
        for (int i = 1; i <= testCases; i++){
            String line = in.next();
            char[] string = line.toCharArray();
            
            String newLine = "";
            for (int x = 0; x < string.length; x++){
                if (string[x] != 'Z'){
                    string[x]++;
                    newLine = newLine + string[x];
                } else {
                    newLine = newLine + 'A';
                }
            }
            System.out.println("String #" + i);
            System.out.println(newLine);
            System.out.println();
        }
    }

}
