package ak;

import java.util.ArrayList;
import java.util.List;

class AkComponentAc extends ak {
  protected int a;
  
  protected int b;
  
  protected int c;
  
  protected int d;
  
  protected String e;
  
  protected String f;
  
  protected String g;
  
  protected String h;
  
  protected String i;
  
  protected String j;
  
  protected String k = "";
  
  protected am l;
  
  protected al m;
  
  protected List n;
  
  public AkComponentAc(aa paramaa, int paramInt) {
    super(paramaa, paramInt);
    if (this.a != 0 && this.d > 0) {
      this.n = new ArrayList(this.d);
      int i = this.a;
      for (byte b = 0; b < this.d; b++) {
        int j = 0;
        ad ad = new ad(this, i);
        for (ae ae : ad.e)
          j += ae.g; 
        if (j > 0)
          this.n.add(ad); 
        i = ad.a;
      } 
    } 
    if (this.b != 0)
      this.l = new am(paramaa, this.b); 
    if (this.c != 0)
      this.m = new al(paramaa, this.c); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */