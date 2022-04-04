import java.io.File ;
import java.io.IOException ;
public class FileT7{
	public static void main(String args[]){
		File f = new File("H:"+File.separator+"奔驰Smart") ;		// 实例化File类的对象
		f.mkdir() ;	// 创建文件夹
	}
};