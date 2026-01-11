package aX;

import V.a;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.fJ;
import com.efiAnalytics.ui.fT;
import com.intel.bluetooth.RemoteDeviceHelper;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.bluetooth.RemoteDevice;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import s.g;

public class c extends JPanel implements fT {
  fJ a = new fJ();
  
  JButton b = new JButton(g.b("Pair"));
  
  JTextField c = new JTextField("1234");
  
  private boolean e = false;
  
  private RemoteDevice f = null;
  
  String d = g.b("Enter the PIN for this Device, usually 1234 or 0000");
  
  public c() {
    setLayout(new BorderLayout());
    add((Component)this.a, "Center");
    this.a.setLayout(new BorderLayout());
    try {
      Image image = cO.a().a(cO.B, this, 200);
      ImageIcon imageIcon = new ImageIcon(image);
      JLabel jLabel = new JLabel(imageIcon);
      this.a.add(jLabel, "Center");
    } catch (a a) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1));
    jPanel1.add(new JLabel(this.d));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(1));
    jPanel2.add(this.c);
    jPanel1.add(jPanel2);
    jPanel1.add(this.b);
    this.a.add(jPanel1, "South");
    this.c.addKeyListener(new d(this));
    this.b.addActionListener(new e(this));
  }
  
  public void a() {
    try {
      String str = this.c.getText();
      this.e = RemoteDeviceHelper.authenticate(this.f, str);
      if (c()) {
        System.out.println("--> Pairing successful with device " + this.f.getBluetoothAddress() + ", using PIN:" + str);
        bV.d(g.b("Successfully Paired with " + this.f.getFriendlyName(false)), this);
        this.b.setEnabled(false);
        this.c.setEnabled(false);
      } else {
        System.out.println("--> Pairing unsuccessful with device " + this.f.getBluetoothAddress() + ", using PIN:" + str);
        bV.d(g.b("Failed to Pair with " + this.f.getFriendlyName(false) + ". Please check PIN and try again."), this);
      } 
    } catch (IOException iOException) {
      System.out.println("--> Pairing fail with device " + this.f.getBluetoothAddress());
      iOException.printStackTrace();
    } 
  }
  
  public boolean g_() {
    return false;
  }
  
  public void a(RemoteDevice paramRemoteDevice) {
    this.f = paramRemoteDevice;
  }
  
  protected boolean c() {
    return this.e;
  }
  
  public void a(Window paramWindow) {
    JDialog jDialog = new JDialog(paramWindow);
    jDialog.setLayout(new BorderLayout());
    jDialog.add(this, "Center");
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    JButton jButton1 = new JButton(g.b("Ok"));
    jPanel.add(jButton1);
    jButton1.addActionListener(new f(this, jDialog));
    JButton jButton2 = new JButton(g.b("Cancel"));
    jPanel.add(jButton2);
    jButton2.addActionListener(new g(this, jDialog));
    jDialog.pack();
    bV.a(paramWindow, jDialog);
    jDialog.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aX/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */