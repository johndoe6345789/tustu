package GInterfaceBt;

import G.Abstract;
import G.ArrayListExceptionprintstacktrace;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.C;
import G.CloneableImpl;
import G.CloneableImplInGPackage;
import G.D;
import G.E;
import G.Exceptionprintstacktrace;
import G.GComponentAg;
import G.GComponentBc;
import G.GComponentBj;
import G.GComponentBk;
import G.GComponentBl;
import G.GComponentBq;
import G.GComponentBx;
import G.GComponentBy;
import G.GComponentBz;
import G.GInterfaceAh;
import G.GInterfaceBb;
import G.GInterfaceBc;
import G.GInterfaceBd;
import G.GInterfaceBe;
import G.GInterfaceBi;
import G.GInterfaceBj;
import G.GInterfaceBr;
import G.GInterfaceBt;
import G.Manager;
import G.ManagerUsingConcurrentHashMap;
import G.R;
import K.ExceptionInVPackage;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import aE.ExceptionInVPackage;
import ai.AiInterfaceEcho;
import ai.EqualsInAiPackage;
import bH.D;
import bH.aa;
import bH.p;
import c.CInterfaceDelta;
import com.efiAnalytics.tuningwidgets.panels.aF;
import com.efiAnalytics.tuningwidgets.panels.ae;
import com.efiAnalytics.tuningwidgets.panels.n;
import com.efiAnalytics.tuningwidgets.portEditor.OutputPortEditor;
import com.efiAnalytics.ui.GComponentBc;
import com.efiAnalytics.ui.bV;
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

