
import java.util.*;
enum Season
{
	iPhone,SAMSUNG,HUAWEI,GOOGLE
}
public class yongEnumSet{
	public static void main(String[] args) 
	{
		//����һ��EnumSet���ϣ�����Ԫ�ؾ���Seasonö�����ȫ��ö��ֵ
		EnumSet es1 = EnumSet.allOf(Season.class);
		//���[iPhone,SAMSUNG,HUAWEI,GOOGLE]
		System.out.println(es1);
		//����һ��EnumSet�ռ��ϣ�ָ���伯��Ԫ����Season���ö��ֵ��
		EnumSet es2 = EnumSet.noneOf(Season.class); 
		//���[]
		//�ֶ��������Ԫ��
		es2.add(Season.GOOGLE);
		es2.add(Season.iPhone);
		//���[iPhone,GOOGLE]
		System.out.println(es2);
		//��ָ��ö��ֵ����EnumSet����
		EnumSet es3 = EnumSet.of(Season.SAMSUNG  , Season.GOOGLE); 
		//���[SAMSUNG,GOOGLE]
		System.out.println(es3);
		EnumSet es4 = EnumSet.range(Season.SAMSUNG  , Season.GOOGLE); 
		//���[SAMSUNG,HUAWEI,GOOGLE]
		System.out.println(es4);
		//�´�����EnumSet���ϵ�Ԫ�غ�es4���ϵ�Ԫ������ͬ���ͣ�
		//es5�ļ���Ԫ�� + es4����Ԫ�� = Seasonö�����ȫ��ö��ֵ
		EnumSet es5 = EnumSet.complementOf(es4); 
		//���[iPhone]
		System.out.println(es5);
	}
}
