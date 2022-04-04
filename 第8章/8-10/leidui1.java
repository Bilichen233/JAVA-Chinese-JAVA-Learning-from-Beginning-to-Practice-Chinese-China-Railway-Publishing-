public class leidui1 {
	int X=12;		//定义int类型的属性X值为12
	int Y=23; 		//定义int类型的属性Y值为23
	public void printFoo(){	//定义方法printFoo()
	  System.out.println("X="+X+",Y="+Y);
	}
	public static void main(String args[]){
		System.out.println("具体坐标是：");
		leidui1 Z=new leidui1();//新建类leidui1的对象实例Z
		Z.X=41;		//将X赋值为41
		Z.Y=75; 	//将Y赋值为75
		Z.printFoo();//调用方法printFoo()
		leidui1 B=new leidui1();
		B.X=23; 	//将X赋值为23
		B.Y=38; 	//将Y赋值为38
		B.printFoo();//调用方法printFoo()
	}
}
