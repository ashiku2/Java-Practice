import java.util.Scanner;

public class Question2 {
    public static void printOdd(int n){
        for(int i=1; i<=n; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOdd(n);
    }
}
