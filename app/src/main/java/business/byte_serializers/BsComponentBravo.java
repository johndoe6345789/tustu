package business.byte_serializers;

import V.ExceptionPrintstacktrace;
import bE.BeInterfaceAlpha;
import bM.BmInterfaceDelta;
import bM.BmInterfaceEcho;
import java.util.logging.Level;
import java.util.logging.Logger;

class BsComponentBravo extends BeInterfaceAlpha implements BmInterfaceEcho {
  int BeInterfaceAlpha = 400;
  
  BsComponentBravo(k paramk) {}
  
  public void BeInterfaceAlpha(BmInterfaceDelta paramd) {
    int i = this.b.b.BeInterfaceAlpha(paramd.BmInterfaceEcho());
    if (i < this.BeInterfaceAlpha) {
      float f = paramd.BmInterfaceDelta() - paramd.c();
      if (!paramd.h() && this.b.BmInterfaceEcho.BmInterfaceEcho() < 20000) {
        float f1 = 0.0F;
        try {
          f1 = (float)this.b.b.b(paramd.BmInterfaceEcho());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        } 
        BeInterfaceAlpha(paramd.BmInterfaceEcho(), f1, f);
        this.b.i.BeInterfaceAlpha();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */