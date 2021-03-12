import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main{

    public static String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";
    public static Connection connection = null;
    public static PreparedStatement stmt1 = null;
    public static PreparedStatement stmt2 = null;
    public static ResultSet rs = null;
    public static ResultSet rs2 = null;

    public static int id;
    public static String name;
    public static int salary;
    public static int number;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Read2.read2();
        Read.read();
    }
}
