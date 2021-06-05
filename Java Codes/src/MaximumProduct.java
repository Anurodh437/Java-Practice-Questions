public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int result = nums[0];
        int n = nums.length;

        for (int i = 0; i < n; i++)
        {
            int pro = nums[i];
            // traversing in current subarray
            for (int j = i + 1; j < n; j++)
            {
                // updating result every time
                // to keep an eye over the
                // maximum product
                result = Math.max(result, pro);
                pro *= nums[j];
            }
            // updating the result for (n-1)th index.
            result = Math.max(result, pro);
        }
        return result;
    }
}
