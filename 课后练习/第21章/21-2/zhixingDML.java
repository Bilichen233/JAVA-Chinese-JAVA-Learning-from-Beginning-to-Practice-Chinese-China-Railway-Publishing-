import java.sql.*;
import java.util.*;
import java.io.*;

public class zhixingDML
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
	public int insertData(String sql)throws Exception
	{
		try
		{
			//加载驱动
			Class.forName(qu);
			//获取数据库连接
			conn = DriverManager.getConnection(di , yong , mi);
			//使用Connection来创建一个Statment对象
			stmt = conn.createStatement();
			//执行DML,返回受影响的记录条数
			return stmt.executeUpdate(sql);
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
		zhixingDML ed = new zhixingDML();
		ed.initParam("mysql.ini");
		int result = ed.insertData("insert into mmmtest(jdbc_name,jdbc_desc)" 
			+ "select s.student_name , t.teacher_name "
			+ "from student_table s , teacher_table t "
			+ "where s.java_teacher = t.teacher_id;");
		System.out.println("------影响了系统中的" + result + "条记录------");
	}
}
