import java.util.Scanner;

public class BuyPlease {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(arr[0]*arr[2] + arr[1]*arr[3]);
    }
}
