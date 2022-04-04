
public class leione {
	String gname;		//定义字符串属性gname
	int gid;			//定义int类型gid
	float gprice;		//定义float类型gprice;
	public void print(){//定义方法print()
		System.out.println(gname+",产品序列号"+gid+",造价成本是"+gprice+"万美元");
	}
	public static void main(String args[]){
		leione book1=new leione();	//新建leione对象实例book1
		book1.gname="歼10B";			//给对象实例book1的gname属性赋值
		book1.gid=10005601;			//给对象实例book1的gid属性赋值
		book1.gprice=4000;			//给对象实例book1的gprice属性赋值
		book1.print();				//调用方法print()
	  leione book2=new leione();	//新建leione对象实例book2
		book2.gname="歼15";			//给对象实例book2的gname属性赋值
		book2.gid=1222002;			//给对象实例book2的gid属性赋值
		book2.gprice=6500;			//给对象实例book2的gprice属性赋值
		book2.print();				//调用方法print()
	}
}
