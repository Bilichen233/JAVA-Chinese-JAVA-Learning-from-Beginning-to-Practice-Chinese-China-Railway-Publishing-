  
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class DateT6 {  
    public static void main(String[] args) 
throws Exception {   // �����쳣 �׳�  
        String strDate = "2008-10-19 10:11:30.345"; 
// ��������ʱ����ַ���  
        String pat = "yyyy-MM-dd HH:mm:ss.SSS";  
// ����ģ��  
        SimpleDateFormat sdf = new
 SimpleDateFormat(pat); // ʵ����ģ�����  
        Date d = sdf.parse(strDate);      
// �������ַ����е�����  ��ȡ����  
        System.out.println(d) ;      
// ���Date����  
    }  
} 
