public class college_classess_8 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6};
        // int arr[] = {10,20,30,40,50,60,70,80,90,100,110};



        // Printing
        // for(int i=0,j=arr.length-1; i < arr.length/2; i++,j--)
        // {
        //     System.out.print(arr[j]+" "+arr[i]+" ");
            
        // }

        // if((arr.length%2) == 1)
        // {
        //      System.out.print(arr[arr.length/2]);
        // }





        // Rearranging

        int temp = 0;
        int len = arr.length -1;
        for(int i=0; i < len; i=i+2)
        {
            // Storing the last element to temo varialbe
            temp = arr[len];
            
            // Then swaping the elements
            // Like arr[5] = arr[4]
            // Like arr[4] = arr[3]
            // Like arr[3] = arr[2]
            // Like arr[2] = arr[1]

            for(int swap =0 ; swap < len-i; swap++)
            {
                arr[len-(swap)] = arr[(len-(swap)) - 1];
            }

            // Then finally storing the temp valus into arr[i]
            arr[i] = temp;

        }



        // Then printing the array elements
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
