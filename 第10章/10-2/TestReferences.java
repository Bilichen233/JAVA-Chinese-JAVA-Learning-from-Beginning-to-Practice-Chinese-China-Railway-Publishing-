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
       
        //����length��MyObject�����ǿ����
        Set<MyObject> a = new HashSet<MyObject>();
        for(int i = 0; i < length; i++)
        {
            MyObject ref=new MyObject("Hard_" + i);
            System.out.println("����ǿ���ã�" +ref);
            a.add(ref);
        }
        //a=null;
        System.gc();
       
        //����length��MyObject�����������
        Set<SoftReference<MyObject>> sa = new HashSet<SoftReference<MyObject>>();
        for(int i = 0; i < length; i++)
        {
            SoftReference<MyObject> ref=new SoftReference<MyObject>(new MyObject("Soft_" + i));
            System.out.println("���������ã�" +ref.get());
            sa.add(ref);
        }
        System.gc();

        //����length��MyObject�����������
        Set<WeakReference<MyObject>> wa = new HashSet<WeakReference<MyObject>>();
        for(int i = 0; i < length; i++)
        {
            WeakReference<MyObject> ref=new WeakReference<MyObject>(new MyObject("Weak_" + i));
            System.out.println("���������ã�" +ref.get());
            wa.add(ref);
        }
        System.gc();

        //����length��MyObject�����������
        ReferenceQueue<MyObject> rq = new ReferenceQueue<MyObject>();
        Set<PhantomReference<MyObject>> pa = new HashSet<PhantomReference<MyObject>>();
        for(int i = 0; i < length; i++)
        {
            PhantomReference<MyObject> ref = new PhantomReference<MyObject>(new MyObject("Phantom_" + i), rq);
            System.out.println("���������ã�" +ref.get());
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
        System.out.println("���ն���" + id);
    }
}

 









