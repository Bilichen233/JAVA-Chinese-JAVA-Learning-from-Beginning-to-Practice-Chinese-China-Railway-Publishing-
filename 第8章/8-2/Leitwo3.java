
public class Leitwo3 {		//定义类
	private String uname;	//定义私有字符串属性uname
	private int uid;		//定义私有整型属性uid
	public String getuname() {	//定义方法getuname()返回名字
				return uname;
	}
	private int getuid(){	//定义方法getuid()返回编号
		return uid;
	}
	//下面是定义一个构造方法Leitwo3()
	public Leitwo3(String uname,int uid){
		this.uname=uname;
		this.uid=uid;
	}
	public static void main(String args[])
	{
		//创建两个eitwo3实例对象PrivateUse1和PrivateUse2
		Leitwo3 PrivateUse1=new Leitwo3("唐唐",21002);
		Leitwo3 PrivateUse2=new Leitwo3("古古",61002);
		String a1=PrivateUse1.getuname();
		System.out.println("姓名："+a1);	//输出PrivateUse1的姓名
		int a2=PrivateUse1.getuid();
		System.out.println("学号："+a2);	//输出PrivateUse1的编号
		
		String a3=PrivateUse2.getuname();
		System.out.println("姓名："+a3);	//输出PrivateUse2的姓名
		int a4=PrivateUse2.getuid();
		System.out.println("学号："+a4);	//输出PrivateUse2的编号
	}
}
