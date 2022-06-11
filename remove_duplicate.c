#include <stdio.h>
#include <string.h>
// Removing the duplicates
int removeDuplicates(int* nums, int numsSize){
    int temp=0;
    for(int i=0; i < numsSize; i++)
    {
        if(nums[i] != nums[i+1])
        {
            nums[temp] = nums[i];
            temp++;
        }
        else
        {
            nums[temp] = 0;
            temp++;
        }
    }
    for(int i=0; i < 5; i++)
    printf("%d\n",nums[i]);
}

int main()
{
    printf("Hellos\n");

    // int nums[11] = {0,0,1,1,1,2,2,3,3,4};
    int nums[11] = {1,1,1,1,1};

    removeDuplicates(nums, 5);
    // printf("%d",removeDuplicates(nums, 10));

    return 0;
}
