public class feijing{
	private double weight;
	//�ⲿ����������صĹ�����
	public feijing(){}
	public feijing(double weight){
		this.weight = weight;
	}
	//����һ���ڲ���
	private class feijingLeg{
		//�ڲ������������
		private double length;
		private String color;
		//�ڲ�����������صĹ�����
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
		//�ڲ��෽��
		public void info(){
			System.out.println("A˵���ҵ��·���ɫ��" + color + ", �ڷ����ſڶ���" + length+"�׵ĵط����㣡");
			//ֱ�ӷ����ⲿ���private���ԣ�weight
			System.out.println("B˵��ԭ��˵���ﰡ�����Һܽ���ֻ��" + weight+"��Զ��");
		}
	}
	public void test(){
		feijingLeg cl = new feijingLeg(50.5 , "��ɫ");
		cl.info();
	}
	public static void main(String[] args){
		feijing feijing = new feijing(800);
		feijing.test();
	}
}