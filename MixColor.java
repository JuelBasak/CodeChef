import java.util.*;
class MixColor
{
    static int color[];
    
    static void sort(int N)
    {
        int temp;
        for(int i = 0; i < N; i++)
        {
             for(int j = i+1; j < N; j++)
             {
                 if(color[i] > color[j])
                 {
                     temp = color[i];
                     color[i] = color[j];
                     color[j] = temp;
                 }
             }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int N, count;
        
        if(T<1 || T>10)
            return;
            
        int output[] = new int[T]; 
            
        for(int i = 0; i < T; i++)
        {
            N = sc.nextInt();
            
            if(N<1 || N>(int)Math.pow(10,5))
                return;
            
            color = new int[N];
            for(int j = 0; j < N; j++)
            {
                color[j] = sc.nextInt();
            }
            count = 0;
            for(int j = 0; j < N-1; j++)
            {
                sort(N);
                if(color[j] == color[j+1])
                {
                    color[j+1] = color[j]+color[j+1];
                    count++;
                }
            }
            output[i] = count;
        }
        for(int i = 0; i < T; i++)
            System.out.println(output[i]);
    }
} 
            
             
                
                
            
            
               
             
