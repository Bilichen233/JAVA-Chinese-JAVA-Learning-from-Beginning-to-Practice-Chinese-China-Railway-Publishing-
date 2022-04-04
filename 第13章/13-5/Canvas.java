
import java.util.*;

public class Canvas
{
	//ͬʱ�ڻ����ϻ��ƶ����״
	public void drawAll(List<? extends Shape> shapes)
	{
		for (Shape s : shapes)
		{
			s.draw(this);
		}
	}
	public static void main(String[] args)
	{
		List<Circle> circleList = new ArrayList<Circle>();
		circleList.add(new Circle());
		Canvas c = new Canvas();
		c.drawAll(circleList);
	}
}
