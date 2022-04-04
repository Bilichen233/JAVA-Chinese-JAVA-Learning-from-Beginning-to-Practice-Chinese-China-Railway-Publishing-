import java.util.*;
public class yongTestTreeSet
{
	public static void main(String[] args) {
		TreeSet nums = new TreeSet();
		//向TreeSet中添加四个Integer对象
		nums.add("iPhone 5");
		nums.add("iPhone 7");
		nums.add("iPhone 6");
		nums.add("iPhone X");
		//输出集合元素，看到集合元素已经处于排序状态
		System.out.println(nums);
		//输出集合里的第一个元素
		System.out.println(nums.first());
		//输出集合里的最后一个元素
		System.out.println(nums.last());
		TreeSet nums1 = new TreeSet();
		//向TreeSet中添加四个Integer对象
		nums1.add(5);
		nums1.add(2);
		nums1.add(10);
		nums1.add(-9);
		//返回小于4的子集，不包含4
		System.out.println(nums1.headSet(4));
		//返回大于5的子集，如果Set中包含5，子集中还包含5
		System.out.println(nums1.tailSet(5));
		//返回大于等于-3，小于4的子集。
		System.out.println(nums1.subSet(-3 , 4));
	}
}
