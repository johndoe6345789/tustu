package bx;

import java.util.ArrayList;
import java.util.List;

public AbstractInBxPackagebstract class AbstractInBxPackage implements b {
  private ArrayList a = new ArrayList();
  
  private List b = new ArrayList();
  
  public ArrayList d() {
    ArrayList arrayList = new ArrayList();
    arrayList.addAll(this.a);
    return arrayList;
  }
  
  public boolean a(String paramString) {
    for (byte b1 = 0; b1 < this.a.size(); b1++) {
      if (((j)this.a.get(b1)).a().equals(paramString)) {
        this.a.remove(b1);
        b(paramString);
        e();
        return true;
      } 
    } 
    return false;
  }
  
  public void b(j paramj) {
    for (byte b1 = 0; b1 < this.a.size(); b1++) {
      if (((j)this.a.get(b1)).a().equals(paramj.a())) {
        this.a.set(b1, paramj);
        d(paramj);
        e();
        return;
      } 
    } 
    this.a.add(paramj);
    c(paramj);
    e();
  }
  
  public void e() {
    b(this.a);
  }
  
  protected abstract void b(ArrayList paramArrayList);
  
  public void f() {
    a(this.a);
  }
  
  protected abstract void a(ArrayList paramArrayList);
  
  public void a(l paraml) {
    this.b.add(paraml);
  }
  
  private void c(j paramj) {
    for (l l : this.b)
      l.a(paramj); 
  }
  
  private void d(j paramj) {
    for (l l : this.b)
      l.b(paramj); 
  }
  
  private void b(String paramString) {
    for (l l : this.b)
      l.a(paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bx/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */