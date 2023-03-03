import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int boyut =scan.nextInt();
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
