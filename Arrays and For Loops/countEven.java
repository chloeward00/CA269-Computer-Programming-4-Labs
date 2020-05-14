ublic class Test

{
  static int countEven(int [] nums)
  {
    int count = 0;
    for(int i = 0; i < nums.length; i++)
    {
      if(nums[i] % 2 == 0)
      {
        count++;
      }
    }
    return count;
  }

}

// counting the total of even numbers in an array 