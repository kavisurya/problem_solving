#include <limits.h>
#include <stdio.h>
#define n 9

int main()
{
    char val[n] = {'o', 'c', 'c', 'u', 'r', 'e', 'n', 'c', 'e'};
    // char val[n] = {'m','i','s','s','i','s','s','i','p','p','i'};
    // char val[n] = {'o', 'n', 'e', 'c', 'h', 'a', 'r'};
    char v;
    int count, flag = 0, total;

    for (int i = 0; i < n; i++)
    {
        count = 1;
        for (int j = i + 1; j < n; j++)
        {
            if (val[i] == val[j])
            {
                count++;
            }
        }

        if (flag == 0)
        {
            total = count;
            v = val[i];
            flag = 1;
        }
        if (count >= total)
        {
            total = count;
            v = val[i];
        }
        // printf("%c",v);
    }

    if (total == 1)
    {
        printf("%c , %d times", val[0], total);
    }
    else
    {
        printf("%c , %d times", v, total);
    }
    return 0;
}