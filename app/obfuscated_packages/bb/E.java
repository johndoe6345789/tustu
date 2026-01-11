package bb;

import ae.k;
import ae.m;
import ae.q;
import ae.r;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.io.File;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import r.a;
import r.j;
import s.g;

public class E extends JPanel {
  JTextPane a = new JTextPane();
  
  JLabel b = new JLabel("Select");
  
  JLabel c = new JLabel("", 0);
  
  JLabel d = new JLabel();
  
  JTextField e = new JTextField("", 30);
  
  JCheckBox f = new JCheckBox(g.b("Other / Browse"));
  
  private k k = null;
  
  JPanel g = new JPanel();
  
  JList h = new JList();
  
  DefaultListModel i = new DefaultListModel();
  
  private m l = null;
  
  q j = null;
  
  public E() {
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BoxLayout(jPanel1, 1));
    JPanel jPanel2 = new JPanel();
    jPanel2.setBorder(BorderFactory.createTitledBorder(g.b("Detected Hardware")));
    jPanel2.setLayout(new GridLayout(1, 1));
    jPanel2.add(this.c);
    jPanel1.add(jPanel2);
    jPanel1.add(new JLabel(" "));
    jPanel1.add(new JLabel(g.b("Select your new firmware below:")));
    JPanel jPanel3 = new JPanel();
    jPanel3.setBorder(BorderFactory.createTitledBorder(g.b("Recommended Firmware")));
    jPanel3.setLayout(new GridLayout(1, 1));
    jPanel3.add(this.b);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(1, 1));
    jPanel4.setBorder(BorderFactory.createTitledBorder(g.b("Available Firmwares")));
    String[] arrayOfString = { "Firmware download Service Unavailable, Browse to local file" };
    JList<String> jList = new JList<>(arrayOfString);
    jList.setVisibleRowCount(5);
    jList.setPreferredSize(eJ.a(200, 100));
    jList.setEnabled(false);
    jList.setBorder(BorderFactory.createLoweredBevelBorder());
    this.d.setPreferredSize(eJ.a(200, 60));
    jPanel4.add(this.d);
    jPanel1.add(jPanel4);
    jPanel1.add(new JLabel(" "));
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new BorderLayout());
    String str = g.b("Browse to your downloaded Firmware package.");
    JLabel jLabel = new JLabel(str);
    jPanel5.add("North", jLabel);
    boolean bool = false;
    if (bool) {
      JButton jButton = new JButton(g.b("Browse"));
      jButton.addActionListener(new F(this));
      jPanel5.add("West", jButton);
    } else {
      jPanel5.add("West", this.f);
      this.f.addActionListener(new G(this));
      this.e.setEnabled(this.f.isSelected());
    } 
    jPanel5.add("Center", this.e);
    this.e.setEditable(false);
    jPanel1.add(jPanel5);
    this.g.setBorder(BorderFactory.createTitledBorder("Firmware Files."));
    this.g.setLayout(new BorderLayout());
    this.g.add(this.h, "Center");
    this.h.setModel(this.i);
    this.h.setBorder(BorderFactory.createBevelBorder(1));
    this.h.addListSelectionListener(new H(this));
    jPanel1.add(this.g);
    this.g.setVisible(false);
    jPanel1.add(this.g);
    add("Center", jPanel1);
  }
  
  private void b() {
    String str1 = "zip;mot;s19";
    str1 = a.a().a(a.V, str1);
    String[] arrayOfString = str1.split(";");
    String str2 = a.a().c(a.E, j.E());
    String str3 = bV.b(this, g.b("Select Firmware File"), arrayOfString, "", str2);
    if (str3 != null && !str3.equals("")) {
      File file = new File(str3);
      JDialog jDialog = (JDialog)bV.b(this);
      jDialog.getGlassPane().setCursor(Cursor.getPredefinedCursor(3));
      jDialog.getGlassPane().setVisible(true);
      D.c("Set WAIT Cursor");
      I i = new I(this, file, jDialog);
      i.start();
    } else {
      this.f.setSelected(false);
    } 
  }
  
  public k a() {
    return this.k;
  }
  
  public void a(k paramk) {
    this.k = null;
    this.i.clear();
    List<File> list = paramk.d();
    List<q> list1 = r.a().a(paramk, this.l);
    for (File file : list) {
      boolean bool = (list1.size() > 0 && ((q)list1.get(0)).b(this.l, file)) ? true : false;
      K k1 = new K(this, paramk, file, bool);
      this.i.addElement(k1);
    } 
    this.k = paramk;
    if (list.size() > 1) {
      this.g.setVisible(true);
      boolean bool = false;
      if (paramk.g() != null) {
        if (list1.size() > 0) {
          for (byte b = 0; b < list.size(); b++) {
            File file = list.get(b);
            if (((q)list1.get(0)).b(this.l, file)) {
              bool = true;
              this.h.setSelectedIndex(b);
              break;
            } 
          } 
        } else {
          for (byte b = 0; b < list.size(); b++) {
            File file = list.get(b);
            if (file.equals(paramk.g())) {
              bool = true;
              this.h.setSelectedIndex(b);
              break;
            } 
          } 
        } 
      } else if (list1.size() == 1) {
        for (byte b = 0; b < list.size(); b++) {
          if (((q)list1.get(0)).a(this.l, list.get(b))) {
            String str = ((q)list1.get(0)).a(list.get(b));
            this.h.setSelectedIndex(b);
            bool = true;
            break;
          } 
        } 
        this.j = list1.get(0);
      } 
      if (this.j != null && !bool)
        for (byte b = 0; b < this.i.getSize(); b++) {
          K k1 = this.i.elementAt(b);
          k1.a = this.j.b(this.l, k1.a());
          if (k1.a && !bool) {
            this.h.setSelectedIndex(b);
            bool = true;
          } 
        }  
    } else {
      this.g.setVisible(false);
      this.h.setSelectedIndex(0);
    } 
  }
  
  public void a(m paramm) {
    this.l = paramm;
    List list = r.a().a(paramm);
    this.c.setText("<html>" + g.b("Found") + ": <b>" + paramm.a() + "</b>");
    if (list.isEmpty()) {
      String str = "<html>" + g.b("Loading firmware to this device is not supported by this application.") + ":<br>" + paramm.a();
      this.d.setText(str);
      this.f.setEnabled(false);
    } else {
      String str = "<html>" + g.b("Download firmware compatible with the detected hardware") + ":<br><b>" + paramm.a() + "</b><br>" + g.b("Then check the box below and browse to the download location.");
      this.d.setText(str);
      this.f.setEnabled(true);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */