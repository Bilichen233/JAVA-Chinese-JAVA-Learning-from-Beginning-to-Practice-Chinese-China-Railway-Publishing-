import java.util.*;
public class yongTestTreeSet
{
	public static void main(String[] args) {
		TreeSet nums = new TreeSet();
		//��TreeSet������ĸ�Integer����
		nums.add("iPhone 5");
		nums.add("iPhone 7");
		nums.add("iPhone 6");
		nums.add("iPhone X");
		//�������Ԫ�أ���������Ԫ���Ѿ���������״̬
		System.out.println(nums);
		//���������ĵ�һ��Ԫ��
		System.out.println(nums.first());
		//�������������һ��Ԫ��
		System.out.println(nums.last());
		TreeSet nums1 = new TreeSet();
		//��TreeSet������ĸ�Integer����
		nums1.add(5);
		nums1.add(2);
		nums1.add(10);
		nums1.add(-9);
		//����С��4���Ӽ���������4
		System.out.println(nums1.headSet(4));
		//���ش���5���Ӽ������Set�а���5���Ӽ��л�����5
		System.out.println(nums1.tailSet(5));
		//���ش��ڵ���-3��С��4���Ӽ���
		System.out.println(nums1.subSet(-3 , 4));
	}
}
