public abstract class moban
{
	//ת��
	private double turnRate;
	public moban()
	{
	}
	//�ѷ��س��ְ뾶�ķ�������ɳ��󷽷�
	public abstract double getRadius();
	public void setTurnRate(double turnRate)
	{
		this.turnRate = turnRate;
	}
	//��������ٶȵ�ͨ���㷨
	public double getSpeed()
	{
		//�ٶȵ��� ���ְ뾶 * 2 * PI * ת��
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
}