import java.util.*;
import java.util.function.Function;

public class WordLengthClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Lambda expression to classify words
        Function<String, String> classify = word -> (word.length() <= 3) ? "Short" : "Long";

        // Output result
        for (String word : words) {
            System.out.print(classify.apply(word) + " ");
        }

        sc.close();
    }
}