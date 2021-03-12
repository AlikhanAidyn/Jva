import java.sql.DriverManager;

public class Read2 extends Main{

    public static void read2(){

        try {

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(connectionUrl, "postgres", "admin");

            stmt1 = connection.prepareStatement("SELECT * FROM employee ORDER BY id");   //SQL Statement for output
            rs = stmt1.executeQuery();

            while (rs.next())
                System.out.println(rs.getInt("id") + " " + rs.getString("name") +
                        " " + rs.getInt("salary"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Successfully read");
        }
    }
}
