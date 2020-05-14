
public class Test

{
  static int [] reverse(int [] nums)
  {
    int len = nums.length - 1;
    for (int i = 0, j = len; i <= j; i++, j--) 
    {
      int ans = nums[i];
      nums[i] = nums[j];
      nums[j] = ans;
    }
    return nums;
    }
  }
