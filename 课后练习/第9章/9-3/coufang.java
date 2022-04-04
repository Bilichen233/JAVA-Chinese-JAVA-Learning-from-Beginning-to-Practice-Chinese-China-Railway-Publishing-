
abstract class ChouDuo//定义的抽象类{
	int a;
	int b;
	abstract void print();//定义了抽象方法
	ChouDuo(int x,int y){
		a=x;
		b=y;
	}
}
class ChouDuo1 extends ChouDuo{
	int c;
	ChouDuo1(int r1,int r2,int r3){
		super(r1,r2);
		c=r3;
	}
	void print()//定义了属于自己的一个方法
	{
		System.out.println(a+b+c);
	}
}
class ChouDuo2 extends ChouDuo{
	int d;
	ChouDuo2(int t1,int t2,int t3){
		super(t1,t2);
		d=t3;
	}
	void print()//定义了属于自己的一个方法
	{
		System.out.println(a*b*d);
	}
}
class tian{
	public static void main(String args[]){
		ChouDuo1 a1=new ChouDuo1(11,72,23);
		ChouDuo2 a2=new ChouDuo2(13,23,33);
		a1.print();
		a2.print();
	}
}
