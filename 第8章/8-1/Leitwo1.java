
class textone {		//定义类textone
	public int a;	//int类型的属性a
	public void print()	//定义打印方法print()
	{
		System.out.println("歼20的飞行里程可达"+a+"公里");//打印输出的文本
	}
}
public class Leitwo1
{
	public static void main(String args[]){
		textone aa=new textone();	//新建类textone的实例对象aa
		aa.a=8000;	//给对象aa的属性a赋值为8000
		aa.print();	//调用方法print()
	}

}
