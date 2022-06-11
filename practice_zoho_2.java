public class practice_zoho_2 {

    void Print_output(char val, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(val);
        }
        // System.out.println();

    }

    public static void main(String[] args) {
        String input = "a1b5c10";

        char inputs[] = input.toCharArray();
        String cc = "";

        for (int i = 0; i < inputs.length; i++) {

            if (Character.isAlphabetic(inputs[i])) {

                for (int j = i + 1; j <= 2 + i; j++) {

                    if (!Character.isAlphabetic(inputs[j])) {
                        cc = cc + inputs[j];
                    }
                }

                // System.out.println(cc);
                practice_zoho_2 pp = new practice_zoho_2();
                pp.Print_output(inputs[i], Integer.valueOf(cc));
                cc = "";

            }

        }
    }
}
