import java.io.File ;
import java.io.IOException ;
public class FileT1{
	public static void main(String args[]){
		File f = new File("H:\\奔驰GLA.txt") ;		// 实例化File类的对象
		try{
			f.createNewFile() ;		// 创建文件，根据给定的路径创建
		}catch(IOException e){
			e.printStackTrace() ;	// 输出异常信息
		}
	}
};