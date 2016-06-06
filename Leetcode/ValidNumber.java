import java.util.regex.Pattern;

/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 * 
 */

public class ValidNumber {

    public static void main(String[] args) {
        System.out.println("---- True ----");
        System.out.println(isNumber("0.1")); // true
        System.out.println(isNumber(".1")); // true
        System.out.println(isNumber(" .1")); // true
        System.out.println(isNumber(" 0.1")); // true
        System.out.println(isNumber("0.1 ")); // true
        System.out.println(isNumber("3.")); // true
        
        System.out.println();
        
        System.out.println(isNumber("-0.1")); // true
        System.out.println(isNumber("-.1")); // true
        System.out.println(isNumber("-0.1 ")); // true
        System.out.println(isNumber(" -0.1 ")); // true
        System.out.println(isNumber("+.1")); // true 
        
        System.out.println();
        
        System.out.println(isNumber("0")); //true
        System.out.println(isNumber("1 ")); // True
        System.out.println(isNumber(" 1")); // True
        System.out.println(isNumber(" 1 ")); // True
        System.out.println(isNumber("+1")); //true
        System.out.println(isNumber(" +1 ")); //true
        
        System.out.println();
        
        System.out.println(isNumber("-2")); // true
        System.out.println(isNumber("-2 ")); // true
        
        System.out.println();
        
        System.out.println(isNumber("2e10")); // true
        System.out.println(isNumber(" 2e10")); // true
        System.out.println(isNumber("2e10 ")); // true
        System.out.println(isNumber("2.e10")); // true
        
        
        System.out.println();
        
        System.out.println(isNumber("-2e10")); // true
        System.out.println(isNumber("-2e10 ")); // true

        System.out.println(isNumber("+.2e10 ")); // true
        
        

        System.out.println("---- False ----");
        
        System.out.println(isNumber("abc")); //false
        System.out.println(isNumber(".")); //false
        System.out.println(isNumber(" .")); //false
        System.out.println(isNumber(". ")); //false
        System.out.println(isNumber("- .")); // false
        System.out.println(isNumber(". 1")); //false
        System.out.println(isNumber("0,,1")); // false
        System.out.println(isNumber("0..1")); // false
        System.out.println(isNumber("-0 .1")); // false
        System.out.println(isNumber("-0. 1")); // false
        System.out.println(isNumber(" . 1")); // false
        System.out.println(isNumber(" . 1 ")); // false
        System.out.println(isNumber("0 .1")); // false
        System.out.println(isNumber("0. 1")); // false
        System.out.println(isNumber("- 0.1")); // false
        System.out.println(isNumber(" - 0.1 ")); // false
        System.out.println(isNumber(" - 2")); // false
        System.out.println(isNumber(" - 2 ")); // false
        
        System.out.println(isNumber("1 a")); //false
        
        System.out.println(isNumber("2z10")); // false
        System.out.println(isNumber("2e--10")); // false
        System.out.println(isNumber("-2e--10")); // false
        System.out.println(isNumber("2ee10")); // false
        System.out.println(isNumber("2 e10")); // false
        System.out.println(isNumber("2e 10")); // false
        System.out.println(isNumber(" 2 e10")); // false
        System.out.println(isNumber(" 2 e 10")); // false
        System.out.println(isNumber(" 2e 10")); // false
        System.out.println(isNumber("-2 e10")); // false
        System.out.println(isNumber("-2e 10")); // false
        System.out.println(isNumber("- 2 e10")); // false
        System.out.println(isNumber("- 2 e 10")); // false
        System.out.println(isNumber("- 2e 10")); // false
        
        System.out.println(isNumber("e")); // false
        System.out.println(isNumber("e9")); // false
        System.out.println(isNumber("e-9")); // false
        System.out.println(isNumber("-e-9")); // false
        System.out.println(isNumber(".e-9")); // false
        System.out.println(isNumber(".e9")); // false
        System.out.println(isNumber(".2e81"));

    }

    public static boolean isNumber(String s) {
        String allNum = "(\\s*?)((\\-??)|(\\+??))(\\d)+(\\s*?)"; // All Numbers
        String decimal = "(\\s*?)((\\-??)|(\\+??))(\\d*?)(\\.)(\\d*?)(\\s*?)"; // Decimal Number
        String onlyDecimal = "(\\s*?)(\\-??)(\\s*?)(\\.)(\\s*?)"; //handles the spaces and only '.'
        String sciNotification = "(\\s*?)((\\-??)|(\\+??))(\\d+?)(\\.??)(e{1})((\\-??)|(\\+??))(\\d+?)(\\s*?)"; // Scientific notation
        String decSci = "(\\s*?)((\\-??)|(\\+??))(((\\d+?)(\\.))|((\\.)(\\d+?))|((\\d+?)(\\.)(\\d+?)))(e{1})((\\-??)|(\\+??))(\\d+?)(\\s*?)";
        
        if (s.matches(allNum)) {
            return true;
        } else if (s.matches(decimal) && !s.matches(onlyDecimal)) {
            return true;
        } else if (s.matches(sciNotification)) {
            return true;
        } else if (s.matches(decSci)) {
            return true;
        } else {
            return false;
        }
    }
}
