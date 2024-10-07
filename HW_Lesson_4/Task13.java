public class Task13 {
    public static void main(String[] args) {
        arrSqrt();
    }
    public static void arrSqrt(){
        int size = 5; 
        int[][] nums = new int[size][size];
        
          for (int i = 0; i < size; i++) {
            nums[i][i] = 1;  
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();  // Переход на новую строку после каждого ряда
        }
    }
}