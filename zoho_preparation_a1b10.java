// Eg 1: Input: a1b10
//        Output: abbbbbbbbbb
// Eg: 2: Input: b3c6d15
//           Output: bbbccccccddddddddddddddd
// The number varies from 1 to 99.

import java.util.*;
class test{
	public static void main(String[] args) {
		
		String input = "b3c6d15";
		char inps[] = input.toCharArray();
		String con = "";
		int i=0;

		for(char a : inps)
		{
			
			if(Character.isAlphabetic(a))
			{
				for(int j= i+1; j <= i+2;j++)
				{
					if(Character.isAlphabetic(inps[j]))
					{
						break;
					}
					else
					{
						con = con + inps[j];
					}
				}

				//Printing

				for(int k = 0; k < Integer.valueOf(con); k++)
				{
					System.out.print(a);
				}
			}


			i++;
			con = "";
		}	


	}
}
