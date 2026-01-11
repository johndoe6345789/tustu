package ak;

import W.T;
import java.util.ArrayList;
import java.util.Iterator;

public class av extends g {
  public av() {
    super(",", false);
  }
  
  protected int b(String paramString) {
    return 0;
  }
  
  public Iterator b() {
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = super.b();
    while (iterator.hasNext()) {
      T t = iterator.next();
      if (!t.a().startsWith("Clock"))
        arrayList.add(t); 
    } 
    return arrayList.iterator();
  }
  
  public float[] c() {
    float[] arrayOfFloat1 = super.c();
    float[] arrayOfFloat2 = new float[arrayOfFloat1.length - 1];
    System.arraycopy(arrayOfFloat1, 1, arrayOfFloat2, 0, arrayOfFloat2.length);
    return arrayOfFloat2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */