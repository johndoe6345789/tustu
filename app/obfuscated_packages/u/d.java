package u;

import G.R;
import G.aM;
import G.bA;
import G.bM;
import G.be;
import G.bq;
import G.bv;
import G.z;
import V.g;
import bH.ac;
import bt.an;
import bt.bh;
import bt.bu;
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

public class d implements bc, dy {
  HashMap a = new HashMap<>();
  
  HashMap b = new HashMap<>();
  
  ArrayList c = new ArrayList();
  
  int d = 0;
  
  R e;
  
  R f;
  
  public d(R paramR1, R paramR2, ArrayList paramArrayList) {
    this.e = paramR1;
    this.f = paramR2;
    z z = new z(ac.a().b());
    ArrayList<bv> arrayList1 = z.a(paramR1, paramArrayList);
    ArrayList<bv> arrayList2 = z.b(paramR1, arrayList1);
    byte b1 = 0;
    byte b2 = 2;
    byte b3 = 0;
    ArrayList<bv> arrayList3 = null;
    int i = 0;
    byte b4;
    for (b4 = 0; b4 < arrayList2.size(); b4++) {
      bv bv = arrayList2.get(b4);
      if (bv instanceof be || (bv.Z() == 1 && bv.j(0) instanceof be)) {
        be be;
        if (bv instanceof be) {
          be = (be)bv;
        } else {
          be = (be)bv.j(0);
        } 
        String str = be.a();
        aM aM = paramR1.c(str);
        if (aM != null && aM.b() > i) {
          i = aM.b();
          if (b4 > 0) {
            bv bv1 = arrayList2.get(0);
            arrayList2.set(0, bv);
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
        bv bv = arrayList2.get(b4);
        arrayList3.add(bv);
        b1++;
      } 
    } else if (arrayList1.size() > 0) {
      for (b4 = 0; b4 < arrayList1.size(); b4++) {
        if (b4 % b2 == 0) {
          arrayList3 = new ArrayList<>();
          this.b.put(Integer.valueOf(b3++), arrayList3);
        } 
        bv bv = arrayList1.get(b4);
        arrayList3.add(bv);
        b1++;
      } 
    } else {
      bv bv = new bv();
      bv.i(1);
      for (aM aM : paramArrayList) {
        if (!aM.i().equals("array")) {
          bq bq = new bq();
          bq.b(aM.aL());
          bq.e(aM.aL() + " raw value:");
          bv.a((bA)bq);
          b1++;
          continue;
        } 
        if (aM.i().equals("array")) {
          bq bq = new bq();
          bq.e(aM.aL() + " values are different.");
          bv.a((bA)bq);
          b1++;
        } 
      } 
      ArrayList<bv> arrayList = new ArrayList();
      arrayList.add(bv);
      this.b.put(Integer.valueOf(0), arrayList);
    } 
    Iterator<aM> iterator = paramArrayList.iterator();
    while (iterator.hasNext())
      this.c.add(((aM)iterator.next()).aL()); 
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
      bv bv1 = new bv();
      bv1.i(1);
      bv bv2 = new bv();
      bv2.i(1);
      List<bv> list = (List)this.b.get(Integer.valueOf(paramInt));
      for (byte b = 0; b < list.size(); b++) {
        bv bv = list.get(b);
        String str = bM.c(this.e, bv.aL());
        bv.s(str);
        boolean bool = W.a(this.e, bv, bV.c());
        if (!bool) {
          bv bv3 = new bv();
          bq bq = new bq();
          bq.e(" ");
          bv3.a((bA)bq);
          bq = new bq();
          bq.e(str);
          bv3.a((bA)bq);
          bq = new bq();
          bq.e(str + " is Password Protected.");
          bq.b(true);
          bv3.a((bA)bq);
          bq = new bq();
          bq.e("To view, click Exit & Go offline, then when you go back online enter the correct password.");
          bv3.a((bA)bq);
          list.set(b, bv3);
        } 
      } 
      for (bv bv : list) {
        if (bv instanceof be || bv instanceof G.bm) {
          bv bv3 = new bv();
          bv3.i(2);
          try {
            bv.t("Center");
          } catch (g g) {
            Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
          } 
          String str = bM.c(this.e, bv.aL());
          bv3.s(str);
          bv3.a(bv);
          bv = bv3;
        } 
        bv1.a(bv);
        bv2.a(bv);
      } 
      bh bh1 = new bh(this.e, bv1, false);
      e.add((Component)bh1);
      bh bh2 = new bh(this.f, bv2, false);
      e.add((Component)bh2);
      ArrayList arrayList1 = a(bh1);
      ArrayList arrayList2 = a(bh2);
      Iterator<bu> iterator1 = arrayList1.iterator();
      Iterator<bu> iterator2 = arrayList2.iterator();
      while (iterator2.hasNext()) {
        bu bu1 = iterator1.next();
        bu bu2 = iterator2.next();
        bu2.a(bu1.g());
      } 
      ArrayList arrayList3 = b(bh1);
      ArrayList arrayList4 = b(bh2);
      Iterator<an> iterator3 = arrayList3.iterator();
      int i = (Toolkit.getDefaultToolkit().getScreenSize()).width * 4 / 10;
      Iterator<an> iterator4 = arrayList4.iterator();
      while (iterator4.hasNext()) {
        an an1 = iterator3.next();
        an an2 = iterator4.next();
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
  
  private ArrayList a(bh parambh) {
    ArrayList arrayList = new ArrayList();
    return a(arrayList, parambh);
  }
  
  private ArrayList b(bh parambh) {
    ArrayList arrayList = new ArrayList();
    return b(arrayList, parambh);
  }
  
  private ArrayList a(ArrayList<bu> paramArrayList, bh parambh) {
    for (byte b = 0; b < parambh.getComponentCount(); b++) {
      if (parambh.getComponent(b) instanceof bu) {
        paramArrayList.add((bu)parambh.getComponent(b));
      } else if (parambh.getComponent(b) instanceof bh) {
        a(paramArrayList, (bh)parambh.getComponent(b));
      } 
    } 
    return paramArrayList;
  }
  
  private ArrayList b(ArrayList<an> paramArrayList, bh parambh) {
    for (byte b = 0; b < parambh.getComponentCount(); b++) {
      if (parambh.getComponent(b) instanceof an) {
        paramArrayList.add((an)parambh.getComponent(b));
      } else if (parambh.getComponent(b) instanceof bh) {
        b(paramArrayList, (bh)parambh.getComponent(b));
      } 
    } 
    return paramArrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/u/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */