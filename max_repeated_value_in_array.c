#include <stdio.h>

// n = 7
// arr[] = S M D H M S F J S R
//  MAximum array repeated finding program
// input S M D H M S F J S R
// Output S

int main()
{
    printf("Hello\n");

    // Declaring valriables
    int n, i, temp = 0, j, flag = 0, values, temp1 = 0;

    // Inputs
    printf("Enter the N values : ");
    scanf("%d", &n);

    // initializing arr
    char arr[n];
    // Inputs
    for (i = 0; i < n; i++)
    {
        printf("Enter Array values :");
        scanf("%s", &arr[i]);
    }

    // Codes
    for (i = 0; i < n; i++)
    {
        //  S M D H M S F J S R
        for (j = i + 1; j < n; j++)
        {
            if (arr[i] == arr[j])
            {

                temp1++;
            }
        }

        if (flag == 0)
        {
            temp = temp1;
            flag = 1;
            temp1 = 0;
            values = arr[i];
        }
        else
        {
            if (temp < temp1)
            {
                temp = temp1;
                // Storing the arr char value respect to that index

                values = arr[i];
                temp1 = 0;
            }
        }
    }

    printf("\nArray values are : %s", arr);
    printf("\nMaximum repeated value : %d", temp+1);
    printf("\nValues : %c", values);

    printf("\nDone\n");
    return 0;
}
