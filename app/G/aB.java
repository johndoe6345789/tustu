package G;

import java.util.ArrayList;

public class aB {
  private static aB a = null;
  
  private ArrayList b = new ArrayList();
  
  private ArrayList c = new ArrayList();
  
  private ArrayList d = new ArrayList();
  
  public static aB a() {
    if (a == null)
      a = new aB(); 
    return a;
  }
  
  public void a(bN parambN) {
    this.b.add(parambN);
  }
  
  public void a(do paramdo) {
    this.d.add(paramdo);
  }
  
  public void a(aT paramaT) {
    this.c.add(paramaT);
  }
  
  public void b() {
    for (do do : this.d)
      do.c(); 
  }
  
  public void a(String paramString, double paramDouble) {
    for (do do : this.d)
      do.a(paramString, paramDouble); 
  }
  
  public void c() {
    for (do do : this.d)
      do.d(); 
  }
  
  public void d() {
    for (do do : this.d)
      do.a(); 
  }
  
  public void e() {
    for (do do : this.d)
      do.b(); 
  }
  
  public void a(String paramString) {
    a(T.a().c().c(), paramString);
  }
  
  protected void a(String paramString1, String paramString2) {
    for (bN bN : this.b)
      bN.b(paramString1, paramString2); 
  }
  
  public void b(String paramString1, String paramString2) {
    for (aT aT : this.c)
      aT.a(paramString1, paramString2); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */