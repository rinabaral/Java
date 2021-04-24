import java.sql.*;

public class NewJDBC {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/javadatabaseexample";
        String username = "root";
        String password = "root";
    try {
            Connection con = DriverManager.getConnection(jdbcURL, username, password);

            //inserting data into the database javadatabaseexample
            String sql = "INSERT INTO users (username, password,fullname, email)"
            + " VALUES('username', 'password', 'fullname', 'user@gmail.com')";

            Statement statement = con.createStatement();
            int rows = statement.executeUpdate(sql);

        if (rows>0){
            System.out.println("A new user has been inserted successfully");
            }

            //retrieving data from the database
            String read = "Select * from users";
            ResultSet result = statement.executeQuery(read);
            while(result.next()){
                String user = result.getString(2);
                System.out.println(user);
            }

        // Updating the content of a row in users table i.e Update
            String update = "update users SET password = 'notnull' where username = 'ABC'";
            int row = statement.executeUpdate(update);
            if (row>0){
                System.out.println("The user's information has been updated.");
            }

            //Deleting from the user
            String delete = "Delete from users where username ='ABC'";
            statement.executeUpdate(delete);
            if (row>0){
                System.out.println("The user's information has been deleted");
            }
    con.close();

       }
    catch (SQLException ex){
        ex.printStackTrace();
        }


    }
}
