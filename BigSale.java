import java.util.*;
import java.math.*;


class BigSale
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        double amount, diff, total, sum;
        int price, quantity, discount, N;
        
        amount = diff = total = 0;

        int T = sc.nextInt();
        
        if(T<1 || T>10)
            return;
        
        double output[] = new double[T];
        
        for(int i = 0; i < T; i++)
        {
            sum = 0;
            N = sc.nextInt();
            
            if(N<1 || N>(int)Math.pow(10,2))
                return;
            
            for(int j = 0; j < N; j++)
            {
                
                price = sc.nextInt();
                
                if(price<1 || price>100)
                    return;
                    
                quantity = sc.nextInt();
                
                if(quantity<1 || quantity>100)
                    return;
                    
                discount = sc.nextInt();
                
                if(discount<0 || discount>100)
                    return;
                    
                amount = price + (discount/100.0)*price;
                amount = amount - (discount/100.0)*amount;
                diff = Math.abs(price-amount);
                total = diff * quantity;
                sum = sum + total;
                
            }
            
            
            output[i] = sum;
         }
         for(int i = 0; i < T; i++)
            System.out.println(output[i]);
    }
}
 
