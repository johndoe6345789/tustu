package W;

import V.a;
import java.io.File;

class aE extends Thread {
  File a;
  
  int b;
  
  aE(aB paramaB, File paramFile, int paramInt) {
    super("LoadTriggerLog");
    setDaemon(true);
    this.a = paramFile;
    this.b = paramInt;
    setPriority(1);
  }
  
  public void run() {
    try {
      this.c.a(this.a, this.b);
    } catch (a a) {
      aB.a(this.c, a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/aE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */