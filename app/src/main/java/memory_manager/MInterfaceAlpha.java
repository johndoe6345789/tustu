package m;

import ak.AkInterfaceWhiskey;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class MInterfaceAlpha implements AkInterfaceWhiskey {
  final c a = new c(this);
  
  List b = null;
  
  public List a(List paramList) {
    b b = new b(this, paramList);
    try {
      SwingUtilities.invokeAndWait(b);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } catch (InvocationTargetException invocationTargetException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
    } 
    List list = (this.b != null) ? this.b : new ArrayList();
    this.b = null;
    return list;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/m/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */