import java.util.ArrayList;
import java.util.List;

public class _SchoolRunner {

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Suleyman","ALptekin","Java", 10001, ITDepartment.DEPARTMENT_NAME);

        ITDepartment itStudents = new Student("Ali", "Can", 101,ITDepartment.DEPARTMENT_NAME,instructor);
        System.out.println(itStudents);

        Student student1 = new Student();
        student1.setFirstName("Mary");
        student1.setLastName("Jones");
        student1.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student1.setInstructor(instructor);

        Student student2 = new Student("Allie","Turtle",102,ITDepartment.DEPARTMENT_NAME,instructor);

        Student student3 = new Student();
        student3.setFirstName("Jane");
        student3.setLastName("Jacks");
        student3.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student3.setInstructor(instructor);

        Student student4 = new Student();
        student4.setFirstName("Rob");
        student4.setLastName("Robber");
        student4.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student4.setInstructor(instructor);


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Instructor instructor1 = new Instructor("Ahmedia", "Bayramioa", "Cucumber", 1002, ITDepartment.DEPARTMENT_NAME);

        instructor1.setStudentList(studentList);

        System.out.println(instructor1.getStudentList());

    }
}
