import java.util.*;
public class TestSort{
	public static void main(String[] args) {
		ArrayList<String> nums = new ArrayList<String>();
		nums.add("iPhon9");	//添加数据iPhon9
		nums.add("iPhon6");	//添加数据iPhon6
		nums.add("iPhon8");	//添加数据iPhon8
		nums.add("iPhon7");	//添加数据iPhon7
		System.out.println(nums);
		//将List集合元素的次序反转
		Collections.reverse(nums);
		System.out.println(nums);
		//将List集合元素的按自然顺序排序
		Collections.sort(nums);
		System.out.println(nums);
		//将List集合元素的按随机顺序排序
		Collections.shuffle(nums);
		//每次调试运行后，打印输出的次序不固定
		System.out.println(nums);
	}
}
