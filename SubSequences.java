public class SubSequences {

    // Method to generate and print all subsequences of a given string
    public static void subSeq(String str, int idx, String newStr) {
        // Base case: If we reach the end of the string
        if (idx == str.length()) {
            System.out.println(newStr); // Print the current subsequence
            return; // Stop recursion
        }

        // Get the current character from the string
        char currChar = str.charAt(idx);

        // Recursive call: Include the current character in the subsequence
        subSeq(str, idx + 1, newStr + currChar);

        // Recursive call: Exclude the current character from the subsequence
        subSeq(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        // Input string for which subsequences will be generated
        String str = "abcd";
        // Call the method with initial values: index=0 and an empty string
        subSeq(str, 0, "");
    }
}
