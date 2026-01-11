package n;

import V.a;
import com.efiAnalytics.ui.aO;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import r.i;
import s.g;

public class b extends JPanel {
  ArrayList a = new ArrayList();
  
  JButton b = null;
  
  JButton c = null;
  
  JButton d = null;
  
  JButton e = null;
  
  ImageIcon f = null;
  
  ImageIcon g = null;
  
  public b() {
    this(24);
  }
  
  public b(int paramInt) {
    setLayout(new GridLayout(eJ.a(1), eJ.a(3), eJ.a(2), eJ.a(2)));
    try {
      Image image1 = cO.a().a(cO.V, this, paramInt);
      this.f = new ImageIcon(image1);
      image1 = cO.a().a(cO.Y, this, paramInt);
      this.g = new ImageIcon(image1);
    } catch (a a) {
      Logger.getLogger(b.class.getName()).log(Level.INFO, "Unable to load burn button image.", (Throwable)a);
    } 
    Image image = null;
    Border border = BorderFactory.createEmptyBorder(eJ.a(3), eJ.a(4), eJ.a(2), eJ.a(4));
    try {
      image = cO.a().a(cO.ad, this, paramInt);
    } catch (a a) {
      Logger.getLogger(b.class.getName()).log(Level.WARNING, "Failed to get Undo Image", (Throwable)a);
    } 
    ImageIcon imageIcon = new ImageIcon(image);
    this.b = new JButton(null, imageIcon);
    this.b.setMnemonic(90);
    this.b.setToolTipText(g.b("Undo Changes (Alt+Z)"));
    this.b.addActionListener(new c(this));
    this.b.setEnabled(false);
    this.b.setBorder(border);
    this.b.setToolTipText(g.b("Undo last change made to configuration"));
    add(this.b);
    try {
      image = cO.a().a(cO.ae, this, paramInt);
    } catch (a a) {
      Logger.getLogger(b.class.getName()).log(Level.WARNING, "Failed to get Redo Image", (Throwable)a);
    } 
    imageIcon = new ImageIcon(image);
    this.c = new JButton(null, imageIcon);
    this.c.setMnemonic(89);
    this.c.setToolTipText(g.b("Redo Changes (Alt+Y)"));
    this.c.addActionListener(new d(this));
    this.c.setEnabled(false);
    this.c.setBorder(border);
    this.c.setToolTipText(g.b("Redo last Undo made to configuration"));
    add(this.c);
    this.e = new JButton(g.b("Burn"));
    this.e.setMnemonic(66);
    this.e.addActionListener(new e(this));
    if (!i.a().a("OIJFDSFDSAPOFS"))
      add(this.e); 
    this.e.setBorder(border);
    this.d = new JButton(g.b("Close"));
    this.d.setMnemonic(67);
    this.d.addActionListener(new f(this));
    this.d.setBorder(border);
    add(this.d);
  }
  
  private void a() {
    for (aO aO : this.a)
      aO.d(); 
  }
  
  private void b() {
    for (aO aO : this.a)
      aO.e(); 
  }
  
  private void c() {
    for (aO aO : this.a)
      aO.f(); 
  }
  
  private void d() {
    for (aO aO : this.a)
      aO.i(); 
  }
  
  public void a(aO paramaO) {
    this.a.add(paramaO);
  }
  
  public void a(boolean paramBoolean) {
    this.b.setEnabled(paramBoolean);
  }
  
  public void b(boolean paramBoolean) {
    this.c.setEnabled(paramBoolean);
  }
  
  public void c(boolean paramBoolean) {
    if (paramBoolean && this.f != null) {
      this.e.setIcon(this.f);
    } else if (!paramBoolean && this.g != null) {
      this.e.setIcon(this.g);
    } else {
      this.e.setEnabled(paramBoolean);
    } 
  }
  
  public void d(boolean paramBoolean) {
    if (!paramBoolean) {
      remove(this.d);
    } else {
      add(this.d);
    } 
  }
  
  public void e(boolean paramBoolean) {
    this.b.setVisible(paramBoolean);
    this.c.setVisible(paramBoolean);
    this.e.setVisible(paramBoolean);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/n/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */