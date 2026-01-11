package G;

class BurnPageCallback implements n {
  K(J paramJ) {}
  
  public void a(double paramDouble) {}
  
  public void a(o paramo) {
    synchronized (this.a.p) {
      if (paramo.a() == 1) {
        if (!this.a.x()) {
          this.a.L = -2;
          aB.a().a(paramo.f(), "Burned All Data");
          this.a.a(paramo.f(), true);
        } else {
          aB.a().a(paramo.f(), "Burned Page " + paramo.b().o());
        } 
      } else if (paramo.a() != 2) {
        aB.a().b(paramo.f(), "Burn Page " + paramo.b().o() + " failed.");
      } 
    } 
  }
  
  public void e() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */