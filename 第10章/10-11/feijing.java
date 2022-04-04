public class feijing{
	private double weight;
	//外部类的两个重载的构造器
	public feijing(){}
	public feijing(double weight){
		this.weight = weight;
	}
	//定义一个内部类
	private class feijingLeg{
		//内部类的两个属性
		private double length;
		private String color;
		//内部类的两个重载的构造器
		public feijingLeg(){}
		public feijingLeg(double length , String color){
			this.length = length;
			this.color = color;
		}
		public void setLength(double length){
			this.length = length;
		}
		public double getLength(){
			 return this.length;
		}
		public void setColor(String color){
			this.color = color;
		}
		public String getColor(){
			 return this.color;
		}
		//内部类方法
		public void info(){
			System.out.println("A说：我的衣服颜色是" + color + ", 在饭店门口东边" + length+"米的地方等你！");
			//直接访问外部类的private属性：weight
			System.out.println("B说：原来说这里啊，离我很近，只有" + weight+"米远！");
		}
	}
	public void test(){
		feijingLeg cl = new feijingLeg(50.5 , "灰色");
		cl.info();
	}
	public static void main(String[] args){
		feijing feijing = new feijing(800);
		feijing.test();
	}
}