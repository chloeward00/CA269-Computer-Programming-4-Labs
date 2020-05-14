public class Test {
    public static Student getBestStudent(Student [] student) // calling from student class
    {
        Student best_student = student[0];
        for(int i = 1; i < student.length; i++) {
            if(student[i].getMark() > best_student.getMark()) {
                best_student = student[i];
            }
      }
    return best_student;
   } 
}