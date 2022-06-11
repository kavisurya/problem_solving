import java.util.HashSet;

public class college_classess_7 {
    public static void main(String[] args) {
        
        String input_value = "1234";
        int n = 2;

        HashSet <String> hs = new HashSet<>();

        int break_flag = 0;


        if(n == input_value.length())
        {
            System.out.println(input_value);
        }
        else if(n > input_value.length())
        {
            System.out.println("[]");
        }
        else
        {
            for(int i=0; i < input_value.length(); i++ )
            {
                
                if(break_flag == 1)
                {
                    break;
                }
                int temp = i;
                String store = "";
                for(int j=i; j < n+i; j++)
                {
                    if(j == (input_value.length()))
                    {
                        temp = 0;
                    }
                    
                    store += String.valueOf(input_value.charAt(temp));
                    
                    temp++;
                }

                // System.out.println(store);
                if(hs.contains(store))
                {   
                    break_flag = 1;
                    break;
                }
                else
                {
                    hs.add(store);
                }
            }

            System.out.println(hs);

        }
        



    }
}

