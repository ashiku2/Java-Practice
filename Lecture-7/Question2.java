import java.util.*;

public class Question2 {
    
    public static int sumOfNum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of two number: "+sumOfNum(a, b) );
    }
    
}
