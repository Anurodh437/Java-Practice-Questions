import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
    public static int romanToInt(String s){
        if(s.length() == 0) return 0;
        Map<Character,Integer> romanValue = new HashMap<>();
        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);
        int finalVal = 0;
        int current,previous = 0;
        for (int i = s.length() - 1; i >=0 ; i--) {
            char input = s.charAt(i);
            current = romanValue.get(input);
            if (current >= previous){
                finalVal += current;
            }
            else {
                finalVal -= current;
            }
            previous = current;
        }
        return finalVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        System.out.println(romanToInt(userInput));
        scanner.close();
    }
}