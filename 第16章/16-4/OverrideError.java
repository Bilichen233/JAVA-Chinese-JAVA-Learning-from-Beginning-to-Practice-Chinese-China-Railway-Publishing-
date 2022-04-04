
class Message{					//定义类Message{

	public String tostring() {	//原本打算覆写toString()	
		return "Hello World .";	//返回字符串“Hello World”
	}
}
public class OverrideError{
	public static void main( String[] args ){
		System.out.println( "我们是英雄联盟的王牌战队"+new Message() );//打印输出Message对象
	}
}
