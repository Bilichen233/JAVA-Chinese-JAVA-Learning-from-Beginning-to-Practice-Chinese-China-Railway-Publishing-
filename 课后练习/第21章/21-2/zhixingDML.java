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
		//ʹ��Properties�������������ļ�
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
			//��������
			Class.forName(qu);
			//��ȡ���ݿ�����
			conn = DriverManager.getConnection(di , yong , mi);
			//ʹ��Connection������һ��Statment����
			stmt = conn.createStatement();
			//ִ��DML,������Ӱ��ļ�¼����
			return stmt.executeUpdate(sql);
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
		zhixingDML ed = new zhixingDML();
		ed.initParam("mysql.ini");
		int result = ed.insertData("insert into mmmtest(jdbc_name,jdbc_desc)" 
			+ "select s.student_name , t.teacher_name "
			+ "from student_table s , teacher_table t "
			+ "where s.java_teacher = t.teacher_id;");
		System.out.println("------Ӱ����ϵͳ�е�" + result + "����¼------");
	}
}
