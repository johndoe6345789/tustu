package L;

import G.GInterfaceAi;
import G.R;
import G.SerializableImpl;
import G.T;
import ax.AbstractInAxPackage;
import ax.AxInterfaceAb;
import ax.CloneableImplInAxPackage;
import ax.ExceptionInAxPackage;
import java.util.Iterator;

public class ChannelMinByOffset extends AbstractInAxPackage {
  GInterfaceAi a;

  AxInterfaceAb b;

  int c = -1;

  AxInterfaceAb d = null;

  int e = -1;

  SerializableImpl f = null;

  double g = Double.NaN;

  public ChannelMinByOffset(AxInterfaceAb paramab1, AxInterfaceAb paramab2) {
    this.d = paramab1;
    this.b = paramab2;
  }

  public ChannelMinByOffset(GInterfaceAi paramaI, AxInterfaceAb paramab) {
    this.a = paramaI;
    this.b = paramab;
  }

  public double a(CloneableImplInAxPackage paramS) {
    double d = (this.d != null) ? this.d.b(paramS) : -1.0D;
    if (this.d != null && this.e != d) {
      String[] arrayOfString = T.a().d();
      for (String str : arrayOfString) {
        R r = T.a().c(str);
        if (r.O().x() == d) {
          this.a = (GInterfaceAi) r;
          this.e = (int) d;
          break;
        }
      }
      this.c = -1;
    }
    if (this.a == null) return Double.NaN;
    int i = (int) this.b.b(paramS);
    if (this.c == -1 || i != this.c || this.f == null) {
      Iterator<SerializableImpl> iterator = this.a.K().q();
      while (iterator.hasNext()) {
        SerializableImpl aH1 = iterator.next();
        if (aH1.b().equals("scalar") && aH1.a() == i) {
          this.f = aH1;
          this.c = i;
          break;
        }
      }
      if (this.f == null && i >= 0)
        throw new ExceptionInAxPackage("No OutputChannel found for offset: " + i);
    }
    return (this.f != null) ? this.f.n() : 0.0D;
  }

  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }

  public String toString() {
    return "getChannelMinByOffset( " + this.b.toString() + " )";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
