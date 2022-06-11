import java.util.*;

public class college_classess_1 {
    public static void main(String[] args) {
        
        int factorial_n = 5;
        int prime_n = 2;
        int factorial_value = 1;

        // Find factorial
        for(int i=1; i <=factorial_n; i++)
        {
            factorial_value *= i;
        }

    
        Math.pow(prime_n, 1);
        // Find largest num divide
        
        int i = 1; 

        while(true)
        {
            int temp = (int) Math.pow(prime_n, i);
            if(temp < factorial_value)
            {
                if(factorial_value % temp == 0)
                {
                    
                }
                else
                {
                    System.out.println(i-1);
                    break;
                }
            }
            // System.out.println(temp + "Div : "+factorial_value % temp+ " Ith : "+i);

            i++;
        }




    }
}
