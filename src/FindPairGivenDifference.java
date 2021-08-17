import java.util.Arrays;

public class FindPairGivenDifference {
    public static void main(String[] args) {
        int[] arr = {5,20,3,2,5,80};
        int n = 78;
        System.out.println(findPair(arr, arr.length,n));
    }
    public static boolean findPair(int[] arr, int size, int n)
    {
        Arrays.sort(arr);
        int i = 0, j=1;
        while(i<size && j<size){
            if (i!=j && arr[j]-arr[i] == n){
                return true;
            }
            else if(arr[j] - arr[i] < n){
                j++;
            }else i++;
        }
        return false;
    }
}
