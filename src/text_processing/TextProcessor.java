package text_processing;

public class TextProcessor {

    public static void main(String[] args) {
        // countWords("I love Java");
        reverseString("I love Java");
    }
    /* splits string into array by tokenizing it, counts words, and prints them*/
    public static void countWords(String text) {
        String[] words = text.split(" ");
        int numWords = words.length;
        System.out.printf("Your text has %d words\n", numWords);

    }

    /* Prints String in reverse order */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            System.out.print(ch);
        }
    }
}
