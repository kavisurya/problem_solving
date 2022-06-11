#include <limits.h>
#include <stdio.h>
#define n1 5
#define n2 4

int main()
{
   int arr[n1][n2] = {
       {3,3,3,0},
       {1,2,3,5},
       {4,5,6,2},
       {7,8,9,8},
       {8,8,8,8}};


    int decrement = n1,count=0;
    for(int row=0; row<n1; row++)
    {
        for(int col=row; col < n2; col++)
        {
            printf("%d", arr[decrement-1][col]);
            count +=arr[decrement-1][col];
        }
        decrement--;   
        printf("\n");
    }

    printf("total : %d", count);
    return 0;
}