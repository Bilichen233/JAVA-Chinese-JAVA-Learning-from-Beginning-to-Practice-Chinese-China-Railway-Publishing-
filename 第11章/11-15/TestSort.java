import java.util.*;
public class TestSort{
	public static void main(String[] args) {
		ArrayList<String> nums = new ArrayList<String>();
		nums.add("iPhon9");	//�������iPhon9
		nums.add("iPhon6");	//�������iPhon6
		nums.add("iPhon8");	//�������iPhon8
		nums.add("iPhon7");	//�������iPhon7
		System.out.println(nums);
		//��List����Ԫ�صĴ���ת
		Collections.reverse(nums);
		System.out.println(nums);
		//��List����Ԫ�صİ���Ȼ˳������
		Collections.sort(nums);
		System.out.println(nums);
		//��List����Ԫ�صİ����˳������
		Collections.shuffle(nums);
		//ÿ�ε������к󣬴�ӡ����Ĵ��򲻹̶�
		System.out.println(nums);
	}
}
