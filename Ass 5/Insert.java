import java.sql.DriverManager;

public class Insert extends Main{
    public static void insert(int id, int number){

        try {

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(connectionUrl, "postgres", "redmi5+5+");

            String sql = "insert into main " + " (id, name, number, salary, total)" + " values (?, ?, ?, ?, ?)";
            stmt1 = connection.prepareStatement(sql);

            stmt2 = connection.prepareStatement("SELECT * FROM employee WHERE id = ?");
            stmt2.setInt(1, id);
            rs = stmt2.executeQuery();

            while (rs.next()){
                name = rs.getString("name");
                salary = rs.getInt("salary");
            }

            total = number * salary;

            stmt1.setInt(1, id);
            stmt1.setString(2, name);
            stmt1.setInt(3, number);
            stmt1.setInt(4, salary);
            stmt1.setInt(5, total);

            stmt1.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Successfully inserted");
        }
    }
}
