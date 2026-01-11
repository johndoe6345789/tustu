package ao;

import W.j;
import W.n;
import bE.l;
import com.efiAnalytics.ui.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class gX extends s {
  private n t = null;
  
  j a = null;
  
  j b = null;
  
  j c = null;
  
  List d = new ArrayList();
  
  HashMap e = new HashMap<>();
  
  gX(go paramgo) {
    b(false);
  }
  
  public void a(String paramString) {
    this.a = c().a(paramString);
    f();
  }
  
  public void b(String paramString) {
    this.b = c().a(paramString);
    f();
  }
  
  public void c(String paramString) {
    this.c = c().a(paramString);
    f();
  }
  
  public n c() {
    return this.t;
  }
  
  public j d() {
    return this.a;
  }
  
  public j e() {
    return this.b;
  }
  
  public void a(n paramn) {
    this.t = paramn;
    this.e.clear();
    f();
  }
  
  private void f() {
    Iterator<l> iterator = this.d.iterator();
    while (iterator.hasNext())
      ((l)iterator.next()).a(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */