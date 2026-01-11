package K;

import G.R;
import G.cx;
import G.dj;

public class KInterfaceFoxtrot {
  private cx a;
  
  private R b;
  
  private int c;
  
  private dj d;
  
  private g e = null;
  
  public KInterfaceFoxtrot(R paramR, int paramInt, dj paramdj) {
    this.b = paramR;
    this.c = paramInt;
    this.d = paramdj;
    this.a = new cx(paramR);
  }
  
  public void a() {
    if (this.e == null || !this.e.isAlive()) {
      this.e = new g(this);
      this.e.start();
    } 
  }
  
  private void b() {
    if (this.b.W() && this.e != null) {
      this.e.a();
    } else if (this.b.R() && !this.b.C().w() && !this.b.C().N() && this.b.C().M() < System.currentTimeMillis()) {
      this.a.a(this.c);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */