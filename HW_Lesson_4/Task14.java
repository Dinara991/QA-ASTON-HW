public class Task14 {
    public static void main(String[] args) {
        int[] result = createArray(4, 2);  
        for (int i : result) {
            System.out.print(i + " ");
        }   
    }
    public static int[] createArray(int len, int initalValue){
        int[] nums = new int[len];
        for(int i = 0; i< nums.length; i++) {
            nums[i] = initalValue;
        }
        return nums;
    }
}