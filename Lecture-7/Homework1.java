import java.util.*;

public class Homework1 {
    public static void checkPrime(int num) {
        boolean isPrime=true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            if (num == 1) {
                System.out.println("Not a prime number"
                );
            } else {
                System.out.println("Prime Number");
            }
        } else {
            System.out.println("This is not a prime number");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPrime(num);
    }
}
