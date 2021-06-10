import java.util.LinkedList;
import java.util.Scanner;

public class FactorsFinding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                linkedList.add(i);
            }
        }
        System.out.println(linkedList.size());
        for (Integer integer : linkedList) {
            System.out.print(integer);
            System.out.print(" ");
        }
    }
}
