package Day04.Assignment.StudentManagementSystem;

public class Student01 {

//----------------------------------------------------------------------------------------------------------------

   private int  studentId;
   private String  studentName;
   private double marks;

//----------------------------------------------------------------------------------------------------------------

    public Student01(int studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

//----------------------------------------------------------------------------------------------------------------

    public Student01() {
        System.out.println("----Default Constructor----");
    }

//----------------------------------------------------------------------------------------------------------------

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMarks() {
        return marks;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

//----------------------------------------------------------------------------------------------------------------

    public void displayInfo (){
        System.out.println("Student details: " + studentId + " " + studentName + " " + marks);
    }

//----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Student01{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                '}';
    }

//---------------------------------------------------------------------------------------------------------------
}
