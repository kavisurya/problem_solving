import java.lang.reflect.Array;
import java.util.*;

public class zoho_problem_solve_5 {
    public static void main(String args[]) {

        // Approach - 3
        // Array elements in string datatype
        String arr[] = { "48", "50", "41","10000", "10", "1", "88", "78", "500", "5", "100", "1220" ,};

        // Length based sorting
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        // Length basesd sorting after printing
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



        // Elements based sorting
        for (int list_vals = 0; list_vals < arr.length; list_vals++) {

            String temp = "";
            for (int list_vals_iter = list_vals + 1; list_vals_iter < arr.length; list_vals_iter++) 
            {

                // if the both array lengths same the if confition will works like arr[0].length == arr[1].length 
                if(arr[list_vals].length() == arr[list_vals_iter].length())
                {
                    // Comparing the two elements by ascii method!
                    int ascii1 = (char) arr[list_vals].charAt(0);
                    int ascii2 = (char) arr[list_vals_iter].charAt(0);

                    if(ascii1 > ascii2)
                    {
                        // if the confition is satisfied swapping process!
                        temp = arr[list_vals_iter];
                        arr[list_vals_iter] = arr[list_vals];
                        arr[list_vals]=temp;
                    }
                }
            }
        }

        // Printing the final array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
   
        // for (int array_values = 0; array_values < arrays.length - 1; array_values++)
        // {
        // for (int array_values_next_iteration = 1; array_values_next_iteration <
        // arrays.length; array_values_next_iteration++)

        // {
        // if (arrays[array_values].length() ==
        // arrays[array_values_next_iteration].length()) {
        // String temp_store = "";
        // int ascii1 = (char) arrays[array_values].charAt(0);
        // int ascii2 = (char) arrays[array_values_next_iteration].charAt(0);
        // int ascii1_1 = (char) arrays[array_values].charAt(1);
        // int ascii2_2 = (char) arrays[array_values_next_iteration].charAt(1);

        // if (ascii1 <= ascii2) {
        // temp_store = arrays[array_values_next_iteration];
        // arrays[array_values_next_iteration] = arrays[array_values];
        // arrays[array_values] = temp_store;
        // }

        // } else {
        // // String temp_store = "";

        // // temp_store = arrays[array_values_next_iteration];
        // // arrays[array_values_next_iteration] = arrays[arrays.length-1];
        // // arrays[arrays.length-1] = temp_store;
        // }
        // }

        // }

        // Compareto Based
        // Approach - 2

        // for(int array_values = 0; array_values < arrays.length-1; array_values++)
        // {
        // String temp_variable = "";
        // for(int array_values_next_iteration = array_values+1;
        // array_values_next_iteration < arrays.length; array_values_next_iteration++)
        // {
        // //
        // System.out.println(arrays[array_values].compareTo(arrays[array_values_next_iteration]));
        // if(arrays[array_values].compareTo(arrays[array_values_next_iteration]) > 0)
        // {
        // temp_variable = arrays[array_values_next_iteration];
        // arrays[array_values_next_iteration] = arrays[array_values];
        // arrays[array_values] = temp_variable;
        // }
        // }
        // }

        // for (int i = 0; i < arrays.length; i++) {
        // System.out.println(arrays[i]);
        // }

        // for (int i = 0; i < arrays.length; i++) {
        // System.out.println(array_values_list.get(i));
        // }
        // System.out.println("400".compareTo("800"));
    }
}
