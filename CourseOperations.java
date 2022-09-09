package interfaces;
import classes.Course;
public interface CourseOperations
{
   
   boolean addcourse(Course c);
   boolean remomovecourse(Course c);
   Course searchCourse(int courseCode);
   void shwoAllcourses();
   

}