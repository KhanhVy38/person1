package person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major, double tuiition, boolean schoolarship, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addStudent(Student st) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        String id = sc.nextLine();
        st.setId(id);
        System.out.println("fullName:");
        String fullName = sc.nextLine();
        st.setFullName(fullName);
        System.out.println("gpa:");
        float GPA = Float.parseFloat(sc.nextLine());
        st.setGpa(gpa);
        System.out.println("dateOfBirth:");
        String dateOfBirthString = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBirthString);
            st.setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("sai");
        }
        System.out.println("major:");
        String major = sc.nextLine();
        st.setMajor(major);
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("id: " + id + ", full Name: " + fullName + ", dateOfBirth:"
                + sdf.format(dateOfBirth) + ", GPA: " + gpa + ", major " + major);
    }

}
