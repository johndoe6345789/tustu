package ao;

import com.efiAnalytics.ui.q;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;

public class bx extends JPanel {
  q a = new q();
  
  go b;
  
  JPanel c = new JPanel();
  
  public static String d = "Hits";
  
  public static String e = "Total Weight";
  
  public static String f = "Z Field";
  
  String g = d;
  
  public bx(go paramgo) {
    this.b = paramgo;
    setLayout(new BorderLayout());
    add("Center", (Component)this.a);
    this.a.b(0.95D);
    add("West", this.c);
    this.c.setBackground(Color.BLACK);
    this.c.setOpaque(true);
  }
  
  public String a() {
    return this.g;
  }
  
  public void a(String paramString) {
    this.g = paramString;
  }
  
  public void b() {
    this.a.a();
    this.a.d(0.0D);
    this.a.c(0.0D);
    gX gX = this.b.b();
    String str = gX.w();
    this.a.d(str);
    if (this.g.equals(d)) {
      this.a.e("Hits");
      String[] arrayOfString = gX.b();
      for (byte b = 0; b < arrayOfString.length; b++)
        this.a.a(gX.D()[0][b].j(), b); 
    } else if (this.g.equals(e)) {
      this.a.e("Total Weight");
      String[] arrayOfString = gX.b();
      for (byte b = 0; b < arrayOfString.length; b++)
        this.a.a(gX.D()[0][b].k(), b); 
    } else {
      this.a.e(this.b.d.getSelectedItem() + "");
      String[] arrayOfString = gX.b();
      for (byte b = 0; b < arrayOfString.length; b++)
        this.a.a(gX.D()[0][b].i().doubleValue(), b); 
    } 
    this.c.setPreferredSize(new Dimension(this.b.l.h().i() / 3, 10));
    doLayout();
    this.a.repaint();
  }
  
  public void c() {
    this.a.b();
  }
  
  public void b(String paramString) {
    this.a.a(paramString);
  }
  
  public void c(String paramString) {
    this.a.d(paramString);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */