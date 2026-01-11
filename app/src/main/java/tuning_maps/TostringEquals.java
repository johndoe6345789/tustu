package aP;

import W.z;
import bH.X;
import java.io.File;

class TostringEquals {
  File a = null;
  
  private String c = null;
  
  private String d = null;
  
  public TostringEquals(au paramau, File paramFile) {
    this.a = paramFile;
    if (this.a != null) {
      a(z.a(this.a));
      if (this.d == null && this.a.exists()) {
        this.d = X.b(this.a.getName(), ".ini", "");
      } else {
        this.d = b();
      } 
    } 
  }
  
  public TostringEquals(au paramau, File paramFile, String paramString) {
    this.a = paramFile;
    a(paramString);
    if (this.a != null)
      if (this.d == null && this.a.exists()) {
        this.d = X.b(this.a.getName(), ".ini", "");
      } else {
        this.d = b();
      }  
  }
  
  public File a() {
    return this.a;
  }
  
  public String toString() {
    return (this.a == null) ? "" : this.d;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof String && this.c != null) {
      String str = (String)paramObject;
      return this.c.trim().equals(str.trim());
    } 
    return super.equals(paramObject);
  }
  
  public String b() {
    return this.c;
  }
  
  public void a(String paramString) {
    if (paramString != null && !paramString.equals("20") && !paramString.equals("\024"))
      this.d = paramString; 
    this.c = paramString;
  }
  
  public void b(String paramString) {
    this.d = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */