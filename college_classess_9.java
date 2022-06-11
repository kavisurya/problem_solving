import java.util.*;

public class college_classess_9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entert the length of an array : ");
        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.println("Entert the key triplet : ");
        int key_sum = scan.nextInt();

        for(int i=0; i<n;i++ )
        {
            System.out.println("Enter the array elements : ");
            arr[i] = scan.nextInt();
        }
        // int arr[] = {1,4,45,6,10,8};
        int count = 0;
        // int key_sum = 13;

        for(int i=0; i < arr.length; i++)
        {
            for(int j=i+1; j < arr.length; j++)
            {
                for(int k=j+1; k < arr.length; k++)
                {
                    if((arr[i]+arr[j]+arr[k]) == key_sum)
                    {
                        count++;
                    }
                }
            }
        }


        System.out.println("Total of triplets is : "+count);

    }
}
