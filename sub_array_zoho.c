#include <limits.h>
#include <stdio.h>
#define n 5
// #define 9/2
#define sum 11


int main()
{
    // int  arr[n] = {1,5,11,5};
    int  arr[n] = {1,6,8,3,4};
    // int  arr[n] = {1,5,3};
    int flag = 0;
    for(int i=0; i <n ; i++ )
    {
        for(int j=i; j < n ; j++)
        {
            // intialing the count for counting
            int count =0;

            // substring loop
            for(int z=i; z <= j; z++)
            {
                // counting the substring values
                count = count + arr[z];
            }


            // checking if the count and sum is equal or not?
            printf("%d\n", count);
            if(count == sum)
            {
                flag = 1;
                break;
            }
        }
    }

    if(flag == 1)
    {
        printf("true\n");
    }
    else
    {
        printf("false\n");
    }
    return 0;
}