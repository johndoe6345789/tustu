package W;

import V.ExceptionInVPackage;
import java.io.File;

class ThreadExtensionInWPackage extends Thread {
  File ExceptionInVPackage;
  
  int b;
  
  ThreadExtensionInWPackage(aB paramaB, File paramFile, int paramInt) {
    super("LoadTriggerLog");
    setDaemon(true);
    this.ExceptionInVPackage = paramFile;
    this.b = paramInt;
    setPriority(1);
  }
  
  public void run() {
    try {
      this.c.ExceptionInVPackage(this.ExceptionInVPackage, this.b);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      aB.ExceptionInVPackage(this.c, ExceptionInVPackage);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/aE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */