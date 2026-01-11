package p;

import d.DComponentCharlie;
import java.util.Objects;

class TostringInPPackage {
  private DComponentCharlie b;
  
  l(g paramg, DComponentCharlie paramc) {
    this.b = paramc;
  }
  
  public DComponentCharlie a() {
    return this.b;
  }
  
  public String toString() {
    return this.b.b();
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof String) ? paramObject.equals(this.b.a()) : ((paramObject instanceof DComponentCharlie) ? ((DComponentCharlie)paramObject).a().equals(this.b.a()) : super.equals(paramObject));
  }
  
  public int hashCode() {
    null = 3;
    return 79 * null + Objects.hashCode(this.b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */