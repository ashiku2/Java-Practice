import java.util.*;

public class Question3 {
    public static int calculateProd(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product: " +calculateProd(a, b));
    }
}
