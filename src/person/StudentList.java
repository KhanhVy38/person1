package person;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    private ArrayList<Student> studentList= new ArrayList<>();

    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap Thong Tin Sinh Vien " + (i + 1) + ":");
            Student student = new Student();
            student.addStudent(student);
            studentList.add(student);
        }
    }

    public void updateStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID sinh vien can cap nhat: ");
        String id = sc.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                System.out.println("Cap nhat thong tin sinh vien:");
                Student updatedStudent = studentList.get(i);

                System.out.print("Nhap Ten moi: ");
                updatedStudent.setFullName(sc.nextLine());

                System.out.print("Nhap Nganh moi: ");
                updatedStudent.setMajor(sc.nextLine());

                System.out.print("Nhap GPA moi: ");
                updatedStudent.setGpa(Float.parseFloat(sc.nextLine()));

                System.out.print("Nhap Ngay Sinh moi: ");
                String dobStr = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    updatedStudent.setDateOfBirth(sdf.parse(dobStr));
                } catch (Exception e) {
                    System.out.println("Wrong Format!");
                }

                studentList.set(i, updatedStudent);
            }
        }
    }

    public void deleteStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID sinh vien can xoa: ");
        String id = sc.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.remove(i);
                System.out.println("Sinh vien voi ID: " + id + " da bi xoa.");
            }
        }
    }

    public void displayAllStudents() {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            student.displayInfo();
            System.out.println();
        }
    }

    public void findTopStudent() {
        Student topStudent = studentList.get(0);
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getGpa()> topStudent.getGpa()) {
                topStudent = student;
            }
        }
        System.out.println("Sinh vien co GPA cao nhat la:");
        topStudent.displayInfo();
    }
}
