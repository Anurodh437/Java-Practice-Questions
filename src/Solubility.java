import java.util.Scanner;

public class Solubility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = scanner.nextInt();
            }
            int result = arr[1] + ((100 - arr[0])*arr[2]);
            System.out.println(result*10);
        }
        scanner.close();
    }
}
