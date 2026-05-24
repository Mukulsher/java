package loop;

import java.util.Scanner;

public class secondprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the number of multiply");
        for (int i = 1; i <= 10; i++) {
            System.out.println(+n * +i);
        }
    }
}
