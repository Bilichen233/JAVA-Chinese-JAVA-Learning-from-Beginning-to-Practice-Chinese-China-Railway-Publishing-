import java.util.*;
//RR�࣬��д��equals���������count������ȷ���true
//��д��compareTo(Object obj)���������count������ȷ���0;
class RR implements Comparable<Object>{
	int count;
	public RR(int count){
		this.count = count;
	}
	public String toString(){
		return "RR(count����:" + count + ")";
	}
	public boolean equals(Object obj){//����ȽϷ���equals���бȽϣ���Ȼ᷵��true
		if (this == obj){
			return true;
		}
		if (obj != null 
			&& obj.getClass() == RR.class){
			RR r = (RR)obj;
			if (r.count == this.count){//��ȵ�������count���
				return true;
			}
		}
		return false;
	}
	public int compareTo(Object obj){//���巽��compareTo���бȽ�
		RR r = (RR)obj;				//�½�RR��ʵ������r
		if (this.count > r.count){	//�������r��count�򷵻�1
			return 1;
		}
		else if (this.count == r.count){	//�������r��count�򷵻�0
			return 0;
		}
		else{						//���С��r��count�򷵻�-1
			return -1;
		}
	}
}
public class yongTreeMap{
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(new RR(3898) , "NEXȫ����6GB+128GB");
		tm.put(new RR(1598) , "Z1ȫ����4GB+64GB");
		tm.put(new RR(2598) , "X21i��ҹ��4GB+128GB");
		System.out.println(tm);
		//���ظ�TreeMap�ĵ�һ��Entry����
		System.out.println(tm.firstEntry());
		//���ظ�TreeMap�����һ��keyֵ
		System.out.println(tm.lastKey());
		//���ظ�TreeMap�ı�new R(2)�����Сkeyֵ��
		System.out.println(tm.higherKey(new RR(2)));
		//���ظ�TreeMap�ı�new R(2)С������key��value�ԡ�
		System.out.println(tm.lowerEntry(new RR(2)));
		//���ظ�TreeMap����TreeMap
		System.out.println(tm.subMap(new RR(-1) , new RR(4)));
	}
}
