public class si{
    public static void main(String args[]) {
        String Str = new String("����̳̣�www.runoob.com");
        boolean retVal;
 
        retVal = Str.endsWith( "runoob" );
        System.out.println("����ֵ = " + retVal );
 
        retVal = Str.endsWith( "com" );
        System.out.println("����ֵ = " + retVal );
    }
}