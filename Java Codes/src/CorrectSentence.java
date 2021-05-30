import java.util.Scanner;

public class CorrectSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int l = 0;l < t; l++)
        {
            int k = scan.nextInt();
            String[] str = new String[k];
            for(int r = 0; r < k ;r++)
            {
                str[r] = scan.next();
            }
            int[] count = new int[k];
            for(int i = 0; i < k ;i++)
            {
                String s = str[i];
                int c1 = 0;
                int c2 = 0;
                for(int j = 0; j < s.length(); j++)
                {
                    char ch = s.charAt(j);
                    if(ch >= 'a' && ch <= 'm' )
                    {
                        c1++;
                    }
                    else if(ch >= 'N' && ch <= 'Z')
                    {
                        c2++;
                    }

                }
                if(c1 == s.length() || c2 == s.length())
                {
                    count[i] = 1;
                }
            }
            int sum = 0;
            for(int i = 0; i < k ;i++)
            {
                sum = sum + count[i];
            }
            if(sum == k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
