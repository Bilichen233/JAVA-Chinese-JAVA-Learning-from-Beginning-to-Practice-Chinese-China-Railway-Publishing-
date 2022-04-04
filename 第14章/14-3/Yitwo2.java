
public class Yitwo2 {
	public static void main(String args[])	{
		try{
			int age=Integer.parseInt("25L");//抛出异常
			System.out.println("输出1");		//输出信息
		}
		catch(NumberFormatException e){
			int b=8/0;						//分母为0
			System.out.println("请输入整数年龄");			//输出信息
			System.out.println("错误"+e.getMessage());	//输出信息
		}
		finally {
			System.out.println("输出2");		//输出信息
		}
		System.out.println("输出3");			//输出信息
	}
}
