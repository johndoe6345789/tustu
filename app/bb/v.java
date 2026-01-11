package bb;

import V.a;
import aE.a;
import ae.d;
import ae.f;
import ae.w;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fT;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import r.j;
import s.g;

public class v extends JPanel implements w, fT {
  w a = new w(this);
  
  f b = null;
  
  JTextPane c = new JTextPane();
  
  JProgressBar d = new JProgressBar(0, 100);
  
  JLabel e = new JLabel();
  
  k f = new k(g.b("Firmware Loaded"), false);
  
  p g = new p(g.b("Preparing for firmware load"));
  
  p h = new p(g.b("Finalizing firmware load"));
  
  JPanel i = new JPanel();
  
  CardLayout j = new CardLayout();
  
  boolean k = false;
  
  boolean l = false;
  
  boolean m = false;
  
  private static final File n = new File(j.C(), "firmwareLoader/firmwareLoadCompleteNoProject.html");
  
  private static final File o = new File(j.C(), "firmwareLoader/firmwareLoadCompleteProject.html");
  
  private static final File p = new File(j.C(), "firmwareLoader/loadError.html");
  
  public v() {
    setLayout(new BorderLayout());
    this.i.setLayout(this.j);
    this.i.add(this.g, "PrepPanel");
    try {
      Image image = cO.a().a(cO.K);
      boolean bool = false;
      if (bool) {
        int i = eJ.a(671);
        int j = eJ.a(300);
        image = cO.a().a(cO.K).getScaledInstance(i, j, 1);
      } 
      ImageIcon imageIcon = new ImageIcon(image);
      this.e.setIcon(imageIcon);
      this.e.setHorizontalAlignment(0);
    } catch (a a) {
      Logger.getLogger(v.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
    this.i.add(this.e, "Animation");
    this.i.add(this.h, "PostPanel");
    this.i.add(this.f, "Complete");
    this.f.a(true);
    this.j.show(this.i, "PrepPanel");
    add(this.i, "Center");
    JPanel jPanel = new JPanel();
    this.c.setMinimumSize(new Dimension(200, eJ.a() * 3));
    jPanel.setLayout(new BorderLayout());
    jPanel.add(this.c, "North");
    jPanel.add(this.d, "Center");
    add(jPanel, "South");
  }
  
  public void a(f paramf) {
    paramf.a(this.a);
    this.k = false;
    this.l = false;
    this.m = false;
    this.b = paramf;
    paramf.a(this);
  }
  
  public boolean a() {
    return this.m;
  }
  
  public boolean g_() {
    return true;
  }
  
  public void a(List paramList) {
    if (b(paramList)) {
      this.l = true;
      this.m = true;
      try {
        this.f.a(p);
      } catch (a a) {
        Logger.getLogger(v.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      } 
      this.d.setValue(100);
      this.b.b(this.a);
      this.j.show(this.i, "Complete");
    } else if (this.b != null) {
      if (!this.k) {
        this.b.b(this);
        this.k = true;
        this.j.show(this.i, "Animation");
      } else if (!this.l) {
        this.l = true;
        this.j.show(this.i, "PostPanel");
        this.b.c(this);
      } else {
        this.m = true;
        this.d.setValue(100);
        try {
          File file;
          if (a.A() == null) {
            file = n;
          } else {
            file = o;
          } 
          this.f.a(file);
        } catch (a a) {}
        this.b.b(this.a);
        this.j.show(this.i, "Complete");
      } 
    } else {
      bV.d("No Valid Loader Set, Can not complete.", this);
    } 
  }
  
  private boolean b(List paramList) {
    StringBuffer stringBuffer1 = new StringBuffer();
    StringBuffer stringBuffer2 = new StringBuffer();
    for (d d : paramList) {
      if (d.a() == d.b) {
        stringBuffer2.append(d.b()).append("\n\n");
        continue;
      } 
      if (d.a() == d.c)
        stringBuffer1.append(d.b()).append("\n\n"); 
    } 
    if (stringBuffer1.length() > 0 || stringBuffer2.length() > 0) {
      StringBuilder stringBuilder = new StringBuilder();
      if (stringBuffer2.length() > 0)
        stringBuilder.append(g.b("Could not complete due to the following errors:")).append("\n").append(stringBuffer2); 
      if (stringBuffer1.length() > 0)
        stringBuilder.append(g.b("Could not complete due to the following errors:")).append("\n").append(stringBuffer1); 
      bV.d(stringBuilder.toString(), this);
    } 
    return (stringBuffer2.length() > 0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */