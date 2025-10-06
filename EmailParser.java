public class EmailParser {
    public static String parseEmail(String email) {
        // Check if the email contains '@'
        if (email == null || !email.contains("@")) {
            return "Invalid email: missing '@'";
        }

        // Split the email into two parts: before and after '@'
        String[] parts = email.split("@");

        // The username is the part before '@'
        String username = parts[0];

        // Check if the username contains a dot
        if (!username.contains(".")) {
            return "Invalid email: missing '.' in username";
        }

        // Split the username by '.'
        String[] names = username.split("\\.");

        // If there are at least two parts, take the first and last
        if (names.length >= 2) {
            String firstName = names[0].toLowerCase();
            String lastName = names[1].toLowerCase();
            return firstName + " " + lastName;
        } else {
            return "Invalid email format";
        }
    }

    public static void main(String[] args) {
        // Test examples
        System.out.println(parseEmail("john.doe@example.com"));
        System.out.println(parseEmail("alice.smith@school.edu"));
        System.out.println(parseEmail("bob@example.com"));
        System.out.println(parseEmail("charlie.brownexample.com"));
    }
}
