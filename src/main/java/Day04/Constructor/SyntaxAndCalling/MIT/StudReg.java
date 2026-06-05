package Day04.Constructor.SyntaxAndCalling.MIT;

import java.util.Scanner;

public class StudReg {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);

        Student [] mitStud = new Student[5];

        System.out.println("1:accept");
        System.out.println("2:display");
        System.out.println("3:edit name");
        System.out.println("4:show email");

        int ch ;
        do {
            System.out.println("Enter choice");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    for (int i = 0; i < mitStud.length; i++) {
                        System.out.println("For choice 1");
                        System.out.println("Enter rollno , Name , city , email , percentage ");
                        Student stu6 = new Student(sc.nextInt(), sc.next(),sc.next(),sc.next(),sc.nextDouble());
                        mitStud[i] =stu6 ;
                        System.out.println("----------Accepted!--------");
                    }
                    break;
                case 2:
                    System.out.println("For choice 2");
//                    Student stu7 = new Student();
//                    stu6.displayinfo();
                    break;
                case 3:
                    System.out.println("For choice 3");
//                    Student stu8 = new Student();
                    System.out.println("Enter name");
//                    stu6.setName(sc.next());
//                    System.out.println("Updated name is: " + stu6.getName());
                    break;
                case 4:
                    System.out.println("For choice 4");
                    System.out.println("Enter roll no: ");
                    int rollno = sc.nextInt();
                    for (int i = 0; i < mitStud.length; i++) {
                        if(mitStud[i].getRollNo() == rollno){
                            System.out.println("Enter name:");

                        }
                    }
//                    System.out.println(stu6.getEmail());
                    break;
            }
        }while(ch!=5);

    }
}
