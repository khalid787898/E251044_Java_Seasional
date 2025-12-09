
import java.util.Scanner;

public class PrimeArray {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int[] primes = new int[(end - start) + 1];
        int index = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes[index] = i;
                index++;
            }
        }

        System.out.println("Prime numbers in the range:");
        for (int i = 0; i < index; i++) {
            System.out.print(primes[i] + " ");
        }

        sc.close();
    }
}
