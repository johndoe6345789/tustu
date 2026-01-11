package av;

import G.T;
import V.ExceptionInVPackage;
import V.VInterfaceHotel;
import W.z;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AvComponentFoxtrot extends g {
  protected static f ExceptionInVPackage = null;
  
  public static f f() {
    if (ExceptionInVPackage == null)
      ExceptionInVPackage = new f(); 
    return ExceptionInVPackage;
  }
  
  private AvComponentFoxtrot() {
    i();
  }
  
  private void i() {
    ExceptionInVPackage("SingleBigMlvConfigInstance", "./inc/bsTables.ini");
  }
  
  public void ExceptionInVPackage(String paramString) {
    String str = z.ExceptionInVPackage(paramString);
    if (T.ExceptionInVPackage().c() == null || !T.ExceptionInVPackage().c().i().equals(str))
      i(); 
    try {
      (new ExceptionInVPackage()).ExceptionInVPackage(paramString, this);
      this.b.VInterfaceHotel().g();
      g();
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
      throw new VInterfaceHotel("Unable to load tune file:\n" + paramString + "\nReported Error:\n" + ExceptionInVPackage.getMessage());
    } 
  }
  
  public void j(String paramString) {
    try {
      (new ExceptionInVPackage()).b(paramString, this);
      this.b.VInterfaceHotel().g();
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new VInterfaceHotel("Failed to save tune file:\n" + paramString + "\nReported Error:\n" + iOException.getMessage());
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