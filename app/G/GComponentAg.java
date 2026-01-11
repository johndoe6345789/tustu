package G;

import java.util.ArrayList;
import java.util.List;

public class GComponentAg extends bv {
  private String a = null;
  
  private String f = null;
  
  private dj g = new B(55.0D);
  
  private int h = 0;
  
  public String a() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public String b() {
    return this.f;
  }
  
  public void b(String paramString) {
    this.f = paramString;
  }
  
  public dj c() {
    return this.g;
  }
  
  public void a(dj paramdj) {
    this.g = paramdj;
  }
  
  public void a(int paramInt) {
    this.h = paramInt;
  }
  
  public int d() {
    return this.h;
  }
  
  public List e() {
    ArrayList<String> arrayList = new ArrayList();
    if (this.a != null && !this.a.isEmpty())
      arrayList.add(this.a); 
    if (this.f != null && !this.f.isEmpty())
      arrayList.add(this.f); 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */