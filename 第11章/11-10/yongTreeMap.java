import java.util.*;
//RR类，重写了equals方法，如果count属性相等返回true
//重写了compareTo(Object obj)方法，如果count属性相等返回0;
class RR implements Comparable<Object>{
	int count;
	public RR(int count){
		this.count = count;
	}
	public String toString(){
		return "RR(count属性:" + count + ")";
	}
	public boolean equals(Object obj){//定义比较方法equals进行比较，相等会返回true
		if (this == obj){
			return true;
		}
		if (obj != null 
			&& obj.getClass() == RR.class){
			RR r = (RR)obj;
			if (r.count == this.count){//相等的依据是count相等
				return true;
			}
		}
		return false;
	}
	public int compareTo(Object obj){//定义方法compareTo进行比较
		RR r = (RR)obj;				//新建RR的实例对象r
		if (this.count > r.count){	//如果大于r的count则返回1
			return 1;
		}
		else if (this.count == r.count){	//如果等于r的count则返回0
			return 0;
		}
		else{						//如果小于r的count则返回-1
			return -1;
		}
	}
}
public class yongTreeMap{
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(new RR(3898) , "NEX全面屏6GB+128GB");
		tm.put(new RR(1598) , "Z1全面屏4GB+64GB");
		tm.put(new RR(2598) , "X21i迷夜紫4GB+128GB");
		System.out.println(tm);
		//返回该TreeMap的第一个Entry对象
		System.out.println(tm.firstEntry());
		//返回该TreeMap的最后一个key值
		System.out.println(tm.lastKey());
		//返回该TreeMap的比new R(2)大的最小key值。
		System.out.println(tm.higherKey(new RR(2)));
		//返回该TreeMap的比new R(2)小的最大的key－value对。
		System.out.println(tm.lowerEntry(new RR(2)));
		//返回该TreeMap的子TreeMap
		System.out.println(tm.subMap(new RR(-1) , new RR(4)));
	}
}
