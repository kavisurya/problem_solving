public class fabinocci {
    public static void main(String[] args) {
        int n = 10, start = 0, end = 1, temp = 0;
        temp = start + end;

        if (n == 0) {
            System.out.println("0 1");

        } else {

            System.out.print("0 1 ");

            for (int i = 3; i <= n; i++) {
                System.out.print(temp+ " ");
                start = end;
                end = temp;
                temp = start + end;
            }
    
        }

    }
}
