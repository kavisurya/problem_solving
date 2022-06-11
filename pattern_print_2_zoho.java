public class pattern_print_2_zoho {
    public static void main(String args[]) {
        int n = 5;
        StringBuffer string_buffer = new StringBuffer();

        // System.out.println(string_buffer);
        // System.out.println(string_buffer.substring(0, 5) + string_buffer.substring(5,
        // 5));
        // System.out.println(string_buffer.substring(1, 5) + string_buffer.substring(0,
        // 1));
        // System.out.println(string_buffer.substring(2, 5) + string_buffer.substring(0,
        // 2));
        // System.out.println(string_buffer.substring(3, 5) + string_buffer.substring(0,
        // 3));
        // System.out.println(string_buffer.substring(4, 5) + string_buffer.substring(0,
        // 4));
        // System.out.println(string_buffer.substring(5,5) +
        // string_buffer.substring(0,2));

        for (int row = 0 - n; row < n; row++) {

            string_buffer.append(row + n + 1);

            if (row == 0) {
                System.out.println(string_buffer.substring(row, n) + string_buffer.substring(n, n));
            } else if (row >= 1) {
                System.out.println(string_buffer.substring(row, n) + string_buffer.substring(0, row));
            }
        }
    }
}
