import java.util.*;

public class Question5 {

    public static boolean checkEligibility(int age){
        boolean eligibility = true;
        if (age < 18) {
            eligibility = false;
        }
        return eligibility;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (checkEligibility(age)) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible");
        }
    }
}
