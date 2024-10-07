import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        mult();
    }
    public static void mult() {
        int[] nums = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < nums.length; i++){
            if(nums[i]< 6) {
            nums[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}