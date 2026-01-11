package al;

import am.c;
import am.d;
import am.e;
import bH.D;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List;

public class b implements c {
  private e f;
  
  private c g;
  
  private String h = "";
  
  f a;
  
  List b = new ArrayList();
  
  a c = null;
  
  byte[] d = null;
  
  boolean e = false;
  
  private boolean i = false;
  
  private int j = 0;
  
  public b(SeekableByteChannel paramSeekableByteChannel, e parame) {
    this.f = parame;
    this.g = parame.f();
    this.a = new f(paramSeekableByteChannel, parame, this.g);
    List list = d.a(this.g);
    for (d d : list) {
      if (b(d.e())) {
        a a1 = new a(d);
        if (a1.e().equalsIgnoreCase("time"))
          this.c = a1; 
        this.b.add(a1);
      } 
    } 
    this.d = this.a.a();
  }
  
  public double a() {
    return (this.c != null && this.c.a().m() > 0.0D) ? ((this.c.a().l() < 0.5D && this.c.a().l() >= 0.0D) ? (this.g.e() / this.c.a().m()) : (this.g.e() / (this.c.a().m() - this.c.a().l()))) : Double.NaN;
  }
  
  public long b() {
    return this.g.e();
  }
  
  public float[] a(double paramDouble, int paramInt, float[] paramArrayOffloat) {
    if (this.j == 0 && this.h.equals("Data Group 132"))
      D.c(this.h); 
    if (!this.i && this.d != null && (paramDouble == 0.0D || this.c == null || this.c.a(this.d) <= paramDouble || !this.e)) {
      for (byte b1 = 0; b1 < this.b.size(); b1++)
        paramArrayOffloat[b1 + paramInt] = (float)((a)this.b.get(b1)).a(this.d); 
      this.j++;
      this.e = true;
      this.d = this.a.a();
    } 
    return paramArrayOffloat;
  }
  
  public boolean c() {
    return (this.c != null);
  }
  
  public double d() {
    return (this.c != null && this.d != null) ? this.c.a(this.d) : Double.NaN;
  }
  
  public List e() {
    return this.b;
  }
  
  public int f() {
    return this.b.size();
  }
  
  public void a(boolean paramBoolean) {
    if (!paramBoolean) {
      for (byte b1 = 0; b1 < this.b.size(); b1++) {
        if (((a)this.b.get(b1)).e().equalsIgnoreCase("time")) {
          this.b.remove(b1);
          break;
        } 
      } 
    } else if (this.c != null && !this.b.contains(this.c)) {
      this.b.add(0, this.c);
    } 
  }
  
  public c g() {
    return this.g;
  }
  
  public void b(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public String h() {
    return this.h;
  }
  
  public void a(String paramString) {
    this.h = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/al/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */