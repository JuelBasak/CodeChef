import java.io.*;

class Chef
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        if(n<1 || n>5000)
            return;
            
        String array[] = new String[n];
        int count[] =new int[n];
        
        
        for(int i = 0; i < n; i++)
        {
            array[i] = br.readLine();
        }
        int c;
        char ch;
        for(int i = 0; i < n; i++)
        {
            c = 0;
            for(int j = 0; j<10; j++)
            {
                ch = array[i].charAt(j);
                if(ch == ' ')
                    continue;
                else
                {
                    if(ch == '1')
                           c++; 
                }
            }
            count[i] = c;
        }
        for(int i = 0; i < n; i++)
        {
            if(count[i] == 0)
                System.out.println("Beginner");
            else if(count[i] == 1)
                System.out.println("Junior Developer");
            else if(count[i] == 2)
                System.out.println("Middle Developer");
            else if(count[i] == 3)
                System.out.println("Senior Developer");
            else if(count[i] == 4)
                System.out.println("Hacker Developer");
            else if(count[i] == 5)
                System.out.println("Jeff Dean");
        }
    }
}
            
            
