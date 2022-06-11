// Input:  m = 9, n = 9
// Output: Following matrix
// 9 9 9 9 9 9 9 9 9 
// 9 8 8 8 8 8 8 8 9 
// 9 8 7 7 7 7 7 8 9 
// 9 8 7 6 6 6 7 8 9 
// 9 8 7 6 5 6 7 8 9 
// 9 8 7 6 6 6 7 8 9 
// 9 8 7 7 7 7 7 8 9 
// 9 8 8 8 8 8 8 8 9 
// 9 9 9 9 9 9 9 9 9 
public class test {
    public static void main(String[] args) {
        int a = 11;
        int b = 11;

        int aa = a;
        int bb = b;

        int inc = 0;
        int ch = a;
        String arr[][] = new String[a][b];

        for (int k = 0; k < a; k++) {
            for (int i = inc; i < aa; i++) {
                if (i == inc || i == (aa - 1)) {
                    for (int j = inc; j < bb; j++) {
                        arr[i][j] = String.valueOf(ch);
                    }
                } else {
                    for (int j = inc; j < bb; j++) {
                        if (j == inc || j == (bb - 1)) {
                            arr[i][j] = String.valueOf(ch);
                        }
                    }
                }
            }

            aa--;
            bb--;
            inc++;
            ch--;
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}