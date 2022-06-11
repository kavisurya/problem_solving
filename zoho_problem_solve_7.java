import java.util.*;

public class zoho_problem_solve_7 {
    public static void main(String args[]) {
        /**
         * 1 2 3 4 5
         * 10 9 8 7 6
         */

        int n = 10;
        int count = 0;
        // Stack for lifo process
        Stack<String> stack = new Stack();
        // For storing the even based loop
        StringBuffer stringBuffer = new StringBuffer();
        // For Spacefor the printing
        StringBuffer stringBuffer_space = new StringBuffer();
        int remove_space = 2;


        // Iteraing the loop for increasing the count and printinf
        for (int i = 0 - n; i < n; i++) {

            // This statment will work i == 0 or greater than 0
            if (i >= 0) {

                // Here, counting the values count = 0-n
                for (int j = 0; j < n; j++) {
                    count++;
                    // Storing the count with space in stringbuffer variable 
                    stringBuffer.append(count + " ");
                    // Storing the count with space in stringbuffer variable 
                    stack.push(String.valueOf(count));
                }


                // Here if the 
                if (i % 2 == 0) {
                    System.out.print(stringBuffer_space.substring(0, stringBuffer_space.length()-remove_space));
                    System.out.print(stringBuffer);
                }

                else {
                    System.out.print(stringBuffer_space.substring(0, stringBuffer_space.length()-remove_space));

                    for (int j = 0; j < n; j++) {
                        System.out.print(stack.pop() + " ");
                    }

                }
            remove_space = remove_space + 2;

            }
            else
            {
                stringBuffer_space.append("  ");
            }
            stringBuffer.delete(0, stringBuffer.length());
            System.out.println();
        }
    }
}
