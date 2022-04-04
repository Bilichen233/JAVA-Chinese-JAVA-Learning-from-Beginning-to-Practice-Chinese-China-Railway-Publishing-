public class BasicAutoChange {
		// 基本类型的自动转换
	public static void main(String[] args) { 
		char c = 'a';
		byte b = 44;
		short s0 = b;
		int i0 = s0;
		int i1 = c;
		long l = i0;
		float f = l;
		double d = f;
		float fl = 1.7f;
		double db = fl;
		System.out.println("fl = " + fl + "; dou = " + db);
		// 一个数从一种类型转换成另外一种类型，再转换回来时，值还是一样。
		fl = (float) db;
		System.out.println("fl = " + fl + "; dou = " + db);
	}
}
