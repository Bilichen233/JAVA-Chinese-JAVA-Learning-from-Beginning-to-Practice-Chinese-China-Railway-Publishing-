import java.sql.DriverManager;

public class SQLuse {
	public static void main(String [] args){
		  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		  String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=display";
		  String userName="sa";
		  String userPwd="66688888";
		  try{
		   Class.forName(driverName);
		   DriverManager.getConnection(dbURL,userName,userPwd);
		    System.out.println("连接数据库成功");
		  }
		  catch(Exception e){
		   e.printStackTrace();
		   System.out.print("连接失败");
		  }    
		}
	}


