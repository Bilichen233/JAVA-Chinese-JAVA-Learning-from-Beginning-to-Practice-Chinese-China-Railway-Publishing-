import java.io.File ;
import java.io.Writer ;
import java.io.FileWriter ;
public class WriterT2{
	public static void main(String args[]) throws Exception{	// �쳣�׳���������
		// ��1����ʹ��File���ҵ�һ���ļ�
		File f= new File("h:" + File.separator + "test.txt") ;	// ����File����
		// ��2����ͨ������ʵ�����������
		Writer out = null ;	// ׼����һ������Ķ���
		out = new FileWriter(f,true)  ;	// ͨ�������̬�ԣ�����ʵ����
		// ��3��������д����
		String str = "\r\n�µ�A4L\r\n�µ�A6L!!!" ;		// ׼��һ���ַ���
		out.write(str) ;						// ����������������ļ�
		// ��4�����ر������
		out.close() ;						// �ر������
	}
};