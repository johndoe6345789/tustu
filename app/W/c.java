package W;

import java.util.ArrayList;
import java.util.Iterator;

public class c {
  private int b = 0;
  
  private int c = 0;
  
  private int d = 0;
  
  private a e = null;
  
  ArrayList a = new ArrayList();
  
  public void a(a parama) {
    this.a.add(parama);
  }
  
  public a a(int paramInt) {
    return this.a.get(paramInt);
  }
  
  public int a() {
    return this.a.size();
  }
  
  public int b() {
    return this.b;
  }
  
  public void b(int paramInt) {
    this.b = paramInt;
  }
  
  public int c() {
    return this.d + this.c;
  }
  
  public Iterator d() {
    return this.a.iterator();
  }
  
  public int e() {
    return this.c;
  }
  
  public void c(int paramInt) {
    this.c = paramInt;
  }
  
  public int f() {
    return this.d;
  }
  
  public void d(int paramInt) {
    this.d = paramInt;
  }
  
  public a g() {
    return this.e;
  }
  
  public void b(a parama) {
    this.e = parama;
  }
  
  public void a(String paramString) {
    Iterator<a> iterator = this.a.iterator();
    while (iterator.hasNext()) {
      if (((a)iterator.next()).a().equals(paramString))
        iterator.remove(); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */