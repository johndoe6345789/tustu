package av;

import G.T;
import V.a;
import V.h;
import W.z;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class f extends g {
  protected static f a = null;
  
  public static f f() {
    if (a == null)
      a = new f(); 
    return a;
  }
  
  private f() {
    i();
  }
  
  private void i() {
    a("SingleBigMlvConfigInstance", "./inc/bsTables.ini");
  }
  
  public void a(String paramString) {
    String str = z.a(paramString);
    if (T.a().c() == null || !T.a().c().i().equals(str))
      i(); 
    try {
      (new a()).a(paramString, this);
      this.b.h().g();
      g();
    } catch (a a) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      throw new h("Unable to load tune file:\n" + paramString + "\nReported Error:\n" + a.getMessage());
    } 
  }
  
  public void j(String paramString) {
    try {
      (new a()).b(paramString, this);
      this.b.h().g();
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new h("Failed to save tune file:\n" + paramString + "\nReported Error:\n" + iOException.getMessage());
    } 
  }
  
  public boolean k(String paramString) {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */