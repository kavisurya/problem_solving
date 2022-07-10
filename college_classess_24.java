import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// given an unsor arr of size n of positive ints. one number A from set {1,2,...n is missing } and one number B occurs twice in a array. find these two nos.


// find the max repeated value and smallest value


public class college_classess_24{
    public static void main(String[] args) {
        
        int array[] = {15,55,8,66,8,55,12,9,2,55};
        HashSet<Integer> dupl = new HashSet<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        Arrays.sort(array);

        // adding the values into linked list
        for(int i=0; i< array.length; i++)
        {
            arrayList.add(array[i]);
        }
        
        System.out.println(arrayList);


        int repeated = 0;
       int first_missing_value = 0;

       try
       {
        for(int i=array[0]; i < array[array.length-1]; i++)
        {
            if(!arrayList.contains(i)){
                first_missing_value = i;
                break;
            }
        }

        for(int i=0; i < array.length; i++)
        {
            if(dupl.contains(array[i]))
            {
                System.out.println(array[i]);
                break;
            }
            else
            {
                dupl.add(array[i]);
            }
        }
       }
       catch(Exception e)
       {

       }


       System.out.println(first_missing_value);
    }
}