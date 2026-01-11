package bt;

import G.R;
import G.GInterfaceAg;
import G.CloneableImpl;
import G.GInterfaceBi;
import G.GInterfaceDb;
import G.i;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.p;
import c.CInterfaceDelta;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.KeyboardFocusManager;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.ExceptionPrintstacktrace;

public class ManagerCinterfacedelta extends JPanel implements h, p, CInterfaceDelta, bc {
  R ExceptionInVPackage = null;
  
  GInterfaceBi b = null;
  
  CloneableImpl c = null;
  
  bu CInterfaceDelta = null;
  
  W e = null;
  
  JPanel f = new JPanel();
  
  bO ExceptionPrintstacktrace = null;
  
  private String k = null;
  
  JCheckBox h;
  
  JLabel i = new JLabel("", 2);
  
  et j = null;
  
  private bP l = null;
  
  private static String m = "checked3D";
  
  public ManagerCinterfacedelta(R paramR, GInterfaceBi parambi, CloneableImpl parambe) {
    this(paramR, parambi, parambe, new i("Multiview_" + parambe.aL()));
  }
  
  public ManagerCinterfacedelta(R paramR, GInterfaceBi parambi, CloneableImpl parambe, et paramet) {
    this.ExceptionInVPackage = paramR;
    this.b = parambi;
    this.c = parambe;
    this.k = parambe.aJ();
    setLayout(new BorderLayout());
    this.j = paramet;
    boolean bool = ExceptionInVPackage(m, "false").equals("true");
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.h = new JCheckBox(ExceptionPrintstacktrace.b("3D View"));
    this.h.setFocusable(false);
    this.h.setSelected(bool);
    this.h.setMnemonic('D');
    this.h.addActionListener(new CloneableImpl(this));
    jPanel.add("East", this.h);
    GInterfaceDb GInterfaceDb = parambe.N();
    if (GInterfaceDb != null) {
      String str;
      try {
        str = ExceptionPrintstacktrace.b(GInterfaceDb.ExceptionInVPackage());
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        str = GInterfaceDb.toString();
      } 
      this.i.setText(str);
      jPanel.add("West", this.i);
    } 
    bf bf = new bf(this, GInterfaceDb);
    try {
      i.ExceptionInVPackage(paramR.c(), GInterfaceDb, bf);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.CInterfaceDelta("Invalid Title Defined: " + GInterfaceDb.toString() + "\nError: " + ExceptionInVPackage.getLocalizedMessage(), this);
    } 
    add("North", jPanel);
    add("Center", this.f);
    ExceptionInVPackage(this.h.isSelected());
    addFocusListener(new bg(this));
    bX bX = new bX(paramR, parambe, (e()).f, this);
    paramR.C().ExceptionInVPackage(bX);
    this.l = bX;
    if (this.CInterfaceDelta != null) {
      this.CInterfaceDelta.e();
      this.CInterfaceDelta.ExceptionInVPackage(this.l);
    } 
    if (this.e != null) {
      this.e.CInterfaceDelta();
      this.e.ExceptionInVPackage(this.l);
    } 
  }
  
  private String ExceptionInVPackage(String paramString1, String paramString2) {
    String str = null;
    if (this.j != null)
      str = this.j.ExceptionInVPackage(paramString1); 
    return (str == null) ? paramString2 : str;
  }
  
