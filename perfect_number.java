import java.lang.Math;

public class perfect_number {
    public static void main(String[] args) {
        
        int number = 51;
        String store_value = "";
        float temp = number;

        int count = 0;
        while(number != count)
        {
            if((int) temp == 0 || (int) temp == 1)
            {
                break;
            }
            temp = Math.round((temp/2));
            int temp_int = (int) temp;
            count = count + temp_int;
            store_value = String.valueOf(temp_int+" ")+store_value;
            // System.out.println(temp_int);
        }


        if(number == count)
        {

            System.out.println("count value : "+count+ " perfect number!");
            System.out.println(store_value);
        }
        else
        {
            System.out.println("Not a perfect number!");
        }

    }
}
