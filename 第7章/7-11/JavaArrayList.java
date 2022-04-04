import java.util.ArrayList;
public class JavaArrayList {
 public static void main(String[]args) {
  //Java动态数组的初始化
  ArrayList<String> al=new ArrayList<String>();
  //向Java动态数组中添加数据
  al.add("a");
  al.add("b");
  al.add("c");
  //输出Java动态数组
  for(int i=0;i<al.size();i++)
  {
   String alEach=(String)al.get(i);
   System.out.println(alEach);
  }
  //删除数组中的某个元素,删除第二个元素
  al.remove(1);
  //修改Java动态数组，把新的元素放到第二个位置
  al.add(1,"2");
  ////输出Java动态数组
  for(int i=0;i<al.size();i++)
  {
   String alEach=(String)al.get(i);
   System.out.println(alEach);
  }
 }
}
