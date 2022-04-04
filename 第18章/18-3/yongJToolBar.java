
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;

public class yongJToolBar
{
	JFrame jf = new JFrame("������");
	JTextArea aaa = new JTextArea(6, 35);
	JToolBar bbb = new JToolBar();
	JMenuBar ccc = new JMenuBar();
	JMenu edit = new JMenu("�༭");
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	//����"ճ��"Action����Action���ڴ����˵�����߰�ť����ͨ��ť
	Action pasteAction = new AbstractAction("ճ��", new ImageIcon("tu/paste.png"))
	{
		public void actionPerformed(ActionEvent e)
		{
			//����������а���stringFlavor����
			if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
			{
				try
				{
					//ȡ����������stringFlavor����
					String content = (String)clipboard.getData(DataFlavor.stringFlavor);
					//��ѡ�������滻�ɼ������е�����
					aaa.replaceRange(content , aaa.getSelectionStart() , aaa.getSelectionEnd());
				}
				catch (Exception ee)
				{
					ee.printStackTrace();
				}
			}
		}
	};
	//����"����"Action
	Action copyAction = new AbstractAction("����", new ImageIcon("tu/copy.png"))
	{
		public void actionPerformed(ActionEvent e)
		{
			StringSelection contents = new StringSelection(aaa.getSelectedText());
			//��StringSelection������������
			clipboard.setContents(contents, null);
			//����������а���stringFlavor����
			if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
			{
				//��pasteAction����
				pasteAction.setEnabled(true);
			}
		}
	};
	public void init()
	{
		//pasteActionĬ�ϴ��ڲ�����״̬
		pasteAction.setEnabled(false);
		jf.add(new JScrollPane(aaa));
		//��Action������ť�������ð�ť��ӵ�Panel��
		JButton copyBn = new JButton(copyAction);
		JButton pasteBn = new JButton(pasteAction);
		JPanel jp = new JPanel();
		jp.add(copyBn);
		jp.add(pasteBn);
		jf.add(jp , BorderLayout.SOUTH);
		//�򹤾��������Action���󣬸ö��󽫻�ת���ɹ��߰�ť
		bbb.add(copyAction);
		bbb.addSeparator();
		bbb.add(pasteAction);
		//��˵������Action���󣬸ö��󽫻�ת���ɲ˵���
		edit.add(copyAction);
		edit.add(pasteAction);
		//��edit�˵���ӵ��˵�����
		bbb.add(edit);
		jf.setJMenuBar(ccc);
		//���ù������͹��߰�ť֮��ľ���
		bbb.setMargin(new Insets(20 ,10 , 5 , 30));
		//�򴰿�����ӹ�����
		jf.add(bbb , BorderLayout.NORTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new yongJToolBar().init();
	}
}
