import java.util.*;
public class test {
	public static void main(String[] args)
	{
		System.out.println("Hi");
		String inp = "geeksforgeeks";
		char inps[] = inp.toCharArray();
		char counts[] = new char[10];
		int counts_int[] = new int[10];
		HashSet<Character> visited = new HashSet<Character>();
		int arr_position = 0;
		for(int i=0; i < inp.length(); i++)
		{
			int count_temp = 0; 
			if(!visited.contains(inps[i]))
			{
				for(int j=0; j < inps.length; j++)
				{
					if(inps[i] == inps[j])
					{
						count_temp++;
					}
					
					
				}
				
				counts[arr_position] = inps[i];
				counts_int[arr_position]= count_temp;
//				System.out.println(count_temp);
				arr_position++;
				visited.add(inps[i]);
			}
			
		}
		
			
		for(int i=0; i < 10; i++)
		{
			System.out.println(counts[i] + " "+ counts_int[i]);
			
			if(1 == counts_int[i])
			{
				System.out.println(counts[i]);
				break;
			}
		}
		
		System.out.println("Done");
	}
}

