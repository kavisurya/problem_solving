// Eg 1: Input: 13,2 4,15,12,10,5
//         Output: 13,2,12,10,5,15,4
// Eg 2: Input: 1,2,3,4,5,6,7,8,9
//         Output: 9,2,7,4,5,6,3,8,1 

import java.util.*;
class test{
	public static void main(String[] args) {
	int n=0;
	String inp = "1,2,3,4,5,6,7,8,9";
	char vals[] = new char[(inp.length()/2)+1];
	LinkedList <String> ll1 = new LinkedList <String> ();


	for(int i=0; i < inp.length(); i++)
	{

		if(String.valueOf(inp.charAt(i)).equals(","))
		{
			
		}
		else
		{
			vals[n] = inp.charAt(i);
			n++;

			if((Integer.valueOf(inp.charAt(i)) % 2) == 0)
			{
				ll1.add(String.valueOf(inp.charAt(i)));
			}
		}
	}

	ListIterator list_iter = ll1.listIterator();

	for(int i=vals.length-1; i >= 0; i--)
	{

		if((Integer.valueOf(vals[i]) % 2) == 1)
		{
			System.out.print(vals[i]);
		}
		else
		{
			System.out.print(list_iter.next());
		}

	}
	
}}