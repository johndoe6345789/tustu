package aP;

import s.f;
import s.g;
import x.a;

public class gW extends a implements f {
  String c = null;
  
  public gW(dB paramdB, String paramString, boolean paramBoolean) {
    this.c = paramString;
    setText(g.b(paramString));
    a(paramBoolean);
    addMouseListener(new gU(paramdB, this));
  }
  
  public gW(dB paramdB, String paramString) {
    this(paramdB, paramString, true);
  }
  
  public void a(String paramString) {
    setText(paramString);
    g.b(this.c, paramString);
  }
  
  public String a() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */