package Com.OOP.Programs;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public int getNumberOfSudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;

    }

    public void addStudents(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudents(String student) {
        students[numberOfStudents]= student;
        numberOfStudents--;
    }
    public String getStudent(String student){
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(student)){
                return students[i];
            }
        }
        return null;
    }
}
