public class Example_01 {			//定义类Example_01
	String s;						//字符变量s
	int i, i2, i3;					//整型变量i、i2和i3
	private Example_01() {			//无参构造方法
	}
	protected Example_01(String s, int i) {//有参构造方法，两个参数
		this.s = s;					//赋值s
		this.i = i;					//赋值i
	}
	//有参构造方法,1个参数
	public Example_01(String... strings) throws NumberFormatException {
		if (0 < strings.length)		//如果strings长度大于0
			i = Integer.valueOf(strings[0]);
		if (1 < strings.length)		//如果strings长度大于1
			i2 = Integer.valueOf(strings[1]);
		if (2 < strings.length)		//如果strings长度大于2
			i3 = Integer.valueOf(strings[2]);
	}
	public void print() {			//定义方法print()打印输出s、i、i2和i3的值
		System.out.println("s=" + s);
		System.out.println("i=" + i);
		System.out.println("i2=" + i2);
		System.out.println("i3=" + i3);
	}
}
