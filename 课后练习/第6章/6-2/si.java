public class si{
    public static void main(String args[]) {
        String Str = new String("菜鸟教程：www.runoob.com");
        boolean retVal;
 
        retVal = Str.endsWith( "runoob" );
        System.out.println("返回值 = " + retVal );
 
        retVal = Str.endsWith( "com" );
        System.out.println("返回值 = " + retVal );
    }
}