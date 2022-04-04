import java.util.*;
import java.text.DateFormat;
public class san {

   public static void main(String[] args) {

	   Date date = new Date();
	 //���ڸ�ʽ����ȷ���� 2017-4-16
	 DateFormat df1 = DateFormat.getDateInstance();
	 System.out.println(df1.format(date));

	 //���Ծ�ȷ����  2017-4-16 12:43:37
	 DateFormat df2 = DateFormat.getDateTimeInstance();
	 System.out.println(df2.format(date));

	 //ֻ��ʾ��ʱʱ���� 12:43:37
	 DateFormat df3 = DateFormat.getTimeInstance();
	 System.out.println(df3.format(date));

	 //��ʾ���ڣ��ܣ������磬ʱ�䣨��ȷ���룩
	 //2017��4��16�� ������ ����12ʱ43��37�� CST
	 DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
	 System.out.println(df4.format(date));

	 //��ʾ����,�����磬ʱ�䣨��ȷ���룩 
	 //2017��4��16�� ����12ʱ43��37��
	 DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
	 System.out.println(df5.format(date));

	 //��ʾ����,�����磬ʱ�䣨��ȷ���룩 
	 //2017��4��16�� ����12ʱ43��37��
	 DateFormat df5_1 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CHINA);
	 System.out.println(df5_1.format(date));
	 //��ʾ���ڣ�������,ʱ�䣨��ȷ���֣� 17-4-16 ����12:43
	 DateFormat df6 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
	 System.out.println(df6.format(date));

	 //��ʾ���ڣ�ʱ�䣨��ȷ���룩 2017-4-16 12:43:37 
	 DateFormat df7 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
	 System.out.println(df7.format(date));
   }
}