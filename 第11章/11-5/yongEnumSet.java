
import java.util.*;
enum Season
{
	iPhone,SAMSUNG,HUAWEI,GOOGLE
}
public class yongEnumSet{
	public static void main(String[] args) 
	{
		//创建一个EnumSet集合，集合元素就是Season枚举类的全部枚举值
		EnumSet es1 = EnumSet.allOf(Season.class);
		//输出[iPhone,SAMSUNG,HUAWEI,GOOGLE]
		System.out.println(es1);
		//创建一个EnumSet空集合，指定其集合元素是Season类的枚举值。
		EnumSet es2 = EnumSet.noneOf(Season.class); 
		//输出[]
		//手动添加两个元素
		es2.add(Season.GOOGLE);
		es2.add(Season.iPhone);
		//输出[iPhone,GOOGLE]
		System.out.println(es2);
		//以指定枚举值创建EnumSet集合
		EnumSet es3 = EnumSet.of(Season.SAMSUNG  , Season.GOOGLE); 
		//输出[SAMSUNG,GOOGLE]
		System.out.println(es3);
		EnumSet es4 = EnumSet.range(Season.SAMSUNG  , Season.GOOGLE); 
		//输出[SAMSUNG,HUAWEI,GOOGLE]
		System.out.println(es4);
		//新创建的EnumSet集合的元素和es4集合的元素有相同类型，
		//es5的集合元素 + es4集合元素 = Season枚举类的全部枚举值
		EnumSet es5 = EnumSet.complementOf(es4); 
		//输出[iPhone]
		System.out.println(es5);
	}
}
