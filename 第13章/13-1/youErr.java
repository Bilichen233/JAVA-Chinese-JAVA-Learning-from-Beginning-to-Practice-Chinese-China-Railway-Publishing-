import java.util.*;
public class youErr{
	public static void main(String[] args) {
		//创建一个只想保存字符串的List集合
		List strList = new ArrayList();
		strList.add("VERO MODA");
		strList.add("ONLY");
		strList.add(" JACK & JONES");
		System.out.println("BESTSELLER旗下的品牌有：");
		//”不小心“把一个Integer对象”丢进"了集合
		strList.add(5);
		for (int i = 0; i < strList.size() ; i++ ){
			//因为List里取出的全部是Object，所以必须强制类型转换
			//最后一个元素将出现ClassCastException异常
			String str = (String)strList.get(i);
		}
	}
}
