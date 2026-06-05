package Day04.Constructor.SyntaxAndCalling.MIT;

public class Student {

//------------------------------------------------------------------------------------------------------------------

    private int rollNo ;
    private String name , city , email;
    private double percentage;

//-------------------------------------------------------------------------------------------------------------

    private static String clgName;

    static {
        System.out.println("----------MIT-------");
        clgName = "MIT" ;
    }

    public static void displayClg(){
        System.out.println(clgName);
    }

//------------------------------------------------------------------------------------------------------------------

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

//---------------------------------------------------------------------------------------------------------------

    public void displayinfo(){
        System.out.println("Student Details: " + rollNo+" "+name+" "+city+" "+email+" "+percentage);
    }

//----------------------------------------------------------------------------------------------------------------

    public Student(int rollNo, String name, String city, String email, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
        this.email = email;
        this.percentage = percentage;
    }

//------------------------------------------------------------------------------------------------------------------

    public Student () {
        System.out.println("---------Default Constructor---------");
    }

//------------------------------------------------------------------------------------------------------------------

//    public String toString(){
//        return "" + rollNo + " "
//    }

//-----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", percentage=" + percentage +
                '}';
    }

//------------------------------------------------------------------------------------------------------------------


}
