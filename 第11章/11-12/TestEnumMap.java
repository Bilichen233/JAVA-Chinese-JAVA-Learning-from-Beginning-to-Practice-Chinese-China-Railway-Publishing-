import java.util.*; 
enum jijie{
	iOS,Android,FALL,WINTER
}
public class TestEnumMap{
	public static void main(String[] args) {
		//����һ��EnumMap���󣬸�EnumMap������key������jijieö�����ö��ֵ
		EnumMap<jijie, String> enumMap = new EnumMap<jijie, String>(jijie.class);
		enumMap.put(jijie.Android , "�汾�࣡");
		enumMap.put(jijie.iOS , "ƻ��ר����");
		System.out.println(enumMap);
	}
}
