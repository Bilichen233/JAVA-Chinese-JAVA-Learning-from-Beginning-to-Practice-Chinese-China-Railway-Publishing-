import java.awt.*;
import java.awt.event.*;
public class WinThree extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
				//定义五个按钮组件
	            Button b1=new Button("中间");
				Button b2=new Button("上边");
				Button b3=new Button("下边");
				Button b4=new Button("左边");
				Button b5=new Button("右边");

				WinThree(){
			//设置窗口名称
			//设置窗口名称
			this.setTitle("五个按钮随意摆");
				//设置布局管理器为BorderLayout
				this.setLayout(new BorderLayout());
				//将按钮组件放入窗口规定位置中
				this.add(b1,BorderLayout.CENTER);
				this.add(b2,BorderLayout.NORTH);
				this.add(b3,BorderLayout.SOUTH);
				this.add(b4,BorderLayout.WEST);
				this.add(b5,BorderLayout.EAST);
				//设置窗口的位置和大小
				this.setBounds(300,200,450,450);
				//设置窗口的可见性
				this.setVisible(true);
				//设置窗口的背景色
				this.setBackground(Color.blue);
			}
			public static void main(String args[])
			{
				new WinThree();
			}	
		}
