import java.util.*;
public class college_classess_5 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row length : ");
        int row_length = scan.nextInt();
        System.out.println("Enter the column length : ");
        int column_length = scan.nextInt();

        // Declaring Array
        int array[][] = new int[row_length][column_length];

        // Storing the elements into the array !

        for(int i=0; i < row_length; i++)
        {
            for(int j=0; j < column_length; j++)
            {
                System.out.println("Enter the array elements : ");
                array[i][j] = scan.nextInt();
            }
        }



        int index = 0;
        int count = 0;
        // Calculating! 
        for(int i=0; i < row_length; i++)
        {
            int temp = 0;
            for(int j=0; j < column_length; j++)
            {
                if(array[i][j] == 1)
                {
                    temp++;
                }
            }


            if(i == 0)
            {
                count = temp;
                index = i;
            }
            if(count <= temp)
            {
                count = temp;
                index = i;
            }
            // System.out.println(temp);
        }


        System.out.println("Maximum repeating 1 count is : "+ count+ " index is "+index);

        

    }
}
