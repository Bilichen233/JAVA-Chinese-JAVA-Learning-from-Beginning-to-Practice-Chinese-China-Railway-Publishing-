abstract class Cou{		//定义抽象类Cou
	int a1;				//定义int变量类型a1
	int b1;				//定义int变量类型b1
	Cou(int a,int b){	//构造方法Cou()
		a1=a;
		b1=b;
	}
	abstract int mathtext();//抽象方法mathtext()
}
class Cou1 extends Cou{	//定义类Cou1，使用了继承，将在本书后面讲解
	Cou1(int a,int b){	//构造方法Cou1()
		super(a,b);
	}
	
	int mathtext(){		//普通方法Cou()
		return a1+b1;	//返回a和b的和
	}
}

class Cou2 extends Cou{//定义类Cou2，使用了继承，将在本书后面讲解
	Cou2(int a,int b){	//构造方法Cou2()
		super(a,b);		//调用父类中的同参方法
	}
	int mathtext(){		//定义方法mathtext()，返回a1和b1的差
		return a1-b1;
	}
}
public class leichou  {
	public static void main(String args[]){
		Cou1 abs1=new Cou1(3000,2000);	//新建类Cou1的对象实例abs1，赋值两个参数
		Cou2 abs2=new Cou2(4000,2000);	//新建类Cou1的对象实例abs2，赋值两个参数
		Cou abs;
		abs=abs1;
		System.out.println("加油后，汽车的油量是"+abs.mathtext()+"升");
		abs=abs2;
		System.out.println("开过一段距离后， 汽车的油量是"+abs.mathtext()+"升");

	}
}

