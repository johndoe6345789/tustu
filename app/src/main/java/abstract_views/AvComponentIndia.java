package av;

import G.R;
import G.Y;
import G.Manager;
import G.ManagerUsingConcurrentHashMap;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import ao.hY;
import bH.X;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AvComponentIndia extends hY {
  private Manager c = null;
  
  private Manager d = null;
  
  private Manager e = null;
  
  Y ExceptionInVPackage = null;
  
  j b = new j(this);
  
  public AvComponentIndia(R paramR, Manager paramaM1, Manager paramaM2, Manager paramaM3) {
    this.ExceptionInVPackage = paramR.h();
    String str = paramR.c();
    this.c = paramaM1;
    this.d = paramaM2;
    this.e = paramaM3;
    ExceptionInVPackage(paramaM3.ExceptionInVPackage(), paramaM3.m());
    ExceptionInVPackage(paramaM3.v());
    try {
      k();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      throw new ExceptionInVPackage("Error loading table parameter values.\n" + ExceptionPrintstacktrace.getMessage());
    } 
    this.b.ExceptionInVPackage();
    addTableModelListener(this.b);
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(str, paramaM1.aL(), this.b);
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(str, paramaM2.aL(), this.b);
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(str, paramaM3.aL(), this.b);
  }
  
  protected void k() {
    double[][] arrayOfDouble = n().i(this.ExceptionInVPackage);
    ExceptionInVPackage(arrayOfDouble);
    d(ExceptionInVPackage(m().i(this.ExceptionInVPackage), m().v()));
    c(ExceptionInVPackage(l().i(this.ExceptionInVPackage), l().v()));
    q();
  }
  
  private String[] ExceptionInVPackage(double[][] paramArrayOfdouble, int paramInt) {
    String[] arrayOfString = new String[paramArrayOfdouble.length];
    for (byte b = 0; b < paramArrayOfdouble.length; b++)
      arrayOfString[b] = "" + X.b(paramArrayOfdouble[b][0], paramInt); 
    return arrayOfString;
  }
  
  public Manager l() {
    return this.c;
  }
  
  public Manager m() {
    return this.d;
  }
  
  public Manager n() {
    return this.e;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */