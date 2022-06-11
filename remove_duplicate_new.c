#include <limits.h>
#include <stdio.h>

// int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };

int main()
{
    int tt[7] = {2, 2, 3, 5, 7, 8, 9};
    int res[7];
    res[0] = tt[0];
    int previous = tt[0];

    for (int i = 1; i < 7; i++)
    {
        if (previous != tt[i])
        {
            res[i] = tt[i];
        }
        else
        {
            previous = tt[i];
            res[i] = 0;
        }
    }

    for (int j = 0; j < 7; j++)
    {
        printf("%d", res[j]);
    }

    return 0;
}