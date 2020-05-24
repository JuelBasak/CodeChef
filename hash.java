import java.util.*;
class hash
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
                
        int T = sc.nextInt();
        
        if(T<1 || T>20)
            return;
            
        int flag[] = new int[T];
        String temp;
        
        for(int i = 0; i < T; i++)
        {
            flag[i] = -1;
            
            int N = sc.nextInt();
            
            if(N<2 || N>26)
                return;
            
            String timestamp[] = new String[N];
            String username[] = new String[N];
            String hash[] = new String[N];
            
            for(int j = 0; j < N; j++)
            {
                timestamp[j] = sc.next();
                
                if(timestamp[j].length() != 10)
                    return;
                
                username[j] = (sc.next()).toLowerCase();
                
                if(username[j].length() > 64)
                    return;
                
                hash[j] = (sc.next()).toLowerCase();
                
                if(hash[j].length() != 32)
                    return;                
            }
            
            for(int j = 0; j < N; j++)
            {
                temp = hash[j];
                for(int k = j+1; k < N; k++)
                {
                    if(hash[j].compareTo(hash[k]) == 0)
                    {
                        if(username[j].compareTo(username[k]) == 0)
                            flag[i] = 1;
                        else
                            flag[i] = 2;
                    }
                }                            
            }
            
        }
        for(int i = 0; i < T; i++)
            System.out.println(flag[i]);
    }
}

                
        
        
