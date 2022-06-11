import java.util.Arrays;

class anagram{
	public static void main(String args[])
	{
		System.out.println("Hi");

		String a = "geeks";
		String b = "ke egs";
		String a1 = a.replaceAll(" ", "").toLowerCase();
		String a2 = b.replaceAll(" ", "").toLowerCase();

		if(a1.length() != a2.length())
		{
			System.out.println("Not anagram");
		}
		else
		{
			char toChar1[] = a1.toCharArray();
			char toChar2[] = a2.toCharArray();


			Arrays.sort(toChar1);
			Arrays.sort(toChar2);

			if(Arrays.equals(toChar1, toChar2))
			{
				System.out.println("anagram");
			
			}
			
		}

	}
}