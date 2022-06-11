public class zoho_problem_solve_27 {
    public static void main(String[] args) {
        
        String values = "1";

        int n = 10;

        if(n==1)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(1);

            for(int k=0; k <n; k++)
            {

                String store_values = "";
                int count = 1;

                // Iterating the loop untill the values length
                // Start from here 1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                for(int i=0; i<values.length(); i++)
                {
                    if(i == values.length()-1)
                    {
                        // System.out.print(count +" "+values.charAt(i)+" ");
                        store_values += String.valueOf(count)+String.valueOf(values.charAt(i));

                    }
                    else
                    {

                        // This is main line in this program
                        // I am here counting the number occurences and storing into store_values variable
                        if(values.charAt(i) == values.charAt(i+1))
                        {   
                            count++;
                        }
                        else
                        {
                            // When the i , i+1 not equal it will add the values
                            store_values += String.valueOf(count)+String.valueOf(values.charAt(i));
                            // System.out.print(count +" "+values.charAt(i)+" ");
                            count=1;
                        }
                    }
                }

                // Then finally prinitng the values
                System.out.println(store_values);
                // Then store the values into values;
                values = store_values;

            }

        }
        
        
    }
}
