package u;

import G.R;
import G.Manager;
import G.Abstract;
import G.ExceptionprintstacktraceInGPackage;
import G.CloneableImpl;
import G.GComponentBq;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.z;
import V.ExceptionPrintstacktrace;
import bH.ac;
import bt.ManagerIinterfacecharlie;
import bt.ExceptionEqualsinaipackage;
import bt.TableModelListenerRequestfocusinwindow;
import com.efiAnalytics.tuningwidgets.panels.W;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dy;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CloseInUPackage implements bc, dy {
  HashMap a = new HashMap<>();
  
  HashMap b = new HashMap<>();
  
  ArrayList c = new ArrayList();
  
  int d = 0;
  
  R e;
  
  R f;
  
  public CloseInUPackage(R paramR1, R paramR2, ArrayList paramArrayList) {
    this.e = paramR1;
    this.f = paramR2;
    z z = new z(ac.a().b());
    ArrayList<ArrayListExceptionprintstacktraceInGPackage> arrayList1 = z.a(paramR1, paramArrayList);
    ArrayList<ArrayListExceptionprintstacktraceInGPackage> arrayList2 = z.b(paramR1, arrayList1);
    byte b1 = 0;
    byte b2 = 2;
    byte b3 = 0;
    ArrayList<ArrayListExceptionprintstacktraceInGPackage> arrayList3 = null;
    int i = 0;
    byte b4;
    for (b4 = 0; b4 < arrayList2.size(); b4++) {
      ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = arrayList2.get(b4);
      if (ArrayListExceptionprintstacktraceInGPackage instanceof CloneableImpl || (ArrayListExceptionprintstacktraceInGPackage.Z() == 1 && ArrayListExceptionprintstacktraceInGPackage.j(0) instanceof CloneableImpl)) {
        CloneableImpl CloneableImpl;
        if (ArrayListExceptionprintstacktraceInGPackage instanceof CloneableImpl) {
          CloneableImpl = (CloneableImpl)ArrayListExceptionprintstacktraceInGPackage;
        } else {
          CloneableImpl = (CloneableImpl)ArrayListExceptionprintstacktraceInGPackage.j(0);
        } 
        String str = CloneableImpl.a();
        Manager Manager = paramR1.c(str);
        if (Manager != null && Manager.b() > i) {
          i = Manager.b();
          if (b4 > 0) {
            ArrayListExceptionprintstacktraceInGPackage bv1 = arrayList2.get(0);
            arrayList2.set(0, ArrayListExceptionprintstacktraceInGPackage);
            arrayList2.set(b4, bv1);
          } 
        } 
      } 
    } 
    if (arrayList2.size() > 0) {
      for (b4 = 0; b4 < arrayList2.size(); b4++) {
        if (b4 % b2 == 0) {
          arrayList3 = new ArrayList();
          this.b.put(Integer.valueOf(b3++), arrayList3);
        } 
        ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = arrayList2.get(b4);
        arrayList3.add(ArrayListExceptionprintstacktraceInGPackage);
        b1++;
      } 
    } else if (arrayList1.size() > 0) {
      for (b4 = 0; b4 < arrayList1.size(); b4++) {
        if (b4 % b2 == 0) {
          arrayList3 = new ArrayList<>();
          this.b.put(Integer.valueOf(b3++), arrayList3);
        } 
        ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = arrayList1.get(b4);
        arrayList3.add(ArrayListExceptionprintstacktraceInGPackage);
        b1++;
      } 
    } else {
      ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = new ArrayListExceptionprintstacktraceInGPackage();
      ArrayListExceptionprintstacktraceInGPackage.i(1);
      for (Manager Manager : paramArrayList) {
        if (!Manager.i().equals("array")) {
          GComponentBq GComponentBq = new GComponentBq();
          GComponentBq.b(Manager.aL());
          GComponentBq.e(Manager.aL() + " raw value:");
          ArrayListExceptionprintstacktraceInGPackage.a((Abstract)GComponentBq);
          b1++;
          continue;
        } 
        if (Manager.i().equals("array")) {
          GComponentBq GComponentBq = new GComponentBq();
          GComponentBq.e(Manager.aL() + " values are different.");
          ArrayListExceptionprintstacktraceInGPackage.a((Abstract)GComponentBq);
          b1++;
        } 
      } 
      ArrayList<ArrayListExceptionprintstacktraceInGPackage> arrayList = new ArrayList();
      arrayList.add(ArrayListExceptionprintstacktraceInGPackage);
      this.b.put(Integer.valueOf(0), arrayList);
    } 
    Iterator<Manager> iterator = paramArrayList.iterator();
    while (iterator.hasNext())
      this.c.add(((Manager)iterator.next()).aL()); 
  }
  
  public int a() {
    return this.b.size();
  }
  
  public boolean b() {
    return (this.d < a() - 1);
  }
  
  public boolean c() {
    return (this.d > 0);
  }
  
  public Component a(int paramInt) {
    e e = (e)this.a.get(Integer.valueOf(paramInt));
    if (e == null) {
      e = new e(this);
      e.setLayout(new GridLayout(0, 2));
      ArrayListExceptionprintstacktraceInGPackage bv1 = new ArrayListExceptionprintstacktraceInGPackage();
      bv1.i(1);
      ArrayListExceptionprintstacktraceInGPackage bv2 = new ArrayListExceptionprintstacktraceInGPackage();
      bv2.i(1);
      List<ArrayListExceptionprintstacktraceInGPackage> list = (List)this.b.get(Integer.valueOf(paramInt));
      for (byte b = 0; b < list.size(); b++) {
        ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = list.get(b);
        String str = ExceptionprintstacktraceInGPackage.c(this.e, ArrayListExceptionprintstacktraceInGPackage.aL());
        ArrayListExceptionprintstacktraceInGPackage.s(str);
        boolean bool = W.a(this.e, ArrayListExceptionprintstacktraceInGPackage, bV.c());
        if (!bool) {
          ArrayListExceptionprintstacktraceInGPackage bv3 = new ArrayListExceptionprintstacktraceInGPackage();
          GComponentBq GComponentBq = new GComponentBq();
          GComponentBq.e(" ");
          bv3.a((Abstract)GComponentBq);
          GComponentBq = new GComponentBq();
          GComponentBq.e(str);
          bv3.a((Abstract)GComponentBq);
          GComponentBq = new GComponentBq();
          GComponentBq.e(str + " is Password Protected.");
          GComponentBq.b(true);
          bv3.a((Abstract)GComponentBq);
          GComponentBq = new GComponentBq();
          GComponentBq.e("To view, click Exit & Go offline, then when you go back online enter the correct password.");
          bv3.a((Abstract)GComponentBq);
          list.set(b, bv3);
        } 
      } 
      for (ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage : list) {
        if (ArrayListExceptionprintstacktraceInGPackage instanceof CloneableImpl || ArrayListExceptionprintstacktraceInGPackage instanceof G.bm) {
          ArrayListExceptionprintstacktraceInGPackage bv3 = new ArrayListExceptionprintstacktraceInGPackage();
          bv3.i(2);
          try {
            ArrayListExceptionprintstacktraceInGPackage.t("Center");
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
          } 
          String str = ExceptionprintstacktraceInGPackage.c(this.e, ArrayListExceptionprintstacktraceInGPackage.aL());
          bv3.s(str);
          bv3.a(ArrayListExceptionprintstacktraceInGPackage);
          ArrayListExceptionprintstacktraceInGPackage = bv3;
        } 
        bv1.a(ArrayListExceptionprintstacktraceInGPackage);
        bv2.a(ArrayListExceptionprintstacktraceInGPackage);
      } 
      ExceptionEqualsinaipackage bh1 = new ExceptionEqualsinaipackage(this.e, bv1, false);
      e.add((Component)bh1);
      ExceptionEqualsinaipackage bh2 = new ExceptionEqualsinaipackage(this.f, bv2, false);
      e.add((Component)bh2);
      ArrayList arrayList1 = a(bh1);
      ArrayList arrayList2 = a(bh2);
      Iterator<TableModelListenerRequestfocusinwindow> iterator1 = arrayList1.iterator();
      Iterator<TableModelListenerRequestfocusinwindow> iterator2 = arrayList2.iterator();
      while (iterator2.hasNext()) {
        TableModelListenerRequestfocusinwindow bu1 = iterator1.next();
        TableModelListenerRequestfocusinwindow bu2 = iterator2.next();
        bu2.a(bu1.ExceptionPrintstacktrace());
      } 
      ArrayList arrayList3 = b(bh1);
      ArrayList arrayList4 = b(bh2);
      Iterator<ManagerIinterfacecharlie> iterator3 = arrayList3.iterator();
      int i = (Toolkit.getDefaultToolkit().getScreenSize()).width * 4 / 10;
      Iterator<ManagerIinterfacecharlie> iterator4 = arrayList4.iterator();
      while (iterator4.hasNext()) {
        ManagerIinterfacecharlie an1 = iterator3.next();
        ManagerIinterfacecharlie an2 = iterator4.next();
        Dimension dimension = an2.getPreferredSize();
        if (dimension.width > i) {
          dimension.width = i;
          an2.setPreferredSize(dimension);
        } 
        dimension = an1.getPreferredSize();
        if (dimension.width > i) {
          dimension.width = i;
          an1.setPreferredSize(dimension);
        } 
        dimension = an2.getMinimumSize();
        if (dimension.width > i) {
          dimension.width = i;
          an2.setMinimumSize(dimension);
        } 
        dimension = an1.getMinimumSize();
        if (dimension.width > i) {
          dimension.width = i;
          an1.setMinimumSize(dimension);
        } 
        an2.a(an1.o());
        if (!an2.k()) {
          an2.a(true);
          an1.a(true);
        } 
      } 
      bh1.a();
      bh2.a();
      bh1.a(this.c);
      bh2.a(this.c);
      this.a.put(Integer.valueOf(paramInt), e);
    } 
    this.d = paramInt;
    return e;
  }
  
  public int d() {
    return this.d;
  }
  
  public void a(Component paramComponent) {}
  
  public void b(Component paramComponent) {}
  
  public void close() {
    for (Component component : this.a.values()) {
      if (component instanceof bc)
        ((bc)component).close(); 
    } 
  }
  
  private ArrayList a(ExceptionEqualsinaipackage parambh) {
    ArrayList arrayList = new ArrayList();
    return a(arrayList, parambh);
  }
  
  private ArrayList b(ExceptionEqualsinaipackage parambh) {
    ArrayList arrayList = new ArrayList();
    return b(arrayList, parambh);
  }
  
  private ArrayList a(ArrayList<TableModelListenerRequestfocusinwindow> paramArrayList, ExceptionEqualsinaipackage parambh) {
    for (byte b = 0; b < parambh.getComponentCount(); b++) {
      if (parambh.getComponent(b) instanceof TableModelListenerRequestfocusinwindow) {
        paramArrayList.add((TableModelListenerRequestfocusinwindow)parambh.getComponent(b));
      } else if (parambh.getComponent(b) instanceof ExceptionEqualsinaipackage) {
        a(paramArrayList, (ExceptionEqualsinaipackage)parambh.getComponent(b));
      } 
    } 
    return paramArrayList;
  }
  
  private ArrayList b(ArrayList<ManagerIinterfacecharlie> paramArrayList, ExceptionEqualsinaipackage parambh) {
    for (byte b = 0; b < parambh.getComponentCount(); b++) {
      if (parambh.getComponent(b) instanceof ManagerIinterfacecharlie) {
        paramArrayList.add((ManagerIinterfacecharlie)parambh.getComponent(b));
      } else if (parambh.getComponent(b) instanceof ExceptionEqualsinaipackage) {
        b(paramArrayList, (ExceptionEqualsinaipackage)parambh.getComponent(b));
      } 
    } 
    return paramArrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/u/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */