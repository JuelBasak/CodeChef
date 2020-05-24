import java.util.*;
import java.lang.*;

class SPSUM
{
    static int array[];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        if(T < 1 || T > 20)
            return;
        
        int N, M;
        
        for(int i = 1; i <= T; i++)
        {
            N = sc.nextInt();
            if(N < 1 || N > (int)Math.pow(10,9))
                return;
            
            M = sc.nextInt();
            
            if(M < 0 || M > (int)Math.pow(10,18))
                return;
            
            array = new int[N];
            
            for(int j = 0; j < N; j++)
                array[j] = j+1;
            
            magic(N);
            
        }
        
    }
    public static void magic(int N)
    {
        int i, j, index = 0;

        while (index < N)
        {
            index++;

            for (i = 0; i < N; i++)
            {
                for (j = i; j < i + index; j++)
                {
                    if (j >= N)
                    {
                        break;
                    }
                    sum1 += array[j];
                }
                for (j = i+index+1; j < N; j++)
                {
                    sum2 += array[j];
                }
                if((int)Math.abs(sum1 - sum2) == M)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
        }
    }
}
