import java.io.File ;
import java.io.RandomAccessFile ;
public class RandomAccessT1{
	// ���е��쳣ֱ���׳��������в��ٽ��д���
	public static void main(String args[]) throws Exception{
		File f = new File("H:" + File.separator + "test.txt") ;	// ָ��Ҫ�������ļ�
		RandomAccessFile rdf = null ;		// ����RandomAccessFile��Ķ���
		rdf = new RandomAccessFile(f,"rw") ;// ��дģʽ������ļ������ڣ����Զ�����
		String name = null ;
		int age = 0 ;
		name = "BMW328i" ;	// д���ַ���
		age = 30 ;					// ���ֵĳ���Ϊ4
		rdf.writeBytes(name) ;		// ������д���ļ�֮��
		rdf.writeInt(age) ;			// ������д���ļ�֮��
		name = "BMW328Li    " ;	// д���ַ���
		age = 31 ;					// ���ֵĳ���Ϊ4
		rdf.writeBytes(name) ;		// ������д���ļ�֮��
		rdf.writeInt(age) ;			// ������д���ļ�֮��
		name = "BMW318Li  " ;	// д���ַ���
		age = 32 ;					// ���ֵĳ���Ϊ4
		rdf.writeBytes(name) ;		// ������д���ļ�֮��
		rdf.writeInt(age) ;			// ������д���ļ�֮��
		rdf.close() ;				// �ر�
	}
};