public class Task6 {
    public static void main(String[] args) {
        int a = 10;
        posiNegative(a);    
    }
    public static void posiNegative(int a) {
        if(a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}