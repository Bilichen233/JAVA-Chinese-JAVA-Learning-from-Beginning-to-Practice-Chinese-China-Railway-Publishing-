import java.io.File ;
import java.io.IOException ;
public class FileT5{
	public static void main(String args[]){
		File f = new File("d:"+File.separator+"test.txt") ;		// 实例化File类的对象
		if(f.exists()){	// 如果文件存在则删除
			f.delete() ;	// 删除文件
		}
	}
};