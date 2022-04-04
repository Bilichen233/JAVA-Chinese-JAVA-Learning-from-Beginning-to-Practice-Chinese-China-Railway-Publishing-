public class ceshi{
	public static void main(String[] args) {
		//声明hello时使用Object类，则hello的编译类型是Object，Object是所有类的父类
		//但hello变量的实际类型是String
		Object hello = "Hello";
		//String是Object类的子类，所以返回true。
		//输出字符串是否是Object类的实例
		System.out.println((hello instanceof Object));
		//输出字符串是否是String类的实例
		System.out.println((hello instanceof String));
		//输出字符串是否是Math类的实例
		System.out.println((hello instanceof Math));
		//String实现了Comparable接口，所以返回true。
		//输出字符串是否是Comparable接口的实例："
		System.out.println((hello instanceof Comparable));
		//String a = "Hello";
		//String类既不是Math类，也不是Math类的父类，所以下面代码编译无法通过
		//System.out.println("字符串是否是Math类的实例：" + (a instanceof Math));
	}
}
