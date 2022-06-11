// You are using Java
import java.util.*;

class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input_value = scan.nextInt();
        Main main = new Main();
        // System.out.println(input_value);
        System.out.println(main.FindNumerologicalReduction(input_value));
        
    }
    
    
    int FindNumerologicalReduction(int n)
    {
        String store_int_val = String.valueOf(n);
        int sum = 0;
        for(int i=0; i < store_int_val.length(); i++)
        {
            int temp = store_int_val.charAt(i) - '0';
            sum = sum + temp;
        }
        
        store_int_val = String.valueOf(sum);
        sum = 0;
        // System.out.println(store_int_val.length());
        for(int i=0; i < store_int_val.length(); i++)
        {
            int temp = store_int_val.charAt(i) - '0';
            sum = sum  + temp;
            // System.out.println(sum);
        }
        return sum;
    }
}

