package aP;

import s.f;
import s.g;
import x.a;

class gN extends a implements f {
  String c = null;
  
  public gN(dB paramdB, String paramString, boolean paramBoolean) {
    super(paramString, paramBoolean);
    this.c = paramString;
    setText(g.b(paramString));
    addMouseListener(new gU(paramdB, this));
  }
  
  public boolean b() {
    return false;
  }
  
  public void a(String paramString) {
    setText(paramString);
    g.b(this.c, paramString);
  }
  
  public String a() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */