import java.util.*;
public class BonusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = 0;
        int flag = 0;
        m = n / 2;
        
        if (n == 0 || n == 1) {
            System.out.println("not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("prime number");
            }
        }

       
        
        
    }
}
