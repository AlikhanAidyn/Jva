import java.sql.DriverManager;

public class Delete extends Main{

    public static void delete(int id){

        try {

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(connectionUrl, "postgres", "admin");

            stmt1 = connection.prepareStatement("DELETE FROM main WHERE id = ?");
            stmt1.setInt(1, id);

            stmt1.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Successfully deleted");
        }
    }
}
