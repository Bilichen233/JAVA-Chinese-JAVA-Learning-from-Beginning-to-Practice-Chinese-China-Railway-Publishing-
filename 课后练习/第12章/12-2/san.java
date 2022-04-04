import java.util.*;
import java.text.DateFormat;
public class san {

   public static void main(String[] args) {

	   Date date = new Date();
	 //日期格式，精确到日 2017-4-16
	 DateFormat df1 = DateFormat.getDateInstance();
	 System.out.println(df1.format(date));

	 //可以精确到秒  2017-4-16 12:43:37
	 DateFormat df2 = DateFormat.getDateTimeInstance();
	 System.out.println(df2.format(date));

	 //只显示出时时分秒 12:43:37
	 DateFormat df3 = DateFormat.getTimeInstance();
	 System.out.println(df3.format(date));

	 //显示日期，周，上下午，时间（精确到秒）
	 //2017年4月16日 星期日 下午12时43分37秒 CST
	 DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
	 System.out.println(df4.format(date));

	 //显示日期,上下午，时间（精确到秒） 
	 //2017年4月16日 下午12时43分37秒
	 DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
	 System.out.println(df5.format(date));

	 //显示日期,上下午，时间（精确到秒） 
	 //2017年4月16日 下午12时43分37秒
	 DateFormat df5_1 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CHINA);
	 System.out.println(df5_1.format(date));
	 //显示日期，上下午,时间（精确到分） 17-4-16 下午12:43
	 DateFormat df6 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
	 System.out.println(df6.format(date));

	 //显示日期，时间（精确到秒） 2017-4-16 12:43:37 
	 DateFormat df7 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
	 System.out.println(df7.format(date));
   }
}