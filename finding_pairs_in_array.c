#include <limits.h>
#include <stdio.h>

// int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
// Read more: https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz7PVfs7cXG
//    4. How to find all pairs of integer arrays whose sum is equal to a given number? (solution)


int main()
{
    // int arr[10] = { 2, 4, 3, 5, 7, 8, 9 };
    int arr[15] = { 0, 14, 0, 4, 7, 8, 3, 5, 7 };
    int n = 11;

    for(int i=0; i < 8; i++)
    {
        int first = arr[i];
        for(int j= i+1; j < 8; j++)
        {
            int second = arr[j];
            if((first + second) == n)
            {
                printf("(%d , %d)", first,second);
            }
        }
    }
   
    return 0;
}
