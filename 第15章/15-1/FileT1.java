import java.io.File ;
import java.io.IOException ;
public class FileT1{
	public static void main(String args[]){
		File f = new File("H:\\����GLA.txt") ;		// ʵ����File��Ķ���
		try{
			f.createNewFile() ;		// �����ļ������ݸ�����·������
		}catch(IOException e){
			e.printStackTrace() ;	// ����쳣��Ϣ
		}
	}
};