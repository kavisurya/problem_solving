// Input: m = 4, n = 5
// Output: Following matrix
// X X X X X
// X 0 0 0 X
// X 0 0 0 X
// X X X X X

// Input:  m = 5, n = 5
// Output: Following matrix
// X X X X X
// X 0 0 0 X
// X 0 X 0 X
// X 0 0 0 X
// X X X X X

// Input:  m = 6, n = 7
// Output: Following matrix
// X X X X X X X
// X 0 0 0 0 0 X
// X 0 X X X 0 X
// X 0 X X X 0 X
// X 0 0 0 0 0 X
// X X X X X X X 
public class test {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;

        int aa = a;
        int bb = b;

        int inc = 0;
        String arr[][] = new String[a][b];

        String ch = "X";
        String ch1 = "0";
        
        for (int k = 0; k < a; k++) {

            for (int i = inc; i < aa; i++) {

                if (i == inc || i == (aa - 1)) {
                    // System.out.println(i);
                    for (int j = inc; j < bb; j++) {
                        arr[i][j] = ch;
                    }
                }

                else {

                    for (int j = inc; j < bb; j++) {
                        if (j == inc || j == (bb - 1)) {
                            // System.out.println("J val = "+ j+ "\nINC = "+inc+ "\nbb val = "+ (bb-1)+"\n I val = "+i);
                            arr[i][j] = ch;
                        } else {
                            arr[i][j] = ch1;
                        }
                    }
                }

            }

            aa--;
            bb--;
            inc++;
            if(inc%2 == 0)
            {
                ch = "X";
                ch1 = "0";
            }
            else{
                ch = "0";
                ch1 = "X";
            }        

        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

        
    }
}