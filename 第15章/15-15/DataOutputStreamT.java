import java.io.DataOutputStream ;
import java.io.File ;
import java.io.FileOutputStream ;
public class DataOutputStreamT{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		DataOutputStream dos = null ;			// �����������������
		File f = new File("h:" + File.separator + "order.txt") ; // �ļ��ı���·��
		dos = new DataOutputStream(new FileOutputStream(f)) ;	// ʵ�����������������
		String names[] = {"BMW520","BMW525","BMW530"} ;	// ��Ʒ����
		float prices[] = {400000,450000,600000} ;		// ��Ʒ�۸�
		int nums[] = {3,2,1} ;	// ��Ʒ����
		for(int i=0;i<names.length;i++){	// ѭ�����
			dos.writeChars(names[i]) ;	// д���ַ���
			dos.writeChar('\t') ;	// д��ָ���
			dos.writeFloat(prices[i]) ; // д��۸�
			dos.writeChar('\t') ;	// д��ָ���
			dos.writeInt(nums[i]) ; // д������
			dos.writeChar('\n') ;	// ����
		}
		dos.close() ;	// �ر������
	}
};