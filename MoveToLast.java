public class MoveToLast {
    // Method to move all occurrences of a target character to the end of the string
    public static void moveToLast(String str, int count, int idx, char target, String newStr) {
        // Base case: If we have processed all characters in the string
        if (idx == str.length()) {
            // Append all remaining target characters ('x') to the end of the new string
            while (count > 0) {
                newStr += "x";
                count--;
            }
            // Print the final modified string
            System.out.println(newStr);
            return; // End the recursive calls
        }

        // Get the character at the current index
        char currentChar = str.charAt(idx);
        // Check if the current character matches the target character
        if (currentChar == target) {
            count++; // Increment the count of the target character
            // Recursively call the method for the next character
            moveToLast(str, count, idx + 1, target, newStr);
        } else {
            // Add the current character to the new string
            newStr += currentChar;
            // Recursively call the method for the next character
            moveToLast(str, count, idx + 1, target, newStr);
        }
    }

    public static void main(String[] args) {
        // Input string to process
        String str = "axbxxxbrbx";
        // Call the method with initial values: count=0, idx=0, target='x', and newStr=""
        moveToLast(str, 0, 0, 'x', "");
    }
}
