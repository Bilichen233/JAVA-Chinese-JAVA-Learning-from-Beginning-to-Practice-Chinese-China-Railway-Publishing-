import java.io.* ;
public class BufferedReaderT{
	public static void main(String args[]){
		BufferedReader buf = null ;		//��������
		buf = new BufferedReader(new InputStreamReader(System.in)) ;	// ���ֽ�����Ϊ�ַ���
		String str = null ;				//������������
		System.out.print("���������Ը����") ;//��ʾ������Ϣ
		try{
			str = buf.readLine() ;		//��ȡһ������
		}catch(IOException e){	
			e.printStackTrace() ;		//������쳣������쳣��Ϣ
		}
		System.out.println("���Ը���ǣ�" + str) ;//��ʾ�������Ϣ
	}
};