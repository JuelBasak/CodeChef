import java.io.*;

class Find
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        if(T<1 || T>20)
            return;
            
        String array[] = new String[T];        
        int data[] = new int[T];
        
        for(int i = 0; i < T; i++)
        {
            array[i] = br.readLine();
        }
        
        char ch;
        String w;
        int d;
        long N,a,b,c;
        int multi;
        int count;
        
        for(int i = 0; i < T; i++)
        {
            d = 0;
            count = 0;
            
            for(int j = 0; j < strlen(array[i]); j++)
            {
                ch = array[i].charAt(j);
                if(ch!=' ')
                    w = w + ch;
                else
                {
                    d++;
                    
                    if(d==1)
                        N = Long.parseLong(w);
                    else if (d==2)
                        a =  Long.parseLong(w);
                    else if (d==3)
                        b =  Long.parseLong(w);
                    else if (d==4)
                        c =  Long.parseLong(w); 
                        
                    if(N<1 || N>Long.parseLong(Math.pow(10,9)))
                        return;   
                    if(a<1 || N>Long.parseLong(Math.pow(10,6)))
                        return;   
                    if(b<1 || N>Long.parseLong(Math.pow(10,6)))
                        return;   
                    if(c<1 || N>Long.parseLong(Math.pow(10,6)))
                        return;       
                         
                    w="";
                 }
              }
              
              for(int x = 1 ; x<=a ;x++)
              {
                for(int y = 1; y<=b; y++)
                {
                    for(int z = 1; z<=c; z++)
                    {
                        multi = x*y*z;
                        if (multi == N)
                            count++; 
                    }
                }
              }
              
              data[i] = count;
         }
         
         for(int i = 0; i<T; i++)
         {
            System.out.println(data[i]);
         }
         
     }
}
        
              
              
                 
                
                     
                        
            
            
        
