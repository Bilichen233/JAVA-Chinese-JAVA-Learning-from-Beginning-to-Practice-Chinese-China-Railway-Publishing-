import java.awt.*;
import java.awt.event.*;
public class WinThree extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
				//���������ť���
	            Button b1=new Button("�м�");
				Button b2=new Button("�ϱ�");
				Button b3=new Button("�±�");
				Button b4=new Button("���");
				Button b5=new Button("�ұ�");

				WinThree(){
			//���ô�������
			//���ô�������
			this.setTitle("�����ť�����");
				//���ò��ֹ�����ΪBorderLayout
				this.setLayout(new BorderLayout());
				//����ť������봰�ڹ涨λ����
				this.add(b1,BorderLayout.CENTER);
				this.add(b2,BorderLayout.NORTH);
				this.add(b3,BorderLayout.SOUTH);
				this.add(b4,BorderLayout.WEST);
				this.add(b5,BorderLayout.EAST);
				//���ô��ڵ�λ�úʹ�С
				this.setBounds(300,200,450,450);
				//���ô��ڵĿɼ���
				this.setVisible(true);
				//���ô��ڵı���ɫ
				this.setBackground(Color.blue);
			}
			public static void main(String args[])
			{
				new WinThree();
			}	
		}
