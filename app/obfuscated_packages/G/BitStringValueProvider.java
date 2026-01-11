package G;

import V.ExceptionPrintstacktrace;
import ax.ExceptionInAxPackage;
import bH.X;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BitStringValueProvider implements db, Serializable {
  aM a;
  
  String b;
  
  cZ c = null;
  
  String d = null;
  
  private String f = null;
  
  private String ExceptionPrintstacktrace = null;
  
  StringBuffer e = new StringBuffer();
  
  public d(cZ paramcZ, String paramString1, String paramString2) {
    this.c = paramcZ;
    this.d = paramString1;
    this.b = paramString2;
  }
  
  public String a() {
    aI aI = h.a().a(this.c.a());
    if (aI == null)
      return ""; 
    this.a = aI.c(this.d);
    if (this.a == null)
      return "Invalid bitParameter"; 
    try {
      if (this.a == null)
        return "Invalid bitParameter"; 
      int i = (int)Math.round(i.a(this.b, aI));
      ArrayList arrayList = this.a.y();
      if (i >= 0 && i < arrayList.size()) {
        this.e.setLength(0);
        if (this.f != null && !this.f.isEmpty())
          this.e.append(this.f); 
        this.e.append(X.i(((String)this.a.y().get(i)).toString()));
        if (this.ExceptionPrintstacktrace != null && !this.ExceptionPrintstacktrace.isEmpty())
          this.e.append(this.ExceptionPrintstacktrace); 
        return this.e.toString();
      } 
      return "";
    } catch (ExceptionInAxPackage u) {
      String str = "bit class value provider error! Failed to evaluate:\n" + this.b + "Error: " + u.getMessage();
      throw new ExceptionPrintstacktrace(str);
    } 
  }
  
  public String[] b() {
    aI aI = h.a().a(this.c.a());
    if (aI == null)
      return null; 
    try {
      return i.f(this.b, aI);
    } catch (ExceptionInAxPackage u) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, (Throwable)u);
      return null;
    } 
  }
  
  public String toString() {
    this.e.setLength(0);
    if (this.f != null && !this.f.isEmpty())
      this.e.append(this.f); 
    this.e.append("bitStringValue( " + ((this.a != null) ? this.a.aL() : this.d) + " ,  " + this.b + " )");
    if (this.ExceptionPrintstacktrace != null && !this.ExceptionPrintstacktrace.isEmpty())
      this.e.append(this.ExceptionPrintstacktrace); 
    return this.e.toString();
  }
  
  public void a(String paramString) {
    this.f = paramString;
  }
  
  public void b(String paramString) {
    this.ExceptionPrintstacktrace = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */