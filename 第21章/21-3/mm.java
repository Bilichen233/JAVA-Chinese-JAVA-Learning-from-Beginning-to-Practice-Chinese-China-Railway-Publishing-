import java.sql.*;

public class mm {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//实现连接方法getConnection(),root是连接数据库的用户名，password是定义连接数据库的密码
		    conn =DriverManager.getConnection("jdbc:mysql://localhost/tushuguanli_database_test?" +
		                                   "user=root&password=66688888&useSSL=false&serverTimezone=GMT");

		    System.out.println("已成功的与MySQL数据库建立连接！！");

		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
    }

}
