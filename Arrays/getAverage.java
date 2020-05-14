public class getAverage

{
  static int getAverage(int [] nums)
  {
    int total = 0;
    int count = 0;
    int avg = 0;
    for(int i = 0; i < nums.length; i++)
    {
      total = total + nums[i];
      count += 1;
    }
    avg = total/count;
    return avg;
  }
  public static void main(String [] nums)
  {
  	int [] num = {2, 3, 5, 7, 11, 13, 17};
  	int x = getAverage(num);
  	System.out.println(x);
  }

}
