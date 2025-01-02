import java.util.Scanner;

public class FirstLastOccurence {

    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int idx, char element) {

        // after reach the end of the string we print the first and last occurence of
        // the element and return
        if (idx == str.length()) {
            System.out.println("First occurence : " + first);
            System.out.println("Last occurence : " + last);
            return;
        }

        // saving the current character of the index in a variable
        char currChar = str.charAt(idx);

        // updating the indices of first, last variables if the current character
        // matches with the element
        if (currChar == element) {

            // if the first index is not yet found it will be -1 so we will update first
            // variable
            if (first == -1) {
                first = idx;
            }
            // if the first index is already found then we update the last index until we
            // reach the end of the string
            else {
                last = idx;
            }
        }

        findOccurence(str, idx + 1, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the String from the user
        System.out.println("Enter the String:  ");
        String str = sc.nextLine();

        // Taking the target character from the user
        System.out.println("Enter the element to be searched: ");
        char ch = sc.next().charAt(0);

        // Calling the recursive function
        findOccurence(str, 0, ch);
    }
}
