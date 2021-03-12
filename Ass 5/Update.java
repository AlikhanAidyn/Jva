import java.sql.DriverManager;

public class Update extends Main{

    public static void update(int id, int number){

        try {

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(connectionUrl, "postgres", "redmi5+5+");

            stmt2 = connection.prepareStatement("SELECT * FROM employee WHERE id = ?");
            stmt2.setInt(1, id);
            rs = stmt2.executeQuery();

            while (rs.next())
                salary = rs.getInt("salary");

            stmt1 = connection.prepareStatement("UPDATE main SET number = ?, total = ? WHERE id = ?");
            stmt1.setInt(1, number);
            stmt1.setInt(2, salary);
            stmt1.setInt(3, id);

            stmt1.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Successfully updated");
        }
    }
}
