package aP;

import bA.c;
import s.f;
import s.g;

class gV extends c implements f {
  String a = null;
  
  public gV(dB paramdB, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    super(g.b(paramString), paramBoolean1, paramBoolean2);
    this.a = paramString;
    addMouseListener(new gU(paramdB, this));
  }
  
  public void a(String paramString) {
    setText(paramString);
    g.b(this.a, paramString);
  }
  
  public String a() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */