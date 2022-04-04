import java.io.File ;
import java.io.Writer ;
import java.io.FileWriter ;
public class WriterT1{
	public static void main(String args[]) throws Exception{	// 异常抛出，不处理
		// 第1步、使用File类找到一个文件
		File f= new File("h:" + File.separator + "test.txt") ;	// 声明File对象
		// 第2步、通过子类实例化父类对象
		Writer out = null ;	// 准备好一个输出的对象
		out = new FileWriter(f)  ;	// 通过对象多态性，进行实例化
		// 第3步、进行写操作
		String str = "不断领先时代的领导者，无不在内心深处，蕴含着一股无可阻挡的进取激情。正如全新上市的奥迪\r\n" + 
				"A6，有内而外，以众多高端配备升级，推出强大豪华阵容。" ;		// 准备一个字符串
		out.write(str) ;						// 将内容输出，保存文件
		// 第4步、关闭输出流
		out.close() ;						// 关闭输出流
	}
};