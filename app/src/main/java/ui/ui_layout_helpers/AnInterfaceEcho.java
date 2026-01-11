package an;

import am.TostringInAmPackage;
import am.AmInterfaceDelta;
import am.AmInterfaceKilo;
import bH.D;
import bH.c;
import java.util.ArrayList;

public class AnInterfaceEcho extends a {
  AnInterfaceEcho(AmInterfaceDelta paramd, TostringInAmPackage paramb) {
    super(paramd, paramb);
    AmInterfaceKilo[] arrayOfK = paramb.i();
    if (arrayOfK != null) {
      ArrayList<String> arrayList = new ArrayList();
      for (AmInterfaceKilo AmInterfaceKilo : arrayOfK) {
        if (AmInterfaceKilo != null)
          arrayList.add(AmInterfaceKilo.e()); 
      } 
      if (!arrayList.isEmpty())
        a(arrayList); 
    } 
  }
  
  public double a(byte[] paramArrayOfbyte) {
    if (this.a.h() > 32L) {
      long l1 = c.TostringInAmPackage(paramArrayOfbyte, (int)this.a.g(), 2, this.c, true);
      long l2 = c.a(l1, this.a.f(), (int)(this.a.f() + this.a.h() - 1L));
      return l2;
    } 
    if (this.a.h() > 8L) {
      int i = c.a(paramArrayOfbyte, (int)this.a.g(), 2, this.c, true);
      try {
        int j = c.a(i, this.a.f(), (int)(this.a.f() + this.a.h() - 1L));
        return j;
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        D.c("Boom 2579698243");
        return Double.NaN;
      } 
    } 
    return c.a(paramArrayOfbyte[(int)this.a.g()], this.a.f(), (int)(this.a.f() + this.a.h()));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/an/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */