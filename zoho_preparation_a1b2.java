public class zoho_preparation_a1b2 {
    public static void main(String[] args) {
        String input = "a2b2";
        char inputs[] = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {

            if (Character.isAlphabetic(inputs[i])) {
                int temp = Integer.valueOf(inputs[i]);
                int temp1 = (inputs[i + 1]) - 48;

                System.out.println(Character.toString(temp + temp1));

            }

            // int c = Integer.valueOf(a+2);
            // System.out.println(Integer.valueOf(a) + " 2 "+ Integer.valueOf(a+2)+ " ASCII
            // "+ Character.toString(c));
        }
    }
}
