import java.io.* ;
public class BufferedReaderT{
	public static void main(String args[]){
		BufferedReader buf = null ;		//声明对象
		buf = new BufferedReader(new InputStreamReader(System.in)) ;	// 将字节流变为字符流
		String str = null ;				//接收输入内容
		System.out.print("请输入你的愿望：") ;//提示输入信息
		try{
			str = buf.readLine() ;		//读取一行数据
		}catch(IOException e){	
			e.printStackTrace() ;		//如果有异常则输出异常信息
		}
		System.out.println("你的愿望是：" + str) ;//显示输入的信息
	}
};