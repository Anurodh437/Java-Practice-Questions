import java.util.Scanner;

public class XorEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int N = scanner.nextInt();
            double res = 1;
            double temp1 = 2;
            double modulo = (Math.pow(10,9)) + 7;
            temp1 = temp1 % modulo;

            if (temp1 == 0)
                System.out.println(0);

            while (N > 0) {
                if ((N & 1) != 0)
                    res = (res * temp1) % modulo;

                N = N >> 1;
                temp1 = (temp1 * temp1) % modulo;
            }
            System.out.println(res);
        }
    }
}

