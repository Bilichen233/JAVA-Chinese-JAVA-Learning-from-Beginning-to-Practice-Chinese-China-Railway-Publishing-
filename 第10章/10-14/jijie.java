
public class jijie
{
	//把Season类定义成不可变的，将其属性也定义成final
	private final String name;
	private final String desc;
	public static final jijie SPRING = new jijie("春天" , "小桥流水");
	public static final jijie SUMMER = new jijie("夏天" , "烈日高照");
	public static final jijie FALL = new jijie("秋天" , "天高云淡");
	public static final jijie WINTER = new jijie("冬天" , "惟余莽莽");

	public static jijie getSeaon(int jijieNum)
	{
		switch(jijieNum)
		{
			case 1 :
				return SPRING;
			case 2 :
				return SUMMER;
			case 3 :
				return FALL;
			case 4 :
				return WINTER;
			default :
				return null;
		}
	}

	//将构造器定义成private访问权限
	private jijie(String name , String desc)
	{
		this.name = name;
		this.desc = desc;
	}
	//只为name和desc属性提供getter方法
	public String getName()
	{
		 return this.name;
	}
	public String getDesc()
	{
		 return this.desc;
	}
}
