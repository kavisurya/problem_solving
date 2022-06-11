#include <stdio.h>

//n = 7
//arr[] = S M D H M S F J S R
// MAximum array index length finding program
//input S M D H M S F J S R
//Output S


int main()
{
    printf("Hello\n");

    // Declaring valriables
    int n,i,temp=0,j,flag = 0,values,ov;
    
    // Inputs
    printf("Enter the N values : ");
    scanf("%d",&n);

    // initializing arr
    char arr[n];
    // Inputs
    for(i=0; i < n; i++)
    {
        printf("Enter Array values :");
        scanf("%s", &arr[i]);
    }

    //Codes
    for(i=0; i < n; i++)
    {
        //  S M D H M S F J S R
        for(j = i+1; j < n; j++)
        {
            if(arr[i] == arr[j])
            {
                // initialing the flag once will be work
                if(flag == 0)
                {
                    // finding the length j - i 
                    ov = j - i;
                    flag = 1;
                    //Storing the arr char value respect to that index
                    values = arr[i];
                }

                if(ov < (j-i))
                {
                    ov =  j - i;
                    values = arr[i];
                }
            }
        }
        
    }
    

    printf("\nArray values are : %s" , arr);
    printf("\nMaximum Length : %d", ov);
    printf("\nValues : %c", values);

    printf("Done");
    return 0;
}
