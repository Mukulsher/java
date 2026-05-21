import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("the number is even ");
        }
        if (n % 2 != 0) {
            System.out.println("the number is odd number");

        }
    }
}
