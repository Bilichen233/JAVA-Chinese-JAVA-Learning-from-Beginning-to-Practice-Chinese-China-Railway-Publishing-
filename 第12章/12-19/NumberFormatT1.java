import java.text.* ;
public class NumberFormatT1{
	public static void main(String args[]){
		NumberFormat nf = null ;		// 声明一个NumberFormat对象
		nf = NumberFormat.getInstance() ;	// 得到默认的数字格式化显示
		System.out.println("金额是" + nf.format(180000000)+"欧元") ;//输出格式化之后的数字
		System.out.println("金额是：" + nf.format(180000123.345)+"欧元") ;//输出格式化之后的数字
	}
};