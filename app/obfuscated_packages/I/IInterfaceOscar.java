package I;

import G.R;
import G.cq;
import G.cu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IInterfaceOscar implements cq {
  public static int a = 255;
  
  public static int b = 65535;
  
  int c = 0;
  
  int d = b;
  
  R e;
  
  String f = null;
  
  public List g = new ArrayList();
  
  public IInterfaceOscar(R paramR) {
    this.e = paramR;
  }
  
  public void a(String paramString, int paramInt) {
    this.f = paramString;
    this.d = paramInt;
    this.c = 0;
    cu.a().a(this.e.c(), paramString, this);
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (this.c <= this.d - 1 && paramDouble < this.c)
      b(); 
    this.c = (int)paramDouble;
  }
  
  public void a() {
    cu.a().a(this);
  }
  
  public void a(n paramn) {
    this.g.add(paramn);
  }
  
  public void b(n paramn) {
    this.g.remove(paramn);
  }
  
  private void b() {
    Iterator<n> iterator = this.g.iterator();
    while (iterator.hasNext())
      ((n)iterator.next()).a(this.e.c()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */