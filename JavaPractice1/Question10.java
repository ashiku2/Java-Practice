import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int third;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(first+" "+second+" ");
        for(int i=2; i<=n; i++){
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
