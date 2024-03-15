import java.util.*;

public class Homework2 {
    public static void checkEven(int n) {
        if (n % 2 == 0) {
            System.out.println("This is even");
        } else {
            System.out.println("This number is not even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkEven(n);
    }
}
