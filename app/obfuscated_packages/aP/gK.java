package aP;

import bA.BaInterfaceFoxtrot;

class gK implements Runnable {
  private BaInterfaceFoxtrot b = null;
  
  private boolean c = true;
  
  private gK(dB paramdB) {}
  
  public void run() {
    this.b.setEnabled(this.c);
    this.a.k.add(this);
  }
  
  public void a(BaInterfaceFoxtrot paramf) {
    this.b = paramf;
  }
  
  public void a(boolean paramBoolean) {
    this.c = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */