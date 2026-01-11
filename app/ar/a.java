package ar;

import bH.S;
import g.k;
import h.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a implements l {
  public void a(c paramc, int paramInt) {
    if (paramc.b().equals("Default")) {
      a(paramc);
    } else {
      b(paramc.b());
      i.c("FIELD_GROUP_NAME_" + paramc.b(), Integer.toString(paramInt));
      for (byte b = 0; b < paramc.c().size(); b++) {
        d d = paramc.c().get(b);
        if (d.a().indexOf(".") > 0 && d.a().length() < i.r)
          i.c("FIELD_SELECTED_GROUP_" + paramc.b() + "_" + d.a(), d.b()); 
      } 
    } 
  }
  
  public List a() {
    String[] arrayOfString = i.e("FIELD_GROUP_NAME_");
    ArrayList<c> arrayList = new ArrayList();
    c c = b();
    c.a(-1);
    arrayList.add(c);
    byte b = 0;
    for (String str1 : arrayOfString) {
      str1 = k.a(str1, "FIELD_GROUP_NAME_", "");
      c c1 = a(str1);
      String str2 = i.e("FIELD_GROUP_NAME_" + c1.b(), "0");
      try {
        int i = Integer.parseInt(str2);
        c1.a(i);
        b++;
      } catch (Exception exception) {
        c1.a(b++);
      } 
      arrayList.add(c1);
    } 
    Collections.sort(arrayList, new b(this));
    return arrayList;
  }
  
  public c a(String paramString) {
    c c = new c(paramString);
    String[] arrayOfString = i.e("FIELD_SELECTED_GROUP_" + paramString + "_");
    arrayOfString = S.a(arrayOfString);
    for (String str1 : arrayOfString) {
      String str2 = i.f(str1, " ");
      if (str1.contains("_"))
        str1 = str1.substring(str1.lastIndexOf("_") + 1); 
      d d = new d(str1, str2);
      c.a(d);
    } 
    c.a(!i.b("FIELD_GROUP_NAME_" + c.b(), "Yes").equals("Yes"));
    return c;
  }
  
  public void b(String paramString) {
    String[] arrayOfString = i.e("FIELD_SELECTED_GROUP_" + paramString + "_");
    if (arrayOfString == null)
      return; 
    i.d("FIELD_GROUP_NAME_" + paramString);
    for (byte b = 0; b < arrayOfString.length; b++)
      i.d(arrayOfString[b]); 
  }
  
  private c b() {
    int i = i.a("numberOfGraphs", i.t);
    int j = i.a("numberOfOverlays", i.u);
    c c = new c("Default");
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        String str1 = "graph" + b + "." + b1;
        String str2 = i.a(str1, " ");
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
        i.c(str, " ");
      } 
    } 
    for (d d : paramc.c()) {
      String str = d.a();
      if (str.contains("_"))
        str = str.substring(str.lastIndexOf("_") + 1); 
      i.c(str, d.b());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ar/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */