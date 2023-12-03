import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int count  = 0;
        System.out.print("Введите колличество чисел: ");
        count = scanner.nextInt();

        int[] numb = new int[count];
        for (int i = 0; i < numb.length; i++) {
            System.out.print(String.format("Значение %d числа : ", i + 1, count));
            numb[i] = random.nextInt( 30 - 4 + 1 ) + 4;
            System.out.println(numb[i]);
        }
        for (int i = 1; i < numb.length; i++) {
            System.out.print(String.format("Значение %d числа деленное на первый элемент:  ", i + 1, count));
            numb[i] = numb[i] / numb[0];
            System.out.println(numb[i]);
        }
        numb[0] = numb[0] / numb[0] ;
        System.out.print("Значение 1 числа деленное на первый элемент: ");
        System.out.println (numb[0]);
    }
}