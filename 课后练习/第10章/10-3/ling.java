
public class ling
{
	public String name;
	public String color;
	public double weight;

	public ling()
	{
	}
	//���������Ĺ�����
	public ling(String name , String color)
	{
		this.name = name;
		this.color = color;
	}
	//���������Ĺ�����
	public ling(String name , String color , double weight)
	{
		//ͨ��this������һ�����صĹ������ĳ�ʼ������
		this(name , color);
		//����this���øù��������ڳ�ʼ����Java����
		this.weight = weight;
	}
}

