#include <limits.h>
#include <stdio.h>
#define n 16
// int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
// Read more: https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz7PVfs7cXG
//    4. How to find all pairs of integer arrays whose sum is equal to a given number? (solution)

int main()
{
    char name[n] = "Hello World guys";
    char temp[n / 2], dd = 0, space = 1;

    // calculating the space value like how many spaces in the char
    for (int i = 0; i < n; i++)
    {
        if (name[i] == ' ')
        {
            space++;
        }
    }

    for (int i = 0; i < n; i++)
    {
        // checking not equal to spaces
        if (name[i] != ' ')
        {
            temp[dd] = name[i];
            dd++;
        }
        // if space came, print the values in reverse order and remove the values too.
        else
        {
            // (n/2) = > 16/2 = 8,
            // space = 3 + 1 = 4 ==> 8-4 = 4
            for (int j = (n / 2) - (space + 1); j >= 0; --j)
            {
                printf("%c", temp[j]);
                //deallocating the memory
                temp[j] = '\0';
            }

            dd = 0;
            printf(" ");
        }
    }

    printf(" ");

    //Finally printing the last words
    for (int j = (n / 2) - (space + 1); j >= 0; --j)
    {
        printf("%c", temp[j]);
    }
    // printf("%s", temp);

    return 0;
}