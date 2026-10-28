import java.util.Scanner;

public class EmailMasker {
    public static String maskEmail(String email) {
        if (email == null) {
            return "Invalid Email";
        }
        
        email = email.trim();
        int atIndex = email.indexOf('@');
        
        if (atIndex == -1) {
            return "Invalid Email";
        }
        
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1).toLowerCase();
        
        String maskedUsername = "";
        if (username.length() <= 2) {
            maskedUsername = username;
        } else {
            maskedUsername = username.substring(0, 2);
            for (int i = 2; i < username.length(); i++) {
                maskedUsername += "*";
            }
        }
        
        return maskedUsername + "@" + domain;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter email: ");
        if (s.hasNextLine()) {
            String input = s.nextLine();
            System.out.println("Output: " + maskEmail(input));
        }
    }
}
