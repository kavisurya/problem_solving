public class zoho_problem_solve_4 {

    public static void main(String args[])
    {
        int arr[]= {1,3,9,5,6,2};
		int n = arr.length;

        for (int i=0; i<n; i++)
		{
            int k =-1;
			for(int j=i+1; j < n; j++)
            {
                if(arr[j] > arr[i] && (arr[j] < k || k == -1))
                {
                    k = arr[j];
                }
            }

            System.out.println(k);
		}
    }
}