public class word_searching_2d_array {
    public static void main(String[] args) {

        String a = "WELCOMETOZOHOCORPORATION";

        String arr[][] = {
                { "W", "E", "L", "C", "O", "M" },
                { "E", "T", "O", "Z", "O", "H" },
                { "O", "C", "O", "R", "P", "O" },
                { "R", "A", "T", "I", "O", "N" }
        };

        String key = "OOPO";
        // System.out.print(arr[0].length);

        // Left to right
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - key.length() + 1; j++) {
                String temp = "";

                for (int k = j; k <= (key.length() - 1) + j; k++) {
                    temp += arr[i][k];

                    if (temp.equals(key)) {
                        System.out.println(i + " " + j + " to " + i + " " + k);

                    }
                }

                // System.out.println(temp);

            }
        }

        // Top to bottom
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length - key.length() + 1; j++) {
                String temp = "";

                for (int k = j; k < key.length() + j; k++) {
                    temp += arr[k][i];
                    if (temp.equals(key)) {
                        System.out.println(j + " " + i + " to " + k + " " + i);

                    }
                }

                // System.out.println(temp);

            }
        }
        // System.out.print(a.length());
    }
}
