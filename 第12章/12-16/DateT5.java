import java.text.* ;
import java.util.* ;
public class DateT5{
	public static void main(String args[]){
		String strDate = "2019-5-19 10:11:30.345" ;
		// ׼����һ��ģ�壬���ַ�������ȡ����������
		String pat1 = "yyyy-MM-dd HH:mm:ss.SSS" ;
		// ׼���ڶ���ģ�壬����ȡ����������ֱ�Ϊָ���ĸ�ʽ
		String pat2 = "yyyy��MM��dd�� HHʱmm��ss��SSS����" ;
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1) ;// ʵ����ģ�����
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2) ;	// ʵ����ģ�����
		Date d = null ;
		try{
			d = sdf1.parse(strDate) ;	// ���������ַ����е�������ȡ����
		}catch(Exception e){			// ����ṩ���ַ�����ʽ�д���������쳣����
			e.printStackTrace() ;	// ��ӡ�쳣��Ϣ
		}
	  System.out.println("����ʱ���ǣ�"+sdf2.format(d)) ;	// �����ڱ�Ϊ�µĸ�ʽ
	}
};
