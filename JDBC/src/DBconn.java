import java.sql.*;

public class DBconn {
    public static final String DB_URL = "jdbc:mysql://localhost/jdbc_task";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        String sql = "SELECT * FROM employees";

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);

            while (data.next()){
                System.out.println("ID : "+data.getInt("id"));
                System.out.println("AD : "+data.getString("name"));
                System.out.println("Pozisyon : "+data.getString("position"));
                System.out.println("Maaş : "+data.getInt("salary") + " TL");
                System.out.println("**********************");
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
