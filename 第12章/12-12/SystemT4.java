class Person{
	private String name ;
	private int age ;
	public Person(String name,int age){
		this.name = name ;
		this.age = age;
	}
	public String toString(){	// ��дtoString()����
		return this.name + "������" + this.age + "��";
	}
	public void finalize() throws Throwable{	// �����ͷſռ�ʱĬ�ϵ��ô˷���
		System.out.println("�����ͷ� -->" + this) ;
	}
};
public class SystemT4{
	public static void main(String args[]){
		Person per = new Person("С��",31) ;
		per = null ;	// �Ͽ�����
		System.gc() ;		// ǿ�����ͷſռ�
	}
};