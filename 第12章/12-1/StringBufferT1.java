public class StringBufferT1{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// 声明StringBuffer对象 
		buf.append("我爱 ") ;					// 向StringBuffer中添加内容
		buf.append("学习").append(" Java") ;		// 可以连续调用append()方法
		buf.append("\n") ;						// 添加一个转义字符
		buf.append("学习了").append(1).append("个月了\n") ;	// 添加数字
		buf.append("我爱学Java吗 =").append(true) ;	// 添加布尔值
		System.out.println(buf) ;			// 直接输出对象，调用toString()
	}
};