  public void CInterfaceDelta() {
    if (this.e != null) {
      this.e.requestFocusInWindow();
    } else if (this.CInterfaceDelta != null) {
      this.CInterfaceDelta.requestFocusInWindow();
    } 
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    if (paramBoolean) {
      this.e = f();
      ExceptionInVPackage(this.e);
      this.ExceptionPrintstacktrace = new bO(this, this.e.b());
      KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.ExceptionPrintstacktrace);
    } else {
      if (this.c == null) {
        bV.CInterfaceDelta(this.b.ExceptionInVPackage() + " 2D Table not found in configuration.", this);
        return;
      } 
      if (this.ExceptionPrintstacktrace != null) {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.ExceptionPrintstacktrace);
        this.ExceptionPrintstacktrace = null;
      } 
      this.CInterfaceDelta = e();
      ExceptionInVPackage(this.CInterfaceDelta);
    } 
    CInterfaceDelta();
  }
  
  private void ExceptionInVPackage(bu parambu) {
    this.f.removeAll();
    this.f.setLayout(new GridLayout());
    this.f.add(parambu);
    this.f.repaint();
    validate();
  }
  
  private void ExceptionInVPackage(W paramW) {
    this.f.removeAll();
    this.f.setLayout(new BorderLayout());
    this.f.add("Center", paramW);
    this.f.repaint();
    validate();
  }
  
  public bu e() {
    if (this.CInterfaceDelta == null) {
      this.CInterfaceDelta = new bu(this.ExceptionInVPackage, this.c);
      if (this.l != null)
        this.CInterfaceDelta.e(); 
    } 
    return this.CInterfaceDelta;
  }
  
  public W f() {
    if (this.e == null) {
      this.e = new W(this.ExceptionInVPackage, this.b, false);
      if (this.l != null) {
        this.e.CInterfaceDelta();
        this.e.ExceptionInVPackage(this.l);
      } 
    } 
    return this.e;
  }
  
  public void close() {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof bc) {
        bc bc1 = (bc)arrayOfComponent[b];
        bc1.close();
      } 
    } 
    if (this.l != null) {
      this.l.b();
      if (this.l instanceof GInterfaceAg)
        this.ExceptionInVPackage.C().b((GInterfaceAg)this.l); 
    } 
    if (this.ExceptionPrintstacktrace != null) {
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.ExceptionPrintstacktrace);
      this.ExceptionPrintstacktrace = null;
    } 
    if (this.CInterfaceDelta != null) {
      this.CInterfaceDelta.close();
      this.CInterfaceDelta = null;
    } 
    if (this.e != null) {
      this.e.close();
      this.e = null;
    } 
  }
  
  public void ExceptionInVPackage() {
    if (a_() != null) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(a_(), this.ExceptionInVPackage);
        setEnabled(bool);
      } catch (Exception exception) {
        D.ExceptionInVPackage(exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  public String a_() {
    return this.k;
  }
  
  public void c_(String paramString) {
    this.k = paramString;
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    if (this.CInterfaceDelta != null)
      this.CInterfaceDelta.setEnabled(paramBoolean); 
    if (this.e != null)
      this.e.setEnabled(paramBoolean); 
    this.h.setEnabled(paramBoolean);
  }
  
  public void ExceptionInVPackage(bP parambP) {
    if (this.l != null) {
      this.l.b();
      if (this.l instanceof GInterfaceAg)
        this.ExceptionInVPackage.C().b((GInterfaceAg)this.l); 
    } 
    this.l = parambP;
    if (this.CInterfaceDelta != null) {
      this.CInterfaceDelta.ExceptionInVPackage(parambP);
      parambP.ExceptionInVPackage();
    } 
    if (this.e != null) {
      this.e.ExceptionInVPackage(parambP);
      parambP.ExceptionInVPackage();
    } 
  }
  
  public void ExceptionInVPackage(double paramDouble1, double paramDouble2) {
    if (this.h.isSelected()) {
      this.e.ExceptionInVPackage(paramDouble1, paramDouble2);
    } else {
      this.CInterfaceDelta.ExceptionInVPackage(paramDouble1, paramDouble2);
    } 
  }
  
  public int c() {
    return this.h.isSelected() ? 1 : this.CInterfaceDelta.f();
  }
  
  public R b_() {
    return this.ExceptionInVPackage;
  }
  
  public CloneableImpl ExceptionPrintstacktrace() {
    return this.c;
  }
  
  public void ExceptionInVPackage(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    this.CInterfaceDelta.ExceptionInVPackage(paramArrayOffloat1, paramArrayOffloat2);
    if (this.e != null && paramArrayOffloat2.length > 0 && paramArrayOffloat1.length > 0)
      this.e.ExceptionInVPackage(paramArrayOffloat1[0], paramArrayOffloat2[0]); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */