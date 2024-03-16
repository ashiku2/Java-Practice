import java.util.Scanner;
import java.lang.Math;;

public class Question8 {
    public static void checkValue(int x, int n){
        System.out.println(Math.pow(x, n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        checkValue(x, n);
    }
}
