class Person{
    String name;
    int age;
    //����Ĺ��췽��
    public Person() {

    }
    public String talk() {
        return "i am:"+this.name+", i am "+ this.age +"years old";
    }

}
class Student extends Person{
    String school;
    //����Ĺ��췽��
    public Student(String name, int age, String school) {
    //��������super���ø����е�����
        super.name=name;
        super.age=age;

        //���ø����е�talk()����
        System.out.print(super.talk());

        //���ñ����е�school����
        this.school=school;
    }
}
public class yi {

    public static void main(String[] args) {
        Student s= new Student("Jack",30,"HAUT");
        System.out.println(", I am from :"+s.school);
    }

}