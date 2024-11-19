public class StringConcatenation {
    public static String concatenateStrings(String firstName, String lastName) {
        int len1 = firstName.length();
        int len2 = lastName.length();

        char[] str3 = new char[len1 + len2];

        int i = 0;
        while (i < len1) {
            str3[i] = firstName.charAt(i);
            i++;
        }

        int j = 0;
        while (j < len2) {
            str3[len1 + j] = lastName.charAt(j);
            j++;
        }

        return new String(str3);
    }
    public static void main(String[] args) {
        String firstName = "aljon ";
        String lastName = "ynot";

        String str3 = concatenateStrings(firstName, lastName);
        System.out.println("Concatenated Name: " + str3);
    }
}
