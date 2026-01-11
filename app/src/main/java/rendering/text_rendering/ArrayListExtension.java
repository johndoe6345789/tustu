package aO;

import V.ExceptionInVPackage;
import java.util.ArrayList;

class ArrayListExtension extends ArrayList {
  int ExceptionInVPackage = 0;
  
  ArrayListExtension(k paramk) {}
  
  public boolean ExceptionInVPackage(W.n paramn) {
    if (paramn == null)
      return false; 
    super.add(paramn);
    while (size() > d())
      remove(0); 
    return true;
  }
  
  public W.n ExceptionInVPackage(int paramInt) {
    if (paramInt >= 0 && paramInt < size()) {
      this.ExceptionInVPackage = paramInt;
      return (W.n)get(paramInt);
    } 
    throw new ExceptionInVPackage("Not ExceptionInVPackage valid data page for the currently loaded log. " + paramInt);
  }
  
  public W.n ExceptionInVPackage() {
    if (this.ExceptionInVPackage < size() - 1) {
      this.ExceptionInVPackage++;
      return (W.n)get(this.ExceptionInVPackage);
    } 
    return null;
  }
  
  public W.n b() {
    if (this.ExceptionInVPackage > 0) {
      this.ExceptionInVPackage--;
      return (W.n)get(this.ExceptionInVPackage);
    } 
    return null;
  }
  
  public void clear() {
    this.ExceptionInVPackage = -1;
    super.clear();
  }
  
  public int c() {
    return this.ExceptionInVPackage;
  }
  
  public int d() {
    return this.b.i();
  }
  
  public W.n e() {
    this.ExceptionInVPackage = size() - 1;
    return (W.n)get(this.ExceptionInVPackage);
  }
  
  public W.n f() {
    this.ExceptionInVPackage = 0;
    return (W.n)get(this.ExceptionInVPackage);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */