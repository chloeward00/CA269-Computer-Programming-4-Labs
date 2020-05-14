public class CountFives
{
	public int CountFives(int [] num)
	{
		int count = 0;
		for(int i=0;i<num.length;i++)
		{
		 if(num[i] == 5)
		 {
		 	count+= 1;
		 }
		}
		return count;
	}
	public static void main(String [] num)
	{
		int [] num = {2, 3, 5, 7, 11, 13, 17, 5, 0, -5, 5};
		int result = CountFives(num);
		System.out.println(result);
	}

}