package business.buffer_pools;

import G.GComponentBq;
import G.GInterfaceAh;
import G.GInterfaceAn;
import G.Manager;
import G.ManagerUsingConcurrentHashMap;
import G.R;
import V.ExceptionPrintstacktrace;
import bH.D;
import bt.ExceptionUsingComponent;
import bt.ManagerUsingGauge;
import bt.d;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.apps.ts.dashboard.renderers.BasicReadoutGaugePainter;
import com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter;
import com.efiAnalytics.ui.aO;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import s.ExceptionPrintstacktrace;

public class UIInBpPackage extends d implements GInterfaceAn, aO {
  ExceptionUsingComponent a = null;

  Manager b = null;

  R c = null;

  public UIInBpPackage(R paramR) {
    this.c = paramR;
    this.b = paramR.c("triggerOffset");
    setBorder(BorderFactory.createEmptyBorder(10, 15, 15, 15));
    setLayout(new BorderLayout());
    aa aa = new aa();
    GInterfaceAh GInterfaceAh = aa.a(paramR, "advance");
    GInterfaceAh.c(ExceptionPrintstacktrace.b("Advance"));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(0, 1));
    ManagerUsingGauge ManagerUsingGauge = new ManagerUsingGauge();
    ManagerUsingGauge.c().setBackColor(Color.BLACK);
    ManagerUsingGauge.c().setFontColor(Color.WHITE);
    ManagerUsingGauge.c().setFontSizeAdjustment(-4);
    ManagerUsingGauge.b(GInterfaceAh.aL());
    ManagerUsingGauge.a((GaugePainter) new BasicReadoutGaugePainter());
    jPanel1.add((Component) ManagerUsingGauge);
    add("Center", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(0, 1));
    jPanel2.add(
        new JLabel(ExceptionPrintstacktrace.b("Match above value with timing light reading."), 0));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    GComponentBq GComponentBq = new GComponentBq();
    GComponentBq.v("offsetField");
    GComponentBq.e(ExceptionPrintstacktrace.b("Ignition Offset angle"));
    GComponentBq.b("triggerOffset");
    this.a = new ExceptionUsingComponent(paramR, GComponentBq);
    this.a.setFont(new Font("Helv", 1, 20));
    try {
      ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap =
          ManagerUsingConcurrentHashMap.a();
      ManagerUsingConcurrentHashMap.a(paramR.c(), GComponentBq.b(), (GInterfaceAn) this.a);
    } catch (V.a a1) {
      a1.printStackTrace();
      D.a(
          "Error subscribing to ParameterValue Changes. Parameter:" + GComponentBq.b(),
          (Exception) a1,
          this);
    }
    jPanel3.add((Component) this.a);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new GridLayout(1, 0, 3, 3));
    cp cp = new cp("-");
    cp.setFont(new Font("Helv", 1, 30));
    cp.b(new Dimension(40, 40));
    cp.setBackground(Color.RED);
    cp.a(new b(this));
    jPanel4.add((Component) cp);
    cp = new cp("+");
    cp.setFont(new Font("Helv", 1, 30));
    cp.setBackground(Color.GREEN);
    cp.a(new c(this));
    jPanel4.add((Component) cp);
    jPanel3.add(jPanel4);
    jPanel2.add(jPanel3);
    jPanel2.add(
        new JLabel(
            ExceptionPrintstacktrace.b(
                "Press Up/Down arrows to adjust. Hold Shift to adjust by 5x"),
            0));
    add("South", jPanel2);
    this.a.requestFocus();
  }

  public void a() {
    try {
      double d1 = this.b.j(this.c.h());
      this.b.a(this.c.h(), d1 + 5.0D * this.b.B());
    } catch (Exception exception) {
      bV.d(
          "Unable to increment offset.\nThe configuration does not support this operation.",
          (Component) this);
      exception.printStackTrace();
    }
  }

  public void b() {
    try {
      double d1 = this.b.j(this.c.h());
      this.b.a(this.c.h(), d1 - 5.0D * this.b.B());
    } catch (Exception exception) {
      bV.d(
          "Unable to increment offset.\nThe configuration does not support this operation.",
          (Component) this);
      exception.printStackTrace();
    }
  }

  public void e() {
    try {
      this.c.h().c();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.a("Failed to undo data change.");
      ExceptionPrintstacktrace.printStackTrace();
    }
    this.a.requestFocus();
  }

  public void d() {
    try {
      this.c.h().d();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.a("Failed to redo data change.");
      ExceptionPrintstacktrace.printStackTrace();
    }
    this.a.requestFocus();
  }

  public void f() {
    this.c.I();
    this.a.requestFocus();
  }

  public void i() {
    f();
    this.a.close();
    ManagerUsingConcurrentHashMap.a().a(this);
    l();
  }

  public void a(String paramString1, String paramString2) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bp/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
