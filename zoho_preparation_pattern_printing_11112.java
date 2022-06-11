public class zoho_preparation_pattern_printing_11112 {

    public static void main(String[] args) {

        int n = 5;
        int oo = 1;

        for (int i = 1; i < n + 1; i++) {

            for (int j = 1; j < n + 1; j++) {

                if ((i % 2) == 0 && j == 1) {
                    System.out.print(++oo+ " ");

                }
                else if((i % 2) == 1 && j == n)
                {
                    System.out.print(++oo);
                }
                else{
                System.out.print(i + " ");

                }
            }
            System.out.println();

        }
    }
}
