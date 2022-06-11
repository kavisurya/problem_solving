public class prime_number {
    public static void main(String[] args) {
        
        int primt_numbers_array[] = {2,3,4,5,6,7,8,9};
        // int prime_number = 2;

        for(int iter =0; iter < primt_numbers_array.length; iter++)
        {
            int count = 0;

            for(int i=1; i < primt_numbers_array[iter]; i++)
            {
                if(primt_numbers_array[iter] % i == 0)
                {
                    count++;
                }
            }
    
            System.out.println(count);
    
            if(count == 1)
            {
                System.out.println("Prime number ! " +primt_numbers_array[iter]);
            }
            else
            {
                System.out.println("Not a prime number ! " + primt_numbers_array[iter]);
            }
        }
    }
}
