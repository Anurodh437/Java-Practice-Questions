import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int lastElement = nums[nums.length-1];
            for (int j = 0; j < nums.length; j++) {
                int temp = nums[j];
                nums[j] = lastElement;
                lastElement = temp;
            }
        }
        //or Second solution
//        int[] a = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            a[(i + k) % nums.length] = nums[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = a[i];
    //}
    }
}
