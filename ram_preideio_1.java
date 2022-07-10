public class ram_preideio_1 {
    
    public static void main(String[] args) {
        
        int div = 6;
        int array[]= {11,12,34,2,8};
        int flag = 0;

        for(int i=0; i < array.length; i++)
        {
            int count = 0;
            for(int j=i; j < array.length; j++)
            {
                count = count+array[j];
                if(count/div == div)
                {
                    flag = 1;
                    break;
                }
            }
        }


        if(flag == 1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}

