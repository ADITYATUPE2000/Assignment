import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        shuffleArray(originalArray);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(originalArray));
    }

    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int randomIndex = rand.nextInt(n);

            // Swap array[i] and array[randomIndex]
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
