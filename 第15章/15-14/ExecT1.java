import java.io.* ;
public class ExecT1{
	public static void main(String args[]) throws Exception{
		int i = 0 ;
		int j = 0 ;
		BufferedReader buf = null ;		// 接收键盘的输入数据
		buf = new BufferedReader(new InputStreamReader(System.in)) ;
		String str = null ;	// 接收数据
		System.out.print("请输入第一个数字：") ;
		str = buf.readLine() ;	// 接收数据
		i = Integer.parseInt(str) ;	// 将字符串变为整数
		System.out.print("请输入第二个数字：") ;
		str = buf.readLine() ;	// 接收数据
		j = Integer.parseInt(str) ;	// 将字
		System.out.println(i + " + " + j + " = " + (i + j)) ;
	}
};