import java.util.*;
class STSWAP
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int temp;
        int N = sc.nextInt();
        
        if(N < 1 || N > (int)Math.pow(10,5))
            return;
        
        int K = sc.nextInt();
        
        if(K < 1 || K > (int)Math.pow(10,5))
            return;
        
        int array[] = new int[N];
        
        for(int i = 0; i < N; i++)
        {
            array[i] = sc.nextInt();
            
            if(array[i] < 1 || array[i] > (int)Math.pow(10,9))
                return;
        }
        
        for(int i = 0; i < N; i++)
        {
            for(int j = i+K+1; j < N; j++)
            {
                if(array[j] < array[i])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i < N; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
