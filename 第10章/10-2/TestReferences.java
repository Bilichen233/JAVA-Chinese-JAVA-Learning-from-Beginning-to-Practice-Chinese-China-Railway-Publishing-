import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.HashSet;

public class TestReferences
{
    public static void main(String[] args)
    {
        int length=10;
       
        //创建length个MyObject对象的强引用
        Set<MyObject> a = new HashSet<MyObject>();
        for(int i = 0; i < length; i++)
        {
            MyObject ref=new MyObject("Hard_" + i);
            System.out.println("创建强引用：" +ref);
            a.add(ref);
        }
        //a=null;
        System.gc();
       
        //创建length个MyObject对象的软引用
        Set<SoftReference<MyObject>> sa = new HashSet<SoftReference<MyObject>>();
        for(int i = 0; i < length; i++)
        {
            SoftReference<MyObject> ref=new SoftReference<MyObject>(new MyObject("Soft_" + i));
            System.out.println("创建软引用：" +ref.get());
            sa.add(ref);
        }
        System.gc();

        //创建length个MyObject对象的弱引用
        Set<WeakReference<MyObject>> wa = new HashSet<WeakReference<MyObject>>();
        for(int i = 0; i < length; i++)
        {
            WeakReference<MyObject> ref=new WeakReference<MyObject>(new MyObject("Weak_" + i));
            System.out.println("创建弱引用：" +ref.get());
            wa.add(ref);
        }
        System.gc();

        //创建length个MyObject对象的虚引用
        ReferenceQueue<MyObject> rq = new ReferenceQueue<MyObject>();
        Set<PhantomReference<MyObject>> pa = new HashSet<PhantomReference<MyObject>>();
        for(int i = 0; i < length; i++)
        {
            PhantomReference<MyObject> ref = new PhantomReference<MyObject>(new MyObject("Phantom_" + i), rq);
            System.out.println("创建虚引用：" +ref.get());
            pa.add(ref);
        }
        System.gc();
    }
}

class MyObject
{
    private String id;

    public MyObject(String id)
    {
        this.id = id;
    }

    public String toString()
    {
        return id;
    }

    public void finalize()
    {
        System.out.println("回收对象：" + id);
    }
}

 









