public class countFives
{
	public static int countFives(int [] nums)
	{
		int count = 0;
		for(int i=0;i<nums.length;i++)
		{
		 if(nums[i] == 5)
		 {
		 	count+= 1;
		 }
		}
		return count;
	}
	public static void main(String [] nums)
	{
		int [] num = {2, 3, 5, 7, 11, 13, 17, 5, 0, -5, 5};
		int result = countFives(num);
		System.out.println(result);
	}

}