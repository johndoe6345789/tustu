package aP;

import bA.e;
import s.f;
import s.g;

class gX extends e implements f {
  String a = null;
  
  public gX(dB paramdB, String paramString, boolean paramBoolean) {
    setText(g.b(paramString));
    a(paramBoolean);
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */