package bh;

import G.R;
import G.x;
import G.y;
import ar.c;
import ar.d;
import ar.l;
import bH.S;
import bH.X;
import g.k;
import h.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class l implements l {
  private R a = null;
  
  private static l b = null;
  
  public static l b() {
    if (b == null)
      b = new l(); 
    return b;
  }
  
  public void a(c paramc, int paramInt) {
    if (paramc.b().equals("Default")) {
      a(paramc);
    } else {
      b(paramc.b());
      i.c("FIELD_GROUP_NAME_" + paramc.b(), Integer.toString(paramInt));
      for (byte b = 0; b < paramc.c().size(); b++) {
        d d = paramc.c().get(b);
        if (d.a().indexOf(".") > 0)
          i.c("FIELD_SELECTED_GROUP_" + paramc.b() + "_" + d.a(), d.b()); 
      } 
    } 
  }
  
  public List a() {
    String[] arrayOfString = i.e("FIELD_GROUP_NAME_");
    if (this.a != null && !this.a.ad().isEmpty()) {
      ArrayList<String> arrayList1 = new ArrayList();
      for (x x : this.a.ad())
        arrayList1.add(x.a()); 
      for (String str : arrayOfString) {
        str = X.b(str, "FIELD_GROUP_NAME_", "");
        if (!arrayList1.contains(str))
          arrayList1.add(str); 
      } 
      arrayOfString = arrayList1.<String>toArray(new String[arrayList1.size()]);
    } 
    ArrayList<c> arrayList = new ArrayList();
    c c = c();
    c.a(-1);
    arrayList.add(c);
    byte b = 0;
    for (String str : arrayOfString) {
      if (!str.equals("Default")) {
        str = k.a(str, "FIELD_GROUP_NAME_", "");
        c c1 = a(str);
        x x = this.a.B(str);
        String str1 = "" + ((x != null) ? x.c() : b);
        String str2 = i.e("FIELD_GROUP_NAME_" + c1.b(), str1);
        try {
          int i = Integer.parseInt(str2);
          c1.a(i);
          b++;
        } catch (Exception exception) {
          c1.a(b++);
        } 
        arrayList.add(c1);
      } 
    } 
    Collections.sort(arrayList, new m(this));
    return arrayList;
  }
  
  public c a(String paramString) {
    null = new c(paramString);
    x x = this.a.B(paramString);
    if (x != null) {
      null.a(true);
      null.a(x.c());
      for (y y : x.b()) {
        String str = "graph" + y.a() + "." + y.b();
        d d = new d(str, y.c());
        null.a(d);
      } 
      null = b(null);
    } else {
      null.a(!i.b("FIELD_GROUP_NAME_" + null.b(), "Yes").equals("Yes"));
    } 
    String[] arrayOfString = i.e("FIELD_SELECTED_GROUP_" + paramString + "_");
    arrayOfString = S.a(arrayOfString);
    for (String str1 : arrayOfString) {
      String str2 = i.f(str1, null.c(str1));
      if (str1.contains("_"))
        str1 = str1.substring(str1.lastIndexOf("_") + 1); 
      d d = new d(str1, str2);
      null.a(d);
    } 
    return b(null);
  }
  
  private c b(c paramc) {
    int i = i.a("numberOfGraphs", i.t);
    int j = i.a("numberOfOverlays", i.u);
    ArrayList arrayList = new ArrayList();
    arrayList.addAll(paramc.c());
    ArrayList<d> arrayList1 = new ArrayList();
    for (d d : arrayList) {
      String str = X.b(d.a(), "graph", "");
      try {
        int k = Integer.parseInt(str.substring(0, str.indexOf(".")));
        int m = Integer.parseInt(str.substring(str.indexOf(".") + 1, str.length()));
        if (k >= i || m >= j) {
          arrayList1.add(d);
          paramc.b(d.a());
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
    for (byte b = 0; b < i && !arrayList1.isEmpty(); b++) {
      for (byte b1 = 0; b1 < j && !arrayList1.isEmpty(); b1++) {
        String str = "graph" + b + "." + b1;
        if (paramc.c(str).equals(c.a)) {
          d d = arrayList1.remove(0);
          d.a(str);
          paramc.a(d);
        } 
      } 
    } 
    return paramc;
  }
  
  public void b(String paramString) {
    if (paramString.equals("Default")) {
      int i = i.a("numberOfGraphs", i.t);
      for (byte b = 0; b < i; b++) {
        String[] arrayOfString = i.e("graph" + b + ".");
        if (arrayOfString == null)
          return; 
        for (byte b1 = 0; b1 < arrayOfString.length; b1++)
          i.d(arrayOfString[b1]); 
      } 
    } else {
      String[] arrayOfString = i.e("FIELD_SELECTED_GROUP_" + paramString + "_");
      if (arrayOfString == null)
        return; 
      i.d("FIELD_GROUP_NAME_" + paramString);
      for (byte b = 0; b < arrayOfString.length; b++)
        i.d(arrayOfString[b]); 
    } 
  }
  
  private c c() {
    int i = i.a("numberOfGraphs", i.t);
    int j = i.a("numberOfOverlays", i.u);
    c c = new c("Default");
    c.a(0);
    x x = this.a.B("Default");
    if (x != null)
      for (y y : x.b()) {
        String str = "graph" + y.a() + "." + y.b();
        d d = new d(str, y.c());
        c.a(d);
      }  
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        String str1 = "graph" + b + "." + b1;
        String str2 = i.a(str1, c.c(str1));
        c.a(new d(str1, str2));
      } 
    } 
    c.a(true);
    return c;
  }
  
  public void a(c paramc) {
    int i = i.a("numberOfGraphs", i.t);
    int j = i.a("numberOfOverlays", i.u);
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        String str = "graph" + b + "." + b1;
        i.d(str);
      } 
    } 
    for (d d : paramc.c()) {
      String str = d.a();
      if (str.contains("_"))
        str = str.substring(str.lastIndexOf("_") + 1); 
      i.c(str, d.b());
    } 
  }
  
  public void a(R paramR) {
    this.a = paramR;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */