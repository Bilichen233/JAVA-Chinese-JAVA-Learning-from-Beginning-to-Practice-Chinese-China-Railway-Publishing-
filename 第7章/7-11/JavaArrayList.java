import java.util.ArrayList;
public class JavaArrayList {
 public static void main(String[]args) {
  //Java��̬����ĳ�ʼ��
  ArrayList<String> al=new ArrayList<String>();
  //��Java��̬�������������
  al.add("a");
  al.add("b");
  al.add("c");
  //���Java��̬����
  for(int i=0;i<al.size();i++)
  {
   String alEach=(String)al.get(i);
   System.out.println(alEach);
  }
  //ɾ�������е�ĳ��Ԫ��,ɾ���ڶ���Ԫ��
  al.remove(1);
  //�޸�Java��̬���飬���µ�Ԫ�طŵ��ڶ���λ��
  al.add(1,"2");
  ////���Java��̬����
  for(int i=0;i<al.size();i++)
  {
   String alEach=(String)al.get(i);
   System.out.println(alEach);
  }
 }
}
