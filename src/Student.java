public class Student {
    private String name;
    private int roll;
    private String department;
    private int marks;

    public Student(String name, int roll, String department, int marks) {
        this.name = name;
        this.roll = roll;
        this.department = department;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getRoll() { return roll; }
    public String getDepartment() { return department; }
    public int getMarks() { return marks; }
}
