import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int[] ints = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            ints[i] = scanner.nextInt();
        }
        Arrays.sort(ints);
        System.out.println(ints[1]);
        scanner.close();
    }
}
