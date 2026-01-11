package G;

import V.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class bv extends Q implements Serializable {
  private db a = new c("");
  
  private ArrayList f = new ArrayList();
  
  private String g = "yAxis";
  
  private int h = 1;
  
  private boolean i = false;
  
  ArrayList b = new ArrayList();
  
  ArrayList c = new ArrayList();
  
  ArrayList d = new ArrayList();
  
  ArrayList e = new ArrayList();
  
  private String j = null;
  
  private boolean k = false;
  
  private String l = null;
  
  private String m = null;
  
  public void a(bI parambI) {
    this.e.add(parambI);
  }
  
  public void b(bI parambI) {
    this.e.remove(parambI);
  }
  
  public void a(bA parambA) {
    this.c.add(parambA);
  }
  
  public Iterator F() {
    return this.c.iterator();
  }
  
  public List G() {
    ArrayList arrayList = new ArrayList();
    arrayList.addAll(this.c);
    for (bv bv1 : this.d)
      arrayList.addAll(bv1.G()); 
    return arrayList;
  }
  
  public int H() {
    return this.c.size();
  }
  
  public void a(aA paramaA) {
    this.b.add(paramaA);
  }
  
  public Iterator I() {
    ArrayList<aA> arrayList = new ArrayList();
    for (bv bv1 : this.d) {
      Iterator<aA> iterator1 = bv1.I();
      while (iterator1.hasNext())
        arrayList.add(iterator1.next()); 
    } 
    Iterator<aA> iterator = this.b.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList.iterator();
  }
  
  public int J() {
    int i = 0;
    for (bv bv1 : this.d)
      i += bv1.J(); 
    i += this.b.size();
    return i;
  }
  
  public void a(bv parambv) {
    this.d.add(parambv);
  }
  
  public Iterator K() {
    return this.d.iterator();
  }
  
  public boolean L() {
    return !this.d.isEmpty();
  }
  
  public String M() {
    try {
      return this.a.a();
    } catch (g g) {
      Logger.getLogger(bv.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      return "";
    } 
  }
  
  public db N() {
    return this.a;
  }
  
  public void s(String paramString) {
    this.a = new c(paramString);
  }
  
  public void d(db paramdb) {
    this.a = paramdb;
  }
  
  public ArrayList O() {
    ArrayList arrayList = P();
    ArrayList<String> arrayList1 = new ArrayList();
    for (db db1 : arrayList) {
      try {
        if (!arrayList1.contains(db1.a()))
          arrayList1.add(db1.a()); 
      } catch (g g) {
        Logger.getLogger(bv.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } 
    } 
    return arrayList1;
  }
  
  public ArrayList P() {
    if (this.d.size() > 0) {
      ArrayList arrayList = new ArrayList();
      arrayList.addAll(this.f);
      Iterator<bv> iterator = this.d.iterator();
      while (iterator.hasNext())
        arrayList.addAll(((bv)iterator.next()).P()); 
      return arrayList;
    } 
    return this.f;
  }
  
  public void e(db paramdb) {
    this.f.add(paramdb);
  }
  
  public String Q() {
    return this.g;
  }
  
  public void t(String paramString) {
    if (paramString == null || paramString.equals(""))
      paramString = "yAxis"; 
    if (paramString.equals("Center") || paramString.equals("East") || paramString.equals("North") || paramString.equals("South") || paramString.equals("West") || paramString.equals("xAxis") || paramString.equals("yAxis") || paramString.equals("Default")) {
      this.g = paramString;
    } else {
      throw new g("Unknown placement constraint " + paramString + ", Valid values: " + "Center" + ", " + "East" + ", " + "North" + ", " + "South" + ", " + "West" + ", " + "Default");
    } 
  }
  
  public int R() {
    return this.h;
  }
  
  public void i(int paramInt) {
    this.h = paramInt;
  }
  
  public boolean n() {
    if (this.i)
      return this.i; 
    Iterator<bv> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      if (((bv)iterator.next()).n())
        return true; 
    } 
    return false;
  }
  
  public void g(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public boolean S() {
    if (this instanceof be)
      return true; 
    Iterator<bv> iterator = K();
    while (iterator.hasNext()) {
      bv bv1 = iterator.next();
      if (bv1 instanceof be || bv1.S())
        return true; 
    } 
    return false;
  }
  
  public boolean T() {
    if (this instanceof bm)
      return true; 
    Iterator<bv> iterator = K();
    while (iterator.hasNext()) {
      bv bv1 = iterator.next();
      if (bv1 instanceof bm || bv1.T())
        return true; 
    } 
    return false;
  }
  
  public List e() {
    ArrayList<String> arrayList = new ArrayList();
    if (this instanceof aS) {
      aS aS = (aS)this;
      arrayList.add(aS.d());
      arrayList.add(aS.g());
      arrayList.add(aS.f());
      arrayList.add(aS.m());
      arrayList.add(aS.i());
      arrayList.add(aS.j());
      arrayList.add(aS.k());
      arrayList.add(aS.l());
    } else if (aL() != null && (aL().equals("std_constants") || aL().equals("std_injection"))) {
      cY.a(aL(), arrayList);
    } else {
      for (bA bA : this.c) {
        if (bA instanceof bq) {
          bq bq = (bq)bA;
          if (bq.b() != null && bq.b().length() > 0)
            arrayList.add(bq.b()); 
        } 
      } 
      if (this.d.size() > 0) {
        Iterator<bv> iterator = this.d.iterator();
        while (iterator.hasNext()) {
          List<? extends String> list = ((bv)iterator.next()).e();
          arrayList.addAll(list);
        } 
      } 
    } 
    return arrayList;
  }
  
  public List U() {
    ArrayList arrayList = new ArrayList();
    arrayList.addAll(this.e);
    Iterator<bv> iterator = this.d.iterator();
    while (iterator.hasNext())
      arrayList.addAll(((bv)iterator.next()).U()); 
    return arrayList;
  }
  
  public String i(String paramString) {
    String str = null;
    for (bA bA : this.c) {
      if (bA.aL() != null && bA.aL().equals(paramString))
        return (bA.aJ() != null) ? bA.aJ() : ""; 
    } 
    for (bv bv1 : this.d) {
      str = bv1.i(paramString);
      if (str != null) {
        if (aJ() != null && aJ().length() > 0)
          str = str + " && (" + aJ() + ") "; 
        break;
      } 
    } 
    return str;
  }
  
  public String V() {
    return this.j;
  }
  
  public void x(String paramString) {
    this.j = paramString;
  }
  
  public boolean W() {
    return this.k;
  }
  
  public void h(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public String X() {
    if (this.l != null && !this.l.isEmpty())
      return this.l; 
    if (L())
      for (bv bv1 : this.d) {
        if (bv1.X() != null && !bv1.X().isEmpty())
          return bv1.X(); 
      }  
    return null;
  }
  
  public void y(String paramString) {
    this.l = paramString;
  }
  
  public boolean Y() {
    if (this.l != null && !this.l.isEmpty())
      return true; 
    if (L())
      for (bv bv1 : this.d) {
        if (bv1.Y())
          return true; 
      }  
    return false;
  }
  
  public int Z() {
    return this.d.size();
  }
  
  public bv j(int paramInt) {
    return this.d.get(paramInt);
  }
  
  public String aa() {
    return this.m;
  }
  
  public void z(String paramString) {
    this.m = paramString;
  }
  
  protected List a(ArrayList<String> paramArrayList) {
    if (this.m != null && !this.m.isEmpty())
      paramArrayList.add(this.m); 
    if (L())
      for (bv bv1 : this.d)
        bv1.a(paramArrayList);  
    return paramArrayList;
  }
  
  public List ab() {
    ArrayList arrayList = new ArrayList();
    return a(arrayList);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */