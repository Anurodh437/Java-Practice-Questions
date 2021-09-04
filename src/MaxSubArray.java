public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max1 = 0,max2 = nums[0];
        for (int num : nums) {
            max1 = max1 + num;
            if (max2 < max1) {
                max2 = max1;
            }
            if (max1 < 0) {
                max1 = 0;
            }
        }
        return max2;
    }
}
