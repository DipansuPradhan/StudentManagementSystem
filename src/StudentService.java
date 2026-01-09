import java.util.Scanner;

public class StudentService {

    private StudentDAO dao = new StudentDAO();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        System.out.print("Marks: ");
        int marks = sc.nextInt();

        dao.addStudent(new Student(name, roll, dept, marks));
    }

    public void viewStudents() { dao.viewStudents(); }

    public void searchStudent() {
        System.out.print("Enter Roll: ");
        dao.searchStudent(sc.nextInt());
    }

    public void updateStudent() {
        System.out.print("Roll: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("New Name: ");
        String name = sc.nextLine();

        System.out.print("New Department: ");
        String dept = sc.nextLine();

        System.out.print("New Marks: ");
        int marks = sc.nextInt();

        dao.updateStudent(new Student(name, roll, dept, marks));
    }

    public void deleteStudent() {
        System.out.print("Enter Roll: ");
        dao.deleteStudent(sc.nextInt());
    }
}
