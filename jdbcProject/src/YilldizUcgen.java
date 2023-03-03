import java.util.Scanner;

public class YilldizUcgen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elmasın boyutunu giriniz: ");
        int boyut = sc.nextInt();

        // Üst yarım elmas
        for (int i = 0; i <= boyut; i++) {
            for (int j = 0; j < boyut - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Alt yarım elmas
        for (int i = boyut - 1; i >= 0; i--) {
            for (int j = 0; j < boyut - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
