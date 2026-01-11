package G;

import bH.X;
import java.io.Serializable;

public class SerializableImplEquals implements Serializable {
  private String b = null;
  
  private String c = "";
  
  public SerializableImplEquals(aX paramaX, String paramString1, String paramString2) {
    a(paramString1);
    b(paramString2);
  }
  
  public String a() {
    return this.b;
  }
  
  public void a(String paramString) {
    this.b = paramString;
  }
  
  public String b() {
    return X.b(this.c, "\"", "");
  }
  
  public void b(String paramString) {
    this.c = paramString;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof aY) {
      aY aY1 = (aY)paramObject;
      if (aY1 != null && aY1.a() != null && a() != null)
        return aY1.a().equals(a()); 
    } 
    return super.equals(paramObject);
  }
  
  public String toString() {
    return (this.c == null || this.c.equals("")) ? a() : b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */