import java.sql.*;

public class mm {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//ʵ�����ӷ���getConnection(),root���������ݿ���û�����password�Ƕ����������ݿ������
		    conn =DriverManager.getConnection("jdbc:mysql://localhost/tushuguanli_database_test?" +
		                                   "user=root&password=66688888&useSSL=false&serverTimezone=GMT");

		    System.out.println("�ѳɹ�����MySQL���ݿ⽨�����ӣ���");

		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
    }

}
