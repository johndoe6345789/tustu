package ao;

import W.j;
import ar.c;
import ar.f;
import h.g;
import h.i;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class A implements bn {
  ArrayList a = new ArrayList();
  
  int b = i.a("numberOfGraphs", i.t);
  
  int c = i.a("numberOfOverlays", i.u);
  
  HashMap d = new HashMap<>();
  
  B e = new B(this);
  
  public A() {
    f.a().a(new C(this));
  }
  
  protected void a(String paramString1, String paramString2, int paramInt) {
    for (bl bl : this.a)
      bl.a(paramString1, paramString2, paramInt); 
  }
  
  protected void a(String paramString, j paramj, int paramInt) {
    for (bl bl : this.a)
      bl.a(paramString, paramj, paramInt); 
  }
  
  private List a(int paramInt) {
    String str = c(paramInt);
    List<B> list = (List)this.d.get(str);
    if (list == null)
      list = new CopyOnWriteArrayList(); 
    if (list.isEmpty()) {
      for (byte b = 0; b < this.c; b++)
        list.add(this.e); 
      this.d.put(str, list);
    } 
    return list;
  }
  
  private int b(int paramInt) {
    List<B> list = a(paramInt);
    for (byte b = 0; b < this.c; b++) {
      if (b >= list.size() || ((B)list.get(b)).a())
        return b; 
    } 
    return -1;
  }
  
  private int c() {
    for (byte b = 0; b < this.b; b++) {
      List<B> list = a(b);
      for (byte b1 = 0; b1 < this.c; b1++) {
        if (b1 >= list.size() || ((B)list.get(b1)).a())
          return b; 
      } 
    } 
    return -1;
  }
  
  private String c(int paramInt) {
    return "graph" + paramInt;
  }
  
  private String a(int paramInt1, int paramInt2) {
    return "graph" + paramInt1 + "." + paramInt2;
  }
  
  public Color a(String paramString) {
    return a(paramString, (Color)null);
  }
  
  public Color a(String paramString, Color paramColor) {
    int i = c();
    return (i >= 0) ? a(paramString, paramColor, i) : null;
  }
  
  public Color a(String paramString, Color paramColor, int paramInt) {
    int i;
    for (i = b(paramInt); i < 0 && ++paramInt < this.b; i = b(paramInt));
    return a(paramString, paramColor, paramInt, i);
  }
  
  public Color a(String paramString, Color paramColor, int paramInt1, int paramInt2) {
    if (paramInt1 == -1)
      paramInt1 = this.b - 1; 
    if (paramInt2 == -1 || paramInt2 >= this.c)
      paramInt2 = this.c - 1; 
    if (paramColor == null) {
      paramColor = aV.a().a(paramInt1, paramInt2);
    } else {
      aV.a().a(paramColor, paramInt1, paramInt2);
    } 
    String str = c(paramInt1);
    j j = hx.a().r().a(paramString);
    a(str, j, paramInt2);
    a(paramString, a(paramInt1, paramInt2));
    List<B> list = a(paramInt1);
    B b = new B(this);
    b.c = paramString;
    b.a = paramInt1;
    b.b = paramInt2;
    list.set(paramInt2, b);
    return paramColor;
  }
  
  public void b(String paramString) {
    for (byte b = 0; b < this.b; b++) {
      List<B> list = a(b);
      for (byte b1 = 0; b1 < this.c; b1++) {
        if (b1 < list.size() && list.get(b1) != null && ((B)list.get(b1)).c.equals(paramString)) {
          list.set(b1, this.e);
          a(" ", a(b, b1));
          a(c(b), paramString, b1);
        } 
      } 
    } 
  }
  
  public void a(bl parambl) {
    this.a.add(parambl);
  }
  
  public void b(bl parambl) {
    this.a.remove(parambl);
  }
  
  public void a() {
    hx hx = hx.a();
    String[] arrayOfString = (String[])this.d.keySet().toArray((Object[])new String[this.d.keySet().size()]);
    for (String str1 : arrayOfString) {
      List list = (List)this.d.get(str1);
      for (B b1 : list)
        b(b1.c); 
    } 
    this.d.clear();
    String str = f.a().g();
    c c = null;
    if (str != null)
      c = f.a().c(str); 
    if (c == null || hx.r() == null)
      return; 
    for (byte b = 0; b < this.b; b++) {
      for (byte b1 = 0; b1 < this.c; b1++) {
        String str1 = "graph" + b + "." + b1;
        String str2 = c.c(str1);
        if (!str2.equals(" ")) {
          if (str2.indexOf("Field.") != -1)
            str2 = g.a().a(str2); 
          if (hx.r().a(str2) != null)
            a(str2, null, b, b1); 
        } 
      } 
    } 
  }
  
  protected void a(String paramString1, String paramString2) {
    j j = hx.a().r().a(paramString1);
    String str = g.a().e(paramString1);
    if (str != null && !str.equals(""))
      paramString1 = "Field." + str; 
    bm.a().a(paramString2, j);
  }
  
  public void a(Color paramColor) {}
  
  public void a(Color paramColor, int paramInt) {}
  
  public void b() {
    for (byte b = 0; b < this.b; b++) {
      List<B> list = a(b);
      for (byte b1 = 0; b1 < this.c; b1++) {
        if (b1 < list.size() && list.get(b1) != null) {
          String str = ((B)list.get(b1)).c;
          list.set(b1, this.e);
          a(" ", a(b, b1));
          a(c(b), str, b1);
        } 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */