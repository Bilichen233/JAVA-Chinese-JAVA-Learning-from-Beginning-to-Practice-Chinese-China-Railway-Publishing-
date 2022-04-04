package bao.acv;

class leibao{
	int a;					//定义int类型变量a
	int b; 					//定义int类型变量b
	public void print(){			//定义方法print()
		System.out.println("a="+a+",b="+b);
	}
}
public class BaoTwo{
	public static void main(String args[]){
		leibao a1=new leibao();	//新建类的leibao对象实例a1
		a1.a=121;				//给a赋值为121
		a1.b=232; 				//给b赋值为232
		a1.print();			//调用方法print()
	}
}