public class ExceptionEqualsinaipackage extends ExceptionPrintstacktrace
    implements ca, CInterfaceDelta, GComponentBc {
  ArrayListExceptionprintstacktraceInGPackage n = null;

  R o = null;

  private boolean ExceptionInVPackage = true;

  private et EqualsInAiPackage = null;

  public ExceptionEqualsinaipackage() {}

  public ExceptionEqualsinaipackage(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv) {
    this(paramR, parambv, true);
  }

  public ExceptionEqualsinaipackage(
      R paramR,
      ArrayListExceptionprintstacktraceInGPackage parambv,
      String paramString,
      et paramet) {
    this(paramR, parambv, true, true, (String) null, paramet);
  }

  public ExceptionEqualsinaipackage(
      R paramR, ArrayListExceptionprintstacktraceInGPackage parambv, boolean paramBoolean) {
    this(paramR, parambv, paramBoolean, true, (String) null);
  }

  private ExceptionEqualsinaipackage(
      R paramR,
      ArrayListExceptionprintstacktraceInGPackage parambv,
      boolean paramBoolean1,
      boolean paramBoolean2,
      String paramString) {
    this(paramR, parambv, paramBoolean1, paramBoolean2, paramString, (et) null);
  }

  private ExceptionEqualsinaipackage(
      R paramR,
      ArrayListExceptionprintstacktraceInGPackage parambv,
      boolean paramBoolean1,
      boolean paramBoolean2,
      String paramString,
      et paramet) {
    this.ExceptionInVPackage = paramBoolean1;
    this.n = parambv;
    this.o = paramR;
    this.EqualsInAiPackage = paramet;
    if (paramString == null || paramString.isEmpty()) {
      if (parambv.aL().isEmpty() && parambv.L()) {
        Iterator<ArrayListExceptionprintstacktraceInGPackage> iterator = parambv.K();
        while (iterator.hasNext()) {
          ArrayListExceptionprintstacktraceInGPackage bv1 = iterator.next();
          if (bv1.aL() != null && !bv1.aL().isEmpty()) setName(bv1.aL());
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

  public void ExceptionInVPackage(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv) {
    if (this.n == null) this.n = parambv;
    if (this.o == null) this.o = paramR;
    N n = M.ExceptionInVPackage().ExceptionInVPackage(parambv);
    if (n != null) {
      ExceptionInVPackage(paramR, n, parambv);
    } else if (parambv instanceof CloneableImpl) {
      ExceptionInVPackage(paramR, (CloneableImpl) parambv);
    } else if (parambv instanceof CloneableImplInGPackage) {
      ExceptionInVPackage(paramR, (CloneableImplInGPackage) parambv);
    } else if (parambv instanceof GInterfaceBi) {
      ExceptionInVPackage(paramR, (GInterfaceBi) parambv);
    } else if (parambv instanceof GInterfaceBj) {
      ExceptionInVPackage(paramR, (GInterfaceBj) parambv);
    } else if (parambv instanceof GComponentBj) {
      ExceptionInVPackage(paramR, (GComponentBj) parambv);
    } else if (parambv instanceof GInterfaceBr) {
      ExceptionInVPackage(paramR, (GInterfaceBr) parambv);
    } else if (parambv instanceof ArrayListExceptionprintstacktrace) {
      ExceptionInVPackage(paramR, (ArrayListExceptionprintstacktrace) parambv);
    } else if (parambv instanceof GComponentAg) {
      ExceptionInVPackage(paramR, (GComponentAg) parambv);
    } else if (parambv instanceof GComponentBc) {
      ExceptionInVPackage(paramR, (GComponentBc) parambv);
    } else if (parambv instanceof GInterfaceBd) {
      ExceptionInVPackage(paramR, (GInterfaceBd) parambv);
    } else if (parambv instanceof GInterfaceBb) {
      ExceptionInVPackage(paramR, (GInterfaceBb) parambv);
    } else if (parambv instanceof GInterfaceBt) {
      ExceptionInVPackage(paramR, (GInterfaceBt) parambv);
    } else if (parambv instanceof GComponentBz) {
      ExceptionInVPackage(paramR, (GComponentBz) parambv);
    } else if (parambv instanceof G.bo) {
      D.ExceptionInVPackage("FTP Browser should have ExceptionInVPackage Handler!!");
    } else {
      EqualsInAiPackage(paramR, parambv);
    }
  }

  protected void ExceptionInVPackage(R paramR, CloneableImpl parambe) {
    setLayout(new BorderLayout());
    GInterfaceBi GInterfaceBi = null;
    if (!parambe.k()) {
      GInterfaceBe GInterfaceBe = paramR.AiInterfaceEcho();
      GInterfaceBi = GInterfaceBe.CInterfaceDelta(parambe.aL());
    }
    if (GInterfaceBi == null
        || !RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("sgds  gdsdggsxbcuj")) {
      bu bu = new bu(paramR, parambe, m());
      ExceptionInVPackage(bu);
      add("Center", bu);
    } else {
      bd bd;
      if (this.EqualsInAiPackage != null) {
        bd = new bd(paramR, GInterfaceBi, parambe, this.EqualsInAiPackage);
      } else if (getName() != null && getName().length() > 0 && !getName().equals(parambe.aL())) {
        RInterfaceIndia RInterfaceIndia =
            new RInterfaceIndia(getName() + "Multiview_" + parambe.aL());
        bd = new bd(paramR, GInterfaceBi, parambe, RInterfaceIndia);
      } else {
        bd = new bd(paramR, GInterfaceBi, parambe);
      }
      ExceptionInVPackage(bd);
      add("Center", bd);
    }
  }

  protected void ExceptionInVPackage(R paramR, CloneableImplInGPackage parambm) {
    try {
      setLayout(new BorderLayout());
      an an = new an(paramR, parambm, this.ExceptionInVPackage, this.EqualsInAiPackage);
      add("Center", an);
      if (parambm.y() != null) {
        Dimension dimension =
            eJ.ExceptionInVPackage(
                parambm.y().ExceptionInVPackage(), parambm.y().EqualsInAiPackage());
        setPreferredSize(dimension);
        setMinimumSize(dimension);
      }
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.CInterfaceDelta(
          "Unable to show CurveGraph" + parambm.aL() + "\n" + ExceptionInVPackage.getMessage(),
          this);
      Logger.getLogger(bh.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
    }
  }

  protected void ExceptionInVPackage(R paramR, GInterfaceBj parambJ) {
    setLayout(new BorderLayout());
    GInterfaceBb GInterfaceBb = new GInterfaceBb(paramR, parambJ);
    if (parambJ.aJ() != null && !parambJ.aJ().isEmpty()) GInterfaceBb.c_(parambJ.aJ());
    add("Center", GInterfaceBb);
    ExceptionInVPackage(GInterfaceBb);
  }

  protected void ExceptionInVPackage(R paramR, GInterfaceBi parambi) {
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

  protected void ExceptionInVPackage(R paramR, GInterfaceBr parambr) {
    if (!RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("0532fewkjfewpoijrew98")) {
      setMaximumSize(new Dimension(1, 1));
      setPreferredSize(new Dimension(1, 1));
      return;
    }
    setLayout(new BorderLayout());
    s s = new s(paramR, parambr);
    add("Center", (Component) s);
  }

  protected void EqualsInAiPackage(R paramR, ArrayListExceptionprintstacktraceInGPackage parambv) {
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
    if (a_() == null) c_(parambv.aJ());
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
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap =
        ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    Iterator<Abstract> iterator = parambv.F();
    while (iterator.hasNext()) {
      Abstract Abstract = iterator.next();
      if (Abstract instanceof GInterfaceBc) {
        GInterfaceBc GInterfaceBc = (GInterfaceBc) Abstract;
        GComponentBq GComponentBq = new GComponentBq(paramR, GInterfaceBc);
        ExceptionInVPackage(GComponentBq);
        add(GComponentBq);
        if (GInterfaceBc.EqualsInAiPackage() != null
            && paramR.c(GInterfaceBc.EqualsInAiPackage()) != null)
          try {
            ManagerUsingConcurrentHashMap.ExceptionInVPackage(
                paramR.c(), GInterfaceBc.EqualsInAiPackage(), GComponentBq);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            ExceptionInVPackage.printStackTrace();
            D.ExceptionInVPackage(
                "Error subscribing to ParameterValue Changes. Parameter:"
                    + GInterfaceBc.EqualsInAiPackage(),
                (Exception) ExceptionInVPackage,
                this);
          }
        continue;
      }
      if (Abstract instanceof GComponentBx) {
        bp bp = new bp(paramR, (GComponentBx) Abstract);
        add(bp);
        continue;
      }
      if (Abstract instanceof GComponentBl) {
        Exceptionprintstacktrace Exceptionprintstacktrace =
            new Exceptionprintstacktrace(paramR, (GComponentBl) Abstract);
        add(Exceptionprintstacktrace);
        continue;
      }
      if (Abstract instanceof E) {
        aj aj = new aj(paramR, (E) Abstract);
        ExceptionInVPackage(aj);
        add(aj);
        continue;
      }
      if (Abstract instanceof D) {
        GInterfaceAh GInterfaceAh = new GInterfaceAh(paramR, (D) Abstract);
        ExceptionInVPackage(GInterfaceAh);
        add(GInterfaceAh);
        continue;
      }
      if (Abstract instanceof C) {
        ac ac = new ac(paramR, (C) Abstract);
        ExceptionInVPackage(ac);
        add(ac);
        continue;
      }
      if (Abstract instanceof GComponentBy) {
        GComponentBy GComponentBy = (GComponentBy) Abstract;
        GComponentBl GComponentBl = new GComponentBl(paramR, GComponentBy);
        if (GComponentBy.aJ() != null
            && a_() != null
            && !GComponentBy.aJ().equals(Boolean.valueOf((a_() != null)))) {
          GComponentBl.c_("(" + GComponentBy.aJ() + ") && (" + a_() + ")");
        } else if (GComponentBy.aJ() != null) {
          GComponentBl.c_(GComponentBy.aJ());
        } else if (a_() != null) {
          GComponentBl.c_(a_());
        }
        add(GComponentBl);
        if (GComponentBy.EqualsInAiPackage() != null
            && paramR.c(GComponentBy.EqualsInAiPackage()) != null)
          try {
            ManagerUsingConcurrentHashMap.ExceptionInVPackage(
                paramR.c(), GComponentBy.EqualsInAiPackage(), GComponentBl);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            ExceptionInVPackage.printStackTrace();
            D.ExceptionInVPackage(
                "Error subscribing to ParameterValue Changes. Parameter:"
                    + GComponentBy.EqualsInAiPackage(),
                (Exception) ExceptionInVPackage,
                this);
          }
        continue;
      }
      if (Abstract instanceof GComponentBk) {
        GComponentBk GComponentBk = (GComponentBk) Abstract;
        I RInterfaceIndia = new I(paramR, GComponentBk);
        if (GComponentBk.aJ() != null
            && a_() != null
            && !GComponentBk.aJ().equals(Boolean.valueOf((a_() != null)))) {
          RInterfaceIndia.c_("(" + GComponentBk.aJ() + ") && (" + a_() + ")");
        } else if (GComponentBk.aJ() != null) {
          RInterfaceIndia.c_(GComponentBk.aJ());
        } else if (a_() != null) {
          RInterfaceIndia.c_(a_());
        }
        add(RInterfaceIndia);
        if (GComponentBk.RInterfaceIndia()) {
          String[] arrayOfString = GComponentBk.c();
          if (arrayOfString != null)
            for (byte EqualsInAiPackage = 0;
                EqualsInAiPackage < arrayOfString.length;
                EqualsInAiPackage++) {
              String str1 = arrayOfString[EqualsInAiPackage];
              if (str1.contains("[")) str1 = str1.substring(0, str1.indexOf("["));
              Manager Manager = paramR.c(str1);
              if (Manager != null)
                try {
                  ManagerUsingConcurrentHashMap.ExceptionInVPackage(
                      paramR.c(), str1, RInterfaceIndia);
                } catch (ExceptionInVPackage ExceptionInVPackage) {
                  ExceptionInVPackage.printStackTrace();
                  D.ExceptionInVPackage(
                      "Error subscribing to ParameterValue Changes. Parameter:"
                          + GComponentBk.EqualsInAiPackage(),
                      (Exception) ExceptionInVPackage,
                      this);
                }
            }
          continue;
        }
        if (GComponentBk.EqualsInAiPackage() != null
            && paramR.c(GComponentBk.EqualsInAiPackage()) != null)
          try {
            ManagerUsingConcurrentHashMap.ExceptionInVPackage(
                paramR.c(), GComponentBk.EqualsInAiPackage(), RInterfaceIndia);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            ExceptionInVPackage.printStackTrace();
            D.ExceptionInVPackage(
                "Error subscribing to ParameterValue Changes. Parameter:"
                    + GComponentBk.EqualsInAiPackage(),
                (Exception) ExceptionInVPackage,
                this);
          }
        continue;
      }
      if (Abstract instanceof GComponentBq) {
        GComponentBq GComponentBq = (GComponentBq) Abstract;
        aV aV = new aV(paramR, GComponentBq);
        if (GComponentBq.aJ() != null
            && a_() != null
            && !GComponentBq.aJ().equals(Boolean.valueOf((a_() != null)))) {
          aV.c_("(" + GComponentBq.aJ() + ") && (" + a_() + ")");
        } else if (GComponentBq.aJ() != null) {
          aV.c_(GComponentBq.aJ());
        } else if (a_() != null) {
          aV.c_(a_());
        }
        add(aV);
        if (GComponentBq.RInterfaceIndia()) {
          String[] arrayOfString = GComponentBq.c();
          if (arrayOfString != null)
            for (byte EqualsInAiPackage = 0;
                EqualsInAiPackage < arrayOfString.length;
                EqualsInAiPackage++) {
              String str1 = arrayOfString[EqualsInAiPackage];
              if (str1.contains("[")) str1 = str1.substring(0, str1.indexOf("["));
              Manager Manager = paramR.c(str1);
              if (Manager != null)
                try {
                  ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), str1, aV);
                } catch (ExceptionInVPackage ExceptionInVPackage) {
                  ExceptionInVPackage.printStackTrace();
                  D.ExceptionInVPackage(
                      "Error subscribing to ParameterValue Changes. Parameter:"
                          + GComponentBq.EqualsInAiPackage(),
                      (Exception) ExceptionInVPackage,
                      this);
                }
            }
          continue;
        }
        if (GComponentBq.EqualsInAiPackage() != null
            && paramR.c(GComponentBq.EqualsInAiPackage()) != null)
          try {
            ManagerUsingConcurrentHashMap.ExceptionInVPackage(
                paramR.c(), GComponentBq.EqualsInAiPackage(), aV);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            ExceptionInVPackage.printStackTrace();
            D.ExceptionInVPackage(
                "Error subscribing to ParameterValue Changes. Parameter:"
                    + GComponentBq.EqualsInAiPackage(),
                (Exception) ExceptionInVPackage,
                this);
          }
        continue;
      }
      D.EqualsInAiPackage(
          "Dialog contains ExceptionInVPackage RowItem type this version of TunerStudio does not"
              + " support: "
              + Abstract);
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
        q.ExceptionInVPackage(new GInterfaceBi(this, str1));
        bh1.setLayout(q);
        if (EqualsInAiPackage > 0) {
          bh bh2 = bh1;
          byte b1 = EqualsInAiPackage;
          GComponentBj GComponentBj = new GComponentBj(this, bh2, b1);
          SwingUtilities.invokeLater(GComponentBj);
        }
      }
      Iterator<ArrayListExceptionprintstacktraceInGPackage> iterator1 = parambv.K();
      while (iterator1.hasNext()) {
        ArrayListExceptionprintstacktraceInGPackage bv1 = iterator1.next();
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

  protected void ExceptionInVPackage(R paramR, GComponentBj parambj) {
    setLayout(new BorderLayout());
    R r = new R(paramR, parambj);
    add("Center", r);
  }

  public void close() {
    Component[] arrayOfComponent = getComponents();
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < getComponentCount(); EqualsInAiPackage++) {
      if (arrayOfComponent[EqualsInAiPackage] instanceof GComponentBc)
        ((GComponentBc) arrayOfComponent[EqualsInAiPackage]).close();
    }
  }

  public ArrayList k() {
    ArrayList arrayList = new ArrayList();
    return ExceptionInVPackage(arrayList, this);
  }

  private ArrayList ExceptionInVPackage(
      ArrayList<EqualsInAiPackage> paramArrayList, Component paramComponent) {
    if (paramComponent instanceof Container) {
      Container container = (Container) paramComponent;
      for (byte EqualsInAiPackage = 0;
          EqualsInAiPackage < container.getComponentCount();
          EqualsInAiPackage++)
        ExceptionInVPackage(paramArrayList, container.getComponent(EqualsInAiPackage));
    }
    if (paramComponent instanceof AiInterfaceEcho) {
      AiInterfaceEcho AiInterfaceEcho = (AiInterfaceEcho) paramComponent;
      if (AiInterfaceEcho.ExceptionInVPackage() != null
          && !paramArrayList.contains(AiInterfaceEcho.ExceptionInVPackage()))
        paramArrayList.add(AiInterfaceEcho.ExceptionInVPackage());
    }
    return paramArrayList;
  }

  private void ExceptionInVPackage(Component paramComponent, boolean paramBoolean) {
    if (paramComponent instanceof h) {
      ((h) paramComponent).ExceptionInVPackage();
    } else if (paramComponent instanceof Container) {
      Container container = (Container) paramComponent;
      for (byte EqualsInAiPackage = 0;
          EqualsInAiPackage < container.getComponentCount();
          EqualsInAiPackage++)
        ExceptionInVPackage(container.getComponent(EqualsInAiPackage), paramBoolean);
    } else {
      paramComponent.setEnabled(paramBoolean);
    }
  }

  public void ExceptionInVPackage() {
    bh bh1 = this;
    GComponentBk GComponentBk = new GComponentBk(this, bh1);
    GComponentBk.run();
  }

  private void ExceptionInVPackage(R paramR, GInterfaceBd parambD) {
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
      boolean bool =
          RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("0532fewkjfewpoijrew98");
      ExceptionInVPackage ExceptionInVPackage =
          new ExceptionInVPackage(paramR, parambD.ExceptionInVPackage(), bool);
      ExceptionInVPackage.s("");
      bh1 = new bh(paramR, (ArrayListExceptionprintstacktraceInGPackage) ExceptionInVPackage);
    }
    if (bh1 != null) {
      add("Center", bh1);
    } else {
      D.EqualsInAiPackage("Undefined dialog panel: " + parambD);
    }
  }

  private void ExceptionInVPackage(R paramR, ArrayListExceptionprintstacktrace paramaS) {
    setLayout(new BorderLayout());
    OutputPortEditor outputPortEditor = new OutputPortEditor(paramR, paramaS);
    add("Center", (Component) outputPortEditor);
  }

  private void ExceptionInVPackage(R paramR, GComponentAg paramag) {
    setLayout(new BorderLayout());
    n n = new n(paramR, paramag);
    add("Center", (Component) n);
  }

  private void ExceptionInVPackage(R paramR, GComponentBc parambc) {
    setLayout(new BorderLayout());
    ae ae = new ae(paramR, parambc);
    add("Center", (Component) ae);
  }

  public boolean l() {
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < getComponentCount(); EqualsInAiPackage++) {
      if (getComponent(EqualsInAiPackage) instanceof aV) {
        aV aV = (aV) getComponent(EqualsInAiPackage);
        if (aV.k()) return true;
      }
      if (getComponent(EqualsInAiPackage) instanceof bh) {
        bh bh1 = (bh) getComponent(EqualsInAiPackage);
        if (bh1.l()) return true;
      }
    }
    return false;
  }

  public void ExceptionInVPackage(ArrayList paramArrayList) {
    for (byte EqualsInAiPackage = 0; EqualsInAiPackage < getComponentCount(); EqualsInAiPackage++) {
      if (getComponent(EqualsInAiPackage) instanceof o) {
        o o = (o) getComponent(EqualsInAiPackage);
        if (paramArrayList.contains(o.c())) o.ExceptionInVPackage(true);
      } else if (getComponent(EqualsInAiPackage) instanceof bh) {
        bh bh1 = (bh) getComponent(EqualsInAiPackage);
        bh1.ExceptionInVPackage(paramArrayList);
      }
    }
  }

  public boolean m() {
    return this.ExceptionInVPackage;
  }

  private void ExceptionInVPackage(R paramR, GInterfaceBb parambB) {
    setLayout(new BorderLayout());
    bI bI = new bI();
    bI.setBackground(Color.BLACK);
    bI.ExceptionInVPackage(paramR, parambB.ExceptionInVPackage());
    add("Center", bI);
  }

  private void ExceptionInVPackage(R paramR, GInterfaceBt parambt) {
    setLayout(new BorderLayout());
    r r = new r(paramR, parambt);
    r.ExceptionInVPackage(parambt.EqualsInAiPackage());
    for (Exceptionprintstacktrace Exceptionprintstacktrace : parambt.ExceptionInVPackage())
      r.ExceptionInVPackage(Exceptionprintstacktrace);
    add("Center", r);
  }

  private void ExceptionInVPackage(R paramR, GComponentBz parambz) {
    setLayout(new BorderLayout());
    D d1 = new D(paramR, parambz);
    d1.ExceptionInVPackage(parambz.ExceptionInVPackage());
    for (GInterfaceAh GInterfaceAh : parambz.EqualsInAiPackage())
      d1.ExceptionInVPackage(GInterfaceAh);
    add("Center", d1);
  }

  private void ExceptionInVPackage(
      R paramR, N paramN, ArrayListExceptionprintstacktraceInGPackage parambv) {
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
        bh bh1 = (bh) getComponent(EqualsInAiPackage);
        if (bh1.c()) return true;
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
        Logger.getLogger(aV.class.getName()).log(Level.SEVERE, (String) null, (Throwable) g1);
      }
      if (isVisible() && !bool) {
        setVisible(false);
        if (getParent() instanceof JPanel) ((JPanel) getParent()).revalidate();
      } else if (!isVisible() && bool) {
        setVisible(true);
        if (getParent() instanceof JPanel) ((JPanel) getParent()).revalidate();
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
    if (paramComponent instanceof L) paramList.add((L) paramComponent);
    if (paramComponent instanceof Container) {
      Container container = (Container) paramComponent;
      for (Component component : container.getComponents())
        paramList = ExceptionInVPackage(paramList, component);
    }
    return paramList;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/GInterfaceBt/bh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
