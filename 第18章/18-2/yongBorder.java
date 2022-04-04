import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class yongBorder
{
	private JFrame jf = new JFrame("�߿�");

	public void init()
	{
		jf.setLayout(new GridLayout(2, 4));
		//ʹ�þ�̬������������BevelBorder
		Border bb = BorderFactory.createBevelBorder(BevelBorder.RAISED ,
			Color.RED, Color.GREEN, Color.BLUE, Color.GRAY);
		jf.add(getPanelWithBorder(bb , "BevelBorder"));
		//ʹ�þ�̬������������LineBorder
		Border lb = BorderFactory.createLineBorder(Color.ORANGE, 10);
		jf.add(getPanelWithBorder(lb , "LineBorder"));
		//�þ�̬������������EmptyBorder��Ŀ�����������������
		Border eb = BorderFactory.createEmptyBorder(20, 5, 10, 30);
		jf.add(getPanelWithBorder(eb , "EmptyBorder"));
		//ʹ�þ�̬������������EtchedBorder
		Border etb = BorderFactory.createEtchedBorder(EtchedBorder.RAISED,
			Color.RED, Color.GREEN);
		jf.add(getPanelWithBorder(etb , "EtchedBorder"));
		//����TitledBorder��TitledBorder�߿�Ϊԭ�еı߿����ӱ���
		TitledBorder tb = new TitledBorder(lb , "���Ա���" , TitledBorder.LEFT , 
			TitledBorder.BOTTOM, new Font("StSong" , Font.BOLD , 18), Color.BLUE);
		jf.add(getPanelWithBorder(tb , "TitledBorder"));
		//����MatteBorder������EmptyBorder�����࣬
		//������ָ�������������ɫ�򱳾����˴���ָ����ɫ
		MatteBorder mb = new MatteBorder(20, 5, 10, 30, Color.GREEN);
		jf.add(getPanelWithBorder(mb , "MatteBorder"));
		//����CompoundBorder�������߿���ϳ��±߿�
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
		//ΪPanel������ñ߿�
		p.setBorder(b);
		return p;
	}
}
