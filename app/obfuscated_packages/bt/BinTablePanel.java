package bt;

import G.R;
import G.aN;
import G.aR;
import G.bh;
import G.bm;
import G.bv;
import G.cq;
import G.cu;
import G.db;
import G.RInterfaceIndia;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bF.TableModelListenerUsingArrayList;
import bF.ManagerGetcolumnname;
import bH.D;
import c.TableModelListenerUsingArrayList;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.ef;
import com.efiAnalytics.ui.eo;
import com.efiAnalytics.ui.et;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import r.RInterfaceIndia;

public class BinTablePanel extends JPanel implements aN, cq, TextChangeNotifier, bP, TableModelListenerUsingArrayList, bc {
  bh ExceptionInVPackage;
  
  TableModelListenerUsingArrayList b;
  
  ManagerGetcolumnname c;
  
  R TableModelListenerUsingArrayList;
  
  V e = new V(this);
  
  String f = null;
  
  bP ExceptionPrintstacktrace = null;
  
  List h = new ArrayList();
  
  public T(R paramR, bm parambm, boolean paramBoolean1, boolean paramBoolean2) {
    String str = parambm.aL() + "_accessoryTable";
    if (paramBoolean1)
      str = str + "_vertical"; 
    bv bv = paramR.e().c(str);
    if (bv != null && !(bv instanceof bh))
      throw new ExceptionPrintstacktrace(str + ", name already used but not defined as ExceptionInVPackage 1DTable"); 
    this.ExceptionInVPackage = (bh)bv;
    if (this.ExceptionInVPackage == null) {
      this.ExceptionInVPackage = new bh();
      this.ExceptionInVPackage.b(parambm.l());
      byte b;
      for (b = 0; b < parambm.TableModelListenerUsingArrayList(); b++)
        this.ExceptionInVPackage.ExceptionInVPackage(parambm.b(b), parambm.ExceptionInVPackage(b)); 
      if (parambm.k() > 0) {
        for (b = 0; b < parambm.k(); b++) {
          db db = parambm.e(b);
          this.ExceptionInVPackage.ExceptionInVPackage(db);
        } 
      } else {
        for (b = 0; b < parambm.ExceptionPrintstacktrace(); b++) {
          db db = parambm.c(b);
          this.ExceptionInVPackage.ExceptionInVPackage(db);
        } 
      } 
      for (b = 0; b < parambm.k(); b++)
        this.ExceptionInVPackage.b(parambm.e(b)); 
      for (b = 0; b < parambm.m(); b++)
        this.ExceptionInVPackage.c(parambm.f(b)); 
      for (b = 0; b < parambm.j(); b++)
        this.ExceptionInVPackage.ExceptionInVPackage(parambm.TableModelListenerUsingArrayList(b)); 
      this.ExceptionInVPackage.b(paramBoolean1);
      this.ExceptionInVPackage.u(parambm.aJ());
      this.ExceptionInVPackage.ExceptionPrintstacktrace(parambm.n());
      this.ExceptionInVPackage.ExceptionInVPackage(parambm.z());
      this.ExceptionInVPackage.v(str);
      paramR.e().ExceptionInVPackage((bv)this.ExceptionInVPackage);
    } else if (!paramBoolean2) {
      this.ExceptionInVPackage.b(paramBoolean1);
      this.ExceptionInVPackage.u(parambm.aJ());
      this.ExceptionInVPackage.ExceptionPrintstacktrace(parambm.n());
      this.ExceptionInVPackage.ExceptionInVPackage(parambm.z());
      this.ExceptionInVPackage.v(str);
    } 
    ExceptionInVPackage(paramR, this.ExceptionInVPackage, paramBoolean2);
  }
  
