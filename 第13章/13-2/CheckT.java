
import java.util.*;

//�Զ���һ��StrList�����࣬ʹ����ϵķ�ʽ������ArrayList��
class StrList
{
	private List strList = new ArrayList();
	//����StrList��add����
	public boolean add(String string)
	{
		return strList.add(string);
	}
	//��дget��������get�����ķ���ֵ���͸�ΪString����
	public String get(int index)
	{
		return (String)strList.get(index);
	}
	public int size()
	{
		return strList.size();
	}
}
public class CheckT
{
	public static void main(String[] args) 
	{
		//����һ��ֻ�뱣���ַ�����List����
		StrList strList = new StrList();
		strList.add("AAA");
		strList.add("BBB");
		strList.add("CCC");
		//������䲻�ܰ�Integer���󡰶�����������,����������쳣
		//strList.add(5);
		System.out.println(strList);
		for (int i = 0; i < strList.size() ; i++ )
		{
			//��ΪStrList��Ԫ�ص����;���String���ͣ���������ǿ������ת��
			String str = strList.get(i);
		}
	}
}