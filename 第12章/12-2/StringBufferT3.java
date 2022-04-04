public class StringBufferT3{
	public static void main(String args[]){
		StringBuffer buf = new StringBuffer() ;	// 声明StringBuffer对象 
		buf.append("Java") ;		// 添加内容
		buf.insert(0,"我学习") ;		// 在第一个内容之前添加内容
		System.out.println(buf) ;
		buf.insert(buf.length(),"3个月了！") ;	// 在最后添加内容
		System.out.println(buf) ;
	}
};