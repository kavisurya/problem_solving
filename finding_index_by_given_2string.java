// Eg 1:Input:
//         String 1: test123string
//          String 2: 123
//         Output: 4
// Eg 2: Input:
//         String 1: testing12
//         String 2: 1234 
//         Output: -1

import java.util.*;

class test {
	public static void main(String[] args) {
	
		String a = "test123string";
		String b = "123";
		int flag = 0;
		
		for(int i=0; i < a.length() - 3; i++)
			{
				if(a.substring(i, (b.length() + i)).equals(b))
				{
					System.out.println(i);
					flag = 1;
				}
			}

			if(flag == 0)
			{
				System.out.println("-1");
			}

		
		
}
}