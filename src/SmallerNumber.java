public class SmallerNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(smallerNumbersThanCurrent(nums));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count += 1;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
