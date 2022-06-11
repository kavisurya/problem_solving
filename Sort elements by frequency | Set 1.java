// Sort elements by frequency | Set 1
// Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
// Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

// Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
// Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
// https://www.geeksforgeeks.org/sort-elements-by-frequency/



import java.util.*;

public class test {

    public static void main(String[] args) {
        // int arr[] = { 2, 5, 2, 8, 5, 6, 8, 8 };
        int arr[] = { 2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8 };
        HashSet<Integer> remove_duplicate = new HashSet<>();
        HashSet<Integer> Visted = new HashSet<>();

        // Adding elements to hashset
        for (int a : arr) {
            remove_duplicate.add(a);
        }
        Arrays.sort(arr);
        System.out.println();
        int n_array_length = Integer.valueOf(remove_duplicate.size());
        int my_ok_array1[] = new int[n_array_length];
        int my_ok_array2[] = new int[n_array_length];

        int inc  = 0;

        for (int i=0; i < arr.length; i++) {
            int count =  0;
            Boolean already_visted = Visted.contains(arr[i]);
            
            for(int j=0; j < (arr.length); j++)
            {
                if(arr[i] == arr[j])
                {

                    if(!already_visted)
                    {
                        count++;
                        Visted.add(arr[i]);
                        my_ok_array1[inc] = arr[i];
                        my_ok_array2[inc] = count;

                    }
                    
                }
            }

            if(!already_visted)
            {
                inc++;
            }
            // System.out.print(a + " ");

        }



        for(int i=0; i < n_array_length; i++)
        {
            System.out.print(my_ok_array1[i]+ " "+ my_ok_array2[i]);
          
            System.out.println();

        }



        //Printing 
        int My_sorted_arr[] = Arrays.copyOf(my_ok_array2, n_array_length) ;
        Arrays.sort(My_sorted_arr);
        
        for(int i=(My_sorted_arr.length-1); i >= 0; i--)
        {
            int index = 0;
            // System.out.print(my_ok_array2[i]);
            for(int j=0; j<n_array_length; j++)
            {
                if(My_sorted_arr[i] == my_ok_array2[j])
                {
                    // System.out.println(my_ok_array2[i]+ " = "+ index);

                    for(int k=0; k < My_sorted_arr[i]; k++)
                    {
                        System.out.print(my_ok_array1[index]+ " ");
                    }

                    my_ok_array2[index] = Integer.MAX_VALUE;
                    my_ok_array1[index] = Integer.MAX_VALUE; 

                    break;
                }
                index++;
            }


        }
    }

}
// Iterator iter_remove = remove_duplicate.iterator();

// while(iter_remove.hasNext())
// {
// System.out.print(iter_remove.next()+" ");
// }