public class ram_precidio_2 {
    public static void main(String[] args) {
        
        int arr[] = {1,1,1};
        // int arr[] = {3,2,1,5,6,4};

        int higher_index = 2;
        int result = 0;
      



        for(int j=0; j < higher_index; j++)
        {
            int index=0;
            int largest_num = -1;
            for(int i=0; i < arr.length; i++)
                {
                    if(arr[i] != -1)
                    {
                        // Finding the largest num in that array elements
                        if(arr[i] > largest_num)
                        {
                            largest_num=arr[i];
                        }
                        // Finding the largest array index
                        if(arr[i] == largest_num)
                        {
                            index = i;
                        }
                    }
                }
    
                result = largest_num;
                // System.out.println(largest_num+ " = " + arr[index]);
                // Once we visited that array we change the values to -1
                arr[index] = -1;
    
        }
    
    
        System.out.println(result);
    
    }

}
