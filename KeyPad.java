public class KeyPad {

    // Array to represent the mappings of numbers (0-9) to letters, similar to a mobile keypad
    public static String[] keyPad = { 
        ".",     // 0 maps to "."
        "abc",   // 1 maps to "abc"
        "def",   // 2 maps to "def"
        "ghi",   // 3 maps to "ghi"
        "jkl",   // 4 maps to "jkl"
        "mno",   // 5 maps to "mno"
        "pqrs",  // 6 maps to "pqrs"
        "tu",    // 7 maps to "tu"
        "vwx",   // 8 maps to "vwx"
        "yz"     // 9 maps to "yz"
    };

    // Method to find all possible combinations for the input string of numbers
    public static void findCombo(String str, int idx, String combo) {
        // Base case: If we reach the end of the input string
        if (idx == str.length()) {
            System.out.println(combo); // Print the current combination
            return; // Stop recursion
        }

        // Get the current character (digit) from the input string
        char currChar = str.charAt(idx);

        // Find the corresponding letters for the current digit using the keyPad array
        String mapping = keyPad[currChar - '0'];

        // Loop through each character in the mapping and make recursive calls
        for (int i = 0; i < mapping.length(); i++) {
            // Add the current character from the mapping to the combination and proceed
            findCombo(str, idx + 1, combo + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        // Input string representing digits to process
        String str = "34";

        // Call the method with initial values: index=0 and an empty string for combinations
        findCombo(str, 0, "");
    }
}
