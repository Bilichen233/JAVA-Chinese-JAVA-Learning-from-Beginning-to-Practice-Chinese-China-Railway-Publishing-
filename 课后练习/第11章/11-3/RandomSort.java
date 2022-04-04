package list;

import java.util.*;

public class RandomSort {
	private int minValue; // 最小值

	private int maxValue; // 最大值

	public RandomSort() { // 构造方法初始化变量
		this.minValue = 0;
		this.maxValue = 10;
	}

	public RandomSort(int minValue, int maxValue) { // 带参数构造方法初始化变量
		this(); // 调用上面的构造方法
		if (maxValue >= minValue) {
			this.minValue = minValue;
			this.maxValue = maxValue;
		} else {
			System.out.println("最大值小于最小值，按缺省值进行赋值！");
		}
	}

	public static void main(String[] args) { // java程序主入口处
		RandomSort rs = new RandomSort(3, 12);
		System.out.println("<1> 运用排除法生成不重复的随机数序列");
		printArray(rs.exclusionSort(6));
		System.out.println("<2> 运用筛选法生成不重复的随机数序列");
		printArray(rs.proceduresSort(6));
	}

	public Integer[] exclusionSort(int len) { // 运用排除法生成不重复的随机数序列
		if (len <= 0) { // 判断传入的数值
			return new Integer[0];
		} else if (len > (this.maxValue - this.minValue)) {
			System.out.println("长度不能达到:" + len + ", 长度只能是："
					+ (this.maxValue - this.minValue));
			len = this.maxValue - this.minValue; // 重新赋值
		}
		Random random = new Random(); // 用于生成随机对象
		List rlist = new ArrayList(); // 创建列表对象
		while (rlist.size() < len) {
			// 将[minValue, maxValue]区间等价于min + [0, maxValue - minValue + 1)
			// 生成随机数
			Integer randnum = new Integer(this.minValue
					+ random.nextInt(this.maxValue - this.minValue + 1));
			if (!rlist.contains(randnum)) { // 判断列表中是否包含对象
				rlist.add(randnum); // 添加整型对象
			}
		}
		return (Integer[]) rlist.toArray(new Integer[0]); // 将列表转换成整型数组返回
	}

	public Integer[] proceduresSort(int len) { // 运用筛选法生成不重复的随机数序列
		if (len <= 0) {
			return new Integer[0];
		} else if (len > (this.maxValue - this.minValue)) {
			System.out.println("长度不能达到:" + len + ", 长度只能是："
					+ (this.maxValue - this.minValue));
			len = this.maxValue - this.minValue;
		}
		int numLength = this.maxValue - this.minValue + 1; // 初始化列表长度
		List alist = new ArrayList();
		for (int i = this.minValue; i <= this.maxValue; i++) { // 循环依次获得整数
			alist.add(new Integer(i)); // 在列表中添加整型数据
		}
		Random rd = new Random(); // 用于生成随机下标
		List rlist = new ArrayList(); // 创建列表对象
		while (rlist.size() < len) {
			int index = rd.nextInt(numLength); // 生成在[0,numLength)范围内的下标
			rlist.add(alist.get(index)); // 下标为index数字对象放入列表对象中
			alist.remove(index); // 移除下标为index的数字对象
			numLength--; // 候选队列长度减去1
		}
		return (Integer[]) rlist.toArray(new Integer[0]); // 将列表转换成整型数组返回
	}

	public static void printArray(Integer[] data) { // 显示数组元素
		if (data != null) { // 判断数组是否为空
			for (int i = 0; i < data.length; i++) { // 循环显示数组数据
				System.out.print(data[i] + "\t");
			}
		}
		System.out.println(); // 换行
	}

}
