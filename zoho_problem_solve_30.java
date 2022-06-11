public class zoho_problem_solve_30 {
    public static void main(String[] args) {
        
        String str1 = "abcdefgh";
        String str2 = "abdfhjfb";


        if(str1.length() != str2.length())
        {
            System.out.println("Both length are differ");
        }
        else
        {

            for(int i=0; i < str1.length(); i++)
            {
                if(str1.charAt(i) != str2.charAt(i))
                {
                    System.out.print(str1.charAt(i)+" "+str2.charAt(i)+" ");
                }
               
            }
        }
    }
}


// c d d f e h f j g f h b