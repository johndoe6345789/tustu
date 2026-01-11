package W;

import bH.D;
import java.io.File;

class EcuDefinitionUpdateThread extends Thread {
  String a;
  
  double b;
  
  File c;
  
  public EcuDefinitionUpdateThread(String paramString, double paramDouble, File paramFile) {
    this.a = paramString;
    this.b = paramDouble;
    this.c = paramFile;
  }
  
  public void run() {
    R r = w.a(this.a, this.b);
    if (r.a()) {
      D.d("Newer ECU Def found for signature: " + this.a + ", iniVersion: " + r.e() + ". downloading it now..");
      r = w.a(this.a, this.c);
      if (r.a()) {
        D.d("downloaded ECU Definition to: " + r.c().getAbsolutePath());
      } else {
        D.d(r.d());
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */