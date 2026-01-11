package aY;

import W.ag;
import W.z;
import aE.a;
import aP.aS;
import com.efiAnalytics.tuningwidgets.panels.U;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import r.a;
import r.j;
import s.g;

public class s extends JPanel {
  a a = null;
  
  A b = new A(this);
  
  U c = new U();
  
  JButton d = null;
  
  JButton e = null;
  
  aS f = null;
  
  public s(a parama) {
    this.a = parama;
    setLayout(new BorderLayout());
    JLabel jLabel = new JLabel();
    String str = "<html><p>" + g.b("Restore Points are automatically saved on key events set in preferences.") + " " + g.b("Each Restore Point contains all Controller Settings for that point in time.") + " " + g.b("Below you can retrieve those settings or view changes made since that Restore Point.") + "</p></html>";
    jLabel.setText(str);
    jLabel.setPreferredSize(new Dimension(eJ.a(300), eJ.a(80)));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("restore-icon-02.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    jLabel.setIcon(imageIcon);
    jLabel.setIconTextGap(eJ.a(15));
    setBorder(BorderFactory.createTitledBorder(g.b("Automatic Saved Restore Points")));
    add("North", jLabel);
    JScrollPane jScrollPane = new JScrollPane(this.b);
    add("West", jScrollPane);
    jScrollPane.setBorder(BorderFactory.createTitledBorder(g.b("Restore Points")));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    this.f = new aS();
    this.f.setBorder(BorderFactory.createTitledBorder(g.b("Controller to Restore")));
    this.f.a(new t(this));
    jPanel1.add("North", (Component)this.f);
    this.c.setBorder(BorderFactory.createTitledBorder(g.b("Selected Restore Point")));
    jPanel1.add("Center", (Component)this.c);
    add("Center", jPanel1);
    a();
    this.b.addListSelectionListener(new u(this));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 0));
    this.e = new JButton(g.b("Compare to Current"));
    this.e.addActionListener(new v(this));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(1));
    jPanel3.add(this.e);
    this.e.setEnabled(false);
    jPanel2.add(jPanel3);
    this.d = new JButton(g.b("Load Restore Point"));
    this.d.addActionListener(new w(this));
    jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(1));
    jPanel3.add(this.d);
    this.d.setEnabled(false);
    jPanel2.add(jPanel3);
    this.b.addListSelectionListener(new x(this));
    add("South", jPanel2);
  }
  
  public void a(Component paramComponent) {
    bV.a(this, paramComponent, g.b("Tune Restore Points"), null);
  }
  
  private void a() {
    this.b.a.clear();
    y y = new y(this);
    ArrayList<?> arrayList = z.a(j.b(this.a), a.cw, y);
    z z = new z(this);
    Collections.sort(arrayList, z);
    Iterator<?> iterator = arrayList.iterator();
    while (iterator.hasNext())
      this.b.a((ag)iterator.next()); 
    this.b.setBorder(BorderFactory.createLoweredBevelBorder());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */