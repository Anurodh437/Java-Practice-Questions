public class SmallestFactorial {
    static boolean validate(int mid,int n){
        int count = 0,f = 5;
        while( f <= mid){
            count+=mid/f;
            f=f*5;
        }
        return (count>=n);
    }

    static int findNum(int n){
        if (n == 1){
            return 5;
        }
        int min = 0,max = 5*n;

        while(min < max){
            int mid = (min + max) / 2;
            if (validate(mid,n)){
                max = mid;
            }
            else
                min = mid + 1;
        }
        return min;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(findNum(n));
    }
}
