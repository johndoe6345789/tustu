package aP;

import bA.f;

class gK implements Runnable {
  private f b = null;
  
  private boolean c = true;
  
  private gK(dB paramdB) {}
  
  public void run() {
    this.b.setEnabled(this.c);
    this.a.k.add(this);
  }
  
  public void a(f paramf) {
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