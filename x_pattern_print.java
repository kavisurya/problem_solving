// Eg 1: Input: 12345
//        Output:
// 1       5
//   2   4
//     3
//   2  4
// 1      5

import java.util.*;
class test{
	public static void main(String[] args) {
	
		String inp = "12345";
		int len = inp.length()-1;
		int len1 = len;

		for(int i=0; i <= len; i++,len1--)
		{
			for(int j =0; j <=len; j++)
			{
				if(j==i || j == len1)
					System.out.print(inp.charAt(j));
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}}