import javax.swing.*;
import java.awt.event.*;

public class yongProgressMonitor
{
	Timer timer;
	public void init()
	{
		final SimulatedTarget target = new SimulatedTarget(1000);
		//������һ���̵߳ķ�ʽ��ִ��һ����ʱ������
		final Thread targetThread = new Thread(target);
		targetThread.start();
		//�������ȶԻ���
		final ProgressMonitor dialog = new ProgressMonitor(null ,
			"�ȴ����" , "����ɣ�" , 0 , target.getAmount());
		//����һ����ʱ��
		timer = new Timer(300 , new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//������ĵ�ǰ��������ý��ȶԻ������ɱ���
				dialog.setProgress(target.getCurrent());
				//����û������˽��ȶԻ���ġ�ȡ������ť
				if (dialog.isCanceled())
				{
					//ֹͣ��ʱ��
					timer.stop();
					//�ж������ִ���߳�
					targetThread.interrupt();
					//ϵͳ�˳�
					System.exit(0);
				}
			}
		});
		timer.start();
	}
	//ģ��һ����ʱ������
	class SimulatedTarget implements Runnable
	{ 
		//����ĵ�ǰ�����
		private volatile int current;
		//��������
		private int amount;
		public SimulatedTarget(int amount)
		{  
			current = 0;
			this.amount = amount;
		}

		public int getAmount()
		{  
		  return amount;
		}

		public int getCurrent()
		{  
			return current;
		}
		//run�����������������Ĺ���
		public void run()
		{  

			while (current < amount)
			{ 
				try
				{
					Thread.sleep(50);
				}
				catch(InterruptedException e)
				{

				}
				current++;
			}
		}
	}
	public static void main(String[] args) 
	{
		new yongProgressMonitor().init();
	}
}
