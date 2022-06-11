import java.util.*;

public class zoho_problem_solve_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
     

        while(true)
        {
            String store_n = String.valueOf(++n);
            String store_n_reverse = "";
    
            for(int i=store_n.length()-1; i >= 0 ; i--)
            {
                store_n_reverse+=String.valueOf(store_n.charAt(i));
            }
            

            if(store_n.equals(store_n_reverse))
            {
                System.out.println(store_n_reverse);
                break;
            }

        }
    }
}
