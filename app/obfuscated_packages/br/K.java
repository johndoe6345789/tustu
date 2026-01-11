package br;

import G.R;
import G.ab;
import G.bM;
import G.bm;
import G.de;
import G.dm;
import G.dp;
import V.a;
import V.g;
import aE.a;
import aE.e;
import aP.hb;
import aS.l;
import ai.f;
import bH.D;
import bs.C;
import bs.f;
import c.e;
import com.efiAnalytics.apps.ts.tuningViews.J;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.cO;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import n.a;
import n.n;
import r.a;
import r.i;
import s.g;

public class K extends n implements ab, e, a {
  R a = null;
  
  ArrayList b = new ArrayList();
  
  ArrayList c = new ArrayList();
  
  f d = null;
  
  private Image f = null;
  
  O e = null;
  
  public K() {
    addChangeListener(new M(this));
    setDoubleBuffered(false);
  }
  
  public void a(R paramR) {
    ArrayList arrayList;
    k();
    removeAll();
    this.b.clear();
    if (paramR == null)
      return; 
    try {
      arrayList = J.a().a(paramR);
      if (arrayList.isEmpty())
        return; 
    } catch (g g) {
      D.a("Unable to get VE Analyze Supported tables.", (Exception)g, this);
      return;
    } 
    this.b.addAll(arrayList);
    byte b = 0;
    a a1 = a.A();
    for (String str : arrayList) {
      try {
        dm dm = J.a().a(paramR, str);
        String str1 = bM.c(paramR, str);
        str1 = g.b(str1);
        String str2 = bM.a(paramR, str);
        i i = new i(paramR, dm);
        i.a(a1);
        this.c.add(i);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 1));
        jPanel.add((Component)i);
        addTab(str1, jPanel);
        if (str2 != null && !str2.equals("")) {
          N n1 = new N(this, paramR, str2);
          a(b + "", n1);
        } else if (str2 == null && dm.d() != null && !dm.d().isEmpty()) {
          N n1 = new N(this, paramR, dm.d());
          a(b + "", n1);
        } 
        b++;
      } catch (Exception exception) {
        D.a("Definition Error! Unable to create VE Analyze for table name: " + str, exception, this);
      } 
    } 
    boolean bool = i.a().a("skj98hg9843lkfd");
    try {
      arrayList = J.a().b(paramR);
    } catch (g g) {
      D.a("Unable to get VE Analyze Supported tables.", (Exception)g, this);
      return;
    } 
    for (String str : arrayList) {
      try {
        de de = J.a().b(paramR, str);
        String str1 = "Trim Table Analyze";
        str1 = g.b(str1);
        String str2 = de.d();
        i i = new i(paramR, (dm)de);
        i.a(a1);
        this.c.add(i);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 1));
        jPanel.add((Component)i);
        addTab(str1, jPanel);
        if (str2 != null && !str2.equals("")) {
          N n1;
          if (bool) {
            n1 = new N(this, paramR, str2);
          } else {
            n1 = new N(this, paramR, "0");
          } 
          a(b + "", n1);
        } 
        b++;
      } catch (Exception exception) {
        D.a("Definition Error! Unable to create VE Analyze for table name: " + str, exception, this);
      } 
    } 
    this.b.addAll(arrayList);
    try {
      arrayList = C.a().a(paramR);
    } catch (g g) {
      D.a("Unable to get Wue Analyze Supported Curves.", (Exception)g, this);
      return;
    } 
    for (String str : arrayList) {
      try {
        dp dp = C.a().a(paramR, str);
        bm bm = (bm)paramR.e().c(str);
        String str1 = g.b(bm.M());
        String str2 = bM.a(paramR, str);
        f f1 = new f(paramR, dp);
        f1.a(a1);
        this.c.add(f1);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 1));
        jPanel.add((Component)f1);
        addTab(str1, jPanel);
        if (str2 != null && !str2.equals("")) {
          N n1 = new N(this, paramR, str2);
          a(b + "", n1);
        } 
        b++;
      } catch (Exception exception) {
        D.a("Unable to get WUE Analyze map for Curve name: " + str, exception, this);
      } 
    } 
    this.b.addAll(arrayList);
    e();
    d();
  }
  
  private void k() {
    for (bc bc : this.c) {
      try {
        bc.close();
      } catch (Exception exception) {
        D.b("Exception caught calling close listeners in VeAnalyzeTabs, caught and continuing.");
        exception.printStackTrace();
      } 
    } 
    f.a().b();
  }
  
  public void paint(Graphics paramGraphics) {
    try {
      super.paint(paramGraphics);
    } catch (Exception exception) {
      D.b("Exception Caught in VeAnalyTabs painting, this was handled. it is just here for informational purposes.");
      exception.printStackTrace();
    } 
    if (getComponentCount() == 0 && this.e == null) {
      g();
    } else if (this.e != null && getComponentCount() > 0) {
      h();
    } 
    if (this.e != null && this.e.a) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Image image = f();
      if (image != null) {
        int i = image.getWidth(null) / 2;
        int j = image.getHeight(null) / 2;
        int k = (getWidth() - i) / 2;
        int m = (getHeight() - j) / 2;
        paramGraphics.drawImage(image, k, m, i, j, null);
      } 
    } 
  }
  
  private void l() {
    if (this.d == null) {
      this.d = new f();
      bV.d("The unregistered version of " + a.b + " does not \noffer " + hb.p + "! Upgrade now to activate\nand watch " + a.b + " tune for you!\n\nSupporting all fueling models!\n\nWhether you are starting with a rough table or\nDialing in a table to perfection, Tune Analyze Live\nprovides you with the best tune by using your vehicles data.", (Component)this);
      addTab(g.b("Upgrade Today!! For " + hb.p + " and a whole lot more!"), (Component)this.d);
    } 
    File file = new File(".");
    String str = "file:///" + file.getAbsolutePath() + "/help/learnMore.html";
    try {
      this.d.b(str);
    } catch (a a1) {
      Logger.getLogger(K.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
  }
  
  public boolean a() {
    if (!i.a().a("-0ofdspok54sg")) {
      l();
      return true;
    } 
    if (this.b.isEmpty()) {
      repaint();
      L l = new L(this);
      if (SwingUtilities.isEventDispatchThread()) {
        l.run();
      } else {
        try {
          SwingUtilities.invokeAndWait(l);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(K.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } catch (InvocationTargetException invocationTargetException) {
          Logger.getLogger(K.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
        } 
      } 
      a a1 = a.a();
      boolean bool = a1.a("displayedVeAnalyzeWarning", false);
    } 
    return true;
  }
  
  public int c() {
    if (this.b.isEmpty())
      a(); 
    return this.b.isEmpty() ? -1 : (this.b.size() - 1);
  }
  
  public void a(a parama, R paramR) {
    this.a = paramR;
    paramR.h().a(this);
  }
  
  public void e_() {
    try {
      k();
    } catch (Exception exception) {
      return;
    } 
    this.b.clear();
    if (this.a != null) {
      this.a.h().b(this);
      this.a = null;
    } 
    this.c.clear();
    removeAll();
    l.a().b();
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    d();
  }
  
  public void d() {
    for (byte b = 0; b < getTabCount(); b++) {
      e e1 = (e)i().get(b + "");
      if (e1 != null) {
        boolean bool = e1.a();
        if (isEnabledAt(b) != bool)
          setEnabledAt(b, bool); 
      } 
    } 
  }
  
  public void e() {
    for (byte b = 0; b < getTabCount(); b++) {
      e e1 = (e)i().get(b + "");
      if (e1 != null) {
        boolean bool = e1.a();
        if (bool) {
          setSelectedIndex(b);
          break;
        } 
      } 
    } 
  }
  
  public void a(a parama) {}
  
  protected Image f() {
    if (this.f == null)
      try {
        this.f = cO.a().a(cO.w);
      } catch (a a1) {
        Logger.getLogger(J.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      }  
    return this.f;
  }
  
  public void g() {
    h();
    this.e = new O(this);
    this.e.start();
  }
  
  public void h() {
    if (this.e != null) {
      this.e.a();
      this.e = null;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/K.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */