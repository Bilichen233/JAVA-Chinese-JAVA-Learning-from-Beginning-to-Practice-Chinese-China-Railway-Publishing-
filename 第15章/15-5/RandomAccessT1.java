import java.io.File ;
import java.io.RandomAccessFile ;
public class RandomAccessT1{
	// 所有的异常直接抛出，程序中不再进行处理
	public static void main(String args[]) throws Exception{
		File f = new File("H:" + File.separator + "test.txt") ;	// 指定要操作的文件
		RandomAccessFile rdf = null ;		// 声明RandomAccessFile类的对象
		rdf = new RandomAccessFile(f,"rw") ;// 读写模式，如果文件不存在，会自动创建
		String name = null ;
		int age = 0 ;
		name = "BMW328i" ;	// 写入字符串
		age = 30 ;					// 数字的长度为4
		rdf.writeBytes(name) ;		// 将姓名写入文件之中
		rdf.writeInt(age) ;			// 将年龄写入文件之中
		name = "BMW328Li    " ;	// 写入字符串
		age = 31 ;					// 数字的长度为4
		rdf.writeBytes(name) ;		// 将姓名写入文件之中
		rdf.writeInt(age) ;			// 将年龄写入文件之中
		name = "BMW318Li  " ;	// 写入字符串
		age = 32 ;					// 数字的长度为4
		rdf.writeBytes(name) ;		// 将姓名写入文件之中
		rdf.writeInt(age) ;			// 将年龄写入文件之中
		rdf.close() ;				// 关闭
	}
};