package Day04.Assignment.StudentManagementSystem;

import Day04.Constructor.SyntaxAndCalling.MIT.Student;

import java.util.Scanner;

public class Test_Student {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
//----------------------------------------------------------------------------------------------------------------
        Student01[] studArr = new Student01[5]; // array declaration

        studArr[0] = new Student01(101, "Amit", 89);
        studArr[1] = new Student01(102, "Priya", 99);
        studArr[2] = new Student01(103, "Ram", 100);
        studArr[3] = new Student01(104, "Sham", 84);
        studArr[4] = new Student01(105, "Yash", 97);

        System.out.println("-------Student Details using getters-------");

        System.out.println("1: Get topper ");
        System.out.println("2: Update marks ");
        System.out.println("3: Average Marks ");
        System.out.println("4: Display Details ");

        int ch;

        do {
            System.out.println("-----Enter your choice-----");
            ch = sc.nextInt();
            switch (ch) {
                case 1:

                    System.out.println("Get topper");
                    Student01 topper = studArr[0];
                    for (int i = 0; i < studArr.length; i++) {
                        if (studArr[i].getMarks() > topper.getMarks()) {
                            topper = studArr[i];
                        }
                    }
                    System.out.println("Topper is:" + topper + "with" + topper.getMarks());
                    break;

                case 2:

                    System.out.println("Enter Student ID to update");
                    int marksUpdate = sc.nextInt();
                    boolean isFound = false;
                    for (int i = 0; i < studArr.length; i++) {
                        if (studArr[i].getStudentId() == marksUpdate) {
                            System.out.println("Enter marks for: " + studArr[i].getStudentName());
                            double newMarks = sc.nextDouble();
                            studArr[i].setMarks(newMarks);
                            System.out.println("Marks updated successfully");
                            studArr[i].displayInfo();
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Student ID doesnt exist ");
                    }
                    break;

                case 3:

                    System.out.println("--- Average Marks ---");
                    double totalMarks = 0;
                    for (int i = 0; i < studArr.length; i++) {
                        totalMarks += studArr[i].getMarks();
                    }
                    double average = totalMarks / studArr.length;
                    System.out.println("Average Marks of the class: " + average);
                    break;

                case 4:

                    System.out.println("---------Student Details---------");
                    for (int i = 0; i < studArr.length; i++) {
                        studArr[i].displayInfo();
                    }
                    break;

                case 5:

                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (ch != 6);


    }
}
