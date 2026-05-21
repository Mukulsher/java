public class dsapratice {
    public static void main(String[] args) {
        int n = 100;
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int largest = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];

            }

        }
        System.out.println(+largest);
    }

}
