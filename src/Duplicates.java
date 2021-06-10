public class Duplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.print(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]){
                temp[k] = nums[i];
                k++;
            }
        }
        temp[k++] = nums[nums.length - 1];
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
        return k;
    }
}
