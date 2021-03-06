import java.io.DataOutputStream ;
import java.io.File ;
import java.io.FileOutputStream ;
public class DataOutputStreamT{
	public static void main(String args[]) throws Exception{	// 所有异常抛出
		DataOutputStream dos = null ;			// 声明数据输出流对象
		File f = new File("h:" + File.separator + "order.txt") ; // 文件的保存路径
		dos = new DataOutputStream(new FileOutputStream(f)) ;	// 实例化数据输出流对象
		String names[] = {"BMW520","BMW525","BMW530"} ;	// 商品名称
		float prices[] = {400000,450000,600000} ;		// 商品价格
		int nums[] = {3,2,1} ;	// 商品数量
		for(int i=0;i<names.length;i++){	// 循环输出
			dos.writeChars(names[i]) ;	// 写入字符串
			dos.writeChar('\t') ;	// 写入分隔符
			dos.writeFloat(prices[i]) ; // 写入价格
			dos.writeChar('\t') ;	// 写入分隔符
			dos.writeInt(nums[i]) ; // 写入数量
			dos.writeChar('\n') ;	// 换行
		}
		dos.close() ;	// 关闭输出流
	}
};