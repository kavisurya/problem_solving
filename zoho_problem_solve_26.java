public class zoho_problem_solve_26 {
    public static void main(String[] args) {
        
        int n = 5;


        for(int i=1; i <= n; i++)
        {
            String store1 = "";
            String store2 = "";
            int increment = 0;
            for(int j=i; j > 0; j--)
            {
                store1 = store1 + String.valueOf(++increment);
                store2 = String.valueOf(increment)+store2;
            }

            System.out.println(store1+ store2.substring(1, store2.length()));

        }
    }
}


// 1
// 121
// 12321
// 1234321
// 123454321

