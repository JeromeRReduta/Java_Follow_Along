package challenges;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        String username = "johndoe";
        String oldPassword = "ABC_1234";
        String newPassword = getNewPassword();
        boolean valid = isValid(newPassword, oldPassword, username);
        String message = valid ? "This works!" : "Password invalid";
        System.out.println(message);
    }

    public static String getNewPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter new password: ");
        String newPassword = scan.next();
        scan.close();
        return newPassword;
    }

    public static boolean isValid(
            String newPassword,
            String oldPassword,
            String username) {
        /* Check if password contains uppercase char and special char */
        boolean containsUpperCase = false;
        boolean containsSpecialChar = false;
        for (int i = 0; i < newPassword.length(); i++) {
            char ch = newPassword.charAt(i);
            if ( Character.isUpperCase(ch) ) {
                containsUpperCase = true;
            }
            boolean charIsSpecial = !Character.isLetter(ch);
            if (charIsSpecial) {
                containsSpecialChar = true;
            }
            if (containsUpperCase && containsSpecialChar) {
                break;
            }
        }
        /* Check for the rest */
        return newPassword.length() >= 8
                && containsUpperCase
                && containsSpecialChar
                && !newPassword.contains(username)
                && !newPassword.matches(oldPassword);
    }
}
