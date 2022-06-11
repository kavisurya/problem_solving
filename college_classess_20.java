public class college_classess_20 {
    public static void main(String[] args) {
        
        int array[] = {1,1,0,0,0,0,1,0,0,0,1};
        
        int start = 0;
        int end = array.length;
        int array_length = array.length-1;

        int i = 0;

        // Its for iteraing the starting 1st 0
        while(array[i++]  != 0 )
        {
            start++;
        }

        // Its for iteraing the ending 1st 0
        
        while(array[array_length--] != 0)
        {
            end--;
        }
   

        int count = 0;

        for(i=start; i < end ; i++)
        {
            if(array[i] == 0)
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        if(count < 0)
        {
            System.out.println(-1);
        }
        else
        {

            System.out.println(count);
        }
   
    }
}
