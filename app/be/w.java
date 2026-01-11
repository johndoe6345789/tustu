package be;

import G.R;
import V.a;
import W.ak;
import aE.a;
import bt.j;
import by.d;
import by.i;
import by.j;
import by.m;
import by.n;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import s.g;

public class w extends JPanel implements o {
  private R f = null;
  
  JTextField a = new JTextField("", 15);
  
  JTextField b = new JTextField("", 3);
  
  d c;
  
  private S g = null;
  
  private S h = null;
  
  String d = "";
  
  n e = new n();
  
  public w(R paramR) {
    setBorder(BorderFactory.createTitledBorder(g.b("OutputChannel Expression Editor")));
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(10, 10));
    add(jPanel1, "North");
    this.a.setBorder(BorderFactory.createBevelBorder(1));
    this.a.addKeyListener(this.e);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout(0));
    JPanel jPanel3 = a("Channel Name", this.a, g.b("A unique name to reference this channel.") + " " + g.b("This name will be added to the available Channel List and can be used by gauges, data log fields or other expressions."));
    jPanel2.add(jPanel3);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add(this.b, "West");
    this.b.addKeyListener(this.e);
    this.b.setBorder(BorderFactory.createBevelBorder(1));
    JPanel jPanel5 = a("Units", jPanel4, (String)null);
    jPanel2.add(jPanel5);
    jPanel2.add(new JLabel(" "));
    jPanel1.add(jPanel2, "Center");
    Image image = null;
    try {
      image = cO.a().a(cO.M, this);
    } catch (a a) {
      Logger.getLogger(w.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(imageIcon);
    jButton.setPreferredSize(new Dimension(eJ.a(28), eJ.a(28)));
    jPanel1.add(jButton, "East");
    jButton.addActionListener(new x(this));
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new BorderLayout());
    jPanel6.add(a("Expression", new JLabel(), "<html>" + g.b("Enter a mathematical expression based on other Channels or Setting Parameters")), "North");
    ArrayList<i> arrayList = new ArrayList();
    arrayList.add(j.a(paramR));
    if (!ak.b(a.A().j()))
      arrayList.add(j.b(paramR)); 
    m m = n.a();
    this.c = new d(arrayList, m, g.d());
    jPanel6.add((Component)this.c, "Center");
    add(jPanel6, "Center");
  }
  
  private void g() {
    R r = null;
    try {
      r = this.h.a(this.c.b());
    } catch (StackOverflowError stackOverflowError) {
      r = new R();
      r.c();
      r.a("Circular Dependency!");
    } 
    if (r.a()) {
      bV.d(g.b("Valid Expression!"), this);
    } else {
      bV.d(g.b(r.d()), this);
    } 
  }
  
  private JPanel a(String paramString1, Component paramComponent, String paramString2) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(5, 5));
    Dimension dimension = new Dimension(eJ.a(100), eJ.a(20));
    JLabel jLabel = new JLabel(g.b(paramString1) + ": ");
    jLabel.setMinimumSize(dimension);
    jPanel.add(jLabel, "West");
    jPanel.add(paramComponent, "Center");
    if (paramString2 != null) {
      j j = new j(g.b(paramString2));
      jPanel.add((Component)j, "East");
    } 
    return jPanel;
  }
  
  public boolean a() {
    if (this.g != null) {
      R r = this.g.a(this.a.getText());
      if (!r.a()) {
        String str = (r.d() != null) ? r.d() : "Invalid Channel Name";
        str = g.b(str);
        bV.d(str, this);
        return false;
      } 
    } 
    if (this.h != null) {
      R r = this.h.a(this.c.b());
      if (!r.a()) {
        String str = (r.d() != null) ? r.d() : "Invalid Expression";
        str = g.b(str);
        bV.d(str, this);
        return false;
      } 
    } 
    return true;
  }
  
  public void a(R paramR) {
    this.f = paramR;
  }
  
  public String b() {
    return this.a.getText();
  }
  
  public void a(String paramString, boolean paramBoolean) {
    this.a.setText(paramString);
    this.a.setEditable(paramBoolean);
  }
  
  public String d() {
    return this.c.b();
  }
  
  public void a(String paramString) {
    this.c.d(paramString);
  }
  
  public void a(S paramS) {
    this.g = paramS;
  }
  
  public void b(S paramS) {
    this.h = paramS;
  }
  
  public void b(String paramString) {
    this.b.setText(paramString);
  }
  
  public String e() {
    return this.b.getText();
  }
  
  public boolean c() {
    return (this.e.a() || !this.d.equals(this.c.b()));
  }
  
  public void f() {
    this.e.b();
    this.d = this.c.b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */