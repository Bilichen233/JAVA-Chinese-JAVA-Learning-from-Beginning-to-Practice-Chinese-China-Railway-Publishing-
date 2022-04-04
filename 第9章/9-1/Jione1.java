
class jitwo{		//定义类jitwo
	String name;	//String类型属性name
	int age;		//int类型属性age
	long number;	//long类型属性number;
	jitwo(long number,String name,int age)	//构造方法
	{ 
		System.out.println("姓名： "+name);		//输出姓名
		System.out.println("年龄：" +age);		//输出年龄
		System.out.println("手机： " +number);	//输出手机号
	}
}

class super2b extends jitwo{	//定义子类super2b，父类是jitwo
	super2b(long number,String name,int age,boolean b)	//构造方法
	{
		super(number,name,age);				//调用父类同参数方法
		System.out.println("喜欢电竞吗？"+b);	//输出是否喜欢电竞
	}
}

public class Jione1{
	public static void main(String args[]){
		//新建super2b实例对象abc1，并分别赋值参数
		super2b abc1=new super2b(1506907006,"王公子",31,true);
	}
}
