import java.util.*;
class Hills
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        if(T<1 || T >100)
            return;
            
        int N, U, D; 
        int i,j, count, diff;
        int output[] = new int[T];  
        
        for(i = 0; i < T; i++)
        {
            N = sc.nextInt();
            U = sc.nextInt();
            D = sc.nextInt();
            
            if(N<1 || N>100)
                return;
                
            if(U<1 || U>1000000)
                return;
                
            if(D<1 || D>1000000)
                return;  
         
            
            int array[] = new int[N];
                 
            
            for (j = 0; j < N; j++)
            {
                array[j] = sc.nextInt();
                
                if(array[j]<1 || array[j]>1000000)
                    return;
            }
            count = 0;
            for (j = 0; j < N-1; j++)
            {
                
                diff = array[j+1] - array[j];
                
                    
                if(diff > 0) 
                {
                    if(diff <= U)
                        continue;
                    else
                        break;
                }                                
                else if(diff < 0) 
                {
                    if((int)Math.abs(diff) <= D)
                        continue;
                    else if(count == 0)
                    {
                        count = 1;
                        continue;
                    }
                    else
                        break;
                        
                }
                else 
                    continue;
                    
                
                    
            }
            output[i] = j+1;
            
            
        }
        for (i = 0; i < T; i++)
            System.out.println(output[i]);
            
        
        sc.close();
    }
}

     
