

public class zilei extends moban
{
	public double getRadius()
	{
		return 0.28;
	}

	public static void main(String[] args) 
	{
		zilei csm = new zilei();
		csm.setTurnRate(15);
		System.out.println(csm.getSpeed());
	}
}
