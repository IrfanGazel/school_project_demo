import java.util.ArrayList;
import java.util.List;

public class Student implements ITDepartment, LanguageDepartment {

    private String firstName;
    private String lastName;
    private int id;
    private String departmentName;
    private String labName;
    private boolean isLabAvailable;

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    private Instructor instructor;
    private List<Instructor> instructorList = new ArrayList<>();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, int id, String departmentName, Instructor instructor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.departmentName = departmentName;
        this.instructor = instructor;
    }

    @Override
    public String departmentName() {
        return departmentName;
    }

    @Override
    public Instructor instructor() {
        return instructor;
    }

    @Override
    public Student student() {
        return this;
    }

    @Override
    public String labName() {
        return labName;
    }

    @Override
    public boolean isLabAvailable() {
        return isLabAvailable;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", instructor=" + instructor +
                '}';
    }
}
