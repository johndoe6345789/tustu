package P;

import G.bL;
import java.util.ArrayList;
import java.util.List;

public class b extends bL {
  private String b = null;
  
  private String c = null;
  
  private String d = null;
  
  private String e = null;
  
  public String b() {
    return this.b;
  }
  
  public void b(String paramString) {
    this.b = paramString;
  }
  
  public String c() {
    return this.c;
  }
  
  public void c(String paramString) {
    this.c = paramString;
  }
  
  public String d() {
    return this.d;
  }
  
  public void d(String paramString) {
    this.d = paramString;
  }
  
  public String e() {
    return this.e;
  }
  
  public void e(String paramString) {
    this.e = paramString;
  }
  
  public List a() {
    ArrayList<String> arrayList = new ArrayList();
    if (this.b != null && !this.b.isEmpty())
      arrayList.add(this.b); 
    if (this.c != null && !this.c.isEmpty())
      arrayList.add(this.c); 
    if (this.d != null && !this.d.isEmpty())
      arrayList.add(this.d); 
    if (this.e != null && !this.e.isEmpty())
      arrayList.add(this.e); 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/P/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */