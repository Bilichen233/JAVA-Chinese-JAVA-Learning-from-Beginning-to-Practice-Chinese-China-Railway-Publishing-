import java.io.File ;
import java.io.IOException ;
public class FileT4{
	public static void main(String args[]){
		File f = new File("H:"+File.separator+"奔驰GLA.txt") ;		// 实例化File类的对象
		f.delete() ;	// 删除文件
	}
};