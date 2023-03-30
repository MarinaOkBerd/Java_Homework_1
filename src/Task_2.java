import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = scanner.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1));
            Array[i] = scanner.nextInt();
        }
        System.out.print("Введите число, на которое будем умножать ");
        int x = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(Array[i] * x);
        }
    }
    
}