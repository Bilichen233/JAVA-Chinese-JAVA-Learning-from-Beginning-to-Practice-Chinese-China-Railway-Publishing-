public class DeprecatedAnnotation{
  public static void main( String[] args ){
     Info info = new Info();
     //虽然使用getInfo方法并不会产生编译错误,只是不建议使用这个方法
     System.out.println( info.getInfo() );    
  }
}
class Info{
   @Deprecated
   public String getInfo(){
            return "RNG战队蝉联英雄联盟ESPN全球战队战力榜冠军";
    }
}
