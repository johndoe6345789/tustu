package aX;

import aC.b;
import aC.d;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fJ;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import s.g;

public class h extends JPanel implements fT {
  JList a = new JList();
  
  DefaultListModel b = new DefaultListModel();
  
  JList c = new JList();
  
  DefaultListModel d = new DefaultListModel();
  
  JButton e = new JButton(g.b("Scan for Bluetooth Adapters"));
  
  fJ f = new fJ();
  
  final Object g = new Object();
  
  d h = new l(this);
  
  public h() {
    setLayout(new BorderLayout());
    this.f.setLayout(new BorderLayout());
    this.f.a(g.b("Searching") + "...");
    JScrollPane jScrollPane = new JScrollPane(this.a);
    jScrollPane.setBorder(BorderFactory.createTitledBorder(g.b("Already Paired Adapters")));
    this.a.setModel(this.b);
    this.a.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(eJ.a(240, 60));
    this.f.add(jScrollPane, "North");
    this.a.setEnabled(false);
    jScrollPane = new JScrollPane(this.c);
    jScrollPane.setBorder(BorderFactory.createTitledBorder(g.b("Discovered Unpaired Adapters")));
    this.c.setModel(this.d);
    this.c.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(eJ.a(240, 120));
    this.f.add(jScrollPane, "Center");
    add((Component)this.f, "Center");
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(0));
    jPanel.add(this.e);
    add(jPanel, "South");
    this.e.addActionListener(new i(this));
  }
  
  public void a() {
    if (b.a() && this.e.isEnabled()) {
      j j = new j(this);
      this.e.setEnabled(false);
      this.f.b();
      j.start();
    } else {
      String str = g.b("Bluetooth is not enabled on this computer.");
      bV.d(str, this);
    } 
  }
  
  public void c() {
    if (!this.e.isEnabled())
      try {
        LocalDevice.getLocalDevice().getDiscoveryAgent().cancelInquiry((DiscoveryListener)this.h);
      } catch (BluetoothStateException bluetoothStateException) {
        Logger.getLogger(h.class.getName()).log(Level.SEVERE, (String)null, (Throwable)bluetoothStateException);
      }  
  }
  
  public RemoteDevice d() {
    return (this.c.getSelectedValue() instanceof m) ? ((m)this.c.getSelectedValue()).a() : null;
  }
  
  private void e() {
    this.b.clear();
    this.d.clear();
    b.a(this.h);
    SwingUtilities.invokeLater(new k(this));
  }
  
  public boolean g_() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aX/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */