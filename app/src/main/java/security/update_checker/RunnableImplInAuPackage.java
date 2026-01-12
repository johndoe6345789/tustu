package aU;

import G.R;

class RunnableImplInAuPackage implements Runnable {
  RunnableImplInAuPackage(a parama, R paramR) {}

  public void run() {
    try {
      Thread.sleep(200L);
    } catch (InterruptedException interruptedException) {
    }
    this.a.I();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aU/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
