package av;

import G.T;
import G.r;
import V.ExceptionPrintstacktrace;
import V.VInterfaceHotel;
import W.NetworkExceptionprintstacktrace;
import W.ExceptionExtension;
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
      NetworkExceptionprintstacktrace NetworkExceptionprintstacktrace = new NetworkExceptionprintstacktrace();
      NetworkExceptionprintstacktrace.a(VInterfaceHotel(), paramString, null);
      this.f = NetworkExceptionprintstacktrace.d(new File(paramString));
    } catch (ExceptionPrintstacktrace g1) {
      throw new VInterfaceHotel("Error loading tune: " + g1.getMessage());
    } catch (ExceptionExtension ExceptionExtension) {
      throw new VInterfaceHotel("Password Protected tune: " + ExceptionExtension.getMessage());
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
      NetworkExceptionprintstacktrace NetworkExceptionprintstacktrace = new NetworkExceptionprintstacktrace();
      NetworkExceptionprintstacktrace.a(VInterfaceHotel(), paramString, new o(this));
      this.b.VInterfaceHotel().ExceptionPrintstacktrace();
      if (this.f != null && this.f.startsWith("<page>"))
        NetworkExceptionprintstacktrace.a(new File(paramString), this.f); 
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