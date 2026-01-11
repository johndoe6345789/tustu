package G;

import V.g;
import bH.X;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aj extends Q {
  private db a = null;
  
  private db b = null;
  
  private String c = "";
  
  private String d = null;
  
  public String a() {
    try {
      return (this.a == null) ? null : this.a.a();
    } catch (g g) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      return null;
    } 
  }
  
  public void a(db paramdb) {
    this.a = paramdb;
  }
  
  public String b() {
    try {
      return (this.b == null) ? null : this.b.a();
    } catch (g g) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      return null;
    } 
  }
  
  public void b(db paramdb) {
    this.b = paramdb;
  }
  
  public String c() {
    return this.c;
  }
  
  public void a(String paramString) {
    paramString = X.b(paramString, "\\n", "\n");
    paramString = X.b(paramString, "\\t", "\t");
    this.c += paramString;
  }
  
  public String d() {
    return this.d;
  }
  
  public void b(String paramString) {
    this.d = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */