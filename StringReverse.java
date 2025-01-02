import java.util.Scanner;

public class StringReverse {
    public static void revString(String str, int idx) {
        // when index comes to the first character we print the character and return
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }

        // printing the character at the index
        System.out.print(str.charAt(idx));

        // calling the function recursively while decrementing the value of the index
        revString(str, idx - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the string input from user
        String str = sc.nextLine();

        // calling our recursive function starting from length - 1 value
        revString(str, str.length() - 1);
    }
}
