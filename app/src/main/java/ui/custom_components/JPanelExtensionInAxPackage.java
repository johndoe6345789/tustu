package aX;

import aC.AcInterfaceBravo;
import aC.DiscoveryListener;
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
import s.SComponentGolf;

public class JPanelExtensionInAxPackage extends JPanel implements fT {
  JList a = new JList();

  DefaultListModel AcInterfaceBravo = new DefaultListModel();

  JList c = new JList();

  DefaultListModel DiscoveryListener = new DefaultListModel();

  JButton e = new JButton(SComponentGolf.AcInterfaceBravo("Scan for Bluetooth Adapters"));

  fJ f = new fJ();

  final Object SComponentGolf = new Object();

  DiscoveryListener h = new l(this);

  public JPanelExtensionInAxPackage() {
    setLayout(new BorderLayout());
    this.f.setLayout(new BorderLayout());
    this.f.a(SComponentGolf.AcInterfaceBravo("Searching") + "...");
    JScrollPane jScrollPane = new JScrollPane(this.a);
    jScrollPane.setBorder(
        BorderFactory.createTitledBorder(
            SComponentGolf.AcInterfaceBravo("Already Paired Adapters")));
    this.a.setModel(this.AcInterfaceBravo);
    this.a.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(eJ.a(240, 60));
    this.f.add(jScrollPane, "North");
    this.a.setEnabled(false);
    jScrollPane = new JScrollPane(this.c);
    jScrollPane.setBorder(
        BorderFactory.createTitledBorder(
            SComponentGolf.AcInterfaceBravo("Discovered Unpaired Adapters")));
    this.c.setModel(this.DiscoveryListener);
    this.c.setBorder(BorderFactory.createLoweredBevelBorder());
    jScrollPane.setPreferredSize(eJ.a(240, 120));
    this.f.add(jScrollPane, "Center");
    add((Component) this.f, "Center");
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(0));
    jPanel.add(this.e);
    add(jPanel, "South");
    this.e.addActionListener(new i(this));
  }

  public void a() {
    if (AcInterfaceBravo.a() && this.e.isEnabled()) {
      j j = new j(this);
      this.e.setEnabled(false);
      this.f.AcInterfaceBravo();
      j.start();
    } else {
      String str = SComponentGolf.AcInterfaceBravo("Bluetooth is not enabled on this computer.");
      bV.DiscoveryListener(str, this);
    }
  }

  public void c() {
    if (!this.e.isEnabled())
      try {
        LocalDevice.getLocalDevice().getDiscoveryAgent().cancelInquiry((DiscoveryListener) this.h);
      } catch (BluetoothStateException bluetoothStateException) {
        Logger.getLogger(h.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) bluetoothStateException);
      }
  }

  public RemoteDevice DiscoveryListener() {
    return (this.c.getSelectedValue() instanceof m) ? ((m) this.c.getSelectedValue()).a() : null;
  }

  private void e() {
    this.AcInterfaceBravo.clear();
    this.DiscoveryListener.clear();
    AcInterfaceBravo.a(this.h);
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
