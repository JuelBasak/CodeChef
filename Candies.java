import java.util.*;
import java.lang.*;

class Candies
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        if(T<1 || T>100)
            return;
        int count, input;
        
        int output[] = new int[T];
        for(int i = 0; i < T; i++)
        {
            count = 0;
            int N = sc.nextInt();
            
            if(N<1 || N>((int)Math.pow(10,8)+1))
                return;
                
            int C = sc.nextInt();
            
            if(C<1 || C>N)
                return;
            
            int array[] = new int[N];
            
            
            for(int j = 0; j < N; j++)
            {
                array[j] = j+1;
            }
            
            for(int j = 0; j < C; j++)
            {
                input = sc.nextInt();
                
                if(array[j] == input)
                    count++;
                else
                    count--;
            }
            output[i] = count-N+C; 
            
            if(output[i] < 1)
                output[i] = 1;
  
        }
        for(int i = 0; i < T; i++)
            System.out.println(output[i]);
     }
}

