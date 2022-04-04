public class leijing1 {
	static int X;		//定义静态int类型变量X
	static int Y; 		//定义静态int类型变量Y
    //定义方法printJingTai()打印输出X和Y的值
	public void printJingTai(){
		System.out.println("X="+X+",Y="+Y);
	}
	public static void main(String args[]){
		leijing1 Aa=new leijing1();//新建类leijing1的对象实例Aa
		System.out.println("具体坐标是：");
		Aa.X=4;		//将X赋值为4	
		Aa.Y=5; 		//将Y赋值为5
		leijing1.X=112;	//重新赋值类leijing1的变量的X值
		leijing1.Y=252; //重新赋值类leijing1的变量的Y值
		Aa.printJingTai();	//调用方法printJingTai()
		leijing1 Bb=new leijing1();//新建类leijing1的对象实例Bb
		Bb.X=3; 		//将X赋值为3
		Bb.Y=8; 		//将Y赋值为8
		leijing1.X=131; //重新赋值类leijing1的变量的X值
		leijing1.Y=272; //重新赋值类leijing1的变量的Y值
		Bb.printJingTai();	//调用方法printJingTai()
	}
}
