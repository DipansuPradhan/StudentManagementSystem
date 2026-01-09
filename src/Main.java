import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 Add  2 View  3 Search  4 Update  5 Delete  6 Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> service.addStudent();
                case 2 -> service.viewStudents();
                case 3 -> service.searchStudent();
                case 4 -> service.updateStudent();
                case 5 -> service.deleteStudent();
                case 6 -> System.exit(0);
            }
        }
    }
}
