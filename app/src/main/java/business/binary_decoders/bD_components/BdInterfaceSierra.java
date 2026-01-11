package business.binary_decoders.bD_components;

import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BdInterfaceSierra implements ActionListener {
  BdInterfaceSierra(r paramr, RemoteFileAccess paramRemoteFileAccess) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.b.i = true;
    this.a.cancelReadFile();
    this.b.g.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */