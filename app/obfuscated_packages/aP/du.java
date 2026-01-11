package aP;

import bH.D;

class du extends Thread {
  du(dl paramdl) {}
  
  public void run() {
    try {
      Thread.sleep(120000L);
      D.c("Application close timeout. Initiating forced close request.");
      D.g();
      D.c("Application close timeout. All threads stacks printed. Exiting.");
      Runtime.getRuntime().halt(3);
    } catch (InterruptedException interruptedException) {}
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/du.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */