import java.util.Scanner;

public class RajuTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%5 == 0 || n%6 ==0) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
