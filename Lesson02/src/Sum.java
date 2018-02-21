import java.util.Scanner;

/*
    Считать с консоли 10 чисел, вывести их сумму на экран
    (числа вводит пользователь)
 */


public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int counter = 0;
        int sum = 0;
        while (counter < 10) {
            x = sc.nextInt();
            sum = sum + x;
            counter++;//то же самое, что counter = counter + 1
        }
        System.out.println(sum);
    }
}
