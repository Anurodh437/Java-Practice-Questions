import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 0;
        for (int i = nums.length-1; i >=0; i--) {
            nums[k] = nums[i];
            k++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
