
public class TestEnum{
	public void judge(jijieEnum s){	//定义方法
		//switch语句里的表达式可以是枚举值
		switch (s)
		{
			case SPRING:
				System.out.println("A说：万物复苏的春天，我是春天之神！");
				break;
			case SUMMER:
				System.out.println("B说：盛夏的果实，我是夏天之神！");
				break;
			case FALL:
				System.out.println("C说：天高云淡之秋，我是秋天之神！");
				break;
			case WINTER:
				System.out.println("D说：惟余莽莽之冬日，我是冬天之神！");
				break;
		}
	}
	public static void main(String[] args){
		System.out.println("《跑男》第n季第一期成员见面会：")		//所有枚举类都有一个values方法，返回该枚举类的所有实例
		for (jijieEnum s : jijieEnum.values()){
			System.out.println(s);
		}
		new TestEnum().judge(jijieEnum.SPRING);
	}
}
