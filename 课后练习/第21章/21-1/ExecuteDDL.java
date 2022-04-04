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
		//ʹ��Properties�������������ļ�
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
			//��������
			Class.forName(qu);
			//��ȡ���ݿ�����
			conn = DriverManager.getConnection(di , yong ,mi);
			//ʹ��Connection������һ��Statment����
			stmt = conn.createStatement();
			//ִ��DDL,�������ݱ�
			stmt.executeUpdate(sql);
		}
		//ʹ��finally�����ر����ݿ���Դ
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
		System.out.println("---------����ɹ�--------");
	}
}