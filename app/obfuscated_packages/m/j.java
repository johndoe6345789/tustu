package m;

import al.d;
import am.c;
import am.d;
import am.e;
import java.util.ArrayList;
import java.util.List;

class j {
  e a;
  
  c b;
  
  List c;
  
  List d = new ArrayList();
  
  d e = null;
  
  j(d paramd, e parame) {
    this.a = parame;
    this.b = parame.f();
    this.c = d.a(this.b);
    for (d d1 : this.c) {
      String str = d1.o().e();
      if (str.equalsIgnoreCase("time"))
        this.e = d1; 
      this.d.add(str);
    } 
  }
  
  private int c() {
    return this.d.size();
  }
  
  public double a() {
    return (this.e != null && this.e.m() > 0.0D) ? ((this.e.l() < 0.5D && this.e.l() >= 0.0D) ? (this.b.e() / this.e.m()) : (this.b.e() / (this.e.m() - this.e.l()))) : Double.NaN;
  }
  
  public long b() {
    return this.b.e();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/m/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */