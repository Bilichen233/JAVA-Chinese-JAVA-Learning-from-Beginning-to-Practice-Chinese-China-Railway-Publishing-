import javax.swing.*;
import java.awt.event.*;

public class yongProgressMonitor
{
	Timer timer;
	public void init()
	{
		final SimulatedTarget target = new SimulatedTarget(1000);
		//以启动一条线程的方式来执行一个耗时的任务
		final Thread targetThread = new Thread(target);
		targetThread.start();
		//创建进度对话框
		final ProgressMonitor dialog = new ProgressMonitor(null ,
			"等待完成" , "已完成：" , 0 , target.getAmount());
		//创建一个计时器
		timer = new Timer(300 , new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//以任务的当前完成量设置进度对话框的完成比例
				dialog.setProgress(target.getCurrent());
				//如果用户单击了进度对话框的”取消“按钮
				if (dialog.isCanceled())
				{
					//停止计时器
					timer.stop();
					//中断任务的执行线程
					targetThread.interrupt();
					//系统退出
					System.exit(0);
				}
			}
		});
		timer.start();
	}
	//模拟一个耗时的任务
	class SimulatedTarget implements Runnable
	{ 
		//任务的当前完成量
		private volatile int current;
		//总任务量
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
		//run方法代表不断完成任务的过程
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
