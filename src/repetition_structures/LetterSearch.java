package repetition_structures;

import java.util.Scanner;

/* Search String to see if it contains the letter 'A' or 'a' */
public class LetterSearch {

    public static void main(String[] args) {
        /* Get text */
        System.out.println("Enter text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        scan.close();
        /* Check if string contains "A"*/
        boolean letterFound = false;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            letterFound = currentLetter == 'A'
                    || currentLetter == 'a';
            if (letterFound) {
                break;
            }
        }
        /* Print message */
        System.out.println("Letter found: " + letterFound);
    }
}
