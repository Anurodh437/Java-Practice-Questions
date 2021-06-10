import java.util.Scanner;

public class LazyChef {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int[] arr = new int[3];
            for (int i1 = 0; i1 < 3; i1++) {
                arr[i1] = scan.nextInt();
            }
            System.out.println(Math.min(arr[0]*arr[1],arr[0]+arr[2]));
        }
    }
}
