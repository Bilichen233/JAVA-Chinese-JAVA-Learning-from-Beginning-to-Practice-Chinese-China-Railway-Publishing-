import java.io.File ;
import java.io.Writer ;
import java.io.FileWriter ;
public class WriterT1{
	public static void main(String args[]) throws Exception{	// �쳣�׳���������
		// ��1����ʹ��File���ҵ�һ���ļ�
		File f= new File("h:" + File.separator + "test.txt") ;	// ����File����
		// ��2����ͨ������ʵ�����������
		Writer out = null ;	// ׼����һ������Ķ���
		out = new FileWriter(f)  ;	// ͨ�������̬�ԣ�����ʵ����
		// ��3��������д����
		String str = "��������ʱ�����쵼�ߣ��޲�����������̺���һ���޿��赲�Ľ�ȡ���顣����ȫ�����еİµ�\r\n" + 
				"A6�����ڶ��⣬���ڶ�߶��䱸�������Ƴ�ǿ��������ݡ�" ;		// ׼��һ���ַ���
		out.write(str) ;						// ����������������ļ�
		// ��4�����ر������
		out.close() ;						// �ر������
	}
};