import java.util.Scanner;

public class TowerOfHanoi {
    public static void hanoiTower(int n, String src, String helper, String destination) {
        // transferring the tower when only one disk is left
        if (n == 1) {
            System.out.println("Transfer of Disk from " + src + " to " + destination);
            return;
        }
        // step : transfering (n-1) disks from source to helper
        hanoiTower((n - 1), src, destination, helper);

        // Displaying how disks are transferring from what to what
        System.out.println("Transfer of Disk from " + src + " to " + destination);

        // step : transferring (n-1) disks from helper disk to destination disk using
        // source as helper
        hanoiTower((n - 1), helper, src, destination);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the number of disks input from user
        int n = sc.nextInt();

        // Calling our recursive function
        hanoiTower(n, "S", "H", "D");
    }
}
