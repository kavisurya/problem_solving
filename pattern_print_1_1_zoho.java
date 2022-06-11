public class pattern_print_1_1_zoho {
    public static void main(String args[]) {
        int n = 8;
        int temp = n;

        // Creating
        StringBuffer st = new StringBuffer();
        StringBuffer st1 = new StringBuffer();

        // Iterating
        for (int row = 0-n; row < n; row++) {

            // System.out.println(row);
            if (row >= 0) {
                // Appendign values
                st.append(row + 1);

                System.out.print(st1.substring(0, temp));

                // Printing Values

                System.out.print(st.reverse());
                st.reverse();
                temp--;

                System.out.println();
            }
            else
            {
                st1.append(" ");
            }
        }

    }
}
