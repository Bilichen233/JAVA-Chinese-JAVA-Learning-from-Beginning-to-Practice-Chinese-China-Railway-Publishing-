
public class Testjijie
{
	public Testjijie(jijie s)
	{
		System.out.println(s.getName() + "����һ��"+ s.getDesc() + "�ļ���");
	}
	public static void main(String[] args) 
	{
		//ֱ��ʹ��Season��FALL��������һ��Season����
		new Testjijie(jijie.FALL);
	}
}
