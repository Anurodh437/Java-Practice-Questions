public class ClimbingStairs {

    public static int totalStairs(int n){
        int[] nums = new int[n+1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i <=n ; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[n];
    }
}
