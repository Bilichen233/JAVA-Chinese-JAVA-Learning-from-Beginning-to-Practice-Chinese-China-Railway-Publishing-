import java.util.*;
//定义Apple类时使用了泛型声明
public class fru<T>{
	//使用T类型形参定义属性
	private T info;
	public fru(){}
	//下面方法中使用T类型形参来定义方法
	public fru(T info){
		this.info = info;
	}
	public void setInfo(T info){
		this.info = info;
	}
	public T getInfo(){
		 return this.info;
	}
	public static void main(String[] args)
	{
		//因为传给T形参的是String实际类型，所以构造器的参数只能是String
		fru<String> a1 = new fru<String>("男装 DRY-EX圆领T恤(短袖) 407204 优衣库UNIQLO");
		System.out.println(a1.getInfo());
		//因为传给T形参的是Double实际类型，所以构造器的参数只能是Double或者double
		fru<Double> a2 = new fru<Double>(99.9);
		System.out.println(a2.getInfo()+"元");
	}
}
