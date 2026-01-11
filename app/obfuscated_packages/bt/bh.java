package bt;

import G.C;
import G.D;
import G.E;
import G.R;
import G.aM;
import G.aR;
import G.aS;
import G.ag;
import G.ah;
import G.ak;
import G.bA;
import G.bB;
import G.bC;
import G.bD;
import G.bE;
import G.bJ;
import G.bc;
import G.be;
import G.bi;
import G.bj;
import G.bk;
import G.bl;
import G.bm;
import G.bq;
import G.br;
import G.bt;
import G.bv;
import G.bx;
import G.by;
import G.bz;
import K.a;
import V.a;
import V.g;
import aE.a;
import ai.b;
import ai.e;
import bH.D;
import bH.aa;
import bH.p;
import c.d;
import com.efiAnalytics.tuningwidgets.panels.aF;
import com.efiAnalytics.tuningwidgets.panels.ae;
import com.efiAnalytics.tuningwidgets.panels.n;
import com.efiAnalytics.tuningwidgets.portEditor.OutputPortEditor;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import r.i;
import s.g;

public class bh extends g implements ca, d, bc {
  bv n = null;
  
  R o = null;
  
  private boolean a = true;
  
  private et b = null;
  
  public bh() {}
  
  public bh(R paramR, bv parambv) {
    this(paramR, parambv, true);
  }
  
  public bh(R paramR, bv parambv, String paramString, et paramet) {
    this(paramR, parambv, true, true, (String)null, paramet);
  }
  
  public bh(R paramR, bv parambv, boolean paramBoolean) {
    this(paramR, parambv, paramBoolean, true, (String)null);
  }
  
  private bh(R paramR, bv parambv, boolean paramBoolean1, boolean paramBoolean2, String paramString) {
    this(paramR, parambv, paramBoolean1, paramBoolean2, paramString, (et)null);
  }
  
  private bh(R paramR, bv parambv, boolean paramBoolean1, boolean paramBoolean2, String paramString, et paramet) {
    this.a = paramBoolean1;
    this.n = parambv;
    this.o = paramR;
    this.b = paramet;
    if (paramString == null || paramString.isEmpty()) {
      if (parambv.aL().isEmpty() && parambv.L()) {
        Iterator<bv> iterator = parambv.K();
        while (iterator.hasNext()) {
          bv bv1 = iterator.next();
          if (bv1.aL() != null && !bv1.aL().isEmpty())
            setName(bv1.aL()); 
        } 
      } else {
        setName(parambv.aL());
      } 
    } else {
      setName(paramString);
    } 
    if (paramBoolean2)
      try {
        a(paramR, parambv);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void a(R paramR, bv parambv) {
    if (this.n == null)
      this.n = parambv; 
    if (this.o == null)
      this.o = paramR; 
    N n = M.a().a(parambv);
    if (n != null) {
      a(paramR, n, parambv);
    } else if (parambv instanceof be) {
      a(paramR, (be)parambv);
    } else if (parambv instanceof bm) {
      a(paramR, (bm)parambv);
    } else if (parambv instanceof bi) {
      a(paramR, (bi)parambv);
    } else if (parambv instanceof bJ) {
      a(paramR, (bJ)parambv);
    } else if (parambv instanceof bj) {
      a(paramR, (bj)parambv);
    } else if (parambv instanceof br) {
      a(paramR, (br)parambv);
    } else if (parambv instanceof aS) {
      a(paramR, (aS)parambv);
    } else if (parambv instanceof ag) {
      a(paramR, (ag)parambv);
    } else if (parambv instanceof bc) {
      a(paramR, (bc)parambv);
    } else if (parambv instanceof bD) {
      a(paramR, (bD)parambv);
    } else if (parambv instanceof bB) {
      a(paramR, (bB)parambv);
    } else if (parambv instanceof bt) {
      a(paramR, (bt)parambv);
    } else if (parambv instanceof bz) {
      a(paramR, (bz)parambv);
    } else if (parambv instanceof G.bo) {
      D.a("FTP Browser should have a Handler!!");
    } else {
      b(paramR, parambv);
    } 
  }
  
  protected void a(R paramR, be parambe) {
    setLayout(new BorderLayout());
    bi bi = null;
    if (!parambe.k()) {
      bE bE = paramR.e();
      bi = bE.d(parambe.aL());
    } 
    if (bi == null || !i.a().a("sgds  gdsdggsxbcuj")) {
      bu bu = new bu(paramR, parambe, m());
      a(bu);
      add("Center", bu);
    } else {
      bd bd;
      if (this.b != null) {
        bd = new bd(paramR, bi, parambe, this.b);
      } else if (getName() != null && getName().length() > 0 && !getName().equals(parambe.aL())) {
        i i = new i(getName() + "Multiview_" + parambe.aL());
        bd = new bd(paramR, bi, parambe, i);
      } else {
        bd = new bd(paramR, bi, parambe);
      } 
      a(bd);
      add("Center", bd);
    } 
  }
  
  protected void a(R paramR, bm parambm) {
    try {
      setLayout(new BorderLayout());
      an an = new an(paramR, parambm, this.a, this.b);
      add("Center", an);
      if (parambm.y() != null) {
        Dimension dimension = eJ.a(parambm.y().a(), parambm.y().b());
        setPreferredSize(dimension);
        setMinimumSize(dimension);
      } 
    } catch (a a) {
      bV.d("Unable to show CurveGraph" + parambm.aL() + "\n" + a.getMessage(), this);
      Logger.getLogger(bh.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
  }
  
  protected void a(R paramR, bJ parambJ) {
    setLayout(new BorderLayout());
    bB bB = new bB(paramR, parambJ);
    if (parambJ.aJ() != null && !parambJ.aJ().isEmpty())
      bB.c_(parambJ.aJ()); 
    add("Center", bB);
    a(bB);
  }
  
  protected void a(R paramR, bi parambi) {
    setLayout(new BorderLayout());
    W w = new W(paramR, parambi, true, this.b);
    add("Center", w);
  }
  
  private void a(d paramd) {
    if (paramd.a_() != null && a_() != null && !a_().isEmpty() && !paramd.a_().equals(a_())) {
      paramd.c_("(" + paramd.a_() + ") && (" + a_() + ")");
    } else if (paramd.a_() != null) {
      paramd.c_(paramd.a_());
    } else if (a_() != null) {
      paramd.c_(a_());
    } 
  }
  
  protected void a(R paramR, br parambr) {
    if (!i.a().a("0532fewkjfewpoijrew98")) {
      setMaximumSize(new Dimension(1, 1));
      setPreferredSize(new Dimension(1, 1));
      return;
    } 
    setLayout(new BorderLayout());
    s s = new s(paramR, parambr);
    add("Center", (Component)s);
  }
  
  protected void b(R paramR, bv parambv) {
    aa aa = new aa();
    aa.a();
    String str = (parambv.M() != null) ? parambv.M() : "";
    boolean bool = false;
    if (bool) {
      if (str.equals(".")) {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), ""));
      } else if (!str.equals("")) {
        str = g.b(str);
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
      } else if (!parambv.W()) {
        setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 3));
      } 
    } else if (str.equals(".")) {
      setBorder(BorderFactory.createTitledBorder(""));
    } else if (!str.equals("")) {
      str = g.b(str);
      setBorder(BorderFactory.createTitledBorder(str));
    } else if (!parambv.W()) {
      setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 3));
    } 
    if (a_() == null)
      c_(parambv.aJ()); 
    if (parambv.R() == 0) {
      setLayout(new BoxLayout(this, 0));
    } else if (parambv.R() == 1) {
      if (parambv.Z() == 1 && parambv.H() == 0) {
        setLayout(new GridLayout());
      } else {
        setLayout(new BoxLayout(this, 1));
      } 
    } else if (parambv.R() == 2) {
      setLayout(new BorderLayout(5, 5));
    } else if (parambv.R() == 3) {
      setLayout(new GridLayout(1, 1));
    } else if (parambv.R() == 4) {
      setLayout(new GridLayout(1, 1));
    } 
    aR aR = aR.a();
    Iterator<bA> iterator = parambv.F();
    while (iterator.hasNext()) {
      bA bA = iterator.next();
      if (bA instanceof bC) {
        bC bC = (bC)bA;
        bq bq = new bq(paramR, bC);
        a(bq);
        add(bq);
        if (bC.b() != null && paramR.c(bC.b()) != null)
          try {
            aR.a(paramR.c(), bC.b(), bq);
          } catch (a a) {
            a.printStackTrace();
            D.a("Error subscribing to ParameterValue Changes. Parameter:" + bC.b(), (Exception)a, this);
          }  
        continue;
      } 
      if (bA instanceof bx) {
        bp bp = new bp(paramR, (bx)bA);
        add(bp);
        continue;
      } 
      if (bA instanceof bl) {
        ak ak = new ak(paramR, (bl)bA);
        add(ak);
        continue;
      } 
      if (bA instanceof E) {
        aj aj = new aj(paramR, (E)bA);
        a(aj);
        add(aj);
        continue;
      } 
      if (bA instanceof D) {
        ah ah = new ah(paramR, (D)bA);
        a(ah);
        add(ah);
        continue;
      } 
      if (bA instanceof C) {
        ac ac = new ac(paramR, (C)bA);
        a(ac);
        add(ac);
        continue;
      } 
      if (bA instanceof by) {
        by by = (by)bA;
        bl bl = new bl(paramR, by);
        if (by.aJ() != null && a_() != null && !by.aJ().equals(Boolean.valueOf((a_() != null)))) {
          bl.c_("(" + by.aJ() + ") && (" + a_() + ")");
        } else if (by.aJ() != null) {
          bl.c_(by.aJ());
        } else if (a_() != null) {
          bl.c_(a_());
        } 
        add(bl);
        if (by.b() != null && paramR.c(by.b()) != null)
          try {
            aR.a(paramR.c(), by.b(), bl);
          } catch (a a) {
            a.printStackTrace();
            D.a("Error subscribing to ParameterValue Changes. Parameter:" + by.b(), (Exception)a, this);
          }  
        continue;
      } 
      if (bA instanceof bk) {
        bk bk = (bk)bA;
        I i = new I(paramR, bk);
        if (bk.aJ() != null && a_() != null && !bk.aJ().equals(Boolean.valueOf((a_() != null)))) {
          i.c_("(" + bk.aJ() + ") && (" + a_() + ")");
        } else if (bk.aJ() != null) {
          i.c_(bk.aJ());
        } else if (a_() != null) {
          i.c_(a_());
        } 
        add(i);
        if (bk.i()) {
          String[] arrayOfString = bk.c();
          if (arrayOfString != null)
            for (byte b = 0; b < arrayOfString.length; b++) {
              String str1 = arrayOfString[b];
              if (str1.contains("["))
                str1 = str1.substring(0, str1.indexOf("[")); 
              aM aM = paramR.c(str1);
              if (aM != null)
                try {
                  aR.a(paramR.c(), str1, i);
                } catch (a a) {
                  a.printStackTrace();
                  D.a("Error subscribing to ParameterValue Changes. Parameter:" + bk.b(), (Exception)a, this);
                }  
            }  
          continue;
        } 
        if (bk.b() != null && paramR.c(bk.b()) != null)
          try {
            aR.a(paramR.c(), bk.b(), i);
          } catch (a a) {
            a.printStackTrace();
            D.a("Error subscribing to ParameterValue Changes. Parameter:" + bk.b(), (Exception)a, this);
          }  
        continue;
      } 
      if (bA instanceof bq) {
        bq bq = (bq)bA;
        aV aV = new aV(paramR, bq);
        if (bq.aJ() != null && a_() != null && !bq.aJ().equals(Boolean.valueOf((a_() != null)))) {
          aV.c_("(" + bq.aJ() + ") && (" + a_() + ")");
        } else if (bq.aJ() != null) {
          aV.c_(bq.aJ());
        } else if (a_() != null) {
          aV.c_(a_());
        } 
        add(aV);
        if (bq.i()) {
          String[] arrayOfString = bq.c();
          if (arrayOfString != null)
            for (byte b = 0; b < arrayOfString.length; b++) {
              String str1 = arrayOfString[b];
              if (str1.contains("["))
                str1 = str1.substring(0, str1.indexOf("[")); 
              aM aM = paramR.c(str1);
              if (aM != null)
                try {
                  aR.a(paramR.c(), str1, aV);
                } catch (a a) {
                  a.printStackTrace();
                  D.a("Error subscribing to ParameterValue Changes. Parameter:" + bq.b(), (Exception)a, this);
                }  
            }  
          continue;
        } 
        if (bq.b() != null && paramR.c(bq.b()) != null)
          try {
            aR.a(paramR.c(), bq.b(), aV);
          } catch (a a) {
            a.printStackTrace();
            D.a("Error subscribing to ParameterValue Changes. Parameter:" + bq.b(), (Exception)a, this);
          }  
        continue;
      } 
      D.b("Dialog contains a RowItem type this version of TunerStudio does not support: " + bA);
    } 
    if (parambv.L()) {
      bh bh1 = new bh();
      bh1.o = paramR;
      if (parambv.R() == 0) {
        bh1.setLayout(new BoxLayout(bh1, 0));
      } else if (parambv.R() == 1) {
        if (parambv.Z() == 1 && parambv.H() == 0) {
          bh1.setLayout(new GridLayout());
        } else {
          bh1.setLayout(new BoxLayout(bh1, 1));
        } 
      } else if (parambv.R() == 2) {
        bh1.setLayout(new BorderLayout());
      } else if (parambv.R() == 3) {
        bh1.setLayout(new CardLayout());
      } else if (parambv.R() == 4) {
        byte b;
        q q = new q(bh1);
        String str1 = parambv.aL() + "_indexCardFocusListener";
        try {
          b = Integer.parseInt(a.A().getProperty(str1, "-1"));
        } catch (Exception exception) {
          b = -1;
        } 
        q.a(b);
        q.a(new bi(this, str1));
        bh1.setLayout(q);
        if (b > 0) {
          bh bh2 = bh1;
          byte b1 = b;
          bj bj = new bj(this, bh2, b1);
          SwingUtilities.invokeLater(bj);
        } 
      } 
      Iterator<bv> iterator1 = parambv.K();
      while (iterator1.hasNext()) {
        bv bv1 = iterator1.next();
        bh bh2 = new bh(paramR, bv1, m(), false, null);
        if (bv1.aJ() != null && a_() != null && !bv1.aJ().equals(a_())) {
          bh2.c_("(" + bv1.aJ() + ") && (" + a_() + ")");
        } else if (bv1.aJ() != null) {
          bh2.c_(bh2.a_());
        } else if (a_() != null) {
          bh2.c_(a_());
        } 
        if (this.b != null && bh2.o() == null)
          bh2.a(this.b); 
        bh2.a(paramR, bv1);
        if (bh1.getLayout() instanceof BorderLayout) {
          bh1.add(bh2, bv1.Q());
          continue;
        } 
        if (bh1.getLayout() instanceof CardLayout) {
          if (bv1.Q().equals("Default")) {
            bh1.add(bh2, "Default");
            continue;
          } 
          bh1.add(bh2, bh2.getName());
          continue;
        } 
        bh1.add(bh2);
      } 
      if (getLayout() instanceof BorderLayout) {
        add(bh1, "Center");
      } else {
        add(bh1);
      } 
    } 
  }
  
  protected void a(R paramR, bj parambj) {
    setLayout(new BorderLayout());
    R r = new R(paramR, parambj);
    add("Center", r);
  }
  
  public void close() {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < getComponentCount(); b++) {
      if (arrayOfComponent[b] instanceof bc)
        ((bc)arrayOfComponent[b]).close(); 
    } 
  }
  
  public ArrayList k() {
    ArrayList arrayList = new ArrayList();
    return a(arrayList, this);
  }
  
  private ArrayList a(ArrayList<b> paramArrayList, Component paramComponent) {
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (byte b = 0; b < container.getComponentCount(); b++)
        a(paramArrayList, container.getComponent(b)); 
    } 
    if (paramComponent instanceof e) {
      e e = (e)paramComponent;
      if (e.a() != null && !paramArrayList.contains(e.a()))
        paramArrayList.add(e.a()); 
    } 
    return paramArrayList;
  }
  
  private void a(Component paramComponent, boolean paramBoolean) {
    if (paramComponent instanceof h) {
      ((h)paramComponent).a();
    } else if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (byte b = 0; b < container.getComponentCount(); b++)
        a(container.getComponent(b), paramBoolean); 
    } else {
      paramComponent.setEnabled(paramBoolean);
    } 
  }
  
  public void a() {
    bh bh1 = this;
    bk bk = new bk(this, bh1);
    bk.run();
  }
  
  private void a(R paramR, bD parambD) {
    bh bh1;
    setLayout(new BorderLayout());
    aF aF = null;
    if (parambD.aL().equals("std_injection")) {
      aF = new aF(paramR);
    } else if (parambD.aL().equals("std_realtime")) {
      D.a("Realtime Display should have used handler?");
    } else if (parambD.aL().equals("std_trigwiz")) {
      D.a("TriggerWizard should have used handler?");
    } else if (parambD.aL().equals("std_ms3SdConsole")) {
      D.a("MS3 SD Card Console should have used handler?");
    } else if (parambD.aL().equals("std_ms3Rtc")) {
      D.a("MS3 Real-Time Clock should have used handler?");
    } else if (parambD.aL().equals("std_accel")) {
      boolean bool = i.a().a("0532fewkjfewpoijrew98");
      a a = new a(paramR, parambD.a(), bool);
      a.s("");
      bh1 = new bh(paramR, (bv)a);
    } 
    if (bh1 != null) {
      add("Center", bh1);
    } else {
      D.b("Undefined dialog panel: " + parambD);
    } 
  }
  
  private void a(R paramR, aS paramaS) {
    setLayout(new BorderLayout());
    OutputPortEditor outputPortEditor = new OutputPortEditor(paramR, paramaS);
    add("Center", (Component)outputPortEditor);
  }
  
  private void a(R paramR, ag paramag) {
    setLayout(new BorderLayout());
    n n = new n(paramR, paramag);
    add("Center", (Component)n);
  }
  
  private void a(R paramR, bc parambc) {
    setLayout(new BorderLayout());
    ae ae = new ae(paramR, parambc);
    add("Center", (Component)ae);
  }
  
  public boolean l() {
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof aV) {
        aV aV = (aV)getComponent(b);
        if (aV.k())
          return true; 
      } 
      if (getComponent(b) instanceof bh) {
        bh bh1 = (bh)getComponent(b);
        if (bh1.l())
          return true; 
      } 
    } 
    return false;
  }
  
  public void a(ArrayList paramArrayList) {
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof o) {
        o o = (o)getComponent(b);
        if (paramArrayList.contains(o.c()))
          o.a(true); 
      } else if (getComponent(b) instanceof bh) {
        bh bh1 = (bh)getComponent(b);
        bh1.a(paramArrayList);
      } 
    } 
  }
  
  public boolean m() {
    return this.a;
  }
  
  private void a(R paramR, bB parambB) {
    setLayout(new BorderLayout());
    bI bI = new bI();
    bI.setBackground(Color.BLACK);
    bI.a(paramR, parambB.a());
    add("Center", bI);
  }
  
  private void a(R paramR, bt parambt) {
    setLayout(new BorderLayout());
    r r = new r(paramR, parambt);
    r.a(parambt.b());
    for (ak ak : parambt.a())
      r.a(ak); 
    add("Center", r);
  }
  
  private void a(R paramR, bz parambz) {
    setLayout(new BorderLayout());
    D d1 = new D(paramR, parambz);
    d1.a(parambz.a());
    for (ah ah : parambz.b())
      d1.a(ah); 
    add("Center", d1);
  }
  
  private void a(R paramR, N paramN, bv parambv) {
    setLayout(new BorderLayout());
    try {
      JPanel jPanel = paramN.a(paramR, parambv);
      add("Center", jPanel);
    } catch (a a) {
      Window[] arrayOfWindow = Window.getWindows();
      Window window = (arrayOfWindow.length > 0) ? arrayOfWindow[0] : null;
      bV.d(a.getLocalizedMessage(), window);
    } 
  }
  
  public String a_() {
    return (this.n == null) ? "" : super.a_();
  }
  
  public boolean n() {
    return (l() || c());
  }
  
  public boolean hasFocus() {
    return (getComponentCount() == 1) ? getComponent(0).hasFocus() : super.hasFocus();
  }
  
  private boolean c() {
    for (byte b = 0; b < getComponentCount(); b++) {
      if (getComponent(b) instanceof bh) {
        bh bh1 = (bh)getComponent(b);
        if (bh1.c())
          return true; 
      } 
    } 
    return false;
  }
  
  public void b() {
    if (this.n != null && this.n.V() != null && !this.n.V().equals("")) {
      boolean bool = true;
      try {
        bool = p.a(this.n.V(), this.o);
      } catch (g g1) {
        Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g1);
      } 
      if (isVisible() && !bool) {
        setVisible(false);
        if (getParent() instanceof JPanel)
          ((JPanel)getParent()).revalidate(); 
      } else if (!isVisible() && bool) {
        setVisible(true);
        if (getParent() instanceof JPanel)
          ((JPanel)getParent()).revalidate(); 
      } 
    } 
  }
  
  public et o() {
    return this.b;
  }
  
  public void a(et paramet) {
    this.b = paramet;
  }
  
  public R b_() {
    return this.o;
  }
  
  public void a(R paramR) {
    this.o = paramR;
  }
  
  public List p() {
    ArrayList arrayList = new ArrayList();
    return a(arrayList, this);
  }
  
  public List a(List<L> paramList, Component paramComponent) {
    if (paramComponent instanceof L)
      paramList.add((L)paramComponent); 
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (Component component : container.getComponents())
        paramList = a(paramList, component); 
    } 
    return paramList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */