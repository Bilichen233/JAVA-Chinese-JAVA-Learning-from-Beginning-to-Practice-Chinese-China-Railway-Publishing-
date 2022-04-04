
public class Leitwo4 {
	protected int a;				//定义保护的int类型的属性a
	protected void print(){			//定义打印输出方法print()
		System.out.println(a+"年");	//输出属性a的值
	}	
    public static void main(String args[]){
    	System.out.println("歼20列装的年份是：");
    	Leitwo4 a1=new Leitwo4();	//新建Leitwo4对象实例a1
		a1.a=2017;					//a1中的属性a赋值为2017
		a1.print();					//调用方法print()
		System.out.println("歼20形成战力的年份是：");
		Leitwo4 a2=new Leitwo4();	//新建Leitwo4对象实例a2
		a2.a=2018;					//a2中的属性a赋值为2018
		a2.print();					//调用方法print()
	}
}
