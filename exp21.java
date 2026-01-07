import java.util.Scanner;

public class exp21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of m: ");
        int m = sc.nextInt();

        System.out.print("Enter value of p: ");
        int p = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= m; i++) {
            result = (result * a) % p;
        }

        System.out.println("Result of a^m mod p = " + result);

        sc.close();
    }
}
