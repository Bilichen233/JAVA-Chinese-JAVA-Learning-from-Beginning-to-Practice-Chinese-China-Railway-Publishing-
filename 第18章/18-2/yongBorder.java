import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class yongBorder
{
	private JFrame jf = new JFrame("边框");

	public void init()
	{
		jf.setLayout(new GridLayout(2, 4));
		//使用静态工厂方法创建BevelBorder
		Border bb = BorderFactory.createBevelBorder(BevelBorder.RAISED ,
			Color.RED, Color.GREEN, Color.BLUE, Color.GRAY);
		jf.add(getPanelWithBorder(bb , "BevelBorder"));
		//使用静态工厂方法创建LineBorder
		Border lb = BorderFactory.createLineBorder(Color.ORANGE, 10);
		jf.add(getPanelWithBorder(lb , "LineBorder"));
		//用静态工厂方法创建EmptyBorder，目的是在组件四周留空
		Border eb = BorderFactory.createEmptyBorder(20, 5, 10, 30);
		jf.add(getPanelWithBorder(eb , "EmptyBorder"));
		//使用静态工厂方法创建EtchedBorder
		Border etb = BorderFactory.createEtchedBorder(EtchedBorder.RAISED,
			Color.RED, Color.GREEN);
		jf.add(getPanelWithBorder(etb , "EtchedBorder"));
		//创建TitledBorder，TitledBorder边框为原有的边框增加标题
		TitledBorder tb = new TitledBorder(lb , "测试标题" , TitledBorder.LEFT , 
			TitledBorder.BOTTOM, new Font("StSong" , Font.BOLD , 18), Color.BLUE);
		jf.add(getPanelWithBorder(tb , "TitledBorder"));
		//创建MatteBorder，这是EmptyBorder的子类，
		//它可以指定留空区域的颜色或背景，此处是指定颜色
		MatteBorder mb = new MatteBorder(20, 5, 10, 30, Color.GREEN);
		jf.add(getPanelWithBorder(mb , "MatteBorder"));
		//创建CompoundBorder将两个边框组合成新边框
		CompoundBorder cb = new CompoundBorder(new LineBorder(Color.RED, 8) , tb);
		jf.add(getPanelWithBorder(cb , "CompoundBorder"));

		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new yongBorder().init();
	}

	public JPanel getPanelWithBorder(Border b , String BorderName)
	{
		JPanel p = new JPanel();
		p.add(new JLabel(BorderName));
		//为Panel组件设置边框
		p.setBorder(b);
		return p;
	}
}
