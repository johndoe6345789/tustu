package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bh extends bv implements Serializable, Cloneable {
  private ArrayList a = new ArrayList();
  
  private ArrayList f = new ArrayList();
  
  private ArrayList g = new ArrayList();
  
  private ArrayList h = new ArrayList();
  
  private ArrayList i = new ArrayList();
  
  private String j = null;
  
  private ArrayList k = new ArrayList();
  
  private boolean l = true;
  
  private boolean m = false;
  
  public int a() {
    return this.a.size();
  }
  
  public String a(int paramInt) {
    return (paramInt >= this.f.size()) ? "1" : this.f.get(paramInt);
  }
  
  public String b(int paramInt) {
    return this.a.get(paramInt);
  }
  
  public void a(String paramString1, String paramString2) {
    this.a.add(paramString1);
    this.f.add(paramString2);
  }
  
  public db c(int paramInt) {
    return (this.h.size() > paramInt) ? this.h.get(paramInt) : null;
  }
  
  public void a(db paramdb) {
    this.h.add(paramdb);
  }
  
  public int b() {
    return this.i.size();
  }
  
  public String d(int paramInt) {
    return this.i.get(paramInt);
  }
  
  public void a(String paramString) {
    this.i.add(paramString);
  }
  
  public void b(db paramdb) {
    this.g.add(paramdb);
  }
  
  public db e(int paramInt) {
    return this.g.get(paramInt);
  }
  
  public int c() {
    return this.g.size();
  }
  
  public String d() {
    return this.j;
  }
  
  public void b(String paramString) {
    this.j = paramString;
  }
  
  public int f() {
    return this.k.size();
  }
  
  public db f(int paramInt) {
    return (this.k.size() > paramInt) ? this.k.get(paramInt) : null;
  }
  
  public void c(db paramdb) {
    this.k.add(paramdb);
  }
  
  public bh g() {
    bh bh1 = new bh();
    bh1.a = this.a;
    bh1.h = this.h;
    bh1.i = this.i;
    bh1.j = this.j;
    bh1.k = this.k;
    bh1.g = this.g;
    bh1.v(aL());
    return bh1;
  }
  
  public List e() {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<String> iterator = this.a.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    iterator = this.i.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList;
  }
  
  public String i(String paramString) {
    return (this.a.contains(paramString) || this.i.contains(paramString)) ? aJ() : null;
  }
  
  public void a(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public boolean h() {
    return (this.m || this.i.isEmpty());
  }
  
  public boolean i() {
    return this.l;
  }
  
  public void b(boolean paramBoolean) {
    this.l = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */