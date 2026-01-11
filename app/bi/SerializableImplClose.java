package bi;

import G.R;
import G.T;
import G.GInterfaceDg;
import aG.AgInterfaceBravo;
import aP.NetworkHashMap;
import bH.D;
import bH.X;
import bt.d;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dO;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Window;
import java.io.File;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SerializableImplClose extends d implements bc, Serializable {
  String a;
  
  dO AgInterfaceBravo = new dO();
  
  JButton c = new JButton("Open Replay Log");
  
  JButton d = new JButton("Cancel");
  
  JLabel e = new JLabel("", 4);
  
  private final String i = "Standard Speed";
  
  private final String j = "High Speed";
  
  File NetworkHashMap = null;
  
  AgInterfaceBravo g = null;
  
  GInterfaceDg h = new d(this);
  
  public SerializableImplClose(R paramR) {
    this.a = paramR.c();
    paramR.O().a(this.h);
    if (paramR.O().W()) {
      this.e.setText("High Speed");
    } else {
      this.e.setText("Standard Speed");
    } 
    this.e.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    setLayout(new BorderLayout());
    add("North", this.e);
    add("Center", (Component)this.AgInterfaceBravo);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    this.c.addActionListener(new AgInterfaceBravo(this));
    this.c.setEnabled(false);
    jPanel.add(this.c);
    this.d.addActionListener(new c(this));
    jPanel.add(this.d);
    add("South", jPanel);
    NetworkHashMap NetworkHashMap = new NetworkHashMap(this);
    NetworkHashMap.start();
  }
  
  private void a() {
    if (this.NetworkHashMap != null && this.NetworkHashMap.exists()) {
      NetworkHashMap.a().a(this.NetworkHashMap);
      AgInterfaceBravo();
    } else {
      bV.d("Replay file not found.", (Component)this);
    } 
  }
  
  private void AgInterfaceBravo() {
    if (this.g != null)
      this.g.a(); 
    R r = T.a().c(this.a);
    r.O().AgInterfaceBravo(this.h);
    Window window = bV.AgInterfaceBravo((Component)this);
    window.dispose();
  }
  
  private void c() {
    aE.a a1 = aE.a.A();
    this.NetworkHashMap = new File(a1.L().getAbsolutePath(), "BigLog_Replay_" + X.a() + ".csv");
    R r = T.a().c(this.a);
    this.g = new AgInterfaceBravo(r);
    try {
      int i = this.g.a(this.NetworkHashMap, new e(this));
    } catch (RemoteAccessException remoteAccessException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)remoteAccessException);
      D.a("Failed to upload replay data", (Exception)remoteAccessException, this);
    } 
  }
  
  public void close() {
    R r = T.a().c(this.a);
    if (r != null)
      r.O().AgInterfaceBravo(this.h); 
  }
  
  public JDialog a(Frame paramFrame, String paramString) {
    JDialog jDialog = new JDialog(paramFrame, paramString, true);
    jDialog.add("Center", (Component)this);
    jDialog.pack();
    bV.a(paramFrame, jDialog);
    jDialog.setVisible(true);
    return jDialog;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bi/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */