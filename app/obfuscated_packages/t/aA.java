package t;

import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.cq;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.UIManager;
import s.g;

public class aA extends a implements f {
  JComboBox a = new JComboBox();
  
  JPanel b = new JPanel();
  
  String c = g.b("Default");
  
  private boolean d = false;
  
  public aA(Window paramWindow, ai paramai) {
    super(paramWindow, "Select Font Family");
    a(paramai);
    setLayout(new BorderLayout());
    add(this.b, "Center");
    this.b.setLayout(new BorderLayout());
    this.b.setBorder(BorderFactory.createTitledBorder("Font Family"));
    this.a.setEditable(false);
    this.a.addItem(this.c);
    String[] arrayOfString = cq.a().c();
    for (byte b = 0; b < arrayOfString.length; b++)
      this.a.addItem(arrayOfString[b]); 
    s s = c().a().get(0);
    this.a.setSelectedItem(s.getFontFamily());
    this.a.addActionListener(new aB(this));
    this.b.add("Center", this.a);
    JButton jButton = new JButton("Close");
    jButton.addActionListener(new aC(this));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    jPanel.add(jButton);
    add("South", jPanel);
    pack();
  }
  
  public void a(String paramString) {
    if (paramString == null || paramString.equals("")) {
      this.a.setSelectedItem(this.c);
    } else {
      this.a.setSelectedItem(paramString);
    } 
  }
  
  public void e(ArrayList<s> paramArrayList) {
    if (paramArrayList.size() > 0) {
      this.a.setEnabled(true);
      s s = paramArrayList.get(0);
      a(s.getFontFamily());
      Color color = UIManager.getColor("Label.foreground");
      this.a.setForeground(color);
      for (s s1 : paramArrayList) {
        if (!s.getFontFamily().equals(s1.getFontFamily())) {
          this.a.setForeground(Color.GRAY);
          break;
        } 
      } 
    } else {
      this.a.setEnabled(false);
    } 
  }
  
  public JPanel a() {
    return this.b;
  }
  
  public void a(ArrayList paramArrayList) {
    this.d = true;
    e(paramArrayList);
    this.d = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */