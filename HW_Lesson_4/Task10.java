import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        arr();
    }
    public static void arr(){
        int nums[] = new int[] { 0, 1, 0, 1, 0, 0, 1};
        for (int num : nums) {
            if (num != 0 && num != 1) {
                System.out.println("Ошибка: допустимы числа 0 или 1.");
                return; 
            }
        }
        System.out.println("До   :"+ Arrays.toString(nums));
        for(int i = 0; i <nums.length; i++) {
            if(nums[i] == 0) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }
        System.out.println("После:" + Arrays.toString(nums));
    }
}