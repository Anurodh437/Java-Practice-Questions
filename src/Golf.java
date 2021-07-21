import java.util.Scanner;

public class Golf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = scanner.nextInt();
            }
            int a = (arr[0]+1)%arr[2];
            if (arr[1]%arr[2] == 0 || arr[1]%arr[2] == a){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        scanner.close();
    }
}
