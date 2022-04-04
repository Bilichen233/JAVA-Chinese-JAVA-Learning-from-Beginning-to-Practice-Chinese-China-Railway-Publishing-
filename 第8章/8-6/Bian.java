public class Bian
{
	//定义了形参个数可变的方法
	public static void test(int a , String... books)
	{
		//books被当成数组处理
		for (String tmp : books)
		{
			System.out.println(tmp);
		}
		//输出整数变量a的值
		System.out.println(a);
	}
	public static void main(String[] args) {
		//调用test方法，为args参数可以传入多个的字符串
		test(2000 , "歼15" , "歼20");
		//调用test方法，为args参数可以传入多个的字符串
		test(1400 , new String[]{"歼10B" , "歼30"});

	}
}
