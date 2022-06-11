import java.util.Arrays;
import java.util.*;

class test{
	public static void main(String args[])
	{
		String a = "We ate Apple";
		char temp[] = new char[6];
		int tem = 0;
		
		
		for(int i=0; i < a.length(); i++)
		{

			if(String.valueOf(a.charAt(i)).equals(" "))
			{
		
				for(int j=tem; j >= 0 ; j--)
				{
					System.out.print(temp[j]);
				}
				tem = 0;
			System.out.print(" ");

			}
			else
			{
				temp[tem] = a.charAt(i);
				tem++;
			}
		}
	
		for(int j=tem; j >= 0 ; j--)
				{
					System.out.print(temp[j]);
				}

	}
}