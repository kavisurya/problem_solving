#include <stdio.h>
#define s1n 15
#define s2n 4

int main()
{
    char s1[s1n] = "ZOHOCORPORATION";
    char s2[s2n] = "PORT";
    int arr_index[s2n], inc = 0;


// Finding Index
    for(int i=0; i < s2n; i++)
    {
        for(int j=0; j <s1n; j++)
        {
            if(s2[i] == s1[j])
            {
                arr_index[inc] = j;
                inc++;
                break;
            }
        }
    }

    // like [7,1,6,11]
inc = 0;


// Sorting the array

    int temp=0;
    for(int i=0; i< s2n; i++)
    {
        for(int j = i+1; j<s2n; j++ )
        {
            if(arr_index[i] >= arr_index[j])
            {
                temp = arr_index[j];
                arr_index[j] = arr_index[i];
                arr_index[i] = temp;
            }
        }
    }


    // for (int i = 0; i < s2n; i++)
    // {
    //     /* code */
    //     printf("%d ", arr_index[i]);
    // }
    // printf("%d\n", arr_index[s2n-1]);
    

    //printing the values
    for(int i=arr_index[0]; i<= arr_index[s2n-1]; i++)
    {
        // printf("%d ,", arr_index[s1n]);
        printf("%c ", s1[i]);
    }

    return 0;
}