import java.util.Scanner;

public class BishuAndSoldiers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        int round = scan.nextInt();
        for (int i = 0; i < round; i++) {
            int power = scan.nextInt();
            int count = 0;
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if(arr[j] <= power){
                    sum+=arr[j];
                    count+=1;
                }
            }
            System.out.println(count + " " + sum);
            //System.out.println(count);
        }
    }
}
