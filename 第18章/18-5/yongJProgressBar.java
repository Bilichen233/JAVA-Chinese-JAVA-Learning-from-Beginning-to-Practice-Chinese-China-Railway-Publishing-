import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class yongJProgressBar
{
	JFrame frame = new JFrame("������");
	//����һ����ֱ������
	JProgressBar bar = new JProgressBar(JProgressBar.VERTICAL );
	JCheckBox indeterminate = new JCheckBox("��ȷ������");
	JCheckBox noBorder = new JCheckBox("�����Ʊ߿�");
	public void init()
	{
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(indeterminate);
		box.add(noBorder);
		frame.setLayout(new FlowLayout());
		frame.add(box);
		//�ѽ�������ӵ�JFrame������
		frame.add(bar);
		//���ý����������ֵ����Сֵ
		bar.setMinimum(0); 
		bar.setMaximum(100);
		//�����ڽ������л�����ɰٷֱ�
		bar.setStringPainted(true);
		noBorder.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent event)
			{
				//���ݸ�ѡ�������Ƿ���ƽ������ı߿�
				bar.setBorderPainted(!noBorder.isSelected());
			}
		});
		indeterminate.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent event)
			{
				//���øý������Ľ����Ƿ�ȷ��
				bar.setIndeterminate(indeterminate.isSelected());
				bar.setStringPainted(!indeterminate.isSelected());
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		//����ѭ����ʽ�����ϸı����������ɽ���
		for (int i = 0 ; i <= 100 ; i++)
		{
			//�ı����������ɽ���
			bar.setValue(i);
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		new yongJProgressBar().init();
	}
}
