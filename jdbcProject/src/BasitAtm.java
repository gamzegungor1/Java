import java.util.Scanner;

public class BasitAtm {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int balance = 1000;

        System.out.println("Bakiyeniz = " + balance);
        System.out.println("\n****İSLEMLER****\n");
        System.out.println("1. Para Çekme");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Bakiye sorgulama");
        System.out.println("4. Kart İade");

        System.out.println("Yapacağınız İşlemi Seçiniz ");
        int process = scan.nextInt();

        switch (process){
            case 1:
                System.out.println("Bakiyeniz = " + balance);
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                int amount = scan.nextInt();
                if(amount > balance) {
                    System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
                    amount = scan.nextInt();
                }
                balance -= amount;
                System.out.println("Yeni bakiyeniz = " + balance);
                break;
            case 2:
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                amount = scan.nextInt();
                balance += amount;
                System.out.println("Yeni bakiyeniz = " + balance);
                break;
            case 3:
                System.out.println("Bakiyeniz = " + balance);
                break;
            case 4:
                System.out.println("Kartınızı almayı unutmayınız.!!");
            default:
                System.out.println("Yanlıs islem secitiniz. Tekrar giriniz.");
        }

        }

    }