import java.util.HashSet;

public class UniqueSubsequences {

    // Method to generate and print all unique subsequences of a given string
    public static void subSeq(String str, int idx, String newStr, HashSet<String> set) {
        // Base case: If we reach the end of the string
        if (idx == str.length()) {
            // Check if the current subsequence is already in the set
            if (set.contains(newStr)) {
                return; // If it's already in the set, stop recursion
            } else {
                System.out.println(newStr); // Print the unique subsequence
                set.add(newStr); // Add the subsequence to the set
                return; // Stop recursion
            }
        }

        // Get the current character from the string
        char currChar = str.charAt(idx);

        // Recursive call: Include the current character in the subsequence
        subSeq(str, idx + 1, newStr + currChar, set);

        // Recursive call: Exclude the current character from the subsequence
        subSeq(str, idx + 1, newStr, set);
    }

    public static void main(String[] args) {
        // Input string for which unique subsequences will be generated
        String str = "aaaa";

        // HashSet to store unique subsequences
        HashSet<String> set = new HashSet<>();

        // Call the method with initial values: index=0, an empty string, and an empty set
        subSeq(str, 0, "", set);
    }
}
