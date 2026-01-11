import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import aP.NetworkHashMap;
import h.IOProperties;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ExceptionInVPackage;

class IOProperties extends Thread {
  IOProperties(h paramh) {}
  
  public void run() {
    setName(getName() + " - TS Shutdown Hook");
    if (!ExceptionInVPackage.ExceptionInVPackage().q()) {
      if (ExceptionInVPackage.A() != null)
        try {
          ExceptionInVPackage.A().b();
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(TunerStudio.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
        }  
      NetworkHashMap.ExceptionInVPackage().g();
    } 
    try {
      ExceptionInVPackage.ExceptionInVPackage().e();
      IOProperties.g();
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(TunerStudio.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
    Runtime.getRuntime().halt(0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/IOProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */