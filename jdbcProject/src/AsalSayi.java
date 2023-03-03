public class AsalSayi {
    public static void main(String[] args){
        int max = 100;
// 1 bütün sayılara bölünebildiği için 2 den başlıyoruz.
        for (int i = 2; i <= max; i++) {
            boolean a = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i + " ");
            }
        }
    }
}
