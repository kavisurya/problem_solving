public class zoho_problem_solve_hill_pattern {
    public static void main(String[] args) {
        
        int n = 4;

        StringBuffer stringBuffer_space = new StringBuffer("");

        for(int i=(0-n); i <= n; i++)
        {
            if(i>=0)
            {
                String reverse = "";
                String forward = "";
    
    
                for(int j=1; j<= i; j++)
                {
                    forward = forward +  String.valueOf(j+" ");
                    reverse = String.valueOf(j+" ") + reverse;
                }
                System.out.print(stringBuffer_space.substring(0, stringBuffer_space.length()-(i*2))  +forward+"0 "+reverse);
                System.out.println();
            }
            else
            {
                stringBuffer_space.append("  ");
            }
            
            
        }
    }
}
