
import java.util.*;

public class yongIdentityHashMap
{
	public static void main(String[] args) {
		IdentityHashMap<String, Integer> ihm = new IdentityHashMap<String, Integer>();
		//�������д��뽫����IdentityHashMap���������2��key-value��
		ihm.put(new String("iPhone") , 210000);
		ihm.put(new String("��Ϊ") , 190000);
		ihm.put("VIVO" , 175000);	//���keyΪVIVO��ֵ
		ihm.put("VIVO" , 180000);	//���keyΪVIVO��ֵ��ֻ����Ӻ����ĵ����ֵ

		System.out.println(ihm);
	}
}
