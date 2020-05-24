// Codechef Link : https://www.codechef.com/LTIME57/problems/GAMENUMB
import java.util.*;
class Game
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        int i,j,N,K,C = 0;
        
        if(T<1 || T>100)
            return;
            
        for (i = 0; i < T; i++)
        {
            N = sc.nextInt();
            K = sc.nextInt();
            
            int A[] = new int[N];
            int D[] = new int[N];
            
            for(j = 0; j < N; j++)
            {
                A[j] = sc.nextInt();
            }
             
            for(j = 0; j < N; j++)
            {
                D[j] = sc.nextInt();
                C = C + D[j];
            }
            
            int array[] = new int[C];
            
            for(j = 0; j < N; j++)
            {
                for(int k = 0; k < D[j]; k++)
                {
                    array[k] = A[j];
                    System.out.print(array[k]+" ");
                }
            }
            
            for(j = 0; j < N; j++)
            {
                for(k = j+1; k < N; k++)
                {
                    if(array[j] > array[k])
                    {
                        temp = array[j];
                        array[j] = array[k];
                        array[k] = temp;
                    }
                }
            }
                        
            
            
            for(j = 0; j < K; j++)
            {
                B[j] = sc.nextInt();
            }
            // this part need to be debugged
            for(j = 0; j < K; j++)
            {
                if(j%2!=0)
                {
                    for(k = C - B[j] ; k < C ; k++)
                    {
                        newArray[l] = array[k];
                        l++;
                
                    }
                    // struck here
                    for(k = 0 ; k < B[j] ; k++)
                    {
                        array[k] = newArray[k];                        
                
                    }
                    C = B[j];
                }
                else
                {
                    for(k = 0 ; k < B[j] ; k++)
                    {
                        array[k] = newArray[k];                        
                
                    }
                    C = B[j];
                }
            }
        }
        
        for(i = 0; i < C; i++)
            s += array[k];
            
         
            
               
        sc.close();
    }
}

