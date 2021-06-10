import java.util.Arrays;

public class EncodedList {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        int len=0,index = 0;
        for(int i=0;i< nums.length;i=i+2)
        {
            len+=nums[i];
        }
        int[] arr = new int[len];
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                arr[index] = nums[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}