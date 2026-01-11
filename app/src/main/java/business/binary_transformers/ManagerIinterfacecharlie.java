package business.binary_transformers;

import G.R;
import G.GInterfaceAi;
import G.Manager;
import G.GInterfaceAn;
import G.ManagerUsingConcurrentHashMap;
import G.ExceptionprintstacktraceInGPackage;
import G.GComponentBj;
import G.CloneableImplInGPackage;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.IInterfaceCharlie;
import G.GComponentCl;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import G.GInterfaceDb;
import G.GInterfaceDj;
import G.RInterfaceIndia;
import G.k;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import W.RInterfaceIndia;
import W.ExceptionExtensionGetmessage;
import W.n;
import ax.ExceptionInAxPackage;
import bH.D;
import bH.X;
import bH.p;
import bH.u;
import bH.w;
import IInterfaceCharlie.CInterfaceDelta;
import com.efiAnalytics.tuningwidgets.panels.ExceptionInVPackage;
import com.efiAnalytics.ui.bN;
import com.efiAnalytics.ui.bS;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.ef;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fp;
import com.efiAnalytics.ui.r;
import RInterfaceIndia.IInterfaceCharlie;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import k.ExceptionInVPackage;
import k.CInterfaceDelta;
import r.RInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class ManagerIinterfacecharlie extends JPanel implements GInterfaceAn, GComponentCq, L, CInterfaceDelta, bS, bc {
  R ExceptionInVPackage = null;
  
  ArrayList b = new ArrayList();
  
  ArrayList IInterfaceCharlie = new ArrayList();
  
  static final String CInterfaceDelta = ExceptionPrintstacktrace.b("Set X Axis Minimum");
  
  static final String e = ExceptionPrintstacktrace.b("Set X Axis Maximum");
  
  static final String f = ExceptionPrintstacktrace.b("Auto Scale X Axis Maximum");
  
  static final String ExceptionPrintstacktrace = ExceptionPrintstacktrace.b("Set Y Axis Minimum");
  
  static final String h = ExceptionPrintstacktrace.b("Set Y Axis Maximum");
  
  static final String RInterfaceIndia = ExceptionPrintstacktrace.b("Auto Scale Y Axis Maximum");
  
  static final String ExceptionExtensionGetmessage = ExceptionPrintstacktrace.b("Selection Follow Mode") + " (CTRL+F)";
  
  static final String k = ExceptionPrintstacktrace.b("Set History Timeout");
  
  static final String l = ExceptionPrintstacktrace.b("Show baseline graph") + " (CTRL+B)";
  
  static final String m = ExceptionPrintstacktrace.b("Revert to baseline");
  
  static final String n = ExceptionPrintstacktrace.b("Show X-Y Data Log Plot") + " (CTRL+X)";
  
  static final String o = ExceptionPrintstacktrace.b("Set Coarse Step Count");
  
  private String P = null;
  
  private boolean Q = true;
  
  bN p = null;
  
  CloneableImplInGPackage q = null;
  
  GInterfaceAi r = null;
  
  aH s;
  
  JPanel t = null;
  
  aL u = null;
  
  T v = null;
  
  T w = null;
  
  int[] x = null;
  
  boolean y = false;
  
  et z;
  
  aP A = null;
  
  ManagerUsingConcurrentHashMap B = null;
  
  aS C = null;
  
  aU D = null;
  
  boolean E = false;
  
  boolean F = true;
  
  aT G = new aT(this);
  
  boolean H = false;
  
  aO I;
  
  bP J = null;
  
  aK K = new aK(this);
  
  ExceptionInVPackage L = null;
  
  aJ M = null;
  
  RInterfaceIndia N = new Manager(this);
  
  List O = new ArrayList();
  
  public ManagerIinterfacecharlie(R paramR, CloneableImplInGPackage parambm, boolean paramBoolean, et paramet) {
    this.ExceptionInVPackage = paramR;
    this.q = parambm;
    if (paramet == null)
      paramet = new aQ(this); 
    this.z = paramet;
    this.E = RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("09LKFDSLK4K ");
    this.F = RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage(";'DS;'G-043LF;L");
    setLayout(new BorderLayout());
    if (parambm.E()) {
      b(paramBoolean);
    } else {
      this.p = new bN();
      if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("joijt;i609tr0932")) {
        this.p.h(true);
      } else {
        this.p.h(false);
      } 
      byte b1;
      for (b1 = 0; b1 < parambm.ExceptionExtensionGetmessage(); b1++) {
        Manager Manager = paramR.IInterfaceCharlie(parambm.CInterfaceDelta(b1));
        if (Manager == null)
          throw new ExceptionInVPackage("CurveGraph X Parameter " + parambm.CInterfaceDelta(b1) + " not found in the current configuration."); 
        this.IInterfaceCharlie.add(Manager);
        RInterfaceIndia.ExceptionInVPackage(paramR.IInterfaceCharlie(), Manager, this);
      } 
      for (b1 = 0; b1 < parambm.CInterfaceDelta(); b1++) {
        Manager Manager = paramR.IInterfaceCharlie(parambm.b(b1));
        String str = parambm.ExceptionInVPackage(b1);
        boolean bool = true;
        try {
          bool = (str != null && RInterfaceIndia.ExceptionInVPackage(str, (GInterfaceAi)paramR) != 0.0D) ? true : false;
        } catch (ExceptionInAxPackage u) {}
        if (bool) {
          if (Manager == null)
            throw new ExceptionInVPackage("CurveGraph Y Parameter " + parambm.b(b1) + " not found in the current configuration."); 
          this.b.add(Manager);
          RInterfaceIndia.ExceptionInVPackage(paramR.IInterfaceCharlie(), Manager, this);
        } 
      } 
      if (this.b.size() == 0)
        bV.CInterfaceDelta("No Y Axis Bins for CurveGraph " + parambm.aL() + "\nthe Y Axis must have at least 1 Y Axis Bin assigned.", this); 
      add("Center", (Component)this.p);
      c_(parambm.aJ());
      this.Q = parambm.v();
      this.p.k((int)ExceptionInVPackage(k, 10000.0D));
      this.p.h(parambm.p());
      this.p.RInterfaceIndia(parambm.o());
      this.p.addMouseListener(new ao(this));
      if (this.b.size() > 0 && ((Manager)this.b.get(0)).aL() != null) {
        this.t = new JPanel();
        this.t.setLayout(new GridLayout(1, 2, 1, 1));
        ExceptionInVPackage a1 = new ExceptionInVPackage(paramR, ((Manager)this.b.get(0)).aL());
        this.t.add(a1);
        l l = new l(paramR, ((Manager)this.b.get(0)).aL());
        this.t.add(l);
        this.t.setBackground(Color.BLACK);
        this.p.add(this.t);
      } 
      if (this.IInterfaceCharlie.size() > 0) {
        this.x = new int[this.IInterfaceCharlie.size()];
      } else {
        this.x = new int[1];
      } 
      this.p.ExceptionInVPackage(this);
      this.p.ExceptionInVPackage(new az(this));
      GComponentCl GComponentCl = new GComponentCl(this.b.get(0));
      this.p.ExceptionInVPackage((GInterfaceDj)GComponentCl);
      this.p.h(Math.max(((Manager)this.b.get(0)).s(), parambm.IInterfaceCharlie()));
      this.p.RInterfaceIndia(((Manager)this.b.get(0)).r());
      this.C = new aS(this);
      if (parambm.N() != null)
        RInterfaceIndia.ExceptionInVPackage(paramR.IInterfaceCharlie(), parambm.N(), this.C); 
      this.p.b(ExceptionPrintstacktrace.b(parambm.M()));
      this.B = new ManagerUsingConcurrentHashMap(this);
      byte b2;
      for (b2 = 0; b2 < parambm.k(); b2++)
        RInterfaceIndia.ExceptionInVPackage(paramR.IInterfaceCharlie(), parambm.e(b2), this.B); 
      for (b2 = 0; b2 < parambm.m(); b2++)
        RInterfaceIndia.ExceptionInVPackage(paramR.IInterfaceCharlie(), parambm.f(b2), this); 
      for (b2 = 0; b2 < parambm.ExceptionPrintstacktrace(); b2++)
        RInterfaceIndia.ExceptionInVPackage(paramR.IInterfaceCharlie(), parambm.IInterfaceCharlie(b2), this); 
      t();
      b2 = 0;
      for (byte b3 = 0; b3 < this.b.size(); b3++) {
        ManagerUsingConcurrentHashMap aR1 = ManagerUsingConcurrentHashMap.ExceptionInVPackage();
        try {
          aR1.ExceptionInVPackage(paramR.IInterfaceCharlie(), ((Manager)this.b.get(b3)).aL(), this);
          if (this.IInterfaceCharlie != null && this.IInterfaceCharlie.size() > b2)
            aR1.ExceptionInVPackage(paramR.IInterfaceCharlie(), ((Manager)this.IInterfaceCharlie.get(b2)).aL(), this); 
        } catch (ExceptionInVPackage a1) {
          a1.printStackTrace();
          D.ExceptionInVPackage("Error subscribing to ParameterValue Changes.", (Exception)a1, this);
        } 
        if (this.IInterfaceCharlie.size() > b2 + 1)
          b2++; 
      } 
      try {
        v();
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.ExceptionInVPackage("Error accessing curve parameters", (Exception)ExceptionPrintstacktrace, this);
      } 
      try {
        if (parambm.l() != null)
          ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(paramR.IInterfaceCharlie(), parambm.l(), this); 
      } catch (ExceptionInVPackage a1) {
        D.ExceptionInVPackage("Unable to subscribe x or y axis for hightlights.", (Exception)a1, this);
      } 
      this.p.addFocusListener(new aA(this));
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new BorderLayout());
      jPanel.setBackground(Color.BLACK);
      if (parambm.r() != null) {
        String[] arrayOfString = parambm.r();
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(0, 1));
        for (byte b = 0; b < arrayOfString.length; b++) {
          if (arrayOfString[b] != null && !arrayOfString[b].equals("")) {
            bI bI = new bI();
            bI.setBackground(Color.BLACK);
            bI.b(arrayOfString[b]);
            jPanel1.add(bI);
          } 
        } 
        jPanel.add("North", jPanel1);
      } 
      this.r = new GInterfaceAi(this);
      this.r.setLayout(new FlowLayout(1));
      if (!this.F) {
        ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = new ArrayListExceptionprintstacktraceInGPackage();
        ArrayListExceptionprintstacktraceInGPackage.RInterfaceIndia(0);
        b2 = 0;
        for (byte b = 0; b < this.b.size(); b++) {
          GInterfaceDb GInterfaceDb;
          if (this.IInterfaceCharlie != null && this.IInterfaceCharlie.size() > b2 && !((Manager)this.IInterfaceCharlie.get(b2)).H() && !this.p.l()) {
            GComponentBj bj1 = new GComponentBj();
            bj1.s(this.p.b(b));
            bj1.b(((Manager)this.IInterfaceCharlie.get(b2)).aL());
            bj1.ExceptionInVPackage(new GInterfaceAn(this, b2));
            bj1.ExceptionInVPackage(this.E);
            if (this.b.size() > 1)
              bj1.ExceptionInVPackage(new k(this.p.ExceptionInVPackage(b).getRGB())); 
            ArrayListExceptionprintstacktraceInGPackage.ExceptionInVPackage((ArrayListExceptionprintstacktraceInGPackage)bj1);
          } 
          GComponentBj GComponentBj = new GComponentBj();
          IInterfaceCharlie IInterfaceCharlie = new IInterfaceCharlie((this.p.IInterfaceCharlie(b) != null) ? this.p.IInterfaceCharlie(b) : ((Manager)this.b.get(b)).aL());
          if (parambm.k() > b)
            GInterfaceDb = parambm.e(b); 
          GComponentBj.CInterfaceDelta(GInterfaceDb);
          GComponentBj.b(((Manager)this.b.get(b)).aL());
          GComponentBj.ExceptionInVPackage(this.E);
          GComponentBj.ExceptionInVPackage(new GInterfaceAn(this, b2));
          if (this.b.size() > 1) {
            GComponentBj.ExceptionInVPackage(new k(this.p.ExceptionInVPackage(b).getRGB()));
          } else {
            Color color = UIManager.getColor("TextField.background");
            GComponentBj.ExceptionInVPackage(new k(color.getRGB()));
          } 
          if (this.IInterfaceCharlie == null && this.IInterfaceCharlie.isEmpty() && this.p.l() && parambm.s() != null) {
            double[] arrayOfDouble = parambm.s();
            String[] arrayOfString = new String[arrayOfDouble.length];
            for (byte b4 = 0; b4 < arrayOfDouble.length; b4++)
              arrayOfString[b4] = X.ExceptionInVPackage(arrayOfDouble[b4]); 
            GComponentBj.ExceptionInVPackage(arrayOfString);
          } 
          ArrayListExceptionprintstacktraceInGPackage.ExceptionInVPackage((ArrayListExceptionprintstacktraceInGPackage)GComponentBj);
          b2++;
        } 
        bh bh = new bh(paramR, ArrayListExceptionprintstacktraceInGPackage);
        this.r.add(bh);
      } 
      JButton jButton1 = new JButton("#");
      jButton1.setPreferredSize(eJ.ExceptionInVPackage(15, 15));
      jButton1.setToolTipText("Click or Press A to show or hide text based arrays");
      jButton1.addActionListener(new aB(this));
      jButton1.setFocusable(false);
      this.p.add(jButton1);
      JButton jButton2 = new JButton("#");
      jButton2.setPreferredSize(eJ.ExceptionInVPackage(15, 15));
      jButton2.setToolTipText(ExceptionPrintstacktrace.b("Click For Options Menu"));
      jButton2.addActionListener(new aC(this));
      jButton2.setFocusable(false);
      this.p.add(jButton2);
      if (parambm.r() != null || parambm.w()) {
        try {
          if (this.F) {
            this.v = new T(paramR, parambm, true, paramBoolean);
            this.v.ExceptionInVPackage(this.G);
            if (parambm.CInterfaceDelta() > 1)
              try {
                for (byte b = 0; b < parambm.CInterfaceDelta(); b++)
                  this.w.ExceptionInVPackage(this.p.ExceptionInVPackage(b)); 
                this.w.ExceptionInVPackage(Color.LIGHT_GRAY);
              } catch (Exception exception) {} 
            this.v.ExceptionInVPackage(paramet);
            this.u = new aL(this, this.v);
            this.u.getVerticalScrollBar().addAdjustmentListener(new aD(this));
            jPanel.add("Center", this.u);
          } else {
            this.u = new aL(this, this.r);
            jPanel.add("South", this.u);
          } 
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        } 
        this.p.setLayout(this.s = new aH(this, null, jButton1, jButton2));
      } else if (this.F && this.E) {
        try {
          this.w = new T(paramR, parambm, false, paramBoolean);
          this.w.ExceptionInVPackage(this.G);
          this.w.setBorder(BorderFactory.createEmptyBorder(5, 8, 5, 8));
          if (parambm.CInterfaceDelta() > 1) {
            for (byte b = 0; b < parambm.CInterfaceDelta(); b++)
              this.w.ExceptionInVPackage(this.p.ExceptionInVPackage(b)); 
            this.w.ExceptionInVPackage(Color.LIGHT_GRAY);
          } 
          this.r.setLayout(new GridLayout(1, 1));
          this.r.add(this.w);
          add("South", this.r);
          this.p.setLayout(this.s = new aH(this, null, jButton1, jButton2));
          this.r.setVisible((parambm.CInterfaceDelta() <= 1));
          this.w.ExceptionInVPackage(paramet);
          boolean bool = Boolean.parseBoolean(paramet.b("showText", parambm.u() + ""));
          this.r.setVisible(bool);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {}
      } else if (this.F) {
        try {
          this.v = new T(paramR, parambm, !this.E, paramBoolean);
          this.v.ExceptionInVPackage(this.G);
          this.u = new aL(this, this.v);
          if (parambm.CInterfaceDelta() > 1) {
            for (byte b = 0; b < parambm.CInterfaceDelta(); b++)
              this.v.ExceptionInVPackage(this.p.ExceptionInVPackage(b)); 
            this.w.ExceptionInVPackage(Color.LIGHT_GRAY);
          } 
          this.p.add(this.u);
          if (!parambm.u()) {
            this.u.setVisible(false);
            this.r.setVisible(false);
          } else {
            this.u.setVisible(true);
            this.r.setVisible(true);
          } 
          this.p.setLayout(this.s = new aH(this, this.u, jButton1, jButton2));
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          D.ExceptionInVPackage("Configuration File Error.", (Exception)ExceptionPrintstacktrace, this);
        } 
      } else {
        this.u = new aL(this, this.r);
        this.p.add(this.u);
        if (!parambm.u()) {
          this.u.setVisible(false);
          this.r.setVisible(false);
        } else {
          this.u.setVisible(true);
          this.r.setVisible(true);
        } 
        this.p.setLayout(this.s = new aH(this, this.u, jButton1, jButton2));
      } 
      this.p.u();
      if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage(";lkdsaop9ewqewqgd")) {
        boolean bool = Boolean.parseBoolean(paramet.b(l, "" + parambm.x()));
        this.p.f(bool);
      } 
      if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("67hgyusg432gvrewhgfds")) {
        s();
        IInterfaceCharlie.ExceptionInVPackage().ExceptionInVPackage(this.K);
      } 
      add("East", jPanel);
      this.p.setFocusable(true);
      this.I = new aO(this);
      this.p.addKeyListener(this.I);
    } 
    IInterfaceCharlie();
  }
  
  private void b(boolean paramBoolean) {
    this.r = new GInterfaceAi(this);
    byte b;
    for (b = 0; b < this.q.ExceptionExtensionGetmessage(); b++) {
      Manager Manager = this.ExceptionInVPackage.IInterfaceCharlie(this.q.CInterfaceDelta(b));
      if (Manager == null)
        throw new ExceptionInVPackage("CurveGraph X Parameter " + this.q.CInterfaceDelta(b) + " not found in the current configuration."); 
      this.IInterfaceCharlie.add(Manager);
    } 
    for (b = 0; b < this.q.CInterfaceDelta(); b++) {
      Manager Manager = this.ExceptionInVPackage.IInterfaceCharlie(this.q.b(b));
      this.b.add(Manager);
    } 
    if (this.b.size() == 0)
      bV.CInterfaceDelta("No Y Axis Bins for 1D Arrays " + this.q.aL() + "\nthe Y Axis must have at least 1 Y Axis Bin assigned.", this); 
    if (this.F && this.E) {
      try {
        this.w = new T(this.ExceptionInVPackage, this.q, false, paramBoolean);
        this.w.ExceptionInVPackage(this.G);
        this.w.setBorder(BorderFactory.createEmptyBorder(5, 8, 5, 8));
        ArrayList<Color> arrayList = new ArrayList();
        arrayList.add(Color.GREEN);
        arrayList.add(Color.RED);
        arrayList.add(Color.CYAN);
        arrayList.add(Color.YELLOW);
        arrayList.add(Color.MAGENTA);
        arrayList.add(Color.WHITE);
        arrayList.add(Color.GRAY);
        arrayList.add(Color.ORANGE);
        arrayList.add(Color.PINK);
        arrayList.add(Color.BLUE);
        if (this.q.CInterfaceDelta() > 1)
          for (byte b1 = 0; b1 < this.q.CInterfaceDelta(); b1++)
            this.w.ExceptionInVPackage(arrayList.get(b1 % arrayList.size()));  
        this.w.ExceptionInVPackage(Color.LIGHT_GRAY);
        this.r.setLayout(new GridLayout(1, 1));
        this.r.add(this.w);
        add("Center", this.r);
        this.r.setVisible((this.q.CInterfaceDelta() <= 1));
        this.r.setVisible(true);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {}
    } else if (this.F) {
      try {
        this.v = new T(this.ExceptionInVPackage, this.q, !this.E, paramBoolean);
        this.v.ExceptionInVPackage(this.G);
        this.u = new aL(this, this.v);
        if (this.q.CInterfaceDelta() > 1) {
          for (b = 0; b < this.q.CInterfaceDelta(); b++)
            this.v.ExceptionInVPackage(this.p.ExceptionInVPackage(b)); 
          this.w.ExceptionInVPackage(Color.LIGHT_GRAY);
        } 
        add("Center", this.u);
        if (!this.q.u()) {
          this.u.setVisible(false);
          this.r.setVisible(false);
        } else {
          this.u.setVisible(true);
          this.r.setVisible(true);
        } 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.ExceptionInVPackage("Configuration File Error.", (Exception)ExceptionPrintstacktrace, this);
      } 
    } else {
      this.u = new aL(this, this.r);
      this.p.add(this.u);
      if (!this.q.u()) {
        this.u.setVisible(false);
        this.r.setVisible(false);
      } else {
        this.u.setVisible(true);
        this.r.setVisible(true);
      } 
      add("Center", this.u);
    } 
  }
  
  private void p() {
    boolean bool = Boolean.parseBoolean(this.z.b(n, "" + this.q.A()));
    if (bool) {
      if (!q().isShowing()) {
        add("North", (Component)q());
        validate();
        doLayout();
      } 
    } else if (this.L != null && this.L.isShowing()) {
      remove((Component)this.L);
      doLayout();
    } 
  }
  
  private ExceptionInVPackage q() {
    if (this.L == null) {
      this.L = new ExceptionInVPackage();
      this.L.ExceptionInVPackage(new aE(this));
    } 
    return this.L;
  }
  
  private boolean IInterfaceCharlie(String paramString) {
    if (paramString == null || paramString.trim().isEmpty())
      return true; 
    try {
      ExceptionInVPackage a1 = CInterfaceDelta.ExceptionInVPackage().ExceptionInVPackage(paramString);
      double d1 = a1.ExceptionInVPackage(IInterfaceCharlie.ExceptionInVPackage().e(), 0);
      return true;
    } catch (Exception exception) {
      String str = ExceptionPrintstacktrace.b("Invalid Expression! Expression should reference fields within the data log.") + "\n" + ExceptionPrintstacktrace.b("Example Expression") + ":\n[MAP] > 90";
      bV.CInterfaceDelta(str, this);
      return false;
    } 
  }
  
  public void b(String paramString) {
    this.M.ExceptionInVPackage(paramString);
    q().IInterfaceCharlie(paramString);
    this.p.o();
    this.p.repaint();
  }
  
  private void r() {
    if (this.p.A() != null && !this.p.A().x() && this.p.B() != null) {
      double[] arrayOfDouble;
      int[] arrayOfInt;
      u u = new u();
      if (this.p.z() == 0) {
        arrayOfDouble = new double[this.p.CInterfaceDelta(0)];
        arrayOfInt = new int[this.p.CInterfaceDelta(0)];
        for (byte b = 0; b < arrayOfInt.length; b++)
          arrayOfInt[b] = b; 
      } else {
        arrayOfInt = this.p.ExceptionExtensionGetmessage(0);
        arrayOfDouble = new double[arrayOfInt.length];
      } 
      for (byte b1 = 0; b1 < arrayOfDouble.length; b1++)
        arrayOfDouble[b1] = this.p.ExceptionInVPackage(0, arrayOfInt[b1]); 
      aF aF = new aF(this, arrayOfDouble);
      List<w> list = u.ExceptionInVPackage(this.p.A(), this.p.B(), aF, arrayOfDouble);
      int ExceptionExtensionGetmessage = this.p.C();
      int k = this.p.D();
      for (byte b2 = 0; b2 < list.size(); b2++) {
        if (arrayOfInt[b2] >= ExceptionExtensionGetmessage && arrayOfInt[b2] <= k)
          this.p.b(0, arrayOfInt[b2], ((w)list.get(b2)).ExceptionInVPackage()); 
      } 
    } 
  }
  
  private void s() {
    boolean bool = false;
    if (this.q.l() != null) {
      String str = ExceptionprintstacktraceInGPackage.ExceptionExtensionGetmessage(this.ExceptionInVPackage, this.q.l());
      bool = (str != null && !str.isEmpty()) ? true : false;
    } 
    boolean bool1 = Boolean.parseBoolean(this.z.b(n, "" + ((this.q.A() || bool) ? 1 : 0)));
    this.p.RInterfaceIndia(bool1);
    this.p.ExceptionInVPackage(null);
    this.p.b(null);
    if (bool1) {
      n n = IInterfaceCharlie.ExceptionInVPackage().e();
      if (n != null) {
        p();
        String str1 = this.z.b("xPlotColumnName", this.q.B());
        String str2 = this.z.b("yPlotColumnName", this.q.C());
        if (str1 != null && n.ExceptionInVPackage(str1) != null) {
          if (this.p.A() != null)
            this.p.A().b(this.N); 
          ExceptionExtensionGetmessage ExceptionExtensionGetmessage = n.ExceptionInVPackage(str1);
          ExceptionExtensionGetmessage.ExceptionInVPackage(this.N);
          this.p.ExceptionInVPackage(ExceptionExtensionGetmessage);
          q().ExceptionInVPackage(str1);
        } 
        if (str2 != null && n.ExceptionInVPackage(str2) != null) {
          if (this.p.B() != null)
            this.p.B().b(this.N); 
          ExceptionExtensionGetmessage ExceptionExtensionGetmessage = n.ExceptionInVPackage(str2);
          ExceptionExtensionGetmessage.ExceptionInVPackage(this.N);
          this.p.b(ExceptionExtensionGetmessage);
          q().b(str2);
        } 
        this.M = new aJ(this, n, this.q.D());
        String str3 = this.z.b("xyPlotFilterExp", "");
        b(str3);
        this.p.ExceptionInVPackage(this.M);
        this.p.o();
        this.p.repaint();
      } 
    } else {
      p();
    } 
  }
  
  private void t() {
    this.p.ExceptionInVPackage();
    for (byte b = 0; b < this.q.k(); b++) {
      String str = this.q.ExceptionInVPackage(b);
      boolean bool = true;
      try {
        bool = (str != null && RInterfaceIndia.ExceptionInVPackage(str, (GInterfaceAi)this.ExceptionInVPackage) != 0.0D) ? true : false;
      } catch (ExceptionInAxPackage u) {}
      if (bool)
        try {
          this.p.ExceptionInVPackage(ExceptionPrintstacktrace.b(this.q.e(b).ExceptionInVPackage()));
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        }  
    } 
    this.p.o();
    this.p.repaint();
  }
  
  private double ExceptionInVPackage(ArrayList paramArrayList) {
    double d1 = Double.MAX_VALUE;
    Iterator<Manager> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      double d2 = ((Manager)iterator.next()).r();
      if (d2 < d1)
        d1 = d2; 
    } 
    return d1;
  }
  
  private double b(ArrayList paramArrayList) {
    double d1 = Double.MIN_VALUE;
    Iterator<Manager> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      double d2 = ((Manager)iterator.next()).s();
      if (d2 > d1)
        d1 = d2; 
    } 
    return d1;
  }
  
  private double IInterfaceCharlie(ArrayList paramArrayList) {
    double d1 = Double.MIN_VALUE;
    Iterator<Manager> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      double d2 = ((Manager)iterator.next()).s();
      if (d2 > d1)
        d1 = d2; 
    } 
    return d1;
  }
  
  private void u() {
    if (this.p.z() > 0) {
      String str = bV.ExceptionInVPackage("{" + ExceptionPrintstacktrace.b("Set Selected Cells to") + ":}", true, ExceptionPrintstacktrace.b("Set Cell Values"), true, this);
      requestFocus();
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        this.p.ExceptionExtensionGetmessage(d1);
      } 
    } 
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    if (this.L != null && (this.L.getPreferredSize()).width > 100) {
      Dimension dimension1 = this.L.getPreferredSize();
      dimension1.width = 20;
      this.L.setPreferredSize(dimension1);
      dimension = super.getPreferredSize();
    } 
    return dimension;
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    if (this.L != null && (this.L.getMinimumSize()).width > 100) {
      Dimension dimension1 = this.L.getMinimumSize();
      dimension1.width = 20;
      this.L.setMinimumSize(dimension1);
      dimension = super.getMinimumSize();
    } 
    return dimension;
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.w != null && this.w.isVisible()) {
      Dimension dimension1 = (this.p != null) ? this.p.getPreferredSize() : new Dimension(0, 0);
      int ExceptionExtensionGetmessage = eJ.ExceptionInVPackage() + 2;
      Dimension dimension2 = this.w.b(ExceptionExtensionGetmessage);
      int k = dimension1.height + dimension2.height;
      int m = paramInt4 - k;
      m = m * 17 / 100;
      int n = ExceptionExtensionGetmessage + m / (this.b.size() + 1);
      int i1 = Math.round(ExceptionExtensionGetmessage * paramInt3 / dimension2.width);
      int i2 = (i1 > n) ? n : i1;
      i2 = (i2 > 3 * ExceptionExtensionGetmessage) ? (3 * ExceptionExtensionGetmessage) : i2;
      i2 = (i2 < ExceptionExtensionGetmessage * 4 / 5) ? (ExceptionExtensionGetmessage * 4 / 5) : i2;
      int i3 = i2;
      aG aG = new aG(this, i3);
      this.w.ExceptionInVPackage(i3);
    } 
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void IInterfaceCharlie() {
    if (this.p != null) {
      if (this.J == null) {
        this.J = new G(this.ExceptionInVPackage, this.q, this);
      } else {
        this.J.b();
      } 
      this.J.ExceptionInVPackage();
    } 
    if (this.v != null)
      this.v.ExceptionInVPackage(); 
    if (this.w != null)
      this.w.ExceptionInVPackage(); 
  }
  
  public void e() {
    if (this.J != null)
      this.J.b(); 
    if (this.v != null)
      this.v.b(); 
    if (this.w != null)
      this.w.b(); 
  }
  
  public void ExceptionInVPackage(bP parambP) {
    e();
    this.J = parambP;
    if (parambP != null)
      parambP.ExceptionInVPackage(); 
  }
  
  public void b(bP parambP) {
    if (this.v != null)
      this.v.ExceptionInVPackage(parambP); 
    if (this.w != null)
      this.w.ExceptionInVPackage(parambP); 
  }
  
  public boolean f() {
    if (!this.r.isVisible() && this.p.w() < 0)
      this.p.b(this.I.ExceptionInVPackage); 
    this.r.setVisible(!this.r.isVisible());
    this.z.ExceptionInVPackage("showText", this.r.isVisible() + "");
    if (this.u != null)
      this.u.setVisible(this.r.isVisible()); 
    return this.r.isVisible();
  }
  
  protected void ExceptionPrintstacktrace() {
    try {
      for (byte b = 0; b < this.b.size(); b++) {
        double[][] arrayOfDouble = ((Manager)this.b.get(b)).RInterfaceIndia(this.ExceptionInVPackage.p());
        for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
          this.p.b(b, b1, arrayOfDouble[b1][0]);
          if (arrayOfDouble[b1][0] > this.p.ExceptionExtensionGetmessage())
            this.p.CInterfaceDelta(arrayOfDouble[b1][0]); 
          if (arrayOfDouble[b1][0] < this.p.k())
            this.p.e(arrayOfDouble[b1][0]); 
        } 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Error pulling curve y parameter values for CurveGraph: " + this.p, (Exception)ExceptionPrintstacktrace, this);
    } 
    this.p.repaint();
  }
  
  protected void h() {
    try {
      double[][] arrayOfDouble = null;
      if (this.IInterfaceCharlie != null && this.IInterfaceCharlie.size() > 0) {
        for (byte b = 0; b < this.IInterfaceCharlie.size(); b++) {
          arrayOfDouble = ((Manager)this.IInterfaceCharlie.get(b)).RInterfaceIndia(this.ExceptionInVPackage.p());
          for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
            if (b == this.IInterfaceCharlie.size() - 1 && this.b.size() > this.IInterfaceCharlie.size()) {
              for (byte b2 = b; b2 < this.b.size(); b2++)
                this.p.ExceptionInVPackage(b2, b1, arrayOfDouble[b1][0]); 
            } else {
              this.p.ExceptionInVPackage(b, b1, arrayOfDouble[b1][0]);
            } 
            if (arrayOfDouble[b1][0] > this.p.h())
              this.p.b(arrayOfDouble[b1][0]); 
            if (arrayOfDouble[b1][0] < this.p.RInterfaceIndia())
              this.p.IInterfaceCharlie(arrayOfDouble[b1][0]); 
          } 
        } 
      } else {
        arrayOfDouble = new double[((Manager)this.b.get(0)).b()][1];
        for (byte b = 0; b < arrayOfDouble.length; b++)
          arrayOfDouble[b][0] = (this.p.h() - this.p.RInterfaceIndia()) * b / arrayOfDouble.length; 
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.ExceptionInVPackage("Error pulling x curve parameters", (Exception)ExceptionPrintstacktrace, this);
    } 
    this.p.repaint();
  }
  
  private void ExceptionInVPackage(ef[] paramArrayOfef) {
    if (this.r != null)
      if (paramArrayOfef != null && paramArrayOfef.length > 0) {
        ExceptionInVPackage(this.r, paramArrayOfef[paramArrayOfef.length - 1].b());
      } else {
        ExceptionInVPackage(this.r, -1);
      }  
    if (this.v != null)
      this.v.ExceptionInVPackage(paramArrayOfef); 
    if (this.w != null)
      this.w.ExceptionInVPackage(paramArrayOfef); 
  }
  
  private void ExceptionInVPackage(JPanel paramJPanel, int paramInt) {
    if (!this.F)
      for (byte b = 0; b < paramJPanel.getComponentCount(); b++) {
        Component component = paramJPanel.getComponent(b);
        if (component instanceof R) {
          R r = (R)component;
          r.b(paramInt);
          JComponent jComponent = r.b();
          if (jComponent != null) {
            Rectangle rectangle = jComponent.getBounds();
            rectangle.y -= 15;
            rectangle.height += 25;
            this.r.scrollRectToVisible(rectangle);
          } 
        } else if (component instanceof JPanel) {
          ExceptionInVPackage((JPanel)component, paramInt);
        } 
      }  
  }
  
  private void ExceptionInVPackage(int paramInt) {
    if (this.r != null)
      b(this.r, paramInt); 
  }
  
  private void b(JPanel paramJPanel, int paramInt) {
    if (!this.F)
      for (byte b = 0; b < paramJPanel.getComponentCount(); b++) {
        Component component = paramJPanel.getComponent(b);
        if (component instanceof R) {
          R r = (R)component;
          r.ExceptionInVPackage(paramInt);
        } else if (component instanceof JPanel) {
          b((JPanel)component, paramInt);
        } 
      }  
  }
  
  private int ExceptionInVPackage(double paramDouble) {
    double d1 = this.p.ExceptionInVPackage(0, 0);
    for (byte b = 0; b < this.p.CInterfaceDelta(0); b++) {
      double d2 = this.p.ExceptionInVPackage(0, b);
      if (d2 > paramDouble)
        return (b == 0 || Math.abs(d2 - paramDouble) < Math.abs(paramDouble - d1)) ? b : (b - 1); 
      d1 = d2;
    } 
    return this.p.CInterfaceDelta(0) - 1;
  }
  
  public void close() {
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this);
    ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this);
    if (this.B != null)
      ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this.B); 
    if (this.C != null)
      ManagerUsingConcurrentHashMap.ExceptionInVPackage().ExceptionInVPackage(this.C); 
    if (this.r != null)
      this.r.ExceptionInVPackage(); 
    if (this.v != null)
      this.v.close(); 
    if (this.w != null)
      this.w.close(); 
    e();
    this.H = true;
    if (this.K != null)
      IInterfaceCharlie.ExceptionInVPackage().b(this.K); 
    if (this.p != null && this.p.A() != null)
      this.p.A().b(this.N); 
    if (this.p != null && this.p.B() != null)
      this.p.B().b(this.N); 
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (!isEnabled())
      return; 
    int ExceptionExtensionGetmessage = ExceptionInVPackage(paramDouble);
    if (this.x[0] != ExceptionExtensionGetmessage) {
      this.x[0] = ExceptionExtensionGetmessage;
      ExceptionInVPackage(ExceptionExtensionGetmessage);
    } 
    if (this.y && ExceptionExtensionGetmessage != this.p.w()) {
      boolean bool = (this.p.x() >= 0) ? this.p.x() : false;
      ExceptionInVPackage(bool, ExceptionExtensionGetmessage);
      r[] arrayOfR = new r[1];
      arrayOfR[0] = new r(bool, ExceptionExtensionGetmessage);
      ExceptionInVPackage((ef[])arrayOfR);
      this.p.repaint();
    } 
  }
  
  private void IInterfaceCharlie(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  private boolean ExceptionInVPackage(ArrayList paramArrayList, String paramString) {
    Iterator<Manager> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      if (((Manager)iterator.next()).aL().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    if (ExceptionInVPackage(this.b, paramString2)) {
      ExceptionPrintstacktrace();
    } else if (ExceptionInVPackage(this.IInterfaceCharlie, paramString2)) {
      h();
    } else {
      this.p.h(((Manager)this.b.get(0)).s());
      this.p.RInterfaceIndia(((Manager)this.b.get(0)).r());
      ExceptionPrintstacktrace();
      h();
      try {
        v();
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      } 
    } 
  }
  
  public void ExceptionInVPackage(int paramInt1, int paramInt2, double paramDouble) {
    if (this.IInterfaceCharlie.isEmpty())
      return; 
    paramInt1 = (paramInt1 < this.IInterfaceCharlie.size()) ? paramInt1 : (this.IInterfaceCharlie.size() - 1);
    try {
      if (!this.ExceptionInVPackage.p().ExceptionExtensionGetmessage() && p.ExceptionInVPackage(this.P, this.ExceptionInVPackage))
        try {
          ((Manager)this.IInterfaceCharlie.get(paramInt1)).ExceptionInVPackage(this.ExceptionInVPackage.p(), paramDouble, paramInt2, 0);
        } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
          this.p.ExceptionInVPackage(paramInt1, paramInt2, ExceptionExtensionGetmessage.IInterfaceCharlie());
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          D.ExceptionInVPackage("Unable to set Curve X value of " + paramDouble, (Exception)ExceptionPrintstacktrace, this);
        }  
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.b("Failed to update Curve Array Constant");
    } 
  }
  
  public void b(int paramInt1, int paramInt2, double paramDouble) {
    if (!this.ExceptionInVPackage.p().ExceptionExtensionGetmessage())
      try {
        ((Manager)this.b.get(paramInt1)).ExceptionInVPackage(this.ExceptionInVPackage.p(), paramDouble, paramInt2, 0);
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        if (w())
          this.p.b(paramInt1, paramInt2, ExceptionExtensionGetmessage.IInterfaceCharlie()); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.ExceptionInVPackage("Unable to set Curve Y value of " + paramDouble, (Exception)ExceptionPrintstacktrace, this);
      }  
  }
  
  private void v() {
    boolean bool1 = Boolean.parseBoolean(this.z.b(RInterfaceIndia, "" + this.q.v()));
    boolean bool2 = Boolean.parseBoolean(this.z.b(f, "" + this.q.v()));
    this.p.CInterfaceDelta(bool2);
    this.p.e(bool1);
    this.p.f();
    String str1 = null;
    byte b1;
    for (b1 = 0; b1 < this.b.size(); b1++) {
      String str = (this.q.f(b1) != null) ? ExceptionPrintstacktrace.b(this.q.f(b1).ExceptionInVPackage()) : null;
      if (str == null || str.length() == 0)
        if (this.q.m() > 0) {
          str = this.q.f(this.q.m() - 1).ExceptionInVPackage();
        } else if (this.IInterfaceCharlie.size() > b1) {
          str = ((Manager)this.IInterfaceCharlie.get(b1)).aL();
        } else if (!this.IInterfaceCharlie.isEmpty()) {
          str = ((Manager)this.IInterfaceCharlie.get(this.IInterfaceCharlie.size() - 1)).aL();
        } else {
          str = "";
        }  
      if (this.IInterfaceCharlie.size() > 0) {
        boolean bool = (b1 < this.IInterfaceCharlie.size()) ? b1 : (this.IInterfaceCharlie.size() - 1);
        if (!((Manager)this.IInterfaceCharlie.get(bool)).p().equals(""))
          str = str + " (" + ExceptionPrintstacktrace.b(((Manager)this.IInterfaceCharlie.get(bool)).p()) + ")"; 
        if (str1 == null || !str1.equals(str)) {
          this.p.ExceptionInVPackage(str, b1);
          str1 = str;
        } 
        if (b1 == 0)
          this.p.ExceptionPrintstacktrace(Math.max(IInterfaceCharlie(this.IInterfaceCharlie), this.p.q())); 
      } else {
        this.p.ExceptionInVPackage(str, b1);
      } 
    } 
    b1 = 0;
    String str2 = null;
    for (byte b2 = 0; b2 < this.b.size(); b2++) {
      String str;
      if (this.q.IInterfaceCharlie(b2) != null) {
        str = ExceptionPrintstacktrace.b(this.q.IInterfaceCharlie(b2).ExceptionInVPackage()) + " " + ExceptionPrintstacktrace.b(((Manager)this.b.get(b2)).p());
      } else {
        str = ExceptionPrintstacktrace.b(((Manager)this.b.get(b2)).p());
      } 
      this.p.b(str, b2);
      str2 = str;
    } 
    double d1 = ExceptionInVPackage(h, this.q.IInterfaceCharlie() / 2.0D);
    double d2 = ExceptionInVPackage(ExceptionPrintstacktrace, this.q.b());
    if (d2 < this.q.b() || d2 > this.q.IInterfaceCharlie())
      d2 = this.q.b(); 
    if (d1 == d2) {
      d1 = this.q.IInterfaceCharlie();
      d2 = this.q.b();
      this.z.ExceptionInVPackage(ExceptionPrintstacktrace, "");
      this.z.ExceptionInVPackage(h, "");
    } 
    if (bool1) {
      d1 = Double.NEGATIVE_INFINITY;
      d2 = Double.MAX_VALUE;
    } 
    double d3 = ExceptionInVPackage(o, this.q.ExceptionInVPackage());
    for (byte b3 = 0; b3 < this.b.size(); b3++) {
      double[][] arrayOfDouble1 = ((Manager)this.b.get(b3)).RInterfaceIndia(this.ExceptionInVPackage.p());
      double[][] arrayOfDouble2 = null;
      if (this.IInterfaceCharlie != null && this.IInterfaceCharlie.size() > 0) {
        arrayOfDouble2 = ((Manager)this.IInterfaceCharlie.get(b1)).RInterfaceIndia(this.ExceptionInVPackage.p());
        this.p.ExceptionInVPackage(((Manager)this.IInterfaceCharlie.get(b1)).B());
        this.p.ExceptionInVPackage(((Manager)this.IInterfaceCharlie.get(b1)).H());
      } else {
        if (this.q.s() == null) {
          arrayOfDouble2 = new double[((Manager)this.b.get(b3)).b()][1];
          for (byte b = 0; b < arrayOfDouble2.length; b++)
            arrayOfDouble2[b][0] = (this.q.RInterfaceIndia() - this.q.h()) * b / arrayOfDouble2.length; 
        } else {
          double[] arrayOfDouble = this.q.s();
          arrayOfDouble2 = new double[arrayOfDouble.length][1];
          for (byte b = 0; b < arrayOfDouble2.length; b++)
            arrayOfDouble2[b][0] = arrayOfDouble[b]; 
        } 
        this.p.ExceptionInVPackage(true);
      } 
      if (arrayOfDouble1.length != arrayOfDouble2.length)
        D.ExceptionInVPackage("SettingsCurve:" + this.q.aL() + " x/y size mismatch."); 
      double d4 = ExceptionInVPackage(e, this.q.RInterfaceIndia());
      double d5 = ExceptionInVPackage(CInterfaceDelta, this.q.h());
      if (d4 == d5) {
        d4 = this.q.RInterfaceIndia();
        d5 = this.q.h();
        this.z.ExceptionInVPackage(CInterfaceDelta, "");
        this.z.ExceptionInVPackage(e, "");
      } 
      if (this.IInterfaceCharlie.size() > 0 && (d5 < ExceptionInVPackage(this.IInterfaceCharlie) || d5 > b(this.IInterfaceCharlie))) {
        d5 = this.q.h();
        this.z.ExceptionInVPackage(CInterfaceDelta, "" + this.q.h());
      } 
      if (bool2 && this.IInterfaceCharlie != null) {
        d4 = Double.NEGATIVE_INFINITY;
        if (d4 > this.p.q()) {
          d4 = this.p.q();
        } else if (d4 < this.q.h()) {
          d4 = this.q.h();
        } 
        for (byte b = 0; b < arrayOfDouble2.length; b++) {
          this.p.ExceptionInVPackage(b3, arrayOfDouble2[b][0], arrayOfDouble1[b][0]);
          if (arrayOfDouble2[b][0] > d4 + ((Manager)this.IInterfaceCharlie.get(0)).B() * 2.0D) {
            double d6 = (arrayOfDouble2[b][0] + ((Manager)this.IInterfaceCharlie.get(0)).B() * 2.0D > this.p.q()) ? arrayOfDouble2[b][0] : (arrayOfDouble2[b][0] + ((Manager)this.IInterfaceCharlie.get(0)).B() * 2.0D);
            d4 = d6;
          } 
          this.p.IInterfaceCharlie(b3, b, ((Manager)this.b.get(b3)).b(b));
        } 
      } else {
        for (byte b = 0; b < arrayOfDouble2.length; b++) {
          try {
            this.p.ExceptionInVPackage(b3, arrayOfDouble2[b][0], arrayOfDouble1[b][0]);
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bV.CInterfaceDelta("Invalid number of values for curve. All X and Y arrats must be of the same size.", this);
          } 
        } 
      } 
      if (bool1) {
        if (d1 > this.p.r()) {
          d1 = this.p.r();
        } else if (d1 < this.q.b()) {
          d1 = this.q.b();
        } 
        for (byte b = 0; b < arrayOfDouble1.length; b++) {
          if (arrayOfDouble1[b][0] > d1 + ((Manager)this.b.get(b3)).B() * 2.0D) {
            double d6 = (arrayOfDouble1[b][0] + ((Manager)this.b.get(b3)).B() * 2.0D > this.p.r()) ? arrayOfDouble1[b][0] : (arrayOfDouble1[b][0] + ((Manager)this.b.get(b3)).B() * 2.0D);
            d1 = d6;
          } 
          if (arrayOfDouble1[b][0] < d2 - ((Manager)this.b.get(b3)).B() * 2.0D) {
            double d6 = arrayOfDouble1[b][0];
            d2 = d6 - ((Manager)this.b.get(b3)).B() * 2.0D;
          } 
        } 
      } else {
        d1 = ExceptionInVPackage(h, this.q.IInterfaceCharlie());
      } 
      this.p.e(d2);
      this.p.CInterfaceDelta(d1);
      this.p.IInterfaceCharlie(d5);
      this.p.b(d4);
      this.p.l((int)d3);
      if (this.IInterfaceCharlie.size() > b1 + 1)
        b1++; 
    } 
    if (this.q.z())
      this.p.ExceptionInVPackage(true); 
  }
  
  public boolean hasFocus() {
    return ExceptionInVPackage(this);
  }
  
  private boolean ExceptionInVPackage(Component paramComponent) {
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (Component component : container.getComponents()) {
        if (ExceptionInVPackage(component))
          return true; 
      } 
    } 
    return paramComponent.equals(this) ? false : paramComponent.hasFocus();
  }
  
  public R b_() {
    return this.ExceptionInVPackage;
  }
  
  public bN RInterfaceIndia() {
    return this.p;
  }
  
  public T ExceptionExtensionGetmessage() {
    return (this.v != null) ? this.v : ((this.w != null) ? this.w : null);
  }
  
  public boolean k() {
    return (this.q.u() || (this.q.q() != null && !this.q.q().isEmpty()));
  }
  
  public CloneableImplInGPackage l() {
    return this.q;
  }
  
  public String a_() {
    return this.P;
  }
  
  public void c_(String paramString) {
    this.P = paramString;
  }
  
  public void m() {
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
  
  private boolean w() {
    boolean bool = true;
    if (a_() != null)
      try {
        bool = p.ExceptionInVPackage(a_(), this.ExceptionInVPackage);
      } catch (Exception exception) {
        D.ExceptionInVPackage(exception.getMessage());
        exception.printStackTrace();
      }  
    return bool;
  }
  
  public void ExceptionInVPackage(K paramK) {
    this.O.add(paramK);
  }
  
  public void b(K paramK) {
    this.O.remove(paramK);
  }
  
  private void CInterfaceDelta(String paramString) {
    for (K k : this.O)
      k.b(paramString); 
  }
  
  private void e(String paramString) {
    for (K k : this.O)
      k.ExceptionInVPackage(paramString); 
  }
  
  public String CInterfaceDelta() {
    return ((Manager)this.b.get(0)).aL();
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.p.setEnabled(paramBoolean);
    fp.ExceptionInVPackage((Component)this.p, paramBoolean);
    if (this.u != null)
      this.u.setEnabled(paramBoolean); 
    if (this.r != null)
      this.r.setEnabled(paramBoolean); 
    if (this.v != null)
      this.v.setEnabled(paramBoolean); 
    if (this.w != null)
      this.w.setEnabled(paramBoolean); 
  }
  
  public void n() {
    if (this.A == null || !this.A.isAlive())
      this.A = new aP(this); 
    this.A.ExceptionInVPackage();
  }
  
  private void f(String paramString) {
    if (paramString.startsWith(CInterfaceDelta)) {
      String str = bV.ExceptionInVPackage(this, true, CInterfaceDelta, X.ExceptionInVPackage(this.p.RInterfaceIndia()));
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        if (d1 < ExceptionInVPackage(this.IInterfaceCharlie) || d1 > b(this.IInterfaceCharlie)) {
          bV.CInterfaceDelta(str + " is out of range, value must be between " + ExceptionInVPackage(this.IInterfaceCharlie) + " and " + b(this.IInterfaceCharlie), this);
          return;
        } 
        this.p.IInterfaceCharlie(d1);
        this.z.ExceptionInVPackage(CInterfaceDelta, d1 + "");
      } 
    } else if (paramString.startsWith(e)) {
      String str = bV.ExceptionInVPackage(this, true, e, X.ExceptionInVPackage(this.p.h()));
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        if (d1 < ExceptionInVPackage(this.IInterfaceCharlie) || d1 > b(this.IInterfaceCharlie)) {
          bV.CInterfaceDelta(str + " is out of range, value must be between " + ExceptionInVPackage(this.IInterfaceCharlie) + " and " + b(this.IInterfaceCharlie), this);
          return;
        } 
        this.z.ExceptionInVPackage(f, "false");
        this.p.b(d1);
        this.z.ExceptionInVPackage(e, d1 + "");
      } 
    } else if (paramString.startsWith(ExceptionPrintstacktrace)) {
      String str = bV.ExceptionInVPackage(this, true, ExceptionPrintstacktrace, X.ExceptionInVPackage(this.p.k()));
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        if (d1 < ExceptionInVPackage(this.b) || d1 > b(this.b)) {
          bV.CInterfaceDelta(str + " is out of range, value must be between " + ExceptionInVPackage(this.b) + " and " + b(this.b), this);
          return;
        } 
        this.p.e(d1);
        this.z.ExceptionInVPackage(ExceptionPrintstacktrace, d1 + "");
      } 
    } else if (paramString.startsWith(o)) {
      String str = bV.ExceptionInVPackage(this, true, o, X.ExceptionInVPackage(this.p.K()));
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        if (d1 < 1.0D) {
          bV.CInterfaceDelta(str + " is out of range, value must be greater than 1", this);
          return;
        } 
        this.p.l((int)d1);
        this.z.ExceptionInVPackage(o, d1 + "");
      } 
    } else if (paramString.startsWith(h)) {
      String str = bV.ExceptionInVPackage(this, true, h, X.ExceptionInVPackage(this.p.ExceptionExtensionGetmessage()));
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        if (d1 < ExceptionInVPackage(this.b) || d1 > b(this.b)) {
          bV.CInterfaceDelta(str + " is out of range, value must be between " + ExceptionInVPackage(this.b) + " and " + b(this.b), this);
          return;
        } 
        this.z.ExceptionInVPackage(RInterfaceIndia, "false");
        this.p.CInterfaceDelta(d1);
        this.z.ExceptionInVPackage(h, d1 + "");
      } 
    } else if (paramString.equals(k)) {
      String str = bV.ExceptionInVPackage(this, true, k + " (s)", X.ExceptionInVPackage((this.p.G() / 1000)));
      if (str != null && !str.equals("")) {
        int ExceptionExtensionGetmessage = (int)(Double.parseDouble(str) * 1000.0D);
        this.p.k(ExceptionExtensionGetmessage);
        this.z.ExceptionInVPackage(k, ExceptionExtensionGetmessage + "");
      } 
    } else if (paramString.equals(m)) {
      this.p.v();
      this.p.o();
      this.p.repaint();
    } else if (paramString.equals(ExceptionExtensionGetmessage)) {
      IInterfaceCharlie(!this.y);
      this.p.repaint();
    } 
    this.p.repaint();
  }
  
  private void b(int paramInt1, int paramInt2) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    ap ap = new ap(this);
    String str1 = this.z.b(ExceptionPrintstacktrace, "");
    String str2 = (str1.length() == 0) ? ExceptionPrintstacktrace : (ExceptionPrintstacktrace + " (" + str1 + ")");
    JMenuItem jMenuItem = jPopupMenu.add(str2);
    jMenuItem.setActionCommand(ExceptionPrintstacktrace);
    jMenuItem.addActionListener(ap);
    if (str1.length() > 0) {
      jMenuItem = jPopupMenu.add("Reset Y Axis Minimum to Default (" + this.q.b() + ")");
      jMenuItem.addActionListener(new aq(this));
    } 
    str1 = this.z.b(h, "");
    str2 = (str1.length() == 0) ? h : (h + " (" + str1 + ")");
    jMenuItem = jPopupMenu.add(str2);
    jMenuItem.setActionCommand(h);
    jMenuItem.addActionListener(ap);
    if (str1.length() > 0) {
      jMenuItem = jPopupMenu.add("Reset Y Axis Maximum to Default (" + this.q.IInterfaceCharlie() + ")");
      jMenuItem.addActionListener(new ar(this));
    } 
    boolean bool = Boolean.parseBoolean(this.z.b(RInterfaceIndia, "" + this.Q));
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(RInterfaceIndia, bool);
    jCheckBoxMenuItem.addActionListener(new as(this));
    jPopupMenu.add(jCheckBoxMenuItem);
    str1 = this.z.b(CInterfaceDelta, "");
    str2 = (str1.length() == 0) ? CInterfaceDelta : (CInterfaceDelta + " (" + str1 + ")");
    jMenuItem = jPopupMenu.add(str2);
    jMenuItem.setActionCommand(CInterfaceDelta);
    jMenuItem.addActionListener(ap);
    if (str1.length() > 0) {
      jMenuItem = jPopupMenu.add("Reset X Axis Minimum to Default (" + this.q.h() + ")");
      jMenuItem.addActionListener(new at(this));
    } 
    str1 = this.z.b(e, "");
    str2 = (str1.length() == 0) ? e : (e + " (" + str1 + ")");
    jMenuItem = jPopupMenu.add(str2);
    jMenuItem.setActionCommand(e);
    jMenuItem.addActionListener(ap);
    if (str1.length() > 0) {
      jMenuItem = jPopupMenu.add("Reset X Axis Maximum to Default (" + this.q.RInterfaceIndia() + ")");
      jMenuItem.addActionListener(new au(this));
    } 
    bool = Boolean.parseBoolean(this.z.b(f, "" + this.Q));
    jCheckBoxMenuItem = new JCheckBoxMenuItem(f, bool);
    jCheckBoxMenuItem.addActionListener(new av(this));
    jPopupMenu.add(jCheckBoxMenuItem);
    if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage(";lkdsaop9ewqewqgd")) {
      jPopupMenu.addSeparator();
      jPopupMenu.add(k).addActionListener(ap);
      boolean bool1 = Boolean.parseBoolean(this.z.b(l, "false"));
      jCheckBoxMenuItem = new JCheckBoxMenuItem(l, bool1);
      jCheckBoxMenuItem.addActionListener(new aw(this));
      jPopupMenu.add(jCheckBoxMenuItem);
      jPopupMenu.add(m).addActionListener(ap);
      if (RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("67hgyusg432gvrewhgfds")) {
        boolean bool2 = Boolean.parseBoolean(this.z.b(n, "" + this.q.A()));
        jCheckBoxMenuItem = new JCheckBoxMenuItem(n, bool2);
        jCheckBoxMenuItem.addActionListener(new ax(this));
        jCheckBoxMenuItem.setEnabled((IInterfaceCharlie.ExceptionInVPackage().e() != null));
        jPopupMenu.add(jCheckBoxMenuItem);
      } 
      jCheckBoxMenuItem = new JCheckBoxMenuItem(ExceptionExtensionGetmessage, this.y);
      jCheckBoxMenuItem.addActionListener(ap);
      jPopupMenu.add(jCheckBoxMenuItem);
      str1 = this.z.b(o, "");
      str2 = (str1.length() == 0) ? o : (o + " (" + str1 + ")");
      jMenuItem = jPopupMenu.add(str2);
      jMenuItem.setActionCommand(o);
      jMenuItem.addActionListener(ap);
      if (str1.length() > 0) {
        jMenuItem = jPopupMenu.add("Reset Coarse Step Count to Default (" + this.q.ExceptionInVPackage() + ")");
        jMenuItem.addActionListener(new ay(this));
      } 
    } 
    this.p.add(jPopupMenu);
    jPopupMenu.show(this, paramInt1, paramInt2);
  }
  
  private void x() {
    boolean bool = !Boolean.parseBoolean(this.z.b(l, "false")) ? true : false;
    this.z.ExceptionInVPackage(l, bool + "");
    this.p.f(bool);
    this.p.o();
    this.p.repaint();
  }
  
  public double ExceptionInVPackage(String paramString, double paramDouble) {
    String str = this.z.ExceptionInVPackage(paramString);
    if (str == null || str.equals(""))
      return paramDouble; 
    try {
      return Double.parseDouble(str);
    } catch (Exception exception) {
      return paramDouble;
    } 
  }
  
  public Double[][] o() {
    Double[][] arrayOfDouble;
    if (this.F && this.v != null)
      return this.v.e().RInterfaceIndia(); 
    if (this.F && this.w != null)
      return this.w.e().RInterfaceIndia(); 
    int ExceptionExtensionGetmessage = 0;
    if (this.q.z()) {
      arrayOfDouble = new Double[this.b.size()][((Manager)this.b.get(0)).b()];
    } else {
      arrayOfDouble = new Double[this.b.size() + this.IInterfaceCharlie.size()][((Manager)this.b.get(0)).b()];
      for (byte b = 0; b < this.IInterfaceCharlie.size(); b++) {
        Manager Manager = this.IInterfaceCharlie.get(b);
        try {
          double[][] arrayOfDouble1 = Manager.RInterfaceIndia(this.ExceptionInVPackage.h());
          for (byte b1 = 0; b1 < Manager.b(); b1++)
            arrayOfDouble[b][b1] = Double.valueOf(arrayOfDouble1[b1][0]); 
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          D.ExceptionInVPackage("Failed to get values for Curve xParam: " + Manager.aL());
          Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        } 
      } 
      ExceptionExtensionGetmessage = this.IInterfaceCharlie.size();
    } 
    for (int k = ExceptionExtensionGetmessage; k < this.b.size(); k++) {
      Manager Manager = this.b.get(k - ExceptionExtensionGetmessage);
      try {
        double[][] arrayOfDouble1 = Manager.RInterfaceIndia(this.ExceptionInVPackage.h());
        for (byte b = 0; b < Manager.b(); b++)
          arrayOfDouble[k][b] = Double.valueOf(arrayOfDouble1[b][0]); 
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.ExceptionInVPackage("Failed to get values for Curve yParam: " + Manager.aL());
        Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      } 
    } 
    return arrayOfDouble;
  }
  
  public void ExceptionInVPackage(Double[][] paramArrayOfDouble) {
    if (this.F && this.v != null) {
      this.v.e().ExceptionInVPackage(paramArrayOfDouble);
    } else if (this.F && this.w != null) {
      this.w.e().ExceptionInVPackage(paramArrayOfDouble);
    } 
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    this.r.setVisible(paramBoolean);
  }
  
  public void ExceptionInVPackage(int paramInt1, int paramInt2) {
    this.p.b(paramInt1, paramInt2);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */