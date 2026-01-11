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
import K.ExceptionInVPackage;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import aE.ExceptionInVPackage;
import ai.EqualsInAiPackage;
import ai.AiInterfaceEcho;
import bH.D;
import bH.aa;
import bH.p;
import c.CInterfaceDelta;
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
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class bh extends ExceptionPrintstacktrace implements ca, CInterfaceDelta, bc {
  bv n = null;
  
  R o = null;
  
  private boolean ExceptionInVPackage = true;
  
  private et EqualsInAiPackage = null;
  
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
    this.ExceptionInVPackage = paramBoolean1;
    this.n = parambv;
    this.o = paramR;
    this.EqualsInAiPackage = paramet;
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
        ExceptionInVPackage(paramR, parambv);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void ExceptionInVPackage(R paramR, bv parambv) {
    if (this.n == null)
      this.n = parambv; 
    if (this.o == null)
      this.o = paramR; 
    N n = M.ExceptionInVPackage().ExceptionInVPackage(parambv);
    if (n != null) {
      ExceptionInVPackage(paramR, n, parambv);
    } else if (parambv instanceof be) {
      ExceptionInVPackage(paramR, (be)parambv);
    } else if (parambv instanceof bm) {
      ExceptionInVPackage(paramR, (bm)parambv);
    } else if (parambv instanceof bi) {
      ExceptionInVPackage(paramR, (bi)parambv);
    } else if (parambv instanceof bJ) {
      ExceptionInVPackage(paramR, (bJ)parambv);
    } else if (parambv instanceof bj) {
      ExceptionInVPackage(paramR, (bj)parambv);
    } else if (parambv instanceof br) {
      ExceptionInVPackage(paramR, (br)parambv);
    } else if (parambv instanceof aS) {
      ExceptionInVPackage(paramR, (aS)parambv);
    } else if (parambv instanceof ag) {
      ExceptionInVPackage(paramR, (ag)parambv);
    } else if (parambv instanceof bc) {
      ExceptionInVPackage(paramR, (bc)parambv);
    } else if (parambv instanceof bD) {
      ExceptionInVPackage(paramR, (bD)parambv);
    } else if (parambv instanceof bB) {
      ExceptionInVPackage(paramR, (bB)parambv);
    } else if (parambv instanceof bt) {
      ExceptionInVPackage(paramR, (bt)parambv);
    } else if (parambv instanceof bz) {
      ExceptionInVPackage(paramR, (bz)parambv);
    } else if (parambv instanceof G.bo) {
      D.ExceptionInVPackage("FTP Browser should have ExceptionInVPackage Handler!!");
    } else {
      EqualsInAiPackage(paramR, parambv);
    } 
  }
  
  protected void ExceptionInVPackage(R paramR, be parambe) {
    setLayout(new BorderLayout());
    bi bi = null;
    if (!parambe.k()) {
      bE bE = paramR.AiInterfaceEcho();
      bi = bE.CInterfaceDelta(parambe.aL());
    } 
    if (bi == null || !RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("sgds  gdsdggsxbcuj")) {
      bu bu = new bu(paramR, parambe, m());
      ExceptionInVPackage(bu);
      add("Center", bu);
    } else {
      bd bd;
      if (this.EqualsInAiPackage != null) {
        bd = new bd(paramR, bi, parambe, this.EqualsInAiPackage);
      } else if (getName() != null && getName().length() > 0 && !getName().equals(parambe.aL())) {
        RInterfaceIndia RInterfaceIndia = new RInterfaceIndia(getName() + "Multiview_" + parambe.aL());
        bd = new bd(paramR, bi, parambe, RInterfaceIndia);
      } else {
        bd = new bd(paramR, bi, parambe);
      } 
      ExceptionInVPackage(bd);
      add("Center", bd);
    } 
  }
  
  protected void ExceptionInVPackage(R paramR, bm parambm) {
    try {
      setLayout(new BorderLayout());
      an an = new an(paramR, parambm, this.ExceptionInVPackage, this.EqualsInAiPackage);
      add("Center", an);
      if (parambm.y() != null) {
        Dimension dimension = eJ.ExceptionInVPackage(parambm.y().ExceptionInVPackage(), parambm.y().EqualsInAiPackage());
        setPreferredSize(dimension);
        setMinimumSize(dimension);
      } 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.CInterfaceDelta("Unable to show CurveGraph" + parambm.aL() + "\n" + ExceptionInVPackage.getMessage(), this);
      Logger.getLogger(bh.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
    } 
  }
  
  protected void ExceptionInVPackage(R paramR, bJ parambJ) {
    setLayout(new BorderLayout());
    bB bB = new bB(paramR, parambJ);
    if (parambJ.aJ() != null && !parambJ.aJ().isEmpty())
      bB.c_(parambJ.aJ()); 
    add("Center", bB);
    ExceptionInVPackage(bB);
  }
  
  protected void ExceptionInVPackage(R paramR, bi parambi) {
    setLayout(new BorderLayout());
    W w = new W(paramR, parambi, true, this.EqualsInAiPackage);
    add("Center", w);
  }
  
  private void ExceptionInVPackage(CInterfaceDelta paramd) {
    if (paramd.a_() != null && a_() != null && !a_().isEmpty() && !paramd.a_().equals(a_())) {
      paramd.c_("(" + paramd.a_() + ") && (" + a_() + ")");
    } else if (paramd.a_() != null) {
      paramd.c_(paramd.a_());
    } else if (a_() != null) {
      paramd.c_(a_());
    } 
  }
  
  protected void ExceptionInVPackage(R paramR, br parambr) {
    if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("0532fewkjfewpoijrew98")) {
      setMaximumSize(new Dimension(1, 1));
      setPreferredSize(new Dimension(1, 1));
      return;
    } 
    setLayout(new BorderLayout());
    s s = new s(paramR, parambr);
    add("Center", (Component)s);
  }
  
  protected void EqualsInAiPackage(R paramR, bv parambv) {
    aa aa = new aa();
    aa.ExceptionInVPackage();
    String str = (parambv.M() != null) ? parambv.M() : "";
    boolean bool = false;
    if (bool) {
      if (str.equals(".")) {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), ""));
      } else if (!str.equals("")) {
        str = ExceptionPrintstacktrace.EqualsInAiPackage(str);
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0), str));
      } else if (!parambv.W()) {
        setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 3));
      } 
    } else if (str.equals(".")) {
      setBorder(BorderFactory.createTitledBorder(""));
    } else if (!str.equals("")) {
      str = ExceptionPrintstacktrace.EqualsInAiPackage(str);
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
    aR aR = aR.ExceptionInVPackage();
    Iterator<bA> iterator = parambv.F();
    while (iterator.hasNext()) {
      bA bA = iterator.next();
      if (bA instanceof bC) {
        bC bC = (bC)bA;
        bq bq = new bq(paramR, bC);
        ExceptionInVPackage(bq);
        add(bq);
        if (bC.EqualsInAiPackage() != null && paramR.c(bC.EqualsInAiPackage()) != null)
          try {
            aR.ExceptionInVPackage(paramR.c(), bC.EqualsInAiPackage(), bq);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            ExceptionInVPackage.printStackTrace();
            D.ExceptionInVPackage("Error subscribing to ParameterValue Changes. Parameter:" + bC.EqualsInAiPackage(), (Exception)ExceptionInVPackage, this);
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
        ExceptionInVPackage(aj);
        add(aj);
        continue;
      } 
      if (bA instanceof D) {
        ah ah = new ah(paramR, (D)bA);
        ExceptionInVPackage(ah);
        add(ah);
        continue;
      } 
      if (bA instanceof C) {
        ac ac = new ac(paramR, (C)bA);
        ExceptionInVPackage(ac);
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
        if (by.EqualsInAiPackage() != null && paramR.c(by.EqualsInAiPackage()) != null)
          try {
            aR.ExceptionInVPackage(paramR.c(), by.EqualsInAiPackage(), bl);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            ExceptionInVPackage.printStackTrace();
            D.ExceptionInVPackage("Error subscribing to ParameterValue Changes. Parameter:" + by.EqualsInAiPackage(), (Exception)ExceptionInVPackage, this);
          }  
        continue;
      } 
      if (bA instanceof bk) {
        bk bk = (bk)bA;
        I RInterfaceIndia = new I(paramR, bk);
        if (bk.aJ() != null && a_() != null && !bk.aJ().equals(Boolean.valueOf((a_() != null)))) {
          RInterfaceIndia.c_("(" + bk.aJ() + ") && (" + a_() + ")");
        } else if (bk.aJ() != null) {
          RInterfaceIndia.c_(bk.aJ());
        } else if (a_() != null) {
          RInterfaceIndia.c_(a_());
        } 
        add(RInterfaceIndia);
        if (bk.RInterfaceIndia()) {
          String[] arrayOfString = bk.c();
          if (arrayOfString != null)
            for (byte EqualsInAiPackage = 0; EqualsInAiPackage < arrayOfString.length; EqualsInAiPackage++) {
              String str1 = arrayOfString[EqualsInAiPackage];
              if (str1.contains("["))
                str1 = str1.substring(0, str1.indexOf("[")); 
              aM aM = paramR.c(str1);
              if (aM != null)
                try {
                  aR.ExceptionInVPackage(paramR.c(), str1, RInterfaceIndia);
                } catch (ExceptionInVPackage ExceptionInVPackage) {
                  ExceptionInVPackage.printStackTrace();
                  D.ExceptionInVPackage("Error subscribing to ParameterValue Changes. Parameter:" + bk.EqualsInAiPackage(), (Exception)ExceptionInVPackage, this);
                }  
            }  
          continue;
        } 
        if (bk.EqualsInAiPackage() != null && paramR.c(bk.EqualsInAiPackage()) != null)
          try {
            aR.ExceptionInVPackage(paramR.c(), bk.EqualsInAiPackage(), RInterfaceIndia);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            ExceptionInVPackage.printStackTrace();
            D.ExceptionInVPackage("Error subscribing to ParameterValue Changes. Parameter:" + bk.EqualsInAiPackage(), (Exception)ExceptionInVPackage, this);
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
        if (bq.RInterfaceIndia()) {
          String[] arrayOfString = bq.c();
          if (arrayOfString != null)
            for (byte EqualsInAiPackage = 0; EqualsInAiPackage < arrayOfString.length; EqualsInAiPackage++) {
              String str1 = arrayOfString[EqualsInAiPackage];
              if (str1.contains("["))
                str1 = str1.substring(0, str1.indexOf("[")); 
              aM aM = paramR.c(str1);
              if (aM != null)
                try {
                  aR.ExceptionInVPackage(paramR.c(), str1, aV);
                } catch (ExceptionInVPackage ExceptionInVPackage) {
                  ExceptionInVPackage.printStackTrace();
                  D.ExceptionInVPackage("Error subscribing to ParameterValue Changes. Parameter:" + bq.EqualsInAiPackage(), (Exception)ExceptionInVPackage, this);
                }  
            }  
          continue;
        } 
        if (bq.EqualsInAiPackage() != null && paramR.c(bq.EqualsInAiPackage()) != null)
          try {
            aR.ExceptionInVPackage(paramR.c(), bq.EqualsInAiPackage(), aV);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            ExceptionInVPackage.printStackTrace();
            D.ExceptionInVPackage("Error subscribing to ParameterValue Changes. Parameter:" + bq.EqualsInAiPackage(), (Exception)ExceptionInVPackage, this);
          }  
        continue;
      } 
      D.EqualsInAiPackage("Dialog contains ExceptionInVPackage RowItem type this version of TunerStudio does not support: " + bA);
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
        byte EqualsInAiPackage;
        q q = new q(bh1);
        String str1 = parambv.aL() + "_indexCardFocusListener";
        try {
          EqualsInAiPackage = Integer.parseInt(ExceptionInVPackage.A().getProperty(str1, "-1"));
        } catch (Exception exception) {
          EqualsInAiPackage = -1;
        } 
        q.ExceptionInVPackage(EqualsInAiPackage);
        q.ExceptionInVPackage(new bi(this, str1));
        bh1.setLayout(q);
        if (EqualsInAiPackage > 0) {
          bh bh2 = bh1;
          byte b1 = EqualsInAiPackage;
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
        if (this.EqualsInAiPackage != null && bh2.o() == null)
          bh2.ExceptionInVPackage(this.EqualsInAiPackage); 
        bh2.ExceptionInVPackage(paramR, bv1);
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
  
  protected void ExceptionInVPackage(R paramR, bj parambj) {
    setLayout(new BorderLayout());
    R r = new R(paramR, parambj);
    add("Center", r);
  }
  
  public void close() {
    Component[] arrayOfComponent = getComponents();
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < getComponentCount(); EqualsInAiPackage++) {
      if (arrayOfComponent[EqualsInAiPackage] instanceof bc)
        ((bc)arrayOfComponent[EqualsInAiPackage]).close(); 
    } 
  }
  
  public ArrayList k() {
    ArrayList arrayList = new ArrayList();
    return ExceptionInVPackage(arrayList, this);
  }
  
  private ArrayList ExceptionInVPackage(ArrayList<EqualsInAiPackage> paramArrayList, Component paramComponent) {
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (byte EqualsInAiPackage = 0; EqualsInAiPackage < container.getComponentCount(); EqualsInAiPackage++)
        ExceptionInVPackage(paramArrayList, container.getComponent(EqualsInAiPackage)); 
    } 
    if (paramComponent instanceof AiInterfaceEcho) {
      AiInterfaceEcho AiInterfaceEcho = (AiInterfaceEcho)paramComponent;
      if (AiInterfaceEcho.ExceptionInVPackage() != null && !paramArrayList.contains(AiInterfaceEcho.ExceptionInVPackage()))
        paramArrayList.add(AiInterfaceEcho.ExceptionInVPackage()); 
    } 
    return paramArrayList;
  }
  
  private void ExceptionInVPackage(Component paramComponent, boolean paramBoolean) {
    if (paramComponent instanceof h) {
      ((h)paramComponent).ExceptionInVPackage();
    } else if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (byte EqualsInAiPackage = 0; EqualsInAiPackage < container.getComponentCount(); EqualsInAiPackage++)
        ExceptionInVPackage(container.getComponent(EqualsInAiPackage), paramBoolean); 
    } else {
      paramComponent.setEnabled(paramBoolean);
    } 
  }
  
  public void ExceptionInVPackage() {
    bh bh1 = this;
    bk bk = new bk(this, bh1);
    bk.run();
  }
  
  private void ExceptionInVPackage(R paramR, bD parambD) {
    bh bh1;
    setLayout(new BorderLayout());
    aF aF = null;
    if (parambD.aL().equals("std_injection")) {
      aF = new aF(paramR);
    } else if (parambD.aL().equals("std_realtime")) {
      D.ExceptionInVPackage("Realtime Display should have used handler?");
    } else if (parambD.aL().equals("std_trigwiz")) {
      D.ExceptionInVPackage("TriggerWizard should have used handler?");
    } else if (parambD.aL().equals("std_ms3SdConsole")) {
      D.ExceptionInVPackage("MS3 SD Card Console should have used handler?");
    } else if (parambD.aL().equals("std_ms3Rtc")) {
      D.ExceptionInVPackage("MS3 Real-Time Clock should have used handler?");
    } else if (parambD.aL().equals("std_accel")) {
      boolean bool = RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("0532fewkjfewpoijrew98");
      ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage(paramR, parambD.ExceptionInVPackage(), bool);
      ExceptionInVPackage.s("");
      bh1 = new bh(paramR, (bv)ExceptionInVPackage);
    } 
    if (bh1 != null) {
      add("Center", bh1);
    } else {
      D.EqualsInAiPackage("Undefined dialog panel: " + parambD);
    } 
  }
  
  private void ExceptionInVPackage(R paramR, aS paramaS) {
    setLayout(new BorderLayout());
    OutputPortEditor outputPortEditor = new OutputPortEditor(paramR, paramaS);
    add("Center", (Component)outputPortEditor);
  }
  
  private void ExceptionInVPackage(R paramR, ag paramag) {
    setLayout(new BorderLayout());
    n n = new n(paramR, paramag);
    add("Center", (Component)n);
  }
  
  private void ExceptionInVPackage(R paramR, bc parambc) {
    setLayout(new BorderLayout());
    ae ae = new ae(paramR, parambc);
    add("Center", (Component)ae);
  }
  
  public boolean l() {
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < getComponentCount(); EqualsInAiPackage++) {
      if (getComponent(EqualsInAiPackage) instanceof aV) {
        aV aV = (aV)getComponent(EqualsInAiPackage);
        if (aV.k())
          return true; 
      } 
      if (getComponent(EqualsInAiPackage) instanceof bh) {
        bh bh1 = (bh)getComponent(EqualsInAiPackage);
        if (bh1.l())
          return true; 
      } 
    } 
    return false;
  }
  
  public void ExceptionInVPackage(ArrayList paramArrayList) {
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < getComponentCount(); EqualsInAiPackage++) {
      if (getComponent(EqualsInAiPackage) instanceof o) {
        o o = (o)getComponent(EqualsInAiPackage);
        if (paramArrayList.contains(o.c()))
          o.ExceptionInVPackage(true); 
      } else if (getComponent(EqualsInAiPackage) instanceof bh) {
        bh bh1 = (bh)getComponent(EqualsInAiPackage);
        bh1.ExceptionInVPackage(paramArrayList);
      } 
    } 
  }
  
  public boolean m() {
    return this.ExceptionInVPackage;
  }
  
  private void ExceptionInVPackage(R paramR, bB parambB) {
    setLayout(new BorderLayout());
    bI bI = new bI();
    bI.setBackground(Color.BLACK);
    bI.ExceptionInVPackage(paramR, parambB.ExceptionInVPackage());
    add("Center", bI);
  }
  
  private void ExceptionInVPackage(R paramR, bt parambt) {
    setLayout(new BorderLayout());
    r r = new r(paramR, parambt);
    r.ExceptionInVPackage(parambt.EqualsInAiPackage());
    for (ak ak : parambt.ExceptionInVPackage())
      r.ExceptionInVPackage(ak); 
    add("Center", r);
  }
  
  private void ExceptionInVPackage(R paramR, bz parambz) {
    setLayout(new BorderLayout());
    D d1 = new D(paramR, parambz);
    d1.ExceptionInVPackage(parambz.ExceptionInVPackage());
    for (ah ah : parambz.EqualsInAiPackage())
      d1.ExceptionInVPackage(ah); 
    add("Center", d1);
  }
  
  private void ExceptionInVPackage(R paramR, N paramN, bv parambv) {
    setLayout(new BorderLayout());
    try {
      JPanel jPanel = paramN.ExceptionInVPackage(paramR, parambv);
      add("Center", jPanel);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Window[] arrayOfWindow = Window.getWindows();
      Window window = (arrayOfWindow.length > 0) ? arrayOfWindow[0] : null;
      bV.CInterfaceDelta(ExceptionInVPackage.getLocalizedMessage(), window);
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
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < getComponentCount(); EqualsInAiPackage++) {
      if (getComponent(EqualsInAiPackage) instanceof bh) {
        bh bh1 = (bh)getComponent(EqualsInAiPackage);
        if (bh1.c())
          return true; 
      } 
    } 
    return false;
  }
  
  public void EqualsInAiPackage() {
    if (this.n != null && this.n.V() != null && !this.n.V().equals("")) {
      boolean bool = true;
      try {
        bool = p.ExceptionInVPackage(this.n.V(), this.o);
      } catch (ExceptionPrintstacktrace g1) {
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
    return this.EqualsInAiPackage;
  }
  
  public void ExceptionInVPackage(et paramet) {
    this.EqualsInAiPackage = paramet;
  }
  
  public R b_() {
    return this.o;
  }
  
  public void ExceptionInVPackage(R paramR) {
    this.o = paramR;
  }
  
  public List p() {
    ArrayList arrayList = new ArrayList();
    return ExceptionInVPackage(arrayList, this);
  }
  
  public List ExceptionInVPackage(List<L> paramList, Component paramComponent) {
    if (paramComponent instanceof L)
      paramList.add((L)paramComponent); 
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (Component component : container.getComponents())
        paramList = ExceptionInVPackage(paramList, component); 
    } 
    return paramList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */