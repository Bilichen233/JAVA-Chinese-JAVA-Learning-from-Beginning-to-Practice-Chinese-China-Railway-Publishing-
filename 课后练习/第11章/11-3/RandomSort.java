package list;

import java.util.*;

public class RandomSort {
	private int minValue; // ��Сֵ

	private int maxValue; // ���ֵ

	public RandomSort() { // ���췽����ʼ������
		this.minValue = 0;
		this.maxValue = 10;
	}

	public RandomSort(int minValue, int maxValue) { // ���������췽����ʼ������
		this(); // ��������Ĺ��췽��
		if (maxValue >= minValue) {
			this.minValue = minValue;
			this.maxValue = maxValue;
		} else {
			System.out.println("���ֵС����Сֵ����ȱʡֵ���и�ֵ��");
		}
	}

	public static void main(String[] args) { // java��������ڴ�
		RandomSort rs = new RandomSort(3, 12);
		System.out.println("<1> �����ų������ɲ��ظ������������");
		printArray(rs.exclusionSort(6));
		System.out.println("<2> ����ɸѡ�����ɲ��ظ������������");
		printArray(rs.proceduresSort(6));
	}

	public Integer[] exclusionSort(int len) { // �����ų������ɲ��ظ������������
		if (len <= 0) { // �жϴ������ֵ
			return new Integer[0];
		} else if (len > (this.maxValue - this.minValue)) {
			System.out.println("���Ȳ��ܴﵽ:" + len + ", ����ֻ���ǣ�"
					+ (this.maxValue - this.minValue));
			len = this.maxValue - this.minValue; // ���¸�ֵ
		}
		Random random = new Random(); // ���������������
		List rlist = new ArrayList(); // �����б����
		while (rlist.size() < len) {
			// ��[minValue, maxValue]����ȼ���min + [0, maxValue - minValue + 1)
			// ���������
			Integer randnum = new Integer(this.minValue
					+ random.nextInt(this.maxValue - this.minValue + 1));
			if (!rlist.contains(randnum)) { // �ж��б����Ƿ��������
				rlist.add(randnum); // ������Ͷ���
			}
		}
		return (Integer[]) rlist.toArray(new Integer[0]); // ���б�ת�����������鷵��
	}

	public Integer[] proceduresSort(int len) { // ����ɸѡ�����ɲ��ظ������������
		if (len <= 0) {
			return new Integer[0];
		} else if (len > (this.maxValue - this.minValue)) {
			System.out.println("���Ȳ��ܴﵽ:" + len + ", ����ֻ���ǣ�"
					+ (this.maxValue - this.minValue));
			len = this.maxValue - this.minValue;
		}
		int numLength = this.maxValue - this.minValue + 1; // ��ʼ���б���
		List alist = new ArrayList();
		for (int i = this.minValue; i <= this.maxValue; i++) { // ѭ�����λ������
			alist.add(new Integer(i)); // ���б��������������
		}
		Random rd = new Random(); // ������������±�
		List rlist = new ArrayList(); // �����б����
		while (rlist.size() < len) {
			int index = rd.nextInt(numLength); // ������[0,numLength)��Χ�ڵ��±�
			rlist.add(alist.get(index)); // �±�Ϊindex���ֶ�������б������
			alist.remove(index); // �Ƴ��±�Ϊindex�����ֶ���
			numLength--; // ��ѡ���г��ȼ�ȥ1
		}
		return (Integer[]) rlist.toArray(new Integer[0]); // ���б�ת�����������鷵��
	}

	public static void printArray(Integer[] data) { // ��ʾ����Ԫ��
		if (data != null) { // �ж������Ƿ�Ϊ��
			for (int i = 0; i < data.length; i++) { // ѭ����ʾ��������
				System.out.print(data[i] + "\t");
			}
		}
		System.out.println(); // ����
	}

}
