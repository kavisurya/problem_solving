// 1) Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.

//     Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
//          Output : {7, 1, 6, 2, 5, 3, 4} 
import java.util.*;

class test {
	public static void main(String[] args) {
	
	int a[] = {1, 2, 3, 4, 5, 6, 7};
	Arrays.sort(a);

	for(int i=0, j=a.length-1; i <= (a.length/2); i++, j--)
	{

		if(j==i)
		{
			System.out.print(a[j]);			
		}
		else{
			System.out.print(a[j]+","+a[i]+",");
		}
	}
		
}
}