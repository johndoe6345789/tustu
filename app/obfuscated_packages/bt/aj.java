package bt;

import G.E;
import G.R;
import G.T;
import G.aH;
import G.aM;
import G.aN;
import G.aR;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import bH.S;
import bH.p;
import c.CInterfaceDelta;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import q.QInterfaceHotel;
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class aj extends ExceptionPrintstacktrace implements aN, bZ, QInterfaceHotel, CInterfaceDelta, bc {
  protected bb ExceptionInVPackage = null;
  
  E b;
  
  R c = null;
  
  y CInterfaceDelta = null;
  
  private boolean ExceptionPrintstacktrace = false;
  
  boolean e = false;
  
  boolean f = false;
  
  public aj(R paramR, E paramE) {
    this.c = paramR;
    this.b = paramE;
    this.e = paramE.e();
    c_(a_());
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(3, 3));
    String str = paramE.l();
    if (str != null)
      str = ExceptionPrintstacktrace.b(str); 
    if (str != null && str.length() == 0)
      str = " "; 
    try {
      this.ExceptionInVPackage = (bb)QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(bb.class);
      this.ExceptionInVPackage.setText(str);
    } catch (Exception exception) {
      this.ExceptionInVPackage = new bb(str);
      D.b("Failed to get SettingsLabel from cache, creating...");
    } 
    jPanel1.add("Center", this.ExceptionInVPackage);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 0, 2, 2));
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("lkjfgblkjgdoijre98u")) {
      ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(this.c, paramE.ExceptionInVPackage());
      jPanel2.add(ExceptionInVPackage);
    } 
    l l = new l(this.c, paramE.ExceptionInVPackage());
    jPanel2.add(l);
    jPanel1.add("West", jPanel2);
    try {
      this.CInterfaceDelta = (y)QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(y.class);
    } catch (Exception exception) {
      this.CInterfaceDelta = new y();
      D.b("Cache Failed, creating new UI Component");
    } 
    c();
    CInterfaceDelta();
    jPanel1.add("East", this.CInterfaceDelta);
    this.CInterfaceDelta.ExceptionInVPackage(this);
    try {
      aR.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), paramE.ExceptionInVPackage(), this);
      if (paramE.CInterfaceDelta() != null && paramE.CInterfaceDelta().length() > 0)
        aR.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), paramE.CInterfaceDelta(), this); 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
    add("North", jPanel1);
  }
  
  private void c() {
    R r = e();
    this.CInterfaceDelta.removeAllItems();
    String[] arrayOfString = r.s();
    arrayOfString = (String[])S.ExceptionInVPackage((Object[])arrayOfString);
    this.f = true;
    for (String str : arrayOfString) {
      aH aH = r.ExceptionPrintstacktrace(str);
      if (aH.b().equals("scalar") && (aH.l() != 4 || !this.e))
        this.CInterfaceDelta.ExceptionInVPackage(aH.aL(), str); 
    } 
    this.f = false;
  }
  
  public void close() {
    this.CInterfaceDelta.b(this);
    QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage);
    QInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage(this.CInterfaceDelta);
    aR.ExceptionInVPackage().ExceptionInVPackage(this);
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    if (this.b.CInterfaceDelta() != null && this.b.CInterfaceDelta().length() > 0 && this.b.CInterfaceDelta().equals(paramString2)) {
      c();
    } else {
      CInterfaceDelta();
    } 
  }
  
  private void CInterfaceDelta() {
    R r = e();
    aM aM = this.c.c(this.b.ExceptionInVPackage());
    String str = this.CInterfaceDelta.ExceptionInVPackage();
    try {
      int RInterfaceIndia = (int)aM.ExceptionExtensionGetmessage(this.c.QInterfaceHotel());
      for (byte b = 0; b < this.CInterfaceDelta.getItemCount(); b++) {
        String str1 = this.CInterfaceDelta.ExceptionInVPackage(b);
        aH aH = r.ExceptionPrintstacktrace(str1);
        if (aH != null && aH.ExceptionInVPackage() == RInterfaceIndia) {
          this.CInterfaceDelta.setSelectedIndex(b);
          return;
        } 
      } 
      if (this.CInterfaceDelta.b(str)) {
        this.CInterfaceDelta.ExceptionInVPackage(str);
      } else {
        this.CInterfaceDelta.setSelectedIndex(0);
      } 
    } catch (ExceptionPrintstacktrace g1) {
      Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
    } 
  }
  
  private R e() {
    R r = this.c;
    if (this.b.CInterfaceDelta() != null && this.b.CInterfaceDelta().length() > 0) {
      aM aM = this.c.c(this.b.CInterfaceDelta());
      try {
        boolean bool = false;
        int RInterfaceIndia = (int)aM.ExceptionExtensionGetmessage(this.c.QInterfaceHotel());
        String[] arrayOfString = T.ExceptionInVPackage().CInterfaceDelta();
        for (String str : arrayOfString) {
          R r1 = T.ExceptionInVPackage().c(str);
          int ExceptionExtensionGetmessage = r1.O().x();
          if (RInterfaceIndia == ExceptionExtensionGetmessage) {
            r = r1;
            bool = true;
            break;
          } 
        } 
        if (!bool && RInterfaceIndia != this.c.O().x()) {
          RInterfaceIndia = this.c.O().x();
          aM.ExceptionInVPackage(this.c.QInterfaceHotel(), RInterfaceIndia);
        } 
      } catch (ExceptionPrintstacktrace g1) {
        Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        Logger.getLogger(aj.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionExtensionGetmessage);
      } 
    } 
    return r;
  }
  
  public void b(String paramString) {
    R r = e();
    aM aM1 = this.c.c(this.b.ExceptionInVPackage());
    aM aM2 = this.c.c(this.b.c());
    aH aH = r.ExceptionPrintstacktrace(paramString);
    if (aH == null) {
      bV.CInterfaceDelta("Invalid OutputChannel name: " + paramString, this.CInterfaceDelta);
    } else if (!this.f) {
      try {
        aM1.ExceptionInVPackage(this.c.QInterfaceHotel(), aH.ExceptionInVPackage());
        int RInterfaceIndia = aH.l();
        if (aH.t())
          RInterfaceIndia |= 0x40; 
        if (!aH.p())
          RInterfaceIndia |= 0x80; 
        aM2.ExceptionInVPackage(this.c.QInterfaceHotel(), RInterfaceIndia);
      } catch (ExceptionPrintstacktrace g1) {
      
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        bV.CInterfaceDelta(ExceptionExtensionGetmessage.getMessage(), this.CInterfaceDelta);
      } 
    } 
  }
  
  public void setFont(Font paramFont) {
    super.setFont(paramFont);
    if (this.CInterfaceDelta != null)
      this.CInterfaceDelta.setFont(paramFont); 
    if (this.ExceptionInVPackage != null)
      this.ExceptionInVPackage.setFont(paramFont); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    ExceptionInVPackage(this, paramBoolean);
  }
  
  private void ExceptionInVPackage(Container paramContainer, boolean paramBoolean) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      arrayOfComponent[b].setEnabled(paramBoolean);
      if (arrayOfComponent[b] instanceof Container)
        ExceptionInVPackage((Container)arrayOfComponent[b], paramBoolean); 
    } 
  }
  
  public void ExceptionInVPackage() {
    if (this.b != null && this.b.aJ() != null && this.CInterfaceDelta != null) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(this.b.aJ(), b_());
        setEnabled(bool);
      } catch (Exception exception) {
        if (!this.ExceptionPrintstacktrace) {
          bV.CInterfaceDelta("Invalid enable condition on offset " + this.b.ExceptionInVPackage() + ":\n { " + a_() + " } ", this);
          this.ExceptionPrintstacktrace = true;
        } 
        D.ExceptionInVPackage(exception.getMessage());
      } 
    } 
  }
  
  public R b_() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */