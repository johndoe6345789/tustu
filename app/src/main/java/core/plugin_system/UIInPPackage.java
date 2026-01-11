package p;

import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.de;
import com.efiAnalytics.ui.eJ;
import d.TostringInDPackage;
import d.DInterfaceIndia;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UIInPPackage extends JPanel {
  private DInterfaceIndia f = null;
  
  JLabel a = new JLabel("", 4);
  
  JTextField b = new JTextField();
  
  de c = new de();
  
  cF d;
  
  ab e;
  
  public UIInPPackage(DInterfaceIndia parami, ab paramab) {
    this.e = paramab;
    setLayout(new BorderLayout(eJ.a(1), eJ.a(5)));
    add("West", this.a);
    Dimension dimension = this.a.getPreferredSize();
    dimension.width = eJ.a(170);
    this.a.setPreferredSize(dimension);
    if (parami.a() == 0) {
      add("Center", (Component)this.c);
    } else {
      add("Center", this.b);
    } 
    setBorder(BorderFactory.createEmptyBorder(eJ.a(3), eJ.a(2), eJ.a(0), eJ.a(2)));
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(1, 0, eJ.a(2), eJ.a(2)));
    if (parami.a() == 7) {
      JButton jButton = new JButton("...");
      jButton.addActionListener(new d(this));
      jButton.setPreferredSize(eJ.a(14, 12));
      jPanel.add(jButton);
    } 
    this.d = new cF("No Help Available", paramab);
    jPanel.add((Component)this.d);
    add("East", jPanel);
    a(parami);
  }
  
  private void c() {
    String[] arrayOfString = { "" };
    String str = bV.a(this, this.f.e(), arrayOfString, "", "", true);
    if (str != null && !str.isEmpty())
      this.b.setText(str); 
  }
  
  public void a(DInterfaceIndia parami) {
    this.f = parami;
    if (this.f.a() == 0 && this.f.b() != null) {
      List<?> list = this.f.b();
      Collections.sort(list, new e(this));
      for (Object object : list)
        this.c.addItem(object); 
      this.c.setEnabled(true);
    } 
    setName(parami.c());
    this.a.setText(parami.c());
    this.d.a(this.f.f());
    this.d.setEnabled((this.f.f() != null && !this.f.f().isEmpty()));
    a(parami.d());
  }
  
  public DInterfaceIndia a() {
    return this.f;
  }
  
  public String b() {
    return (this.f.a() == 0) ? ((this.c.getSelectedItem() instanceof TostringInDPackage) ? ((TostringInDPackage)this.c.getSelectedItem()).a() : ((this.c.getSelectedItem() != null) ? this.c.getSelectedItem().toString() : "")) : this.b.getText();
  }
  
  public void a(String paramString) {
    this.b.setText(paramString);
    if (this.c.getItemCount() > 0 && this.c.getItemAt(0) instanceof TostringInDPackage) {
      TostringInDPackage TostringInDPackage = new TostringInDPackage(paramString, "");
      this.c.setSelectedItem(TostringInDPackage);
    } else {
      if (paramString != null && !paramString.isEmpty() && !this.c.c(paramString)) {
        this.c.a(paramString);
        this.c.setEnabled(false);
      } 
      this.c.setSelectedItem(paramString);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */