import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1, 3, 4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Integer[] result = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }
        Set<Integer> integers = new HashSet<>(Arrays.asList(result));
        return integers.size() != nums.length;
    }
}
