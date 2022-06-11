// Check whether a given mathematical expression is valid.

// Eg.) Input  : (a+b)(a*b)
//      Output : Valid

//      Input  : (ab)(ab+)
//      Output : Invalid

//      Input  : ((a+b)
//      Output : Invalid 


public class test{
    public static void main(String[] args)
    {
        String input = "((a+b)";
        test tt = new test();
        int tem = 0;
        Boolean flag = tt.Paranthesis(input);

        if(flag)
        {
            for(int i=0; i< input.length();i++)
            {
                if("+".equals(String.valueOf(input.charAt(i))) || "*".equals(String.valueOf(input.charAt(i))) || "/".equals(String.valueOf(input.charAt(i))) || "-".equals(String.valueOf(input.charAt(i))))
                {
                    if(Character.isAlphabetic(input.charAt(i-1)) && Character.isAlphabetic(input.charAt(i+1)))
                    {
                        flag = true;
                    }
                    else
                    {
                        flag = false;
                    }
                }
            }
        }
        else
        {
            System.out.print("Not Valid");
            tem = 1;
        }
        

        if(tem == 0)
        {

            if(!flag)
            {
                System.out.print("Not Valid");
            }
            else
            {
                System.out.print("Valid");
            }

        }
    }

    Boolean Paranthesis(String val)
    {
        int temp = 0;
        for(int i=0; i < val.length(); i++)
        {
            if(String.valueOf(val.charAt(i)).equals(")"))
            {
                temp++;
            }
            else if(String.valueOf(val.charAt(i)).equals("("))
            {
                temp--;
            }
        }

        return (temp == 0);
    }
}