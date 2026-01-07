public class exp2 {
    public static void main(String[] args) {

        int sum = 0;
        int mod = 3;

        for (int i = 10; i <= 100; i += 10) {

            int remainder = i % mod;
            System.out.println("The remainder when " + i +
                               " is divided by " + mod +
                               " is: " + remainder);
            System.out.println("Current sum is: " + sum);

            sum = sum+remainder;

            if (sum > 6) {
                System.out.println("The sum of remainders is greater than 6. Loop stopped.");
                break;
            }
        }
    }
}
