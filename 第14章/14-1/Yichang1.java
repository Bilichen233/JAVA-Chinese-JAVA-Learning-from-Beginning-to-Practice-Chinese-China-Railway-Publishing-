public class Yichang1{
	public static void main(String args[]){
		int x,y;		//定义两个整数遍历x和y
		try{
			x=0;		//x赋值为0
			y=5/x;		//y赋值为5/x，这时候分母为0
			System.out.println("需要检验的程序");
		}
		catch(ArithmeticException e){
			System.out.println("发生了异常，分母不能为零");
		}
		System.out.println("程序运行结束");
	}
}
