
public class TestEnum{
	public void judge(jijieEnum s){	//���巽��
		//switch�����ı��ʽ������ö��ֵ
		switch (s)
		{
			case SPRING:
				System.out.println("A˵�����︴�յĴ��죬���Ǵ���֮��");
				break;
			case SUMMER:
				System.out.println("B˵��ʢ�ĵĹ�ʵ����������֮��");
				break;
			case FALL:
				System.out.println("C˵������Ƶ�֮���������֮��");
				break;
			case WINTER:
				System.out.println("D˵��Ω��çç֮���գ����Ƕ���֮��");
				break;
		}
	}
	public static void main(String[] args){
		System.out.println("�����С���n����һ�ڳ�Ա����᣺")		//����ö���඼��һ��values���������ظ�ö���������ʵ��
		for (jijieEnum s : jijieEnum.values()){
			System.out.println(s);
		}
		new TestEnum().judge(jijieEnum.SPRING);
	}
}
