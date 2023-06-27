import java.sql.*;
public class main1 {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver" );
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://std-mysql.ist.mospolytech.ru:3306/std_1620_staff" ,
                    "std_1620_staff" , "qwerty" );
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM posts" ;
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                int id = result.getInt(" id " );
                String name = result.getString(" name " );
                String short_name = result.getString(" short_name " );
                System.out.print(" Vacant post: " );
                System.out.print(" id = " + id);
                System.out.print(" , name = \" " + name + " \" " );
                System.out.println(" , short name = \" " + short_name + " \" . " );
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}