
public class qiangzhuan
{
	public static void main(String[] args) {
		double d = 13.4;
		long l = (long)d;

		int in = 5;
		//下面代码编译时出错：试图把一个数值型变量转换为boolean型，
		//编译时候会提示: 不可转换的类型
		//boolean b = (boolean)in;
		Object obj = "小牛牛，你收到了吗？";
		//obj变量的编译类型为Object，是String类型的父类，可以强制类型转换
		//而且obj变量实际上类型也是String类型，所以运行时也可通过
		String objStr = (String)obj;
		System.out.println("老邓头转账进行中.....");
		System.out.println("系统繁忙，请稍等.....");
		System.out.println("转账金额"+l+"万");
		System.out.println(objStr);
		System.out.println("银行系统故障！");
		//定义一个objPri变量，编译类型为Object，实际类型为Integer
		Object objPri = new Integer(5);
		//objPri变量的编译类型为Object，是String类型的父类，可以强制类型转换
		//而objPri变量实际上类型是Integer类型，所以下面代码运行时引发ClassCastException异常
		String str = (String)objPri;

	}
}
