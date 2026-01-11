package G;

import V.ExceptionPrintstacktrace;
import bH.D;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GInterfaceCt implements aG, co {
  R a;
  
  List b = null;
  
  cT(R paramR) {
    this.a = paramR;
    if (paramR.C() != null)
      paramR.C().a(this); 
  }
  
  public boolean a(String paramString, bT parambT) {
    cu.a().a(this.a);
    return true;
  }
  
  public void a(String paramString) {
    this.b = null;
    this.a.O().b((List)null);
  }
  
  public void a(List<w> paramList) {
    double[][] arrayOfDouble;
    if (paramList != null) {
      this.b = new ArrayList();
      this.b.addAll(paramList);
    } else {
      this.b = null;
    } 
    aM aM = this.a.c(this.a.O().aa());
    try {
      arrayOfDouble = aM.i(this.a.h());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(cT.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      arrayOfDouble = new double[aM.b()][1];
    } 
    byte b = 0;
    boolean bool = false;
    if (paramList != null && this.a.O().X()) {
      for (byte b1 = 0; b1 < arrayOfDouble.length + b; b1++) {
        if (b1 < paramList.size()) {
          char c;
          w w = paramList.get(b1);
          int i = w.a();
          switch (w.c()) {
            case 0:
              c = Character.MIN_VALUE;
              break;
            case 1:
              c = ' ';
              break;
            case 2:
              c = '䀀';
              break;
            case 4:
              c = '怀';
              break;
            case 8:
              c = '耀';
              break;
            case 16:
              c = 'ꀀ';
              break;
            case 32:
              c = '쀀';
              break;
            case 64:
              c = '';
              break;
            default:
              c = Character.MIN_VALUE;
              b++;
              D.b("Unsupported data size " + w.c() + " for ScatteredRuntime for offset: " + i);
              break;
          } 
          if (this.a.c(aM.aL()).e() > 1) {
            arrayOfDouble[b1 - b][0] = (c + i);
          } else {
            i += this.a.O().af() & 0xFF;
            arrayOfDouble[b1 - b][0] = i;
          } 
        } else {
          if (this.a.c(aM.aL()).e() == 1) {
            arrayOfDouble[b1 - b][0] = 255.0D;
            break;
          } 
          arrayOfDouble[b1 - b][0] = 0.0D;
        } 
      } 
      if (paramList.size() > arrayOfDouble.length) {
        D.b("Too many OutputChannels registered (" + paramList.size() + ") for size of: " + aM.aL() + "(" + arrayOfDouble.length + ")");
        this.a.O().j(true);
      } else {
        this.a.O().j(false);
      } 
      try {
        this.a.a(aM.aL(), arrayOfDouble);
        this.a.H();
        this.a.O().b(this.b);
        aB.a().a(this.a.c(), "Updated Quick Runtime Table");
      } catch (Exception exception) {
        Logger.getLogger(cT.class.getName()).log(Level.SEVERE, (String)null, exception);
        D.a("Failed to set Scatter Runtime Read values, disabling.");
        this.a.O().e(new cU(this));
        this.a.O().b((List)null);
      } 
    } else {
      this.a.O().b((List)null);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */