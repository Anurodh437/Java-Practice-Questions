import java.util.Scanner;

public class IsBothOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n%11==0 && n%5==0){
            System.out.println("BOTH");
        }
        else if ((n % 11 == 0) || (n % 5 == 0)){
            System.out.println("ONE");
        }
        else System.out.println("NONE");
    }
    
}