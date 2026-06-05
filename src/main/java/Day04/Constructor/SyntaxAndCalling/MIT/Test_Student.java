package Day04.Constructor.SyntaxAndCalling.MIT;

import java.util.Scanner;

public class Test_Student {
    public static void main(String[] args) {

//------------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);

//------------------------------------------------------------------------------------------------------------------

//        Student stu = new Student();
//        stu.setCity("Nashik");
//        System.out.println("Update value: " + stu.getCity());

//------------------------------------------------------------------------------------------------------------------

        Student[] allStd = new Student[5];
        Student stu1 = new Student(101, "Ram", "Pune1", "12@email.com", 89);
        Student stu2 = new Student(102, "Sham", "Pune2", "34@email.com", 90);
        Student stu3 = new Student(103, "Gham", "Pune3", "56@email.com", 99);
        Student stu4 = new Student(104, "Pan", "Pune4", "78@email.com", 76);
        Student stu5 = new Student(105, "Nammu", "Pune5", "90@email.com", 78);

//------------------------------------------------------------------------------------------------------------------

        allStd[0] = stu1;
        allStd[1] = stu2;
        allStd[2] = stu3;
        allStd[3] = stu4;
        allStd[4] = stu5;

//------------------------------------------------------------------------------------------------------------------

        for (int i = 0; i < allStd.length; i++) {
            System.out.println(allStd[i]);
        }

//------------------------------------------------------------------------------------------------------------------
        //Static:-

        Student.displayClg();
//

    }
}
