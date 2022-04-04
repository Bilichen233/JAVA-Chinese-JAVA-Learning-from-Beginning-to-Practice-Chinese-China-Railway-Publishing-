class Person{
	private String name ;
	private int age ;
	public Person(String name,int age){
		this.name = name ;
		this.age = age;
	}
	public String toString(){	// 覆写toString()方法
		return this.name + "，年龄" + this.age + "岁";
	}
	public void finalize() throws Throwable{	// 对象释放空间时默认调用此方法
		System.out.println("对象被释放 -->" + this) ;
	}
};
public class SystemT4{
	public static void main(String args[]){
		Person per = new Person("小李",31) ;
		per = null ;	// 断开引用
		System.gc() ;		// 强制性释放空间
	}
};