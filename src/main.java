import java.sql.*;
public class main {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver" );
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://std-mysql.ist.mospolytech.ru:3306/std_2281_test" ,
                    "std_2281_test" , "12345678" );
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM employees" ;
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                int id = result.getInt("id" );
                String name = result.getString("name" );
                int salary = result.getInt("salary" );

                System.out.println("Employ:");
                System.out.println("id = " + id + "; name = " + name + "; salary = " + salary + ".");

            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}