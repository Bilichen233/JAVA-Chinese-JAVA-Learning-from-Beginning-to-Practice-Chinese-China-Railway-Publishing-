import java.util.*;
public class fanList{
	public static void main(String[] args) {
		//创建一个只想保存字符串的List集合
		List<String> strList = new ArrayList<String>();
		strList.add("VERO MODA");
		strList.add("ONLY");
		strList.add("JACK JONES");
		//下面代码将引起编译错误
		//strList.add(5);
		for (int i = 0; i < strList.size() ; i++ ){
			//下面代码无需强制类型转换
			String str = strList.get(i);
		}
		System.out.println(strList+"这三个品牌是一个老板");
	}
}