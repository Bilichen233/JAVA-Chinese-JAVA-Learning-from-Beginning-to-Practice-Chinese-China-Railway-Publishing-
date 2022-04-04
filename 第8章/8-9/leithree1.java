
public class leithree1 {
	public String color="粉红";//定义全局变量
	//定义一个方法
	public void hu(){
		String color="咖啡";
	//定义局部变量
		System.out.println ("歼20的涂装颜色是"+color+"色的");
	//此处应用了局部变量
		System.out.println("歼15的涂装颜色是"+this.color+"色的");
	//此处应用了全局变量
	}
	public static void main(String args[]){
		leithree1 bb=new leithree1();
		bb.hu();
	}
}

