package com.efiAnalytics.ui;

class cX extends Thread {
  cX(cT paramcT) {
    setDaemon(true);
  }
  
  public void run() {
    while (cS.b(this.a.c) > 0) {
      this.a.b.setText(cT.a(this.a));
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {}
      cS.c(this.a.c);
    } 
    this.a.b.setText(cT.a(this.a));
    this.a.b.setEnabled(true);
    if (this.a.a)
      this.a.dispose(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */