import java.io.File ;
import java.io.IOException ;
public class FileT4{
	public static void main(String args[]){
		File f = new File("H:"+File.separator+"����GLA.txt") ;		// ʵ����File��Ķ���
		f.delete() ;	// ɾ���ļ�
	}
};