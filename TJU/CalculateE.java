// TJU ACM Problem set 1549

public class CalculateE {

    public static double factorial(int x) {
        double answer = 1;

        while (x != 0) {
            answer = answer * x;
            x--;
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println("n e");
        System.out.println("- -----------");

        double e = 2.5;
        System.out.println("0 1");
        System.out.println("1 2");
        System.out.println("2 2.5");

        for (int i = 3; i <= 9; i++) {
            double add = 1.0 / factorial(i);
            e = e + (add);
            System.out.printf("%d %.9f%n", i, e);
        }
    }

}
