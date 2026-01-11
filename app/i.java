import V.a;
import aE.a;
import aP.f;
import h.i;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;

class i extends Thread {
  i(h paramh) {}
  
  public void run() {
    setName(getName() + " - TS Shutdown Hook");
    if (!a.a().q()) {
      if (a.A() != null)
        try {
          a.A().b();
        } catch (a a) {
          Logger.getLogger(TunerStudio.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        }  
      f.a().g();
    } 
    try {
      a.a().e();
      i.g();
    } catch (a a) {
      Logger.getLogger(TunerStudio.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    Runtime.getRuntime().halt(0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */