import java.io.File ;
import java.io.Writer ;
import java.io.FileWriter ;
public class WriterT2{
	public static void main(String args[]) throws Exception{	// 异常抛出，不处理
		// 第1步、使用File类找到一个文件
		File f= new File("h:" + File.separator + "test.txt") ;	// 声明File对象
		// 第2步、通过子类实例化父类对象
		Writer out = null ;	// 准备好一个输出的对象
		out = new FileWriter(f,true)  ;	// 通过对象多态性，进行实例化
		// 第3步、进行写操作
		String str = "\r\n奥迪A4L\r\n奥迪A6L!!!" ;		// 准备一个字符串
		out.write(str) ;						// 将内容输出，保存文件
		// 第4步、关闭输出流
		out.close() ;						// 关闭输出流
	}
};