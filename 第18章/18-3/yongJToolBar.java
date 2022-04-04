
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;

public class yongJToolBar
{
	JFrame jf = new JFrame("工具条");
	JTextArea aaa = new JTextArea(6, 35);
	JToolBar bbb = new JToolBar();
	JMenuBar ccc = new JMenuBar();
	JMenu edit = new JMenu("编辑");
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	//创建"粘贴"Action，该Action用于创建菜单项、工具按钮和普通按钮
	Action pasteAction = new AbstractAction("粘贴", new ImageIcon("tu/paste.png"))
	{
		public void actionPerformed(ActionEvent e)
		{
			//如果剪贴板中包含stringFlavor内容
			if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
			{
				try
				{
					//取出剪贴板中stringFlavor内容
					String content = (String)clipboard.getData(DataFlavor.stringFlavor);
					//将选中内容替换成剪贴板中的内容
					aaa.replaceRange(content , aaa.getSelectionStart() , aaa.getSelectionEnd());
				}
				catch (Exception ee)
				{
					ee.printStackTrace();
				}
			}
		}
	};
	//创建"复制"Action
	Action copyAction = new AbstractAction("复制", new ImageIcon("tu/copy.png"))
	{
		public void actionPerformed(ActionEvent e)
		{
			StringSelection contents = new StringSelection(aaa.getSelectedText());
			//将StringSelection对象放入剪贴板
			clipboard.setContents(contents, null);
			//如果剪贴板中包含stringFlavor内容
			if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
			{
				//将pasteAction激活
				pasteAction.setEnabled(true);
			}
		}
	};
	public void init()
	{
		//pasteAction默认处于不激活状态
		pasteAction.setEnabled(false);
		jf.add(new JScrollPane(aaa));
		//以Action创建按钮，并将该按钮添加到Panel中
		JButton copyBn = new JButton(copyAction);
		JButton pasteBn = new JButton(pasteAction);
		JPanel jp = new JPanel();
		jp.add(copyBn);
		jp.add(pasteBn);
		jf.add(jp , BorderLayout.SOUTH);
		//向工具条中添加Action对象，该对象将会转换成工具按钮
		bbb.add(copyAction);
		bbb.addSeparator();
		bbb.add(pasteAction);
		//向菜单中添加Action对象，该对象将会转换成菜单项
		edit.add(copyAction);
		edit.add(pasteAction);
		//将edit菜单添加到菜单条中
		bbb.add(edit);
		jf.setJMenuBar(ccc);
		//设置工具条和工具按钮之间的距离
		bbb.setMargin(new Insets(20 ,10 , 5 , 30));
		//向窗口中添加工具条
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
