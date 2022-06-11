public class zoho_problem_solve_3 {
    public static void main(String args[])
    {
        // String inputs = "12345+*-+";
        // String inputs = "45612+*-+";
        // String input = "45612+*-+";
        String inputs = "45612+*-+--++*";



        int n_operator_index = (inputs.length()/2)+1;

        int total = inputs.charAt(0) - '0';
        int temp = 1;
        

        // for(int i=0; i < inputs.length(); i++)
        // {
        //     if(Charact)
        // }
        // System.out.println(n_operator_index);
        // System.out.println(n_operator_index+n_operator_index-1);

        // System.out.println(inputs.length());


        try{
            for(int inps_from_operators=n_operator_index; inps_from_operators < (n_operator_index+n_operator_index-1); inps_from_operators++ )
            {
                // System.out.println(inputs_char[inps_from_operators]);
    
                if(String.valueOf(inputs.charAt(inps_from_operators)).equals("+"))
                {
                    total += inputs.charAt(temp) - '0';
                }
                else if(String.valueOf(inputs.charAt(inps_from_operators)).equals("-"))
                {
                    total -= inputs.charAt(temp) - '0';

                }
    
                else if(String.valueOf(inputs.charAt(inps_from_operators)).equals("*"))
                {
                    total *= inputs.charAt(temp) - '0';

                }
    
                else if(String.valueOf(inputs.charAt(inps_from_operators)).equals("/"))
                {
                    total /= inputs.charAt(temp) - '0';

                }
                temp++;
                // System.out.println(total);

            }

            System.out.println(total);
            
        }
        catch(Exception e)
        {
            System.out.println(total);
            System.out.println(e);
        }
        
    }
}
