package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class bJ extends bv implements Serializable {
  private final ArrayList a = new ArrayList();
  
  private boolean f = false;
  
  private A g = null;
  
  public void a(String paramString, bL parambL) {
    bK bK = new bK(this, paramString, parambL);
    this.a.add(bK);
  }
  
  public List a() {
    return this.a;
  }
  
  public A b() {
    return this.g;
  }
  
  public void a(A paramA) {
    this.g = paramA;
  }
  
  public boolean c() {
    return this.f;
  }
  
  public void a(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  public List e() {
    ArrayList arrayList = new ArrayList();
    for (bK bK : this.a)
      arrayList.addAll(bK.b().a()); 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */