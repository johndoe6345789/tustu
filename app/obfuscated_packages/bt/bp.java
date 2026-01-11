package bt;

import G.R;
import G.aM;
import G.aN;
import G.aR;
import G.bw;
import G.bx;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import bH.p;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import s.ExceptionPrintstacktrace;

public class bp extends JPanel implements aN, bZ, ca, h, bc {
  private R ExceptionInVPackage = null;
  
  private bx b = null;
  
  private y c = new y();
  
  private static String d = ExceptionPrintstacktrace.b("Custom");
  
  private ArrayList e = null;
  
  private boolean f = false;
  
  private String ExceptionPrintstacktrace = null;
  
  public bp(R paramR, bx parambx) {
    this.ExceptionInVPackage = paramR;
    this.b = parambx;
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(3, 3));
    bb bb = new bb(ExceptionPrintstacktrace.b(parambx.l()));
    jPanel.add("Center", bb);
    jPanel.add("East", this.c);
    this.c.addItem(d);
    null = parambx.ExceptionInVPackage();
    while (null.hasNext())
      this.c.addItem(ExceptionPrintstacktrace.b(((bw)null.next()).ExceptionInVPackage())); 
    this.c.ExceptionInVPackage(this);
    add("North", jPanel);
    this.e = ExceptionInVPackage(parambx);
    for (String str : this.e) {
      aR aR = aR.ExceptionInVPackage();
      try {
        aR.ExceptionInVPackage(paramR.c(), str, this);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
        D.ExceptionInVPackage("SettingSelector, Error subscribing to ParameterValue Changes. Parameter:" + str, (Exception)ExceptionInVPackage, this);
      } 
    } 
    c();
  }
  
  private void c() {
    if (this.f)
      return; 
    bw bw = this.b.ExceptionInVPackage(ExceptionPrintstacktrace.c(this.c.ExceptionInVPackage()));
    if (bw != null && ExceptionInVPackage(bw))
      return; 
    if (this.ExceptionPrintstacktrace != null) {
      bw = this.b.ExceptionInVPackage(this.ExceptionPrintstacktrace);
      if (bw != null && ExceptionInVPackage(bw))
        return; 
    } 
    Iterator<bw> iterator = this.b.ExceptionInVPackage();
    while (iterator.hasNext()) {
      bw bw1 = iterator.next();
      boolean bool = ExceptionInVPackage(bw1);
      if (bool)
        return; 
    } 
    this.c.ExceptionInVPackage(d);
  }
  
  private boolean ExceptionInVPackage(bw parambw) {
    Iterator<String> iterator = parambw.b();
    while (iterator.hasNext()) {
      String str = iterator.next();
      double d = parambw.ExceptionInVPackage(str);
      aM aM = this.ExceptionInVPackage.c(str);
      try {
        if (Math.abs(aM.ExceptionExtensionGetmessage(this.ExceptionInVPackage.h()) - d) > 1.0E-8D)
          return false; 
        if (!iterator.hasNext()) {
          this.c.setSelectedItem(ExceptionPrintstacktrace.b(parambw.ExceptionInVPackage()));
          return true;
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        return false;
      } 
    } 
    return false;
  }
  
  private void b(bw parambw) {
    this.f = true;
    Iterator<String> iterator = parambw.b();
    while (iterator.hasNext()) {
      String str = iterator.next();
      double d = parambw.ExceptionInVPackage(str);
      aM aM = this.ExceptionInVPackage.c(str);
      try {
        aM.ExceptionInVPackage(this.ExceptionInVPackage.h(), d);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.c("Unable to set parameter value for " + str);
        ExceptionPrintstacktrace.printStackTrace();
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        D.b("Invalid value set in settingSelector '" + this.b.l() + "' for parameter:" + str);
      } 
    } 
    this.f = false;
    c();
  }
  
  private ArrayList ExceptionInVPackage(bx parambx) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<bw> iterator = parambx.ExceptionInVPackage();
    while (iterator.hasNext()) {
      bw bw = iterator.next();
      Iterator<String> iterator1 = bw.b();
      while (iterator1.hasNext()) {
        String str = iterator1.next();
        if (!arrayList.contains(str))
          arrayList.add(str); 
      } 
    } 
    return arrayList;
  }
  
  public void close() {
    aR aR = aR.ExceptionInVPackage();
    aR.ExceptionInVPackage(this);
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    c();
  }
  
  public void b(String paramString) {
    if (!paramString.equals(d)) {
      bw bw = this.b.ExceptionInVPackage(ExceptionPrintstacktrace.c(paramString));
      if (bw != null)
        b(bw); 
      this.ExceptionPrintstacktrace = paramString;
    } 
  }
  
  public void ExceptionInVPackage() {
    if (this.b != null && this.b.aJ() != null && !this.b.aJ().isEmpty())
      try {
        boolean bool = p.ExceptionInVPackage(this.b.aJ(), this.ExceptionInVPackage);
        if (bool ^ this.c.isEnabled())
          this.c.setEnabled(bool); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(bp.class.getName()).log(Level.SEVERE, "Bad enable expresstion  on settingSelector", (Throwable)ExceptionPrintstacktrace);
      }  
  }
  
  public void b() {
    if (this.b != null && this.b.m() != null && !this.b.m().isEmpty())
      try {
        boolean bool = p.ExceptionInVPackage(this.b.m(), this.ExceptionInVPackage);
        if (bool ^ this.c.isVisible())
          this.c.setVisible(bool); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(bp.class.getName()).log(Level.SEVERE, "Bad enable expresstion  on settingSelector", (Throwable)ExceptionPrintstacktrace);
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */