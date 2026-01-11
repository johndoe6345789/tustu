package aY;

import G.GInterfaceAf;
import bH.X;
import s.SComponentGolf;

class AyInterfaceIndia implements GInterfaceAf {
  AyInterfaceIndia(f paramf) {}
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null) {
      this.a.SComponentGolf.setText(SComponentGolf.b("Polling device") + "...");
    } else if (this.a.m.f() > 0.0D) {
      this.a.c.setText(X.b(this.a.m.f(), 3) + " sec.");
      this.a.d.setText(this.a.m.e() + "");
      this.a.e.setText(X.b(this.a.m.o(), 1) + "/s");
      this.a.SComponentGolf.setText(SComponentGolf.b("Logging") + "...");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */