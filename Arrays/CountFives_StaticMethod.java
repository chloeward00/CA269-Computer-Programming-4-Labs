
public class Test

{
  static int countFives(int [] nums)
  {
    int count = 0;
    for(int i = 0; i < nums.length; i++)
    {
      if(nums[i] == 5)
      {
        count++;
      }
    }
    return count;
  }

}
