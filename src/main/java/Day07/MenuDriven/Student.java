package Day07.MenuDriven;

public class Student {
//------------------------------------------------------------------------------------------------------------------
    private int studId ;
    private String name ;
    private double marks ;
//------------------------------------------------------------------------------------------------------------------
    public void displayInfo(){
        System.out.println("Student details are:" + studId + " " + name + " " + marks);
    }
//------------------------------------------------------------------------------------------------------------------
    public Student(int studId, String name, double marks) {
        this.studId = studId;
        this.name = name;
        this.marks = marks;
    }
//------------------------------------------------------------------------------------------------------------------
    public Student(){
        System.out.println("----------Default Constructor----------");
    }
//------------------------------------------------------------------------------------------------------------------
    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    //------------------------------------------------------------------------------------------------------------------
}
