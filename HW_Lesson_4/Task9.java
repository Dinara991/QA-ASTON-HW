public class Task9 {
    public static void main(String[] args) {
        System.out.println(leapYear()); 
    }
    public static boolean leapYear() {
        int year = 3000;
        if(year%400 == 0) {
           return true;
        } else if (year%100 == 0) {
            return false;
        } else if(year%4 == 0) {
            return true;
        }else if (year%100 == 0) {
            return false;
        } else {
            return false;
        }
    }
}