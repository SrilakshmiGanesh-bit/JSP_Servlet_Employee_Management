package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// connection made
/*credenntails as static
create a method that returns connection 
create connection object
pass value in drivermananger
before that connect jar use add jar or use class.forname link and 
then 2 exceptions sql and class not found exveption*/
public class DBconnection {
	static  String url="jdbc:mysql://localhost:3306/empdatas";
	static String username="root";
	static String password="shree";
	
	public static Connection dbconnect() {
		
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			System.out.println("DB connection successful: " + con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		Connection con=DBconnection.dbconnect();
		if(con!=null) {
			System.out.println("connection success");
		}
		else {
			System.out.println("connection failed");
		}
	}

}
