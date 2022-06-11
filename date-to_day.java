import java.util.Arrays;

class test{
	public static void main(String args[])
	{
		int months_value[] = {0,3,3,6,1,4,6,2,5,0,3,5};
		String days[] = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday" };
		// String date = "28/07/2022";
		// String date = "01/06/2032";
		String date = "26/05/2001";

		String data_arr[] = date.split("/");
		int sum;
		float sec_step = 1/4f;
		

		sum = (Integer.parseInt(data_arr[data_arr.length-1].substring(2))) +  (Integer.parseInt(data_arr[0]) + (months_value[Integer.parseInt(data_arr[1])-1]))+ (eroid(Integer.parseInt(data_arr[data_arr.length-1])));




		System.out.println(Integer.parseInt(data_arr[data_arr.length-1].substring(2)));
		System.out.println(sec_step);
		System.out.println(Integer.parseInt(data_arr[0]));
		System.out.println(months_value[Integer.parseInt(data_arr[1])-1]);
		System.out.println(eroid(Integer.parseInt(data_arr[data_arr.length-1])));
		int cal = sum+ (int)sec_step;
		System.out.println(cal);

		System.out.println(cal%7);
		System.out.println(days[(cal%7)]);

	}

	public static int eroid(int year){
		if(year >= 1500 && year <= 1599)
		{
			return 0;
		}
		else if(year >= 1600 && year <= 1699)
		{
			return 6;
		}
		else if(year >= 1700 && year <= 1799)
		{
			return 4;
		}
		else if(year >= 1800 && year <= 1899)
		{
			return 2;
		}
		else if(year >= 1900 && year <= 1999)
		{
			return 0;
		}
		else if(year >= 2000 && year <= 2099)
		{
			return 6;
		}
		
		else{
		return 0;
		}
	}
}