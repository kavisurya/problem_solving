// Spiral printing
// 1 2 3 4 8 12 16 15 14 13 9 5 
// 6 7 11 10


// 1 2 3 4 5 6 7 14 21 28 35 42 49 48 47 46 45 44 43 36 29 22 15 8 
// 9 10 11 12 13 20 27 34 41 40 39 38 37 30 23 16 
// 17 18 19 26 33 32 31 24 
// 25 


public class college_classess_10 {
    public static void main(String[] args) {
        

        int array[][] = {
            {1,2,3,4,5,6,7},
            {8,9,10,11,12,13,14},
            {15,16,17,18,19,20,21},
            {22,23,24,25,26,27,28},
            {29,30,31,32,33,34,35},
            {36,37,38,39,40,41,42},
            {43,44,45,46,47,48,49}
        };


        int n = array.length;
        // For loop for printing

        for(int i=0; i < n; i++)
        {
            // 1st loop upper left to right
            int j=0;
            for(j=i; j < n-i; j++)
            {
                System.out.print(array[i][j]+ " ");
            }
            
            j--;
            // 2nd loop top to bottom
            for(int k=i+1; k <n-i; k++)
            {
                // System.out.println("J value is : "+j+ " k values is :"+k);
                System.out.print(array[k][j]+ " ");
            }
            

            // 3rd loop right to left
            for(int m=j-1; m >= i; m--)
            {
                System.out.print(array[j][m]+ " ");
            }

            // 4th loop bottom to top
            for(int p=j-1; p > i; p--)
            {
                System.out.print(array[p][i]+ " ");
            }
            System.out.println();


        }
    }
}
