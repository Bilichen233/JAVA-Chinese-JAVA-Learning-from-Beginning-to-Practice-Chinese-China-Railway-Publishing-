import java.awt.*;
public class Wintwo1 extends Frame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//定义三个按钮组件
	Button b1=new Button("提交");
	Button b2=new Button("取消");
	Button b3=new Button("重置");
	
Wintwo1()
	{
		//设置窗口名称
		this.setTitle("使用FlowLayout布局");
		//设置布局管理器为FlowLayout
		this.setLayout(new FlowLayout());
		//将按钮组件放入窗口中

		this.add(b1);
		this.add(b2);
		this.add(b3);

		//设置窗口的位置和大小
		this.setBounds(100,100,450,350);

		//设置窗口的可见性
		this.setVisible(true);
	}
	public static void main(String args[])
	{
		new Wintwo1();
	}
}
