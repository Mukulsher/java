import java.util.Scanner;

public class praticehash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("enter a number");

        int arr[] = { 1, 2, 3, 2, 1, 5 };

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        int hash[] = new int[10];

        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q = sc.nextInt();
        System.out.println("enter q number");

        while (q > 0) {

            int number1 = sc.nextInt();

            System.out.println(hash[number1]);

            q--;
        }

        sc.close();
    }
}
