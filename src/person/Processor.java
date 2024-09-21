package Person;

import java.util.Scanner;
import person.StudentList;

public class Processor {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student by ID");
            System.out.println("3. Delete a student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.updateStudentById();
                    break;
                case 3:
                    studentList.deleteStudentById();
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    studentList.findTopStudent();
                    break;
                case 6:
                    System.out.println("Ket thuc chuong trinh!!!");
                    break;
                default:
                    System.out.println("Vui long chon lai!!!");
            }
        } while (choice != 6);
    }
}