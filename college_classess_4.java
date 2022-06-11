import java.util.*;

public class college_classess_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row length : ");
        int row_length = scan.nextInt();
        System.out.println("Enter the column length : ");
        int column_length = scan.nextInt();
        System.out.println("Enter the key to search : ");
        int key = scan.nextInt();


        // Declaring Array
        int array[][] = new int[row_length][column_length];

        for(int i=0; i < row_length; i++)
        {
            for(int j=0; j < column_length; j++)
            {
                System.out.println("Enter the array elements : ");
                array[i][j] = scan.nextInt();
            }
        }


        int flag = 0;
        // Finding
        for(int i=0; i < row_length; i++)
        {

            if(flag == 1)
            {
                break;
            }

            if(array[i][0] <= key && array[i][column_length-1] >= key)
            {
                for(int j=0; j < column_length; j++)
                {
                    if(array[i][j] == key)
                    {
                        System.out.print("Key Found : " +array[i][j] + " at "+i + " "+ j);
                        flag = 1;
                        break;
                    }
                    
                }
            }
            
        }

        if(flag == 0)
        {
            System.out.println("Key not found !");
        }

    }
}
