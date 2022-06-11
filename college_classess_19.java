import java.lang.reflect.Array;
import java.util.Arrays;

public class college_classess_19 {
    public static void main(String[] args) {
        
        String name = "AC2BEW3";
        String temp = "";
        int count = 0;


        for(int i=0; i<name.length(); i++)
        {
            if(Character.isDigit(name.charAt(i)))
            {
                count = count +  name.charAt(i) - '0';
            }
            else
            {
                temp = temp + String.valueOf(name.charAt(i));
            }
        }

        name = temp;
        char[] temp_arr = name.toCharArray();

        Arrays.sort(temp_arr);

        for(int i=0;i < name.length(); i++)
        {
            System.out.print(temp_arr[i]);
        }
        System.out.print(count);
        



    }
}


// ABCEW5