import java.util.*; 
enum jijie{
	iOS,Android,FALL,WINTER
}
public class TestEnumMap{
	public static void main(String[] args) {
		//创建一个EnumMap对象，该EnumMap的所有key必须是jijie枚举类的枚举值
		EnumMap<jijie, String> enumMap = new EnumMap<jijie, String>(jijie.class);
		enumMap.put(jijie.Android , "版本多！");
		enumMap.put(jijie.iOS , "苹果专供！");
		System.out.println(enumMap);
	}
}
