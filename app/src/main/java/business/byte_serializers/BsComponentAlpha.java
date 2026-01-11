package business.byte_serializers;

import V.ExceptionPrintstacktrace;
import bE.BeInterfaceAlpha;
import bM.BmInterfaceDelta;
import bM.BmInterfaceEcho;
import java.util.logging.Level;
import java.util.logging.Logger;

class BsComponentAlpha extends BeInterfaceAlpha implements BmInterfaceEcho {
  int BeInterfaceAlpha = 400;
  
  BsComponentAlpha(k paramk) {}
  
  public void BeInterfaceAlpha(BmInterfaceDelta paramd) {
    int i = this.b.b.BeInterfaceAlpha(paramd.BmInterfaceEcho());
    if (i < this.BeInterfaceAlpha) {
      float f = (paramd.BmInterfaceDelta() / paramd.c() - 1.0F) * 100.0F;
      if (!paramd.h() && this.b.BmInterfaceEcho.BmInterfaceEcho() < 20000) {
        float f1 = 0.0F;
        try {
          f1 = 100.0F - (float)(this.b.b.b(paramd.BmInterfaceEcho()) / this.b.b.BeInterfaceAlpha(paramd.BmInterfaceEcho())) * 100.0F;
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        } 
        BeInterfaceAlpha(paramd.BmInterfaceEcho(), f, f1);
        this.b.f.BeInterfaceAlpha();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */