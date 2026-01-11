package G;

import bH.D;
import bH.c;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

class CommDebugLogWriter extends Thread {
  ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
  
  boolean b = true;
  
  int c = 0;
  
  CommDebugLogWriter(J paramJ) {
    setName("CommDebugLogWriter");
    setDaemon(true);
    setPriority(1);
  }
  
  public synchronized void run() {
    while (true) {
      for (O o : this.a) {
        this.a.remove(o);
        if (o.a() != null) {
          a(o.b(), o.c(), o.a());
          continue;
        } 
        if (O.a(o) != null) {
          a(o.b(), o.c(), o.a());
          continue;
        } 
        a(o.b(), o.c());
      } 
      this.c++;
      notify();
      try {
        wait(500L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public synchronized void a(O paramO) {
    this.a.add(paramO);
    notify();
  }
  
  void a(String paramString1, String paramString2) {
    if (J.I()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Time: ").append(paramString2).append(": ").append(paramString1);
      System.out.println(stringBuilder);
    } 
  }
  
  void a(String paramString1, String paramString2, byte[] paramArrayOfbyte) {
    if (this.d.D > 0 || J.I()) {
      StringBuilder stringBuilder = new StringBuilder();
      if (paramArrayOfbyte != null) {
        stringBuilder.append("Time: ").append(paramString2).append(": ").append(paramString1).append(", ").append(paramArrayOfbyte.length).append(" bytes");
      } else {
        stringBuilder.append("Time: ").append(paramString2).append(": ").append(paramString1);
      } 
      if (paramArrayOfbyte != null && this.b) {
        stringBuilder.append("\n").append(c.a(paramArrayOfbyte, 16)).append("\n");
      } else if (paramArrayOfbyte == null) {
        stringBuilder.append("\n").append("No bytes!\n");
      } 
      if (J.I()) {
        D.e(stringBuilder.toString());
      } else {
        this.d.m(stringBuilder.toString());
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */