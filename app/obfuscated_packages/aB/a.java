package aB;

import A.e;
import A.f;
import A.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a implements f {
  ArrayList a = new ArrayList();
  
  ArrayList b = new ArrayList();
  
  public void a(y paramy) {
    if (!this.b.contains(paramy))
      this.b.add(paramy); 
  }
  
  public void b(y paramy) {
    this.b.remove(paramy);
  }
  
  protected void a(List paramList) {
    for (y y : this.b)
      y.a(paramList); 
  }
  
  public void a(e parame) {
    this.a.add(parame);
  }
  
  public void b(e parame) {
    this.a.remove(parame);
  }
  
  protected void a() {
    Iterator<e> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((e)iterator.next()).a(); 
  }
  
  protected void b() {
    Iterator<e> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((e)iterator.next()).b(); 
  }
  
  protected void c() {
    Iterator<e> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((e)iterator.next()).c(); 
  }
  
  protected void d() {
    Iterator<e> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((e)iterator.next()).d(); 
  }
  
  protected void e() {
    Iterator<e> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((e)iterator.next()).e(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aB/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */