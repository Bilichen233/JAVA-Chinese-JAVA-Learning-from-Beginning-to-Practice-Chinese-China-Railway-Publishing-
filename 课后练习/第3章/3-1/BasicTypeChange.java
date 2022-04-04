public class BasicTypeChange{		//创建一个修饰基本数据类型转换的类
	public static void main(String[] args) {
		byte b = 12;
		char c = 'b';
		short s = 13;
		int i = 567;
		long l = 678756;
		float ft = 23.67f;
		double db = 6.124d;
		//result声明为其他类型会出错，除非进行类型转换
		double result = (ft * b) + +(l * ft) + (i / c) - (db * s); 
		System.out.print(" 结果 ：" + result+" = ");
		System.out.println((ft * b) + " + " + (l * ft) + " + " + (i / c) + " - "
				+ (db * s));		//输入经过运算获得的结果
	}
}
