import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[]args){
        int n;
        int r;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
         n = scanner.nextInt();

        System.out.print("R değerini giriniz: ");
         r = scanner.nextInt();

        int kombinasyon = hesaplaKombinasyon(n, r);
        System.out.println(n + " sayısının " + r + " li kombinasyonu: " + kombinasyon);
    }

    public static int hesaplaKombinasyon(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            return hesaplaKombinasyon(n - 1, r - 1) + hesaplaKombinasyon(n - 1, r);
        }
    }
}
