interface Jiechang{		//定义接口Jiechang	
	int a=100;					//a的初始值是100 
	int b=200;					//b的初始值是200 
	int c=323;					//c的初始值是323 
	int d=234;					//d的初始值是234 
	int f=523;					//f的初始值是523
	void print();				//声明方法print()
	void print1();				//声明方法print1()
}

class Jiedo implements Jiechang{
	public void print(){		//定义方法print()，输出a和b的和
		System.out.println("老二得的财产是：");
		System.out.println(a+b);
	}
	
	public void print1(){		//定义方法print1()，输出c、d和f的和
		System.out.println("老大获得的财产是：");
		System.out.println(c+d+f);
	}
}

public class Jie{
	public static void main(String args[]){
		Jiedo a1=new Jiedo();	//定义Jiedo对象实例a1
		a1.print();				//调用方法print()
		a1.print1();			//调用方法print1()
	}
}