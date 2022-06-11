import java.util.*;
public class test {
	public static void main(String[] args)
	{
		System.out.println("Hi");
		int arr[] = {5,7,1,2,7,5,3};
		

		for(int i=0; i < arr.length; i++)
		{
			int count = 0;
			for(int j=0; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println(arr[i]);
			}
			
			
		}
		System.out.println("Done");
	}
}

