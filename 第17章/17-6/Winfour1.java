//����AWT��
import java.awt.*;
import java.awt.event.*;
class Winfour1 extends Frame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8630011717145764871L;
	int i=5;
	//����Ÿ���ť���
	Button b1=new Button("��ťA");
	Button b2=new Button("��ťB");
	Button b3=new Button("��ťC");
	Button b4=new Button("��ťD");
	Button b5=new Button("��ťE");
	Button b6=new Button("��ťF");
	Button b7=new Button("��ťG");
	Button b8=new Button("��ťH");
	Button b9=new Button("��ťI");
	Winfour1()
	{
		//���ô�������
		this.setTitle("��������Gridlayout");
		//���ò��ֹ�����Ϊ2��3�е�Gridlayout���ֹ�����
		this.setLayout(new GridLayout(3,3));
		//����ť������봰��
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		//Ϊÿ����ť�����Ӽ���
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		//���ô��ڵ�λ�úʹ�С
		this.setBounds(100,100,450,450);
		//���ô��ڵĿɼ���
		this.setVisible(true);
	}
	//ʵ��ActionListener�ӿ��е�actionPerformed����
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e)
    {
	    i++;
	    Button bi=new Button("��ť"+i);
	    this.add(bi);
	    bi.addActionListener(this);
	    this.show(true);
    }
	public static void main(String args[])
	{
		new Winfour1();
	}
}
