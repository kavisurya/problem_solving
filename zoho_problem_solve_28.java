public class zoho_problem_solve_28 {
    public static void main(String[] args) {
        
        String palindrome_val = "11100111";
        String left_reverse = "";


        if(palindrome_val.length() % 2 == 0)
        {
            for(int i=0; i < palindrome_val.length()/2; i++)
            {
                left_reverse = String.valueOf(palindrome_val.charAt(i))+left_reverse;
            }

            if(left_reverse.equals(palindrome_val.substring((palindrome_val.length()/2), palindrome_val.length())))
            {
                System.out.println(palindrome_val + " is plaindrome !");
            }
            else
            {
                System.out.println(palindrome_val + "is not plaindrome !");
            }

        }
        else
        {
            for(int i=0; i < palindrome_val.length()/2; i++)
            {
                left_reverse = String.valueOf(palindrome_val.charAt(i))+left_reverse;
            }

            if(left_reverse.equals(palindrome_val.substring((palindrome_val.length()/2)+1, palindrome_val.length())))
            {
                System.out.println(palindrome_val + " is plaindrome !");
            }
            else
            {
                System.out.println(palindrome_val + "is not plaindrome !");
            }

        }

    }
}
