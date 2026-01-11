package aO;

import V.a;
import java.util.ArrayList;

class n extends ArrayList {
  int a = 0;
  
  n(k paramk) {}
  
  public boolean a(W.n paramn) {
    if (paramn == null)
      return false; 
    super.add(paramn);
    while (size() > d())
      remove(0); 
    return true;
  }
  
  public W.n a(int paramInt) {
    if (paramInt >= 0 && paramInt < size()) {
      this.a = paramInt;
      return (W.n)get(paramInt);
    } 
    throw new a("Not a valid data page for the currently loaded log. " + paramInt);
  }
  
  public W.n a() {
    if (this.a < size() - 1) {
      this.a++;
      return (W.n)get(this.a);
    } 
    return null;
  }
  
  public W.n b() {
    if (this.a > 0) {
      this.a--;
      return (W.n)get(this.a);
    } 
    return null;
  }
  
  public void clear() {
    this.a = -1;
    super.clear();
  }
  
  public int c() {
    return this.a;
  }
  
  public int d() {
    return this.b.i();
  }
  
  public W.n e() {
    this.a = size() - 1;
    return (W.n)get(this.a);
  }
  
  public W.n f() {
    this.a = 0;
    return (W.n)get(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */