import java.sql.SQLOutput;
import java.util.Scanner;

public class SayıBulanProgram {

    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");

        int sayi  = a.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i=0; i<=sayi; i++){
            if(i % 3 ==0 && i %4 ==0){
                toplam += i;
                adet++;
            }
        }

        if(adet>0){
            double ortalama  = (double) toplam /adet;
            System.out.println("3e ve 4e tam bölünen sayıların ortalaması "+ortalama);

        }
        else{
            System.out.println("girilen aralıkta bölünen sayı yoktur");
        }
    }

}
