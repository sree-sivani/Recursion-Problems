
public class CheckArraySort {

    public static boolean isSorted(int[] arr, int idx) {

        // if the index reaches till the last element then it means our array is sorted
        // hence we return true
        if (idx == arr.length - 1) {
            return true;
        }

        // checking if the array elements are sorted by comparing the index element with
        // its next element.... and return true or false based on it
        // if -> true - return boolean value and perform recursive call
        // if -> false - return boolean value false
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] a = { 2, 6, 8, 3, 6 };

        // calling our rec function to check if the array is sorted or not
        boolean result = isSorted(a, 0);

        // if the returned value from our rec function is true then array we passed is
        // sorted otherwise not sorted
        if (result) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
