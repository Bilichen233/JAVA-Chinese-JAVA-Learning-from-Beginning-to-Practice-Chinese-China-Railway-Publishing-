//引入AWT包
import java.awt.*;
import java.awt.event.*;
class Winfour1 extends Frame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8630011717145764871L;
	int i=5;
	//定义九个按钮组件
	Button b1=new Button("按钮A");
	Button b2=new Button("按钮B");
	Button b3=new Button("按钮C");
	Button b4=new Button("按钮D");
	Button b5=new Button("按钮E");
	Button b6=new Button("按钮F");
	Button b7=new Button("按钮G");
	Button b8=new Button("按钮H");
	Button b9=new Button("按钮I");
	Winfour1()
	{
		//设置窗口名称
		this.setTitle("布局利器Gridlayout");
		//设置布局管理器为2行3列的Gridlayout布局管理器
		this.setLayout(new GridLayout(3,3));
		//将按钮组件放入窗口
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		//为每个按钮组件添加监听
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		//设置窗口的位置和大小
		this.setBounds(100,100,450,450);
		//设置窗口的可见性
		this.setVisible(true);
	}
	//实现ActionListener接口中的actionPerformed方法
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e)
    {
	    i++;
	    Button bi=new Button("按钮"+i);
	    this.add(bi);
	    bi.addActionListener(this);
	    this.show(true);
    }
	public static void main(String args[])
	{
		new Winfour1();
	}
}
