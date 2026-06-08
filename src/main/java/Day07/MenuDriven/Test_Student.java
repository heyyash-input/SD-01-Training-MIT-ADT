package Day07.MenuDriven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student stud1 = new Student();

//        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> names = NamesUtil.getAllName();

        System.out.println("1:Add name");
        System.out.println("2:Show");
        System.out.println("3:search");
        System.out.println("4:Get by index");
        System.out.println("5:Remove");
        System.out.println("6:Sort");

        int ch;
        do {
            System.out.println("Enter choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter name: ");
                    names.add(sc.next()); // add name
                    break;
                case 2:
                    for (String str : names) {
                        System.out.println("s: " + str);
                    }
                    break;
                case 3:
                    System.out.println("Enter name ");
                    String str1 = sc.next();
                    System.out.println(names.contains(str1));
                    break;

                case 4:
                    System.out.println("Enter value to get ");
                    System.out.println(names.get(sc.nextInt()));
                    break;
                case 5:
                    System.out.println(names.remove(sc.next()));
                    break;
                case 6:
                    Collections.sort(names);
                    break;
                default:
                    System.out.println("Enter valid options");
            }
        } while (ch != 4);

    }
}
