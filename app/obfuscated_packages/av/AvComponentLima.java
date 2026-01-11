package av;

import G.T;
import G.r;
import V.ExceptionPrintstacktrace;
import V.VInterfaceHotel;
import W.aa;
import W.aj;
import W.z;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AvComponentLima extends ExceptionPrintstacktrace {
  protected static l a = null;
  
  String e = null;
  
  String f = null;
  
  public static l f() {
    if (a == null) {
      a = new l();
      a.a(new m());
    } 
    return a;
  }
  
  public void a(File paramFile, r[] paramArrayOfr) {
    a("SingleIniMlvConfigInstance", paramFile.getAbsolutePath(), paramArrayOfr);
  }
  
  public void a(String paramString) {
    String str = z.a(paramString);
    if (T.a().c() == null || !T.a().c().i().equals(str))
      throw new VInterfaceHotel("Proper Configuration has not been loaded."); 
    try {
      aa aa = new aa();
      aa.a(VInterfaceHotel(), paramString, null);
      this.f = aa.d(new File(paramString));
    } catch (ExceptionPrintstacktrace g1) {
      throw new VInterfaceHotel("Error loading tune: " + g1.getMessage());
    } catch (aj aj) {
      throw new VInterfaceHotel("Password Protected tune: " + aj.getMessage());
    } catch (IOException iOException) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new VInterfaceHotel("Unable to access msq for PcVarables.");
    } 
    n n = new n(this);
    n.start();
    ExceptionPrintstacktrace();
    this.e = paramString;
  }
  
  public void j(String paramString) {
    try {
      aa aa = new aa();
      aa.a(VInterfaceHotel(), paramString, new o(this));
      this.b.VInterfaceHotel().ExceptionPrintstacktrace();
      if (this.f != null && this.f.startsWith("<page>"))
        aa.a(new File(paramString), this.f); 
    } catch (Exception exception) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, exception);
      throw new VInterfaceHotel("Failed to save tune file:\n" + paramString + "\nReported Error:\n" + exception.getMessage());
    } 
  }
  
  public boolean k(String paramString) {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */