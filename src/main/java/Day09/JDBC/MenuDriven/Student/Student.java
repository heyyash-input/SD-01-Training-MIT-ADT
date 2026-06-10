package Day09.JDBC.MenuDriven.Student;

//POJO:
public class Student {
//----------------------------------------------------------------------------------------------------------------
    private int studID ;
    private String name , city  ;
    private double marks ;
//----------------------------------------------------------------------------------------------------------------
    public Student(int studID, String name, String city, double marks) {
        this.studID = studID;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }
//----------------------------------------------------------------------------------------------------------------
    public Student (){
        System.out.println("---------Default Constructor called --------");
    }
//----------------------------------------------------------------------------------------------------------------
    public int getStudID() {
        return studID;
    }

    public void setStudID(int studID) {
        this.studID = studID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
//----------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Student{" +
                "studID=" + studID +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", marks=" + marks +
                '}';
    }
//----------------------------------------------------------------------------------------------------------------

}
