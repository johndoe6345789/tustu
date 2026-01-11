package k;

import L.V;
import W.j;
import W.n;
import ax.AxInterfaceFoxtrot;
import ax.AxInterfaceHotel;
import ax.ArrayListUsingPattern;
import ax.ExceptionInAxPackage;
import bH.D;
import bH.X;
import HInterfaceHotel.HInterfaceHotel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KInterfaceAlpha extends ArrayListUsingPattern {
  String[] a = null;
  
  Map b = new HashMap<>();
  
  String c = null;
  
  public KInterfaceAlpha(String paramString) {
    this.c = paramString;
    byte b = 0;
    paramString = X.b(paramString, "Math.", "");
    paramString = X.a(paramString, " AND ", " && ");
    for (paramString = X.a(paramString, " OR ", " || "); paramString.indexOf("[") != -1; paramString = str3 + str4 + str1) {
      String str4;
      String str1 = paramString.substring(paramString.indexOf("]") + 1);
      String str2 = paramString.substring(paramString.lastIndexOf("[", paramString.indexOf("]")), paramString.indexOf("]") + 1);
      String str3 = paramString.substring(0, paramString.lastIndexOf("[", paramString.indexOf("]")));
      b b1 = c(str2);
      if (b1.b() != 0) {
        str4 = "TimeShiftVariableAlias" + b++;
      } else {
        str4 = "TimeShiftVariableAlias" + b++;
      } 
      this.b.put(str4, b1);
    } 
    paramString = d(paramString);
    a(paramString);
  }
  
  public double a(n paramn, int paramInt) {
    String[] arrayOfString = a();
    for (byte b = 0; b < arrayOfString.length; b++) {
      try {
        float f;
        String str = arrayOfString[b];
        if (str.startsWith("TimeShiftVariableAlias") && this.b.get(str) != null) {
          b b1 = (b)this.b.get(str);
          f = a(b1.a(), paramn, paramInt, b1.b());
        } else {
          f = a(str, paramn, paramInt, 0);
        } 
        a(arrayOfString[b], f);
      } catch (AxInterfaceHotel HInterfaceHotel) {
        D.c("Error setting variable '" + arrayOfString[b] + "' in formula:\n" + super.c());
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)HInterfaceHotel);
      } catch (AxInterfaceFoxtrot f) {
        D.c("Error setting variable '" + arrayOfString[b] + "' in formula:\n" + super.c());
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)f);
      } 
    } 
    return d();
  }
  
  public String[] a() {
    if (this.a == null || this.a.length == 0)
      this.a = super.a(); 
    return this.a;
  }
  
  public String[] b() {
    ArrayList<String> arrayList = new ArrayList();
    for (b b : this.b.values())
      arrayList.add(b.a()); 
    return arrayList.<String>toArray(new String[arrayList.size()]);
  }
  
  protected float a(String paramString, n paramn, int paramInt1, int paramInt2) {
    j j = paramn.a(paramString);
    if (j != null) {
      if (j.v() <= 0)
        return Float.NaN; 
      if (paramInt1 + paramInt2 < 0)
        return j.c(0); 
      if (paramInt1 + paramInt2 >= 0 && paramInt1 + paramInt2 > j.i() - 1)
        return j.c(j.i() - 1); 
      if (paramInt1 + paramInt2 >= 0)
        return j.c(paramInt1 + paramInt2); 
    } else {
      throw new ExceptionInAxPackage("Field: " + paramString + " not found in currently loaded data set.\n this field is required to evaluate expression:\n" + this.c + "\n\nPlease make sure any Option fields required for this expression are turned on.");
    } 
    return 0.0F;
  }
  
  private b c(String paramString) {
    int i = 0;
    b b = new b(this);
    if (paramString.startsWith("[") && paramString.endsWith("]")) {
      paramString = paramString.substring(1, paramString.length() - 1);
      int j = paramString.indexOf("-");
      if (j > 0) {
        String str = paramString.substring(j + 1);
        paramString = paramString.substring(0, j);
        i -= Integer.parseInt(str);
      } else if (paramString.indexOf("+") > 0) {
        j = paramString.indexOf("+");
        String str = paramString.substring(j + 1);
        paramString = paramString.substring(0, j);
        i += Integer.parseInt(str);
      } 
    } 
    b.a(paramString);
    b.a(i);
    return b;
  }
  
  private String d(String paramString) {
    int i = paramString.indexOf("table(");
    if (i == -1)
      return paramString; 
    while (i != -1) {
      Long long_;
      String str1 = paramString.substring(0, paramString.indexOf("table("));
      int j = paramString.indexOf("(", paramString.indexOf("table")) + 1;
      int k = paramString.indexOf(",", j);
      String str2 = paramString.substring(j, k).trim();
      int m = paramString.indexOf(")", k);
      String str3 = paramString.substring(k + 1, m).trim();
      String str4 = HInterfaceHotel.c().getAbsolutePath();
      str3 = X.b(str3, "\"", "");
      String str5 = paramString.substring(m + 1);
      try {
        long_ = V.a().a(str4, str3);
      } catch (FileNotFoundException fileNotFoundException) {
        c c = new c(fileNotFoundException.getLocalizedMessage(), fileNotFoundException);
        c.a(new File(str3));
        throw c;
      } 
      paramString = str1 + " table(" + str2 + ", " + long_ + " ) " + str5;
      i = paramString.indexOf("table(", i + 6);
    } 
    return paramString;
  }
  
  public String c() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/k/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */