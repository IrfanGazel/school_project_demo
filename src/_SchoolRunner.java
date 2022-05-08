public class _SchoolRunner {

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Suleyman","ALptekin","Java", 10001, ITDepartment.DEPARTMENT_NAME);

        ITDepartment itStudents = new Student("Ali", "Can", 101,ITDepartment.DEPARTMENT_NAME,instructor);
        System.out.println(itStudents);

        Student student1 = new Student();
        student1.setFirstName("Filiz");
        student1.setLastName("Onat");
        student1.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student1.setInstructor(instructor);

        Student student2 = new Student("Ali","Turkes",102,ITDepartment.DEPARTMENT_NAME,instructor);
        Student student3 = new Student();
        Student student4 = new Student();

    }
}
