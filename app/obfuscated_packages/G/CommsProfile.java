package G;

import bH.R;
import java.io.Serializable;

public class CommsProfile extends Q implements R, Serializable {
  private String a = null;
  
  private boolean b = false;
  
  private String c = null;
  
  private boolean d = false;
  
  private R e = null;
  
  public r() {}
  
  public r(String paramString) {
    v(paramString);
  }
  
  public String a() {
    return b() ? (this.a + " (Default)") : this.a;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public boolean b() {
    return this.b;
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public void b(String paramString) {
    this.c = paramString;
  }
  
  public String toString() {
    return (a() != null) ? a() : aL();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof r) {
      r r1 = (r)paramObject;
      return (r1.aL().equals(aL()) && r1.a.equals(this.a));
    } 
    if (paramObject instanceof String) {
      String str = (String)paramObject;
      return str.equals(aL());
    } 
    return false;
  }
  
  public String c() {
    return (this.e != null) ? this.e.c() : (a() + aL());
  }
  
  public void a(R paramR) {
    this.e = paramR;
  }
  
  public void b(boolean paramBoolean) {
    this.d = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */