import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("taban değeri giriniz ");
        int a = input.nextInt();

        System.out.print("Üs değerini giriniz  ");
         int b = input.nextInt();

        int sonuc = 1;
        for(int i =1; i<=b; i++){
            sonuc *= a;
        }

        System.out.println(a + " ^ "+ b + " = "  + sonuc);


    }
}
