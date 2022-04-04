import java.sql.*;
import java.util.*;
import java.io.*;

public class ExecuteDDL
{
	private String qu;
	private String di;
	private String yong;
	private String mi;
	Connection conn;
	Statement stmt;
	public void initParam(String paramFile)throws Exception
	{
		//使用Properties类来加载属性文件
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		qu = props.getProperty("qu");
		di = props.getProperty("di");
		yong = props.getProperty("yong");
		mi = props.getProperty("mi");
	}

	public void createTable(String sql)throws Exception
	{
		try
		{
			//加载驱动
			Class.forName(qu);
			//获取数据库连接
			conn = DriverManager.getConnection(di , yong ,mi);
			//使用Connection来创建一个Statment对象
			stmt = conn.createStatement();
			//执行DDL,创建数据表
			stmt.executeUpdate(sql);
		}
		//使用finally块来关闭数据库资源
		finally
		{
			if (stmt != null)
			{
				stmt.close();
			}
			if (conn != null)
			{
				conn.close();
			}
		}

	}

	public static void main(String[] args) throws Exception
	{
		ExecuteDDL ed = new ExecuteDDL();
		ed.initParam("mysql.ini");
		ed.createTable("create table mmtest "
			+ "( jdbc_id int auto_increment primary key, " 
			+ "jdbc_name varchar(255), "
			+ "jdbc_desc text);");
		System.out.println("---------建表成功--------");
	}
}