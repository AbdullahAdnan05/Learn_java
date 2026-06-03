public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concatenated = str1 + ", " + str2;
        System.out.println("Concatenated string: " + concatenated);

        // Length
        int length = concatenated.length();
        System.out.println("Length of the string: " + length);

        // Substring
        String substring = concatenated.substring(0, 5);
        System.out.println("Substring: " + substring);

        // String comparison
        String str3 = "Hello";
        boolean isEqual = str1.equals(str3);
        System.out.println("Are str1 and str3 equal? " + isEqual);

        // String intern
        String internedString = str1.intern();
        System.out.println("Interned string: " + internedString);
    }
}
