import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Введите первое число:");
        int num1 = in.nextInt();

        System.out.println("Введите второе число:");
        int num2 = in.nextInt();  
        boolean result = isSumInRange(num1, num2);  
        System.out.println(result);
    }
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}