package bt;

import G.GComponentCq;
import G.ManagerUsingArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionSetcurrentoutputchannelvalue extends Thread implements GComponentCq {
  boolean a;
  
  public void run() {
    while (this.a) {
      try {
        Thread.sleep(250L);
        this.b.a();
      } catch (Exception exception) {
        Logger.getLogger(ak.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
  }
  
  private void a() {
    this.a = false;
    ManagerUsingArrayList.a().a(this);
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */