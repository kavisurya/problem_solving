import java.util.*;
public class test {
	public static void main(String[] args)
	{
		System.out.println("Hi");
		int arr1[] = {2,4,5,6,7,9,10,13};
		int arr2[] = {2,3,4,5,6,7,8,9,11,15};
		
		HashSet<Integer> hs = new HashSet<>();
		
		
		for(int i=0; i < arr1.length; i++)
		{
			hs.add(arr1[i]);
		}
		
		for(int i=0; i < arr2.length; i++)
		{
			hs.add(arr2[i]);
		}
		Iterator<Integer> itr= hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println("Done");
	}
}
