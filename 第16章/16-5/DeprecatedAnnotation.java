public class DeprecatedAnnotation{
  public static void main( String[] args ){
     Info info = new Info();
     //��Ȼʹ��getInfo��������������������,ֻ�ǲ�����ʹ���������
     System.out.println( info.getInfo() );    
  }
}
class Info{
   @Deprecated
   public String getInfo(){
            return "RNGս�Ӳ���Ӣ������ESPNȫ��ս��ս����ھ�";
    }
}
