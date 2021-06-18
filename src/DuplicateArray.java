public class DuplicateArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1;i<nums.length;i++){
            if(nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
}
