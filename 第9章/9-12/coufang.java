
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
		System.out.println("newjie�ӿ����һ����û�����η�");
	}
	
	public void print1()
	{
		System.out.println("newjie�ӿ���ڶ������������η�public");
	}
	
	public  void print2()
	{
		System.out.println("newjie�ӿ�����������������η�abstract");
	}
	
	public  void print3()
	{
		System.out.println("newjie�ӿ�����ĸ����������η�public��abstract");
	}
	
	 public void print4()
	{
		System.out.println("newjie�ӿ����������������η�abstract��public");
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