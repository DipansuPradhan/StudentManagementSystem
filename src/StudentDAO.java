import java.sql.*;

public class StudentDAO {

    public void addStudent(Student s) {
        String sql = "INSERT INTO students VALUES (NULL, ?, ?, ?, ?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());
            ps.setInt(2, s.getRoll());
            ps.setString(3, s.getDepartment());
            ps.setInt(4, s.getMarks());

            ps.executeUpdate();
            System.out.println("Student added successfully!");

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Roll number already exists!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {
        String sql = "SELECT * FROM students";

        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- Student List ---");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("roll") + " | " +
                    rs.getString("department") + " | " +
                    rs.getInt("marks")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchStudent(int roll) {
        String sql = "SELECT * FROM students WHERE roll=?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, roll);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(
                    rs.getString("name") + " | " +
                    rs.getString("department") + " | " +
                    rs.getInt("marks")
                );
            } else {
                System.out.println("Student not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Student s) {
        String sql = "UPDATE students SET name=?, department=?, marks=? WHERE roll=?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getDepartment());
            ps.setInt(3, s.getMarks());
            ps.setInt(4, s.getRoll());

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Student updated successfully!");
            else
                System.out.println("Student not found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int roll) {
        String sql = "DELETE FROM students WHERE roll=?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, roll);
            ps.executeUpdate();
            System.out.println("Student deleted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
