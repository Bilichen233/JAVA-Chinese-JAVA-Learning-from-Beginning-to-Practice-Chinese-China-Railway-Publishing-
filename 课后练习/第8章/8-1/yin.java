


public class yin
{
	public static void swap(muzi dw)
	{
		//下面三行代码实现dw的a、b属性值交换。
		//定义一个临时变量来保存dw对象的a属性的值
		int tmp = dw.a;
		//把dw对象的b属性值赋给a属性
		dw.a = dw.b;
		//把临时变量tmp的值赋给dw对象的a属性
		dw.b = tmp;
		System.out.println("swap方法里，a属性的值是" + dw.a + "；b的值是" + dw.b);
		//把dw直接赋为null，让它不再指向任何有效地址。
		dw = null;
	}
	public static void main(String[] args) 
	{
		muzi dw = new muzi();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("交换结束后，a属性的值是" + dw.a + "；b属性的值是" + dw.b);

	}
}