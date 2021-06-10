import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOrder {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        int[] targetList = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            targetList[i] = list.get(i);
        }
        System.out.println(Arrays.toString(targetList));
    }
}
