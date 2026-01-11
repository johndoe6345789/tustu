package business.binary_transformers;

import G.R;
import G.Manager;
import G.GInterfaceAn;
import G.ManagerUsingConcurrentHashMap;
import G.CloneableImpl;
import G.GInterfaceBi;
import G.RInterfaceIndia;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import aE.ExceptionInVPackage;
import ai.EqualsInAiPackage;
import ai.AiInterfaceDelta;
import ai.AiInterfaceEcho;
import bH.D;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.T;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.bt;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.eM;
import com.efiAnalytics.ui.eR;
import com.efiAnalytics.ui.eS;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import r.ExceptionInVPackage;
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class Table2DEditorPanel extends JPanel implements GInterfaceAn, AiInterfaceEcho, bc, eS {
  private R q;
  
  JSplitPane ExceptionInVPackage = new JSplitPane();
  
  eM EqualsInAiPackage = null;
  
  CloneableImpl c = null;
  
  bt AiInterfaceDelta = null;
  
  Manager AiInterfaceEcho = null;
  
  Manager f = null;
  
  Manager ExceptionPrintstacktrace = null;
  
  bO h = null;
  
  String RInterfaceIndia = "";
  
  et ExceptionExtensionGetmessage = null;
  
  String k = null;
  
  String l = null;
  
  private int r = eJ.ExceptionInVPackage(300);
  
  private int s = eJ.ExceptionInVPackage(800);
  
  private int t = eJ.ExceptionInVPackage(440);
  
  Isoptimizeddrawingenabled m = null;
  
  x Isoptimizeddrawingenabled = null;
  
  x o = null;
  
  static String p = "_histogram";
  
  private bP u = null;
  
  public W(R paramR, GInterfaceBi parambi, boolean paramBoolean) {
    this(paramR, parambi, paramBoolean, (et)null);
  }
  
  public W(R paramR, GInterfaceBi parambi, boolean paramBoolean, et paramet) {
    if (paramet == null)
      paramet = new Z(this); 
    this.ExceptionExtensionGetmessage = paramet;
    boolean bool = RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("oijfdsaoij98oi43");
    this.AiInterfaceDelta = new bt(bool, new X(this));
    this.q = paramR;
    try {
      this.c = (CloneableImpl)paramR.AiInterfaceEcho().c(parambi.ExceptionInVPackage());
      this.EqualsInAiPackage = this.AiInterfaceDelta.h();
    } catch (Exception exception) {
      D.EqualsInAiPackage("Unable to get 3D table layout by name: " + parambi.ExceptionInVPackage());
    } 
    ExceptionInVPackage(paramR, parambi);
    this.RInterfaceIndia = parambi.aL();
    setLayout(new BorderLayout());
    this.ExceptionInVPackage.setOrientation(1);
    this.AiInterfaceDelta.EqualsInAiPackage(parambi.c());
    this.AiInterfaceDelta.ExceptionInVPackage(parambi.EqualsInAiPackage());
    if (ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage.bV, ExceptionInVPackage.bW) && (this.ExceptionExtensionGetmessage.ExceptionInVPackage("colorTheme") == null || this.ExceptionExtensionGetmessage.ExceptionInVPackage("colorTheme").isEmpty()))
      this.ExceptionExtensionGetmessage.ExceptionInVPackage("colorTheme", bt.l); 
    this.AiInterfaceDelta.ExceptionInVPackage(this.ExceptionExtensionGetmessage);
    this.AiInterfaceDelta.AiInterfaceDelta();
    if (paramBoolean) {
      this.Isoptimizeddrawingenabled = new x(paramR);
      this.Isoptimizeddrawingenabled.setName(this.RInterfaceIndia + "_Cluster");
      T t = this.Isoptimizeddrawingenabled.X();
      KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher)t);
      if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("64865e43s5hjhcurd")) {
        this.m = new Isoptimizeddrawingenabled();
        this.m.setTabPlacement(3);
        this.ExceptionInVPackage.setTopComponent((Component)this.m);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add("Center", (Component)this.Isoptimizeddrawingenabled);
        this.m.addTab(ExceptionPrintstacktrace.EqualsInAiPackage("Standard"), jPanel);
        this.Isoptimizeddrawingenabled.setMinimumSize(new Dimension(1, 150));
        this.o = new x(paramR);
        this.o.setName(this.RInterfaceIndia + "_HistogramCluster");
        t = this.o.X();
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher)t);
        jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add("Center", (Component)this.o);
        this.m.addTab(ExceptionPrintstacktrace.EqualsInAiPackage("Histogram"), jPanel);
        this.o.setMinimumSize(new Dimension(1, 150));
      } else {
        this.ExceptionInVPackage.setTopComponent((Component)this.Isoptimizeddrawingenabled);
      } 
      try {
        Z z1 = (new aa()).ExceptionInVPackage(paramR, ExceptionInVPackage.A(), parambi.aL(), 2);
        this.Isoptimizeddrawingenabled.ExceptionInVPackage(z1);
        Z z2 = (new aa()).ExceptionInVPackage(paramR, parambi.aL(), 2);
        this.Isoptimizeddrawingenabled.EqualsInAiPackage(z2);
        this.Isoptimizeddrawingenabled.Isoptimizeddrawingenabled(ExceptionInVPackage.A().m());
        Component[] arrayOfComponent = this.Isoptimizeddrawingenabled.getComponents();
        byte EqualsInAiPackage;
        for (EqualsInAiPackage = 0; EqualsInAiPackage < arrayOfComponent.length; EqualsInAiPackage++) {
          if (arrayOfComponent[EqualsInAiPackage] instanceof Gauge) {
            Gauge gauge = (Gauge)arrayOfComponent[EqualsInAiPackage];
            if (gauge.getOutputChannel().equals("veTuneValue")) {
              this.EqualsInAiPackage.ExceptionInVPackage(new ab(this, gauge));
              gauge.setCurrentOutputChannelValue("veTuneValue", this.EqualsInAiPackage.o());
            } 
          } 
        } 
        if (this.o != null) {
          z1 = (new aa()).ExceptionInVPackage(paramR, ExceptionInVPackage.A(), parambi.aL() + p, 4);
          this.o.ExceptionInVPackage(z1);
          z2 = (new aa()).ExceptionInVPackage(paramR, parambi.aL() + p, 4);
          this.o.EqualsInAiPackage(z2);
          this.o.Isoptimizeddrawingenabled(ExceptionInVPackage.A().m());
          arrayOfComponent = this.o.getComponents();
          for (EqualsInAiPackage = 0; EqualsInAiPackage < arrayOfComponent.length; EqualsInAiPackage++) {
            if (arrayOfComponent[EqualsInAiPackage] instanceof Gauge) {
              Gauge gauge = (Gauge)arrayOfComponent[EqualsInAiPackage];
              if (gauge.getOutputChannel().equals("veTuneValue")) {
                this.EqualsInAiPackage.ExceptionInVPackage(new ab(this, gauge));
                gauge.setCurrentOutputChannelValue("veTuneValue", this.EqualsInAiPackage.o());
              } 
            } 
          } 
          this.m.ExceptionPrintstacktrace(this.ExceptionExtensionGetmessage.EqualsInAiPackage("selectedDash", ExceptionPrintstacktrace.EqualsInAiPackage("Standard")));
        } 
      } catch (Exception exception) {
        bV.AiInterfaceDelta("Error setting gauges, check log for detail.\nMessage:\Isoptimizeddrawingenabled" + exception.getMessage(), this);
        exception.printStackTrace();
      } 
      this.ExceptionInVPackage.setBottomComponent((Component)this.AiInterfaceDelta);
      this.ExceptionInVPackage.setDividerSize(eJ.ExceptionInVPackage(5));
      this.ExceptionInVPackage.addPropertyChangeListener("dividerLocation", new Y(this));
      int RInterfaceIndia = Integer.parseInt(this.ExceptionExtensionGetmessage.EqualsInAiPackage("tableTuningSplitPanePosition", "" + this.r));
      this.ExceptionInVPackage.setDividerLocation(RInterfaceIndia);
      add("Center", this.ExceptionInVPackage);
    } else {
      add("Center", (Component)this.AiInterfaceDelta);
    } 
    this.h = new bO(this, this.AiInterfaceDelta);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.h);
    if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("oijfdsaoij98oi43"));
  }
  
  protected bt EqualsInAiPackage() {
    return this.AiInterfaceDelta;
  }
  
  public void c() {
    if (this.u == null) {
      this.u = new aa(this);
    } else {
      this.u.EqualsInAiPackage();
    } 
    this.u.ExceptionInVPackage();
  }
  
  public void AiInterfaceDelta() {
    if (this.u != null)
      this.u.EqualsInAiPackage(); 
  }
  
  public void close() {
    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.h);
    AiInterfaceDelta();
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this);
    if (this.Isoptimizeddrawingenabled != null && this.Isoptimizeddrawingenabled.getComponentCount() > 0) {
      this.Isoptimizeddrawingenabled.f();
      (new aa()).ExceptionInVPackage(this.Isoptimizeddrawingenabled, ExceptionInVPackage.A(), this.RInterfaceIndia);
      this.Isoptimizeddrawingenabled.c();
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher((KeyEventDispatcher)this.Isoptimizeddrawingenabled.X());
    } 
    if (this.o != null && this.o.getComponentCount() > 0) {
      this.Isoptimizeddrawingenabled.f();
      (new aa()).ExceptionInVPackage(this.o, ExceptionInVPackage.A(), this.RInterfaceIndia + p);
      this.o.c();
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher((KeyEventDispatcher)this.o.X());
    } 
    if (this.m != null)
      this.ExceptionExtensionGetmessage.ExceptionInVPackage("selectedDash", this.m.getTitleAt(this.m.getSelectedIndex())); 
  }
  
  public void ExceptionInVPackage(R paramR, GInterfaceBi parambi) {
    try {
      ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap = ManagerUsingConcurrentHashMap.ExceptionInVPackage();
      ManagerUsingConcurrentHashMap.ExceptionInVPackage(this);
      AiInterfaceDelta();
      eR eR = new eR();
      CloneableImpl be1 = (CloneableImpl)paramR.AiInterfaceEcho().c(parambi.ExceptionInVPackage());
      if (be1.p() != null) {
        try {
          eR.EqualsInAiPackage(be1.p().ExceptionInVPackage());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(W.class.getName()).log(Level.WARNING, "Unable to resolve X Axis Label", (Throwable)ExceptionPrintstacktrace);
          eR.EqualsInAiPackage(be1.AiInterfaceDelta());
        } 
      } else {
        eR.EqualsInAiPackage(be1.AiInterfaceDelta());
      } 
      if (be1.q() != null) {
        try {
          eR.ExceptionInVPackage(be1.q().ExceptionInVPackage());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(W.class.getName()).log(Level.WARNING, "Unable to resolve X Axis Label", (Throwable)ExceptionPrintstacktrace);
          eR.ExceptionInVPackage(be1.AiInterfaceDelta());
        } 
      } else {
        eR.ExceptionInVPackage(be1.f());
      } 
      this.AiInterfaceEcho = paramR.c(be1.c());
      this.f = paramR.c(be1.EqualsInAiPackage());
      this.ExceptionPrintstacktrace = paramR.c(be1.ExceptionInVPackage());
      RInterfaceIndia.ExceptionInVPackage(this.q.c(), this.ExceptionPrintstacktrace, this);
      RInterfaceIndia.ExceptionInVPackage(this.q.c(), this.f, this);
      RInterfaceIndia.ExceptionInVPackage(this.q.c(), this.AiInterfaceEcho, this);
      eR.c(this.AiInterfaceEcho.p());
      eR.AiInterfaceDelta(this.AiInterfaceEcho.r());
      eR.c(this.AiInterfaceEcho.s());
      eR.AiInterfaceEcho(this.AiInterfaceEcho.B());
      eR.ExceptionInVPackage(this.f.EqualsInAiPackage(), this.ExceptionPrintstacktrace.EqualsInAiPackage());
      try {
        eR.ExceptionInVPackage(this.AiInterfaceEcho.RInterfaceIndia(paramR.p()));
        double[] arrayOfDouble1 = ExceptionInVPackage(this.ExceptionPrintstacktrace.RInterfaceIndia(paramR.p()));
        for (byte b1 = 0; b1 < arrayOfDouble1.length; b1++)
          eR.ExceptionInVPackage(b1, arrayOfDouble1[b1]); 
        double[] arrayOfDouble2 = ExceptionInVPackage(this.f.RInterfaceIndia(paramR.p()));
        for (byte b2 = 0; b2 < arrayOfDouble2.length; b2++)
          eR.EqualsInAiPackage(b2, arrayOfDouble2[b2]); 
        if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("oijfdsaoij98oi43"))
          eR.c(); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.ExceptionInVPackage("Error mapping 3D view to Parameter. ", (Exception)ExceptionPrintstacktrace, this);
      } 
      try {
        ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), this.ExceptionPrintstacktrace.aL(), this);
        ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), this.f.aL(), this);
        ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), this.AiInterfaceEcho.aL(), this);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.AiInterfaceDelta("Error subscribing for parameter changes.", this);
        ExceptionInVPackage.printStackTrace();
      } 
      c();
      this.EqualsInAiPackage.ExceptionInVPackage(eR);
      this.EqualsInAiPackage.ExceptionPrintstacktrace(this.f.v());
      this.EqualsInAiPackage.h(this.ExceptionPrintstacktrace.v());
      this.EqualsInAiPackage.RInterfaceIndia(this.AiInterfaceEcho.v());
      eR.ExceptionInVPackage(this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(W.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    if (paramString2.equals(this.AiInterfaceEcho.aL())) {
      AiInterfaceEcho();
      this.EqualsInAiPackage.z();
      this.EqualsInAiPackage.repaint();
    } else if (paramString2.equals(this.ExceptionPrintstacktrace.aL())) {
      f();
      this.EqualsInAiPackage.z();
      this.EqualsInAiPackage.repaint();
    } else if (paramString2.equals(this.f.aL())) {
      ExceptionPrintstacktrace();
      this.EqualsInAiPackage.z();
      this.EqualsInAiPackage.repaint();
    } else {
      this.EqualsInAiPackage.ExceptionInVPackage().c(this.AiInterfaceEcho.p());
      this.EqualsInAiPackage.ExceptionInVPackage().AiInterfaceDelta(this.AiInterfaceEcho.r());
      this.EqualsInAiPackage.ExceptionInVPackage().c(this.AiInterfaceEcho.s());
      this.EqualsInAiPackage.ExceptionInVPackage().AiInterfaceEcho(this.AiInterfaceEcho.B());
      this.EqualsInAiPackage.ExceptionPrintstacktrace(this.f.v());
      this.EqualsInAiPackage.h(this.ExceptionPrintstacktrace.v());
      this.EqualsInAiPackage.RInterfaceIndia(this.AiInterfaceEcho.v());
      AiInterfaceEcho();
      f();
      ExceptionPrintstacktrace();
      this.EqualsInAiPackage.z();
      this.EqualsInAiPackage.repaint();
    } 
  }
  
  public void ExceptionInVPackage(double paramDouble) {
    this.EqualsInAiPackage.EqualsInAiPackage(paramDouble);
    if (this.AiInterfaceDelta.AiInterfaceEcho())
      this.AiInterfaceDelta.f(); 
    this.EqualsInAiPackage.repaint();
  }
  
  public void EqualsInAiPackage(double paramDouble) {
    if (this.c == null)
      return; 
    this.EqualsInAiPackage.ExceptionInVPackage(paramDouble);
    if (this.AiInterfaceDelta.AiInterfaceEcho())
      this.AiInterfaceDelta.f(); 
    this.EqualsInAiPackage.repaint();
  }
  
  private double[] ExceptionInVPackage(double[][] paramArrayOfdouble) {
    double[] arrayOfDouble = new double[paramArrayOfdouble.length];
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < paramArrayOfdouble.length; EqualsInAiPackage++)
      arrayOfDouble[EqualsInAiPackage] = paramArrayOfdouble[EqualsInAiPackage][0]; 
    return arrayOfDouble;
  }
  
  public void ExceptionInVPackage(int paramInt1, int paramInt2, double paramDouble) {
    try {
      this.AiInterfaceEcho.ExceptionInVPackage(this.q.p(), paramDouble, paramInt1, paramInt2);
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      ExceptionExtensionGetmessage.printStackTrace();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
    } 
  }
  
  public void ExceptionInVPackage(int paramInt, double paramDouble) {
    this.EqualsInAiPackage.ExceptionInVPackage().ExceptionInVPackage(paramInt, paramDouble);
  }
  
  public void EqualsInAiPackage(int paramInt, double paramDouble) {
    this.EqualsInAiPackage.ExceptionInVPackage().EqualsInAiPackage(paramInt, paramDouble);
  }
  
  private void AiInterfaceEcho() {
    try {
      double[][] arrayOfDouble = this.AiInterfaceEcho.RInterfaceIndia(this.q.p());
      eR eR = this.EqualsInAiPackage.ExceptionInVPackage();
      for (byte EqualsInAiPackage = 0; EqualsInAiPackage < arrayOfDouble.length; EqualsInAiPackage++) {
        for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
          double AiInterfaceDelta = eR.AiInterfaceDelta(EqualsInAiPackage, b1);
          if (arrayOfDouble[EqualsInAiPackage][b1] != AiInterfaceDelta)
            eR.ExceptionInVPackage(EqualsInAiPackage, b1, arrayOfDouble[EqualsInAiPackage][b1]); 
        } 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
    } 
  }
  
  private void f() {
    try {
      eR eR = this.EqualsInAiPackage.ExceptionInVPackage();
      double[] arrayOfDouble = ExceptionInVPackage(this.ExceptionPrintstacktrace.RInterfaceIndia(this.q.p()));
      for (byte EqualsInAiPackage = 0; EqualsInAiPackage < arrayOfDouble.length; EqualsInAiPackage++)
        eR.ExceptionInVPackage(EqualsInAiPackage, arrayOfDouble[EqualsInAiPackage]); 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.ExceptionInVPackage("X Axis failed on update, it may now CloneableImpl out of sync.", (Exception)ExceptionPrintstacktrace, null);
    } 
  }
  
  private void ExceptionPrintstacktrace() {
    try {
      eR eR = this.EqualsInAiPackage.ExceptionInVPackage();
      double[] arrayOfDouble = ExceptionInVPackage(this.f.RInterfaceIndia(this.q.p()));
      for (byte EqualsInAiPackage = 0; EqualsInAiPackage < arrayOfDouble.length; EqualsInAiPackage++)
        eR.EqualsInAiPackage(EqualsInAiPackage, arrayOfDouble[EqualsInAiPackage]); 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.ExceptionInVPackage("X Axis failed on update, it may now CloneableImpl out of sync.", (Exception)ExceptionPrintstacktrace, null);
    } 
  }
  
  public Dimension getMinimumSize() {
    return (this.Isoptimizeddrawingenabled != null) ? new Dimension(eJ.ExceptionInVPackage(this.s), eJ.ExceptionInVPackage(this.t)) : new Dimension(eJ.ExceptionInVPackage(this.s - this.r), eJ.ExceptionInVPackage(this.t - 125));
  }
  
  public Dimension getPreferredSize() {
    return getMinimumSize();
  }
  
  public void validate() {
    super.validate();
    this.AiInterfaceDelta.h().z();
  }
  
  public EqualsInAiPackage ExceptionInVPackage() {
    String str = AiInterfaceDelta.ExceptionInVPackage("/help/3D_Table_Editor.htm");
    return new EqualsInAiPackage(ExceptionPrintstacktrace.EqualsInAiPackage("3D Table Usage"), str);
  }
  
  public void setEnabled(boolean paramBoolean) {
    fp.ExceptionInVPackage(this, paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void ExceptionInVPackage(bP parambP) {
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage(" a09kmfds098432lkg89vlk")) {
      AiInterfaceDelta();
      this.u = parambP;
    } 
  }
  
  public void ExceptionInVPackage(double paramDouble1, double paramDouble2) {
    EqualsInAiPackage(paramDouble2);
    ExceptionInVPackage(paramDouble1);
  }
  
  public boolean isOptimizedDrawingEnabled() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */