package Com.OOP.Programs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course = new Course("Psychology");
    Course course2 = new Course("Political Science");

@Test
    public void getCourseName(){
    Course course1 = new Course("Psychology");
    course1.getCourseName();
    assertNotNull(course1.getCourseName());
}
@Test
    public void getCourseName2(){
    Course course1 = new Course("Political Science");
    course2.getCourseName();
    assertNotNull(course1.getCourseName());
}
@Test
    public void getStudentsDuringTheCourse(){
    //course.getNumberOfSudents(100);
  //  assertEquals(100,course.getNumberOfSudents(100));
}

@Test
    public void addStudentsToTheCourse(){
    //course.getNumberOfSudents(100);
    course.addStudents("John");
    course.addStudents("Nkwachi");
    course.addStudents("Nkwachi");
    assertEquals(3, course.getNumberOfSudents());
}
@Test
    public void addStudentsToTheCourse2(){
       // course2.getNumberOfSudents(100);
        course2.addStudents("John");
        course2.addStudents("Nkwachi");
       assertEquals(2, course2.getNumberOfSudents());
    }
@Test
    public void dropNumberOfStudets(){
    course.addStudents("John");
    course.addStudents("John");
    course.dropStudents("John");
    assertEquals(1, course.getNumberOfSudents());
}
@Test
    public void getAStudents(){
    course.addStudents("John");
    course.addStudents("Jo");
    String studentName = course.getStudent("Jo");
    assertNotNull(studentName);
}

}