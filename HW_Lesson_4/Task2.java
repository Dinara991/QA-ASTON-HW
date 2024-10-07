
public class Task2 {
    public static void main(String[] args) {
        checkSumSign();
    }
    public static void  checkSumSign() {
     int a = 10, b = 20;
     if(a+b > 0 || a+b == 0) {
        System.out.println("Сумма положительная");
     } else {
        System.out.println("Сумма отрицательная");
     }  
    }
}

