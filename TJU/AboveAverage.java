import java.util.Scanner;


public class AboveAverage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        
        for (int i = 0; i < testCases; i++){
            int classSize = in.nextInt();
            int totalClassScore = 0;
            int[] grades = new int[classSize];
            int aboveAverage = 0;
            double aAverage;
            double average;
            
            for (int j = 0; j < classSize; j++){
                int grade = in.nextInt();
                grades[j] = grade;
                totalClassScore += grade;
            }
            average = (double)totalClassScore / classSize;
            
            for (int x = 0; x < classSize; x++){
                if (grades[x] > average){
                    aboveAverage++;
                }
            }
            aAverage = ((double)aboveAverage / classSize) * 100;
            String s = "%";
            System.out.printf("%.3f%s\n", aAverage, s);
        }

    }

}
