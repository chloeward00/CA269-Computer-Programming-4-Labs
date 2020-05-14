public class Test
{
   public static double getPassingAverage(Student [] student)
   {
        double total_marks = 0;
        int students = 0;
      for(int i = 0; i < student.length; i++)
        if(student[i].getMark() >= 40)
        {
            total_marks += student[i].getMark();
            students++;
        }
    return total_marks/students;
   }
}