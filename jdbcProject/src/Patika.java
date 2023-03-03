import java.util.Scanner;

public class Patika {
    public static void main(String[] args) {
     /*   int n;
        int total =0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz ");
            n = scan.nextInt();
            if(n % 2==1){
            total += n;

            }

        }while (n > 0);

        System.out.println("toplam: "+ total );
    }*/


        int i = 0, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            i = input.nextInt();
            if (i % 4 == 0) {
                total += i;
            }
        } while (i % 2 == 0);
        System.out.println("Toplam : " + total);
    }




    }




