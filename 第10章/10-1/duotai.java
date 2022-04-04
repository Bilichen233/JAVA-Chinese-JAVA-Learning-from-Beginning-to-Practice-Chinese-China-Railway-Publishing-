
class jiBaseClass				//定义基类jiBaseClass
{
	public int book = 6;		//定义属性book的初始值是6
	public void base(){			//定义方法base()输出文本
		System.out.println("父类的普通方法");
	}
	public void test(){			//定义方法test()输出文本
		System.out.println("父类的被覆盖的方法");
	}
}
//定义子类duotai
public class duotai extends jiBaseClass{
	//重新定义一个book实例属性覆盖父类的book实例属性
	public String book = "《青年公寓》";	//为属性book重新赋值为《青年公寓》
	public void test(){			//在子类中重写方法test()
		System.out.println("子类的覆盖父类的方法");
	}
	public void sub()			//在子类中重写方法sub()
	{
		System.out.println("子类的普通方法");
	}
	public static void main(String[] args){
		//下面编译时类型和运行时类型完全一样，因此不存在多态
		jiBaseClass bc = new jiBaseClass();
		//输出 6
		System.out.println(bc.book);
		//下面两次调用将执行jiBaseClass的方法
		bc.base();
		bc.test();

		//下面编译时类型和运行时类型完全一样，因此不存在多态
		duotai sc = new duotai();
		//输出"《青年公寓》""
		System.out.println(sc.book);
		//下面调用将执行从父类继承到的base方法
		sc.base();
		//下面调用将执行从当前类的test方法
		sc.test();
		//下面调用将执行从当前类的sub方法
		sc.sub();

		//下面编译时类型和运行时类型不一样，多态发生
		jiBaseClass ploymophicBc = new duotai();
		//输出 6 —— 表明访问的是父类属性
		System.out.println(ploymophicBc.book);
		//下面调用将执行从父类继承到的base方法
		ploymophicBc.base();
		//下面调用将执行从当前类的test方法
		ploymophicBc.test();
		//jiBaseClass类没有提供sub方法，这是因为sanYin的编译类型是jiBaseClass
		//所以下面代码编译时会出现错误。
		//sanYin.sub();
	}
}