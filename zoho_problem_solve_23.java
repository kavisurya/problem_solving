public class zoho_problem_solve_23 {
    
    public static void main(String[] args) {
        
        int n = 5;

        int remove_value = n-1;

        for(int i=1; i <= n; i++)
        {
            int temp = remove_value;
            int store = 0;
            int flag = 0;
            System.out.print(i + " ");

            for(int j=0; j < i-1 && i != 1; j++)
            {
                if(flag == 0)
                {
                    store = i + temp;
                    System.out.print(store + " ");
                    flag = 1;
                }
                else
                {

                    store =store + temp;
                    System.out.print(store + " ");
                }
                temp--;
            }
            System.out.println();
        }
    }
}