  private void ExceptionInVPackage(R paramR, bh parambh, boolean paramBoolean) {
    this.TableModelListenerUsingArrayList = paramR;
    this.ExceptionInVPackage = parambh;
    this.f = parambh.aJ();
    if (paramBoolean) {
      this.c = bQ.ExceptionInVPackage().c(paramR, parambh.aL(), parambh.aM());
    } else {
      this.c = bQ.ExceptionInVPackage().c(paramR, parambh.aL());
    } 
    this.b = new TableModelListenerUsingArrayList(this.c);
    this.b.b(RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("joijt;i609tr0932"));
    this.b.e().addFocusListener(new U(this));
    setLayout(new BorderLayout());
    add("Center", (Component)this.b);
    try {
      aR.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), parambh.TableModelListenerUsingArrayList(0), this);
    } catch (Exception exception) {
      D.TableModelListenerUsingArrayList("No Column Parameter");
    } 
    byte b;
    for (b = 0; b < this.ExceptionInVPackage.f(); b++) {
      try {
        RInterfaceIndia.ExceptionInVPackage(paramR.c(), this.ExceptionInVPackage.f(b), this);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(T.class.getName()).log(Level.WARNING, "Failed to setup listener for label changes.", (Throwable)ExceptionInVPackage);
      } 
    } 
    for (b = 0; b < this.ExceptionInVPackage.c(); b++) {
      try {
        RInterfaceIndia.ExceptionInVPackage(paramR.c(), this.ExceptionInVPackage.e(b), this);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(T.class.getName()).log(Level.WARNING, "Failed to setup listener for label changes.", (Throwable)ExceptionInVPackage);
      } 
    } 
  }
  
  public void ExceptionInVPackage(et paramet) {
    this.b.ExceptionInVPackage(paramet);
  }
  
  public void ExceptionInVPackage(eo parameo) {
    this.b.ExceptionInVPackage(parameo);
  }
  
  public void ExceptionInVPackage(ef[] paramArrayOfef) {
    this.b.ExceptionInVPackage(paramArrayOfef);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.b.setEnabled(paramBoolean);
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    this.b.b();
  }
  
  public void close() {
    aR.ExceptionInVPackage().ExceptionInVPackage(this);
    cu.ExceptionInVPackage().ExceptionInVPackage(this);
    b();
  }
  
  public void c() {
    if (this.e == null)
      this.e = new V(this); 
    this.e.ExceptionInVPackage();
  }
  
  public void ExceptionInVPackage(Color paramColor) {
    this.b.ExceptionInVPackage(paramColor);
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {}
  
  public ManagerGetcolumnname e() {
    return this.b.ExceptionInVPackage();
  }
  
  public void ExceptionInVPackage(int paramInt) {
    this.b.b(paramInt);
  }
  
  public Dimension b(int paramInt) {
    return this.b.c(paramInt);
  }
  
  public R b_() {
    return this.TableModelListenerUsingArrayList;
  }
  
  public String a_() {
    return this.f;
  }
  
  public void c_(String paramString) {
    this.f = paramString;
  }
  
  public TableModelListenerUsingArrayList f() {
    return this.b;
  }
  
  public void ExceptionInVPackage() {
    if (this.ExceptionPrintstacktrace == null) {
      this.ExceptionPrintstacktrace = new F(this.TableModelListenerUsingArrayList, this.ExceptionInVPackage, this);
    } else {
      this.ExceptionPrintstacktrace.b();
    } 
    this.ExceptionPrintstacktrace.ExceptionInVPackage();
  }
  
  public void b() {
    if (this.ExceptionPrintstacktrace != null)
      this.ExceptionPrintstacktrace.b(); 
  }
  
  public void ExceptionInVPackage(bP parambP) {
    b();
    this.ExceptionPrintstacktrace = parambP;
    if (parambP != null)
      parambP.ExceptionInVPackage(); 
  }
  
  public bh ExceptionPrintstacktrace() {
    return this.ExceptionInVPackage;
  }
  
  protected void c(int paramInt) {
    this.b.ExceptionInVPackage(paramInt);
  }
  
  public void ExceptionInVPackage(K paramK) {
    this.h.add(paramK);
  }
  
  public void b(K paramK) {
    this.h.remove(paramK);
  }
  
  public String TableModelListenerUsingArrayList() {
    return this.ExceptionInVPackage.b(0);
  }
  
  private void b(String paramString) {
    for (K k : this.h)
      k.b(paramString); 
  }
  
  private void c(String paramString) {
    for (K k : this.h)
      k.ExceptionInVPackage(paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */