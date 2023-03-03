import java.util.Scanner;

public class SayininKuvvetleri {
    public static void main(String[] args) {
        //başlangıç değeri belli koşul belli bu sebeple for kullanılabilir.

        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("sınır sayısı giriniz : ");
        a = input.nextInt();
        for(int i =1, j = 1; i <=a && j<=a; i *=4,j *=5){
            System.out.println(i+ "/t"+j );

        }
    }
}

