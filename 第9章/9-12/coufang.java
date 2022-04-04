
interface newjie
{
	void print();
	public void print1();
	abstract void print2();
	public abstract void print3();
	abstract public void print4();
}

class newjie1 implements newjie
{
	public void print()
	{
		System.out.println("newjie接口里第一方法没有修饰符");
	}
	
	public void print1()
	{
		System.out.println("newjie接口里第二个方法有修饰符public");
	}
	
	public  void print2()
	{
		System.out.println("newjie接口里第三个方法有修饰符abstract");
	}
	
	public  void print3()
	{
		System.out.println("newjie接口里第四个方法有修饰符public和abstract");
	}
	
	 public void print4()
	{
		System.out.println("newjie接口里第五个方法有修饰符abstract和public");
	}
}

public class coufang
{
	public static void main(String args[])
	{
		newjie1 a1=new newjie1();
		a1.print();
		a1.print1();
		a1.print2();
		a1.print3();
		a1.print4();
	}
}