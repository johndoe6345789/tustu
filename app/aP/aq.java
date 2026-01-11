package aP;

import G.T;
import G.cL;
import G.cM;
import aE.a;
import aE.d;
import com.efiAnalytics.tunerStudio.panels.a;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.ei;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class aq extends JPanel {
  ei a = new ei();
  
  JComboBox b = new JComboBox();
  
  JComboBox c = new JComboBox();
  
  a d;
  
  a e = null;
  
  public aq() {
    setLayout(new BorderLayout(4, 4));
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder("Projects Main Controller"));
    jPanel1.setLayout(new GridLayout(0, 1, 5, 5));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(8, 8));
    JLabel jLabel = new JLabel("Main Controller CAN ID", 4);
    jPanel2.add("Center", jLabel);
    jLabel.setToolTipText("The CAN ID assigned to the main project controller. This must match what is set in the Tune.");
    jPanel2.add("East", this.b);
    this.b.setEditable(false);
    for (byte b = 0; b < 16; b++)
      this.b.addItem("" + b); 
    this.b.addActionListener(new ar(this));
    jPanel1.add(jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout(5, 5));
    jLabel = new JLabel("Serial Protocol: ", 4);
    jPanel3.add("Center", jLabel);
    jLabel.setToolTipText("<htm>Used to select the protocol used to communicate with the Main Controller.<br>If connecting to a remote device through a device<br> with a different protocol this will be required.<html>");
    jPanel3.add("East", this.c);
    this.c.setEditable(false);
    at at = new at(this);
    at.a("Firmware Default");
    at.b("");
    this.c.addItem(at);
    Iterator<cM> iterator = cL.a().b();
    while (iterator.hasNext()) {
      cM cM = iterator.next();
      at = new at(this);
      at.b(cM.c());
      at.a("Force - " + cM.d());
      this.c.addItem(at);
    } 
    jPanel1.add(jPanel3);
    add("North", jPanel1);
    JPanel jPanel4 = new JPanel();
    add("Center", jPanel4);
    jPanel4.setBorder(BorderFactory.createTitledBorder("CAN Devices"));
    jPanel4.setLayout(new BorderLayout(15, 15));
    jPanel4.add("North", (Component)this.a);
    this.a.a(new as(this));
    this.d = new a(T.a().c());
    jPanel4.add("Center", (Component)this.d);
    fp.a((Component)this.d, false);
  }
  
  public d[] a() {
    this.d.a();
    Object[] arrayOfObject = this.a.a();
    d[] arrayOfD = new d[arrayOfObject.length];
    for (byte b = 0; b < arrayOfObject.length; b++)
      arrayOfD[b] = (d)arrayOfObject[b]; 
    return arrayOfD;
  }
  
  public void a(d paramd) {
    this.a.a(paramd);
  }
  
  public int b() {
    return this.b.getSelectedIndex();
  }
  
  public String c() {
    at at = (at)this.c.getSelectedItem();
    return (at != null) ? at.b() : "";
  }
  
  public boolean d() {
    String str = "";
    d[] arrayOfD = a();
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 0; b < arrayOfD.length; b++) {
      str = str + b(arrayOfD[b]);
      if (arrayList.contains(arrayOfD[b].a())) {
        str = str + "All deveices must have unique Device Identifiers. " + arrayOfD[b].a() + " is assigned to more than 1 device.\n";
        break;
      } 
      arrayList.add(arrayOfD[b].a());
    } 
    if (str.length() > 0) {
      bV.d("Please correct the following CAN configuration errors\nor remove them from the project if not needed:\n" + str, this);
      return false;
    } 
    return true;
  }
  
  public String b(d paramd) {
    String str = "";
    if (paramd.a().length() == 0) {
      str = str + "Device Identifier missing.\n";
    } else if (paramd.a().length() > 6) {
      str = str + "Device Identifier '" + paramd.a() + "' is too long, must be 6 or less characters.\n";
    } 
    if (paramd.b().length() == 0)
      str = str + "Device Description missing.\n"; 
    if (paramd.c().length() == 0) {
      str = str + "Controller Configuration file must be set for each CAN device.\n";
    } else if (this.e != null && !(new File(paramd.a(this.e))).exists()) {
      str = str + "Device Configuration File must be the full path and file name to a valid file.\n";
    } 
    return str;
  }
  
  public void a(a parama) {
    this.e = parama;
    for (byte b = 0; b < (this.a.a()).length; b++)
      this.a.a(b); 
    this.d.a(parama);
    if (parama.c() >= 0 && parama.c() < 16) {
      this.b.setSelectedIndex(parama.c());
    } else {
      this.b.setSelectedIndex(0);
    } 
    at at = new at(this);
    at.b(parama.d());
    this.c.setSelectedItem(at);
    Iterator<d> iterator = parama.I();
    while (iterator.hasNext()) {
      d d = iterator.next();
      try {
        a(d.g());
      } catch (CloneNotSupportedException cloneNotSupportedException) {
        a(d);
        Logger.getLogger(aq.class.getName()).log(Level.SEVERE, (String)null, cloneNotSupportedException);
      } 
    } 
  }
  
  public void e() {
    this.d.d();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */