import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
            Scanner input = new Scanner(System.in);

            System.out.print("Kaç elemanlık Fibonacci serisi hesaplanacak?: ");
            int n = input.nextInt();

            int first = 0, second = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }

