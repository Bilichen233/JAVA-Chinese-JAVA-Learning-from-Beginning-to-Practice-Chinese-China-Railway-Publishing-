
import java.awt.*;
public class yongPanel
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("测试窗口");
		//创建一个Panel对象
		Panel p = new Panel();
		//相Panel对象中添加两个组件
		p.add(new TextField(20));
		p.add(new Button("单击我"));
		f.add(p);
		//设置窗口的大小、位置
		f.setBounds(30, 30 , 250, 120);
		//将窗口显示出来（Frame对象默认处于隐藏状态）
		f.setVisible(true);
	}
}
