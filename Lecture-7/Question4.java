import java.util.*;

public class Question4 {
    public static void printFactorial(int n) {
        int factorial = 1;
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        } else if (n == 0) {
            System.out.println(1);
            return;
        }
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial: " +factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
