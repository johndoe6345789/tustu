package business.byte_serializers.bS_components;

import A.AInterfaceEcho;

class BsInterfaceMike implements AInterfaceEcho {
  r a;
  
  public void m(l paraml, r paramr) {
    this.a = paramr;
    l.a(paraml);
  }
  
  public void a() {
    n n = null;
    l.b(this.b);
    for (n n1 : this.b.c) {
      if (n1.b().equals(this.a)) {
        n = n1;
        break;
      } 
    } 
    if (n != null) {
      n.a();
      this.b.c.remove(n);
    } 
  }
  
  public void b() {}
  
  public void c() {}
  
  public void d() {}
  
  public void AInterfaceEcho() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */