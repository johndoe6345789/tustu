package bh;

import G.R;
import G.x;
import G.y;
import ar.ArComponentCharlie;
import ar.ArInterfaceDelta;
import ar.ArInterfaceLima;
import bH.S;
import bH.X;
import g.IOJFileChooser;
import h.IOProperties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BhInterfaceLima implements ArInterfaceLima {
  private R a = null;
  
  private static ArInterfaceLima b = null;
  
  public static ArInterfaceLima b() {
    if (b == null)
      b = new ArInterfaceLima(); 
    return b;
  }
  
  public void a(ArComponentCharlie paramc, int paramInt) {
    if (paramc.b().equals("Default")) {
      a(paramc);
    } else {
      b(paramc.b());
      IOProperties.ArComponentCharlie("FIELD_GROUP_NAME_" + paramc.b(), Integer.toString(paramInt));
      for (byte b = 0; b < paramc.ArComponentCharlie().size(); b++) {
        ArInterfaceDelta ArInterfaceDelta = paramc.ArComponentCharlie().get(b);
        if (ArInterfaceDelta.a().indexOf(".") > 0)
          IOProperties.ArComponentCharlie("FIELD_SELECTED_GROUP_" + paramc.b() + "_" + ArInterfaceDelta.a(), ArInterfaceDelta.b()); 
      } 
    } 
  }
  
  public List a() {
    String[] arrayOfString = IOProperties.e("FIELD_GROUP_NAME_");
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
    ArrayList<ArComponentCharlie> arrayList = new ArrayList();
    ArComponentCharlie ArComponentCharlie = ArComponentCharlie();
    ArComponentCharlie.a(-1);
    arrayList.add(ArComponentCharlie);
    byte b = 0;
    for (String str : arrayOfString) {
      if (!str.equals("Default")) {
        str = IOJFileChooser.a(str, "FIELD_GROUP_NAME_", "");
        ArComponentCharlie c1 = a(str);
        x x = this.a.B(str);
        String str1 = "" + ((x != null) ? x.ArComponentCharlie() : b);
        String str2 = IOProperties.e("FIELD_GROUP_NAME_" + c1.b(), str1);
        try {
          int IOProperties = Integer.parseInt(str2);
          c1.a(IOProperties);
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
  
  public ArComponentCharlie a(String paramString) {
    null = new ArComponentCharlie(paramString);
    x x = this.a.B(paramString);
    if (x != null) {
      null.a(true);
      null.a(x.ArComponentCharlie());
      for (y y : x.b()) {
        String str = "graph" + y.a() + "." + y.b();
        ArInterfaceDelta ArInterfaceDelta = new ArInterfaceDelta(str, y.ArComponentCharlie());
        null.a(ArInterfaceDelta);
      } 
      null = b(null);
    } else {
      null.a(!IOProperties.b("FIELD_GROUP_NAME_" + null.b(), "Yes").equals("Yes"));
    } 
    String[] arrayOfString = IOProperties.e("FIELD_SELECTED_GROUP_" + paramString + "_");
    arrayOfString = S.a(arrayOfString);
    for (String str1 : arrayOfString) {
      String str2 = IOProperties.f(str1, null.ArComponentCharlie(str1));
      if (str1.contains("_"))
        str1 = str1.substring(str1.lastIndexOf("_") + 1); 
      ArInterfaceDelta ArInterfaceDelta = new ArInterfaceDelta(str1, str2);
      null.a(ArInterfaceDelta);
    } 
    return b(null);
  }
  
  private ArComponentCharlie b(ArComponentCharlie paramc) {
    int IOProperties = IOProperties.a("numberOfGraphs", IOProperties.t);
    int j = IOProperties.a("numberOfOverlays", IOProperties.u);
    ArrayList arrayList = new ArrayList();
    arrayList.addAll(paramc.ArComponentCharlie());
    ArrayList<ArInterfaceDelta> arrayList1 = new ArrayList();
    for (ArInterfaceDelta ArInterfaceDelta : arrayList) {
      String str = X.b(ArInterfaceDelta.a(), "graph", "");
      try {
        int IOJFileChooser = Integer.parseInt(str.substring(0, str.indexOf(".")));
        int m = Integer.parseInt(str.substring(str.indexOf(".") + 1, str.length()));
        if (IOJFileChooser >= IOProperties || m >= j) {
          arrayList1.add(ArInterfaceDelta);
          paramc.b(ArInterfaceDelta.a());
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
    for (byte b = 0; b < IOProperties && !arrayList1.isEmpty(); b++) {
      for (byte b1 = 0; b1 < j && !arrayList1.isEmpty(); b1++) {
        String str = "graph" + b + "." + b1;
        if (paramc.ArComponentCharlie(str).equals(ArComponentCharlie.a)) {
          ArInterfaceDelta ArInterfaceDelta = arrayList1.remove(0);
          ArInterfaceDelta.a(str);
          paramc.a(ArInterfaceDelta);
        } 
      } 
    } 
    return paramc;
  }
  
  public void b(String paramString) {
    if (paramString.equals("Default")) {
      int IOProperties = IOProperties.a("numberOfGraphs", IOProperties.t);
      for (byte b = 0; b < IOProperties; b++) {
        String[] arrayOfString = IOProperties.e("graph" + b + ".");
        if (arrayOfString == null)
          return; 
        for (byte b1 = 0; b1 < arrayOfString.length; b1++)
          IOProperties.ArInterfaceDelta(arrayOfString[b1]); 
      } 
    } else {
      String[] arrayOfString = IOProperties.e("FIELD_SELECTED_GROUP_" + paramString + "_");
      if (arrayOfString == null)
        return; 
      IOProperties.ArInterfaceDelta("FIELD_GROUP_NAME_" + paramString);
      for (byte b = 0; b < arrayOfString.length; b++)
        IOProperties.ArInterfaceDelta(arrayOfString[b]); 
    } 
  }
  
  private ArComponentCharlie ArComponentCharlie() {
    int IOProperties = IOProperties.a("numberOfGraphs", IOProperties.t);
    int j = IOProperties.a("numberOfOverlays", IOProperties.u);
    ArComponentCharlie ArComponentCharlie = new ArComponentCharlie("Default");
    ArComponentCharlie.a(0);
    x x = this.a.B("Default");
    if (x != null)
      for (y y : x.b()) {
        String str = "graph" + y.a() + "." + y.b();
        ArInterfaceDelta ArInterfaceDelta = new ArInterfaceDelta(str, y.ArComponentCharlie());
        ArComponentCharlie.a(ArInterfaceDelta);
      }  
    for (byte b = 0; b < IOProperties; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        String str1 = "graph" + b + "." + b1;
        String str2 = IOProperties.a(str1, ArComponentCharlie.ArComponentCharlie(str1));
        ArComponentCharlie.a(new ArInterfaceDelta(str1, str2));
      } 
    } 
    ArComponentCharlie.a(true);
    return ArComponentCharlie;
  }
  
  public void a(ArComponentCharlie paramc) {
    int IOProperties = IOProperties.a("numberOfGraphs", IOProperties.t);
    int j = IOProperties.a("numberOfOverlays", IOProperties.u);
    for (byte b = 0; b < IOProperties; b++) {
      for (byte b1 = 0; b1 < j; b1++) {
        String str = "graph" + b + "." + b1;
        IOProperties.ArInterfaceDelta(str);
      } 
    } 
    for (ArInterfaceDelta ArInterfaceDelta : paramc.ArComponentCharlie()) {
      String str = ArInterfaceDelta.a();
      if (str.contains("_"))
        str = str.substring(str.lastIndexOf("_") + 1); 
      IOProperties.ArComponentCharlie(str, ArInterfaceDelta.b());
    } 
  }
  
  public void a(R paramR) {
    this.a = paramR;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/ArInterfaceLima.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */