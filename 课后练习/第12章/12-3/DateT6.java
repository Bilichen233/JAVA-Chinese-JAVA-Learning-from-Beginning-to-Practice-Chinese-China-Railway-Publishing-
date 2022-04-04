  
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class DateT6 {  
    public static void main(String[] args) 
throws Exception {   // 所有异常 抛出  
        String strDate = "2008-10-19 10:11:30.345"; 
// 定义日期时间的字符串  
        String pat = "yyyy-MM-dd HH:mm:ss.SSS";  
// 定义模板  
        SimpleDateFormat sdf = new
 SimpleDateFormat(pat); // 实例化模板对象  
        Date d = sdf.parse(strDate);      
// 将给定字符串中的日期  提取出来  
        System.out.println(d) ;      
// 输出Date对象  
    }  
} 
