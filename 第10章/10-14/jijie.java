
public class jijie
{
	//��Season�ඨ��ɲ��ɱ�ģ���������Ҳ�����final
	private final String name;
	private final String desc;
	public static final jijie SPRING = new jijie("����" , "С����ˮ");
	public static final jijie SUMMER = new jijie("����" , "���ո���");
	public static final jijie FALL = new jijie("����" , "����Ƶ�");
	public static final jijie WINTER = new jijie("����" , "Ω��çç");

	public static jijie getSeaon(int jijieNum)
	{
		switch(jijieNum)
		{
			case 1 :
				return SPRING;
			case 2 :
				return SUMMER;
			case 3 :
				return FALL;
			case 4 :
				return WINTER;
			default :
				return null;
		}
	}

	//�������������private����Ȩ��
	private jijie(String name , String desc)
	{
		this.name = name;
		this.desc = desc;
	}
	//ֻΪname��desc�����ṩgetter����
	public String getName()
	{
		 return this.name;
	}
	public String getDesc()
	{
		 return this.desc;
	}
}
