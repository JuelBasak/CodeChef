import java.util.*;
import java.lang.*;

class MINEAT
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        if(T<1 || T>10)
            return;
        
        int output[] = new int[T];
        

        int i,speed,time, loop;
        
        for(loop = 0; loop < T; loop++)
        {
            int N = sc.nextInt();
            
            if(N<1 || N>(int)Math.pow(10,5))
                return;
        
            int H = sc.nextInt();
            
            if(H<N || H>(int)Math.pow(10,9))
                return;
        
            int A[] = new int[N];
        
            int array[] = new int[N];
            
            speed = time = 0;                
        
            for(i = 0; i < N; i++)
            {
                A[i] = sc.nextInt();
                
                if(A[i]<1 || A[i]>(int)Math.pow(10,9))
                    return;
            }

            while(true)
            {
           
                for(i = 0; i < N; i++)
                {
                      array[i] = A[i];
                }
                
                
                speed++;
                time = 0;

                for(i = 0; i < N; i++)
                {
                    while(array[i] > 0)
                    {   
                        array[i] = array[i] - speed;
                        time++;                   
                    }
     
                }          
            
                if(time > H)
                    continue;
                else
                    break;
 
            }
            output[loop] = speed;
        }
        for(loop = 0; loop < T; loop++)
            System.out.println(output[loop]);
    }
}
    
            
