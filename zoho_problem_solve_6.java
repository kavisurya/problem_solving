public class zoho_problem_solve_6 {
    public static void main(String[] args) {
        int arrays[] = { 25, 90, 65, 12, 1, 88, 55 };

        try {

            for (int k = 0; k < arrays.length; k++) {
                int largest = Integer.MAX_VALUE;
                int smallest = Integer.MIN_VALUE;
                int largest_index = -1;
                int smallest_index = -1;

                for (int i = 0; i < arrays.length; i++) {

                    // If the index not 0 iy will execute. bcz its already vistited
                    if (i == 0 || arrays[i] != 0 || arrays[i] != 0) {

                        // Finding smallest and largest values each loop
                        if (arrays[i] < largest) {
                            largest = arrays[i];
                        } else if (arrays[i] > smallest) {
                            smallest = arrays[i];
                        }

                        // Finding the index
                        if (largest == arrays[i]) {
                            largest_index = i;
                        } else if (smallest == arrays[i]) {
                            smallest_index = i;
                        }
                    }

                }

                // Swaping , If once found a largest and smallest the index will be 0
                arrays[smallest_index] = 0;
                arrays[largest_index] = 0;

                System.out.print(smallest + " ");
                System.out.print(largest + " ");
                // System.out.println(smallest + " index is " + smallest_index );
                // System.out.println(largest + " index is "+ largest_index);
            }
        } catch (Exception E) {
            // System.out.println(x);
        }
    }
}
