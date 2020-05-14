ublic class Average
{
    public static double averageArea(Shape [] arr)
    {
        double average = 0;
        
        int i;
        for(i=0;i < arr.length; i++)
        {
            average = average + arr[i].area();
        }
        
        return average / arr.length;
    }
}