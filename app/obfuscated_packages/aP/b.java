package aP;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

final class b extends WindowAdapter {
  public void windowDeactivated(WindowEvent paramWindowEvent) {
    if (!paramWindowEvent.getWindow().isShowing())
      a(paramWindowEvent); 
  }
  
  public void windowClosed(WindowEvent paramWindowEvent) {
    a(paramWindowEvent);
  }
  
  private void a(WindowEvent paramWindowEvent) {
    paramWindowEvent.getWindow().removeWindowListener(this);
    a.a = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */