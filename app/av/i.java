package av;

import G.R;
import G.Y;
import G.aM;
import G.aR;
import V.a;
import V.g;
import ao.hY;
import bH.X;
import java.util.logging.Level;
import java.util.logging.Logger;

public class i extends hY {
  private aM c = null;
  
  private aM d = null;
  
  private aM e = null;
  
  Y a = null;
  
  j b = new j(this);
  
  public i(R paramR, aM paramaM1, aM paramaM2, aM paramaM3) {
    this.a = paramR.h();
    String str = paramR.c();
    this.c = paramaM1;
    this.d = paramaM2;
    this.e = paramaM3;
    a(paramaM3.a(), paramaM3.m());
    a(paramaM3.v());
    try {
      k();
    } catch (g g) {
      Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      throw new a("Error loading table parameter values.\n" + g.getMessage());
    } 
    this.b.a();
    addTableModelListener(this.b);
    aR.a().a(str, paramaM1.aL(), this.b);
    aR.a().a(str, paramaM2.aL(), this.b);
    aR.a().a(str, paramaM3.aL(), this.b);
  }
  
  protected void k() {
    double[][] arrayOfDouble = n().i(this.a);
    a(arrayOfDouble);
    d(a(m().i(this.a), m().v()));
    c(a(l().i(this.a), l().v()));
    q();
  }
  
  private String[] a(double[][] paramArrayOfdouble, int paramInt) {
    String[] arrayOfString = new String[paramArrayOfdouble.length];
    for (byte b = 0; b < paramArrayOfdouble.length; b++)
      arrayOfString[b] = "" + X.b(paramArrayOfdouble[b][0], paramInt); 
    return arrayOfString;
  }
  
  public aM l() {
    return this.c;
  }
  
  public aM m() {
    return this.d;
  }
  
  public aM n() {
    return this.e;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/av/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */