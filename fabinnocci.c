#include <limits.h>
#include <stdio.h>
#define TRUE 1

int main()
{
    int n=10;
    int temp1 = 0,temp2=1;
    int val = temp1+temp2;
    printf("%d %d ", temp1,temp2); 
    for(int i=3; i <= n;i++)
    {
        printf("%d ", (val));
        temp1 = temp2;
        temp2 = val;
        val = temp1 + temp2;

    }
    return 0;
}