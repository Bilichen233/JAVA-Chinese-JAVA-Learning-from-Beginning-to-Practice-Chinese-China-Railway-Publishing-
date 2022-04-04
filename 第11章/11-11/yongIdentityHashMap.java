
import java.util.*;

public class yongIdentityHashMap
{
	public static void main(String[] args) {
		IdentityHashMap<String, Integer> ihm = new IdentityHashMap<String, Integer>();
		//下面两行代码将会向IdentityHashMap对象中添加2个key-value对
		ihm.put(new String("iPhone") , 210000);
		ihm.put(new String("华为") , 190000);
		ihm.put("VIVO" , 175000);	//添加key为VIVO的值
		ihm.put("VIVO" , 180000);	//添加key为VIVO的值，只会添加后来的的这个值

		System.out.println(ihm);
	}
}
