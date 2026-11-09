import java.util.*;

public class Main {
    public static void main(String args[]) {
        Random rand = new Random();
        int secretnumber = rand.nextInt(100) + 1;
        System.out.println("You have 5 attempts to guess the number ");
        int t = 0;
        while (t != 5) {
            System.out.println("Enter your guess:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n > secretnumber) {
                System.out.println("The number is smaller than " + n);
            } else if (n < secretnumber) {
                System.out.println("The number is greater than " + n);
            } else {
                System.out.println("Correct Answer. Good Job");
                return;
            }
            t++;
        }
        System.out.println("You're out of attempts!");
        System.out.println("The correct number is: " + secretnumber);
    }
}