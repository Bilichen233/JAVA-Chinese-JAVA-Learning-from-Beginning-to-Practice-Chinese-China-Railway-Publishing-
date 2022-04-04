class Person{
    String name;
    int age;
    //父类的构造方法
    public Person() {

    }
    public String talk() {
        return "i am:"+this.name+", i am "+ this.age +"years old";
    }

}
class Student extends Person{
    String school;
    //子类的构造方法
    public Student(String name, int age, String school) {
    //在这里用super调用父类中的属性
        super.name=name;
        super.age=age;

        //调用父类中的talk()方法
        System.out.print(super.talk());

        //调用本类中的school属性
        this.school=school;
    }
}
public class yi {

    public static void main(String[] args) {
        Student s= new Student("Jack",30,"HAUT");
        System.out.println(", I am from :"+s.school);
    }

}