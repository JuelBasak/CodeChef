import java.util.*;
class ChefGlove
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int L[],G[];
        int c1, c2, N;
        
        if(T<1 || T>10)
            return;
            
        String output[] = new String[T];
            
        for(int i = 0; i < T; i++)
        {
            N = sc.nextInt();
            
            if(N<1 || N>(int)Math.pow(10,2))
                return;
                
            L = new int[N];
            G = new int[N];
            
            for(int j = 0; j < N; j++)
            {
                L[j] = sc.nextInt();
                
                if(L[j]<1 || L[j]>(int)Math.pow(10,9))
                    return;
            }
            
            for(int j = 0; j < N; j++)
            {
                G[j] = sc.nextInt();
                
                if(G[j]<1 || G[j]>(int)Math.pow(10,9))
                    return;
            }
            
            c1 = c2 = 0;
            
            for(int j = 0; j < N; j++)
            {
                if(L[j] <= G[j])
                    c1++;
                    
                if(L[j] <= G[N-1-j])
                    c2++;
            }
            if((c1 == c2) && (c1 == N))
                output[i] = "both";
            
            else if(c1 < c2)
                output[i] = "back";
            
            else if(c1 > c2)
                output[i] = "front";
            
            else
                output[i] = "none";
         }
         for(int i = 0; i < T; i++)
            System.out.println(output[i]);
    }
}

                
            
            
