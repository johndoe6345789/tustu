package bQ;

import G.l;
import bH.D;
import bN.o;
import java.util.logging.Level;
import java.util.logging.Logger;

class b implements Runnable {
  b(a parama) {}
  
  public void run() {
    try {
      this.a.a.m();
    } catch (Exception exception) {
      D.b("Reset Comms failed to stop DAQ");
    } 
    try {
      this.a.a.g();
    } catch (l l) {
      Logger.getLogger(a.class.getName()).log(Level.WARNING, "Error on SYNC during Comms Reset!", (Throwable)l);
    } catch (V.b b2) {
      D.b("Timeout on SYNC during Comms Reset!");
    } catch (o o) {
      Logger.getLogger(a.class.getName()).log(Level.WARNING, "Error on SYNC during Comms Reset!", (Throwable)o);
    } 
    byte b1 = 0;
    boolean bool = false;
    do {
      try {
        this.a.a.l();
        bool = true;
      } catch (Exception exception) {
        D.a("Failed to restart the DAQ, going offline.");
      } 
    } while (!bool && b1++ < 4);
    if (b1 >= 4)
      try {
        D.a("CommHealthMonitor: Failed to restart DAQ after 4 attempts, closing connection.");
        this.a.a.a().g();
      } catch (Exception exception) {} 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */