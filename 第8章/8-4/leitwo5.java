
public class leitwo5 {
	int a;		//定义int类型的属性a
	int b;		//定义int类型的属性b
	void print(){	//定义方法print()
		int c=a+b;	//定义int类型的属性c，赋值为a+b
		System.out.println("a+b="+c);	//打印输出a+b的值
	}
	public static void main(String args[]){
		leitwo5 a1=new leitwo5();	//定义类leitwo5的对象实例a1
		a1.a=2;						//赋值a的值为2
		a1.b=3;						//赋值a的值为3
		a1.print();					//调用方法print()打印输出a+b的值
	}
}
