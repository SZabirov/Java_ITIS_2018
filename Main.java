import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c = s * 15;//стоимость
        if (c >= 150) {
            c = c - 25;
        }
        System.out.println(c);
    }
}