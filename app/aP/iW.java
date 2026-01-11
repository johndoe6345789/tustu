package aP;

import G.R;
import G.S;
import G.n;
import G.o;
import com.efiAnalytics.ui.dM;
import com.efiAnalytics.ui.ep;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.SoftBevelBorder;

public class iW extends JPanel implements S, n {
  JPanel a = new JPanel();
  
  dM b = new dM();
  
  iZ c = new iZ(this);
  
  iZ d = new iZ(this);
  
  Insets e = new Insets(0, 1, 1, 20);
  
  public iW(boolean paramBoolean) {
    setLayout(new BorderLayout());
    this.a.setLayout(new GridLayout(1, 0, 0, 2));
    SoftBevelBorder softBevelBorder = new SoftBevelBorder(1);
    this.a.setBorder(softBevelBorder);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    jPanel.add("East", this.a);
    jPanel.add("Center", this.d);
    if (paramBoolean) {
      ir ir = new ir();
      ir.setBorder(softBevelBorder);
      jPanel.add("West", ir);
    } 
    this.d.setBorder(softBevelBorder);
    add("East", jPanel);
    add("Center", (Component)this.b);
    this.c.setBorder(new SoftBevelBorder(1));
    add("West", this.c);
    dd.a().a(this.b);
    dd.a().a(this);
    setOpaque(true);
  }
  
  public void a(ep paramep) {
    this.a.add((Component)paramep);
    doLayout();
    this.a.doLayout();
  }
  
  public void a(String paramString) {
    for (byte b = 0; b < this.a.getComponentCount(); b++) {
      ep ep = (ep)this.a.getComponent(b);
      if (ep.b().equals(paramString)) {
        this.a.remove((Component)ep);
        ep.a();
      } 
    } 
  }
  
  public void b(String paramString) {
    String str = paramString;
    if (paramString != null && paramString.indexOf(File.separator) >= 0)
      str = paramString.substring(paramString.lastIndexOf(File.separator) + 1, paramString.length()); 
    this.d.setText(str);
    this.d.setToolTipText(paramString);
  }
  
  public String a() {
    return this.d.getText();
  }
  
  public void b() {
    String str = this.d.getText();
    if (!str.isEmpty() && !str.startsWith("Modified - "))
      this.d.setText("Modified - " + this.d.getText()); 
  }
  
  public void c(String paramString) {
    if (SwingUtilities.isEventDispatchThread()) {
      this.c.setText(paramString);
    } else {
      iX iX = new iX(this, paramString);
      SwingUtilities.invokeLater(iX);
    } 
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    a(paramR.c());
    paramR.b(this);
    paramR.d(this);
  }
  
  public void c(R paramR) {
    iW iW1 = this;
    iY iY = new iY(this, paramR, iW1);
    try {
      if (SwingUtilities.isEventDispatchThread()) {
        iY.run();
      } else {
        SwingUtilities.invokeAndWait(iY);
      } 
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(iW.class.getName()).log(Level.SEVERE, "Error Initializing Status Bar", interruptedException);
    } catch (InvocationTargetException invocationTargetException) {
      Logger.getLogger(iW.class.getName()).log(Level.SEVERE, "Error Initializing Status Bar", invocationTargetException);
    } 
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    paramGraphics.setColor(getBackground().darker());
    int i = getWidth() - 4;
    byte b = 8;
    boolean bool = true;
    paramGraphics.drawOval(i, b, bool, bool);
    paramGraphics.drawOval(i - 4, b + 4, bool, bool);
    paramGraphics.drawOval(i - 8, b + 8, bool, bool);
    paramGraphics.drawOval(i, b + 4, bool, bool);
    paramGraphics.drawOval(i - 4, b + 8, bool, bool);
    paramGraphics.drawOval(i, b + 8, bool, bool);
  }
  
  public Insets getInsets() {
    return this.e;
  }
  
  public void a(double paramDouble) {}
  
  public void a(o paramo) {}
  
  public void e() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */