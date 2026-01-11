package bC;

import V.a;
import Z.b;
import Z.c;
import Z.e;
import bH.D;
import bH.ab;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cI;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Window;
import java.util.Collections;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class k extends JPanel implements bc {
  ab a;
  
  b b;
  
  c c;
  
  e d;
  
  JPanel e;
  
  private int h;
  
  JButton f;
  
  String g = "Standardize Field naming will map many possible field name to a single standard field name.\nLog files for various systems often use different field names for fields that actually represent the same thing. This can break your Calculated Fields and Filters, or require you to set many redundant Min/Max limits for essentially the same field. This can also create confusion finding a field when switching systems. By using Standardized Field Names, you can have the same field name set no matter what system the log file is from.";
  
  private Runnable i;
  
  private o j;
  
  public k(ab paramab) {
    this.a = paramab;
    setLayout(new BorderLayout(eJ.a(10), eJ.a(8)));
    setBorder(BorderFactory.createEmptyBorder(eJ.a(10), eJ.a(10), eJ.a(10), eJ.a(10)));
    JPanel jPanel1 = new JPanel();
    add("Center", jPanel1);
    jPanel1.setLayout(new BorderLayout(eJ.a(10), eJ.a(8)));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    Image image = null;
    ImageIcon imageIcon = null;
    try {
      image = cO.a().a(cO.I, this);
      imageIcon = new ImageIcon(image);
      JButton jButton = new JButton(imageIcon);
      Dimension dimension = eJ.a(28, 28);
      jButton.setPreferredSize(dimension);
      jPanel2.add("West", jButton);
      jButton.addActionListener(new l(this));
      cI cI = new cI(this.g);
      jPanel2.add("East", (Component)cI);
    } catch (a a) {
      D.a((Exception)a);
    } 
    jPanel1.add("North", jPanel2);
    this.b = new b(paramab);
    JScrollPane jScrollPane = new JScrollPane(this.b);
    jPanel1.add("Center", jScrollPane);
    jScrollPane.setPreferredSize(eJ.a(420, 200));
    this.j = new o(this);
    this.d = new e(paramab);
    this.d.a(this.j);
    this.e = new JPanel();
    this.e.setLayout(new BorderLayout());
    this.e.add("Center", this.d);
    jPanel1.add("South", this.e);
    try {
      image = cO.a().a(cO.P, this);
      imageIcon = new ImageIcon(image);
      this.f = new JButton(b("Save"), imageIcon);
      this.f.addActionListener(new m(this));
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new FlowLayout(2));
      this.e.add("South", jPanel);
      jPanel.add(this.f);
    } catch (a a) {
      D.a((Exception)a);
    } 
    this.b.getSelectionModel().addListSelectionListener(new p(this, null));
    this.d.g();
  }
  
  public void a(c paramc) {
    this.c = paramc;
    this.d.a(paramc);
    List<?> list = paramc.a();
    Collections.sort(list, new n(this));
    this.b.a(list);
  }
  
  public void a(String paramString) {
    for (byte b1 = 0; b1 < this.b.getRowCount(); b1++) {
      e e1 = this.b.a(b1);
      if (paramString.equals(e1.a())) {
        this.b.getSelectionModel().setSelectionInterval(b1, b1);
        return;
      } 
    } 
  }
  
  public void a() {
    this.d.a();
  }
  
  private void a(int paramInt) {
    if (this.d.e()) {
      String str = b("The Root Field currently being edited has not been saved.") + "\n" + b("Would you like to save it now?");
      if (bV.a(str, this.d, true))
        if (c()) {
          this.d.g();
        } else {
          if (this.h >= 0)
            this.b.getSelectionModel().setSelectionInterval(paramInt, paramInt); 
          return;
        }  
    } 
    if (paramInt >= 0) {
      this.h = paramInt;
      this.d.a(this.b.a(paramInt));
    } else {
      this.d.g();
    } 
  }
  
  private String b(String paramString) {
    return (this.a != null) ? this.a.a(paramString) : paramString;
  }
  
  public void b() {
    d();
    String str = "";
    do {
      str = bV.a(this, false, "New Standard Field Name", str);
      if (str == null || str.isEmpty())
        continue; 
      if (!this.d.a(str)) {
        bV.d("Invalid characters in field name", this);
      } else {
        e e1 = new e(str);
        this.d.a(e1);
        return;
      } 
    } while (str != null && !str.isEmpty());
  }
  
  private boolean c() {
    e e1 = this.d.d();
    if (a(e1)) {
      this.c.a(e1);
      this.d.f();
      this.b.a(e1);
      return true;
    } 
    return false;
  }
  
  private boolean a(e parame) {
    if (parame == null || !c(parame.a()))
      return false; 
    for (String str : parame.b()) {
      if (!c(str))
        return false; 
    } 
    return true;
  }
  
  private boolean c(String paramString) {
    return (paramString.trim().length() > 0);
  }
  
  public void a(Window paramWindow) {
    JDialog jDialog = bV.b(this, paramWindow, b("Root Field Editor"), this);
    jDialog.pack();
    bV.a(paramWindow, jDialog);
    jDialog.setVisible(true);
  }
  
  public void close() {
    d();
  }
  
  public void a(Runnable paramRunnable) {
    this.i = paramRunnable;
  }
  
  private void d() {
    if (this.d.e()) {
      String str = b("The Root Field currently being edited has not been saved.") + "\n" + b("Would you like to save it now?");
      if (bV.a(str, this.d, true) && !c())
        D.c("Failed to save RootField"); 
    } else {
      b.a().b();
      if (this.j.c() && this.i != null)
        SwingUtilities.invokeLater(this.i); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bC/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */