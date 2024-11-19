public class StringConcatenation {
    public static String concatenateStrings(String firstName, String lastName) {
        int len1 = firstName.length();
        int len2 = lastName.length();

        char[] fullName = new char[len1 + len2];

        int i = 0;
        while (i < len1) {
            fullName[i] = firstName.charAt(i);
            i++;
        }

        int j = 0;
        while (j < len2) {
            fullName[len1 + j] = lastName.charAt(j);
            j++;
        }

        return new String(fullName);
    }
    public static void main(String[] args) {
        String firstName = "aljon ";
        String lastName = "ynot";

        String fullName = concatenateStrings(firstName, lastName);
        System.out.println("Concatenated Name: " + fullName);
    }
}