import java.util.Scanner;

public class Armstrong {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int toplam =0;

        while(sayi>0){
            toplam += sayi%10;
            sayi /=10;

        }
        System.out.println("Basamakların toplamı " + toplam);

    }
}
