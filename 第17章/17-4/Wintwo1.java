import java.awt.*;
public class Wintwo1 extends Frame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//����������ť���
	Button b1=new Button("�ύ");
	Button b2=new Button("ȡ��");
	Button b3=new Button("����");
	
Wintwo1()
	{
		//���ô�������
		this.setTitle("ʹ��FlowLayout����");
		//���ò��ֹ�����ΪFlowLayout
		this.setLayout(new FlowLayout());
		//����ť������봰����

		this.add(b1);
		this.add(b2);
		this.add(b3);

		//���ô��ڵ�λ�úʹ�С
		this.setBounds(100,100,450,350);

		//���ô��ڵĿɼ���
		this.setVisible(true);
	}
	public static void main(String args[])
	{
		new Wintwo1();
	}
}
