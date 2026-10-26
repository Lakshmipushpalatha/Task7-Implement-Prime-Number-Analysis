import java.util.Scanner;

public class Task7{

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers in the range:");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}