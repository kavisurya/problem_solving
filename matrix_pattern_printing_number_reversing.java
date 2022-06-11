// Input: n = 9
// Output: Following matrix
// 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 
// 9 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 9 
// 9 8 7 7 7 7 7 7 7 7 7 7 7 7 7 8 9 
// 9 8 7 6 6 6 6 6 6 6 6 6 6 6 7 8 9 
// 9 8 7 6 5 5 5 5 5 5 5 5 5 6 7 8 9 
// 9 8 7 6 5 4 4 4 4 4 4 4 5 6 7 8 9 
// 9 8 7 6 5 4 3 3 3 3 3 4 5 6 7 8 9 
// 9 8 7 6 5 4 3 2 2 2 3 4 5 6 7 8 9 
// 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 
// 9 8 7 6 5 4 3 2 2 2 3 4 5 6 7 8 9 
// 9 8 7 6 5 4 3 3 3 3 3 4 5 6 7 8 9 
// 9 8 7 6 5 4 4 4 4 4 4 4 5 6 7 8 9 
// 9 8 7 6 5 5 5 5 5 5 5 5 5 6 7 8 9 
// 9 8 7 6 6 6 6 6 6 6 6 6 6 6 7 8 9 
// 9 8 7 7 7 7 7 7 7 7 7 7 7 7 7 8 9 
// 9 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 9 
// 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 
public class test {
    public static void main(String[] args) {
        int n=9;
        int val = (n*2)-1;

        int aa = val;
        int bb = val;

        int inc = 0;
        int ch = n;
        String arr[][] = new String[aa][bb];

        for (int k = 0; k < val; k++) {
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

        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}