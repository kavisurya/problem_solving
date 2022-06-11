public class zoho_problem_solve_10 {
    public static void main(String[] args) {

        int n = 4;

        int count = 1;
        for (int i = 0; i < n; i++) {
            String temp = "";

            for (int space = 0; space < (n * 2) - (i + 2); space++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n && (i % 2== 0); j++) {
                System.out.print(count++ + " ");
            }

            for (int j = 0; j < n && (i % 2 == 1); j++) {
                temp = String.valueOf(count++ + " ") + temp;
            }

            System.out.print(temp);


            System.out.println();
        }
    }
}
