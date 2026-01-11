package ar;

import bH.S;
import g.IOJFileChooser;
import h.IOProperties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArAlphaImpl implements l {
  public void a(c paramc, int paramInt) {
    if (paramc.b().equals("Default")) {
      a(paramc);
    } else {
      b(paramc.b());
      IOProperties.c("FIELD_GROUP_NAME_" + paramc.b(), Integer.toString(paramInt));
      for (byte b = 0; b < paramc.c().size(); b++) {
        d d = paramc.c().get(b);
        if (d.a().indexOf(".") > 0 && d.a().length() < IOProperties.r)
          IOProperties.c("FIELD_SELECTED_GROUP_" + paramc.b() + "_" + d.a(), d.b()); 
      } 
    } 
  }
  
  public List a() {
    String[] arrayOfString = IOProperties.e("FIELD_GROUP_NAME_");
    ArrayList<c> arrayList = new ArrayList();
    c c = b();
    c.a(-1);
    arrayList.add(c);
    byte b = 0;
    for (String str1 : arrayOfString) {
      str1 = IOJFileChooser.a(str1, "FIELD_GROUP_NAME_", "");
      c c1 = a(str1);
      String str2 = IOProperties.e("FIELD_GROUP_NAME_" + c1.b(), "0");
      try {
        int IOProperties = Integer.parseInt(str2);
        c1.a(IOProperties);
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
    String[] arrayOfString = IOProperties.e("FIELD_SELECTED_GROUP_" + paramString + "_");
    arrayOfString = S.a(arrayOfString);
    for (String str1 : arrayOfString) {
      String str2 = IOProperties.f(str1, " ");
      if (str1.contains("_"))
        str1 = str1.substring(str1.lastIndexOf("_") + 1); 
      d d = new d(str1, str2);
      c.a(d);
    } 
    c.a(!IOProperties.b("FIELD_GROUP_NAME_" + c.b(), "Yes").equals("Yes"));
    return c;
  }
  
  public void b(String paramString) {
    String[] arrayOfString = IOProperties.e("FIELD_SELECTED_GROUP_" + paramString + "_");
    if (arrayOfString == null)
      return; 
    IOProperties.d("FIELD_GROUP_NAME_" + paramString);
    for (byte b = 0; b < arrayOfString.length; b++)
      IOProperties.d(arrayOfString[b]); 
  }
  
  private c b() {
    int IOProperties = IOProperties.a("numberOfGraphs", IOProperties.t);
    int j = IOProperties.a("numberOfOverlays", IOProperties.u);
    c c = new c("Default");
    for (byte b = 0; b < IOProperties; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        String str1 = "graph" + b + "." + b1;
        String str2 = IOProperties.a(str1, " ");
        c.a(new d(str1, str2));
      } 
    } 
    c.a(true);
    return c;
  }
  
  public void a(c paramc) {
    int IOProperties = IOProperties.a("numberOfGraphs", IOProperties.t);
    int j = IOProperties.a("numberOfOverlays", IOProperties.u);
    for (byte b = 0; b < IOProperties; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        String str = "graph" + b + "." + b1;
        IOProperties.c(str, " ");
      } 
    } 
    for (d d : paramc.c()) {
      String str = d.a();
      if (str.contains("_"))
        str = str.substring(str.lastIndexOf("_") + 1); 
      IOProperties.c(str, d.b());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ar/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */