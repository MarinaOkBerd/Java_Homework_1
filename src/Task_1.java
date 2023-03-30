import java.util.Scanner;


public class Task_1 {
    public static void main(String[] args) {
       int[] Array = new int[1000];
       for (int i = 1; i <= 1000; i++) {
        Array[i - 1] = i * i * i;         
       }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число от 1 до 1000. ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число от 1 до 1000. ");
        int b = scanner.nextInt();
        System.out.print(Array[a - 1]);
        System.out.println();
        System.out.print(Array[b - 1]);
    }
    
}