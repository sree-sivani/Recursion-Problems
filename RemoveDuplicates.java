public class RemoveDuplicates {
    // A boolean array to keep track of visited characters ('a' to 'z')
    public static boolean[] map = new boolean[26];

    // Method to remove duplicates from a string
    public static void removeDups(String str, int idx, String newStr) {
        // Base case: If we reach the end of the string
        if (idx == str.length() - 1) {
            System.out.println(newStr); // Print the final string without duplicates
            return; // Stop recursion
        }

        // Get the current character from the string
        char currChar = str.charAt(idx);

        // Check if the character has already been added to the new string
        if (map[currChar - 'a']) {
            // Skip the character and move to the next one
            removeDups(str, idx + 1, newStr);
        } else {
            // Add the character to the new string
            newStr += currChar;
            // Mark the character as visited in the map
            map[currChar - 'a'] = true;
            // Move to the next character
            removeDups(str, idx + 1, newStr);
        }
    }

    public static void main(String[] args) {
        // Input string containing duplicate characters
        String str = "abcbabcbcdbghfb";
        // Call the method with initial values: index=0 and an empty string
        removeDups(str, 0, "");
    }
}
