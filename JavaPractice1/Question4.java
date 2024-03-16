import java.util.Scanner;

public class Question4 {
    public static double checkCir(int r) {
        return 3.14 * r * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("The circumference: "+checkCir(r));
    }
}
