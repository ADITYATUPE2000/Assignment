import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean[] alphabetPresent = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                int index = Character.toLowerCase(currentChar) - 'a';
                alphabetPresent[index] = true;
            }
        }

        boolean isPangram = true;
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
