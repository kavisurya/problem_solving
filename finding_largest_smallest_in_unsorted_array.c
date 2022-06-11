#include <limits.h>
#include <stdio.h>
//  3. How to find the largest and smallest number in an unsorted integer array? (solution)

// Read more: https://www.java67.com/2018/05/top-75-programming-interview-questions-answers.html#ixzz7POasiaXd
// Output:
// Given integer array : [-20, 34, 21, -87, 92, 2147483647]
// Largest number in array is : 2147483647
// Smallest number in array is : -87
// Given integer array : [10, -2147483648, -2]
// Largest number in array is : 10
// Smallest number in array is : -2147483648
// Given integer array : [2147483647, 40, 2147483647]
// Largest number in array is : 2147483647
// Smallest number in array is : 40
// Given integer array : [1, -1, 0]
// Largest number in array is : 1
// Smallest number in array is : -1

// Read more: https://www.java67.com/2014/02/how-to-find-largest-and-smallest-number-array-in-java.html#ixzz7PObGWOOr

int main()
{
    int smallest = INT_MIN;
    int largest = INT_MAX;
    printf("Hello\n");

    int nums[11] = {-20, 34, 21, -87, 92};
    // printf("%d\n", INT_MIN);
    // printf("%d\n", INT_MAX);

    for (int i = 0; i < 5; i++)
    {

        if (nums[i] < largest)
        {
            largest = nums[i];
        }
        else if (nums[i] > smallest)
        {
            smallest = nums[i];
        }
    }

    printf("%d\n", smallest);
    printf("%d\n", largest);

    return 0;
}
