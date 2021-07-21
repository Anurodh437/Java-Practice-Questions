import java.util.Scanner;

public class RangeOdd {
    public static void main(String[] args) {
        int[] arr = new int[2];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = arr[0]; i <= arr[1]; i++) {
            if(i%2 != 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
        scan.close();
    }
}
