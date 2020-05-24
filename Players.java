import java.util.*;

class Players
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        if(T<1 || T>100)
            return;
        
        int i, j, team1_odd, team2_odd, X, Y;
       
        int team1[] = new int[11];
        int team2[] = new int[11];
        String output[] = new String[T];
        
        for(i = 0; i < T; i++)
        {
            team1_odd = team2_odd = 0;
            
            X = sc.nextInt();
            
            if(X<1 || X>100)
                return;
            
            Y = sc.nextInt();
            
            if(Y<1 || Y>100)
                return;
            
            if(X == Y)
                return;
            
            for(j = 0; j < 11; j++)
            {
                team1[j] = sc.nextInt();
                
                if(team1[j]<1 || team1[j]>100)
                    return;
                
                if(team1[j] % 2 != 0)
                    team1_odd++;
            }
            
            for(j = 0; j < 11; j++)
            {
                team2[j] = sc.nextInt();
                
                if(team2[j]<1 || team2[j]>100)
                    return;
                
                if(team2[j] % 2 != 0)
                    team2_odd++;
            }
            
            if(team1_odd == team2_odd)
                output[i] = "alan";
            
            if(team1_odd>team2_odd)
            {
                if(X>Y)             
                    output[i] = "alan";
                else
                    output[i] = "chef";
            }
            else if(team1_odd<team2_odd)
            {
                if(X>Y)  
                    output[i] = "chef";
                else
                    output[i] = "alan";
            }
         }
         for(i = 0; i < T; i++)
            System.out.println(output[i]);
     }
}


            
                
            
            
