import java.util.*;

public class RomanToIntegerConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        int integerEquivalent = convertRomanToInteger(romanNumeral);

        if (integerEquivalent != -1) {
            System.out.println("Integer equivalent: " + integerEquivalent);
        } else {
            System.out.println("Invalid Roman numeral. Please enter a valid Roman numeral.");
        }

        scanner.close();
    }

    public static int convertRomanToInteger(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.getOrDefault(currentChar, 0);

            if (currentValue == 0) {
                return -1; // Invalid Roman numeral
            }

            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}
