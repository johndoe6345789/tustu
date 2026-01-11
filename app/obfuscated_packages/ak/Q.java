package ak;

import V.a;
import V.f;
import W.T;
import bH.D;
import bH.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Q extends S {
  public Q() {
    super(",", false);
  }
  
  public Iterator b() {
    while (this.g.isEmpty()) {
      String str = null;
      try {
        str = l();
      } catch (IOException iOException) {
        iOException.printStackTrace();
        throw new a("IO Error reading header rows from file.");
      } catch (a a) {
        a.printStackTrace();
        throw new a("No Valid Data found in file");
      } 
      byte b1 = 0;
      String[] arrayOfString = n();
      boolean bool = (arrayOfString == null || arrayOfString.length == 0) ? true : false;
      byte b2 = 0;
      if (!bool)
        for (String str1 : arrayOfString) {
          if (!str1.isEmpty() && ++b2 > 5) {
            bool = false;
            break;
          } 
        }  
      ArrayList<String> arrayList1 = new ArrayList();
      if (str.startsWith("Date,Time,")) {
        str = str.substring(10);
        arrayList1.add("Date");
        arrayList1.add("Time");
        for (String str1 : str.split(Pattern.quote("\",\"")))
          arrayList1.add(str1); 
      } 
      for (String str1 : arrayList1) {
        d d1 = new d();
        str1 = str1.trim();
        if (str1.startsWith("\"") || str1.endsWith("\""))
          str1 = X.b(str1, "\"", "").trim(); 
        if (str1.isEmpty())
          str1 = "Col" + b1; 
        if (str1.contains("-"))
          str1 = X.b(str1, "-", " "); 
        while (str1.contains("  "))
          str1 = X.b(str1, "  ", " "); 
        if (str1.equals("Time")) {
          d1.a(3);
          d1.a("Time");
          d1.b("s");
          str1 = "Time";
        } 
        try {
          if (str1.lastIndexOf("[") > 1 && str1.lastIndexOf("]") > str1.lastIndexOf("[")) {
            int i = str1.lastIndexOf("[");
            int j = str1.indexOf("]", i);
            String str4 = str1.substring(i + 1, j).trim();
            d1.b(str4);
            str1 = (str1.substring(0, i) + str1.substring(j + 1, str1.length())).trim();
            this.t = true;
          } else if (str1.lastIndexOf("(") > 1 && str1.lastIndexOf(")") > str1.lastIndexOf("(")) {
            int i = str1.lastIndexOf("(");
            int j = str1.indexOf(")", i);
            String str4 = str1.substring(i + 1, j).trim();
            d1.b(str4);
            str1 = (str1.substring(0, i) + str1.substring(j + 1, str1.length())).trim();
          } 
        } catch (Exception exception) {
          D.c("Thought I could parse units, but it failed on field \"" + str1 + "\"");
        } 
        String str2 = d1.b();
        if (str2 != null)
          if (str2.equals("On/Off")) {
            d1.b(4);
          } else if (str2.equals("High/Low")) {
            d1.b(6);
          } else if (str2.equals("Active/Inactive") || str2.equals("Act/Inact")) {
            d1.b(7);
          } else if (str2.equals("Yes/No")) {
            d1.b(5);
          } else if (str2.equals("True/False")) {
            d1.b(8);
          }  
        while (str1.endsWith("*"))
          str1 = str1.substring(0, str1.length() - 1); 
        if (str1.contains("|")) {
          str1 = str1.substring(0, str1.indexOf('|'));
          this.t = true;
        } 
        str1 = str1.trim();
        String str3 = str1;
        for (byte b = 0; b < 100 && i(str3); b++)
          str3 = str1 + b; 
        str1 = str3;
        d1.a(str1);
        d d2 = a(d1);
        if (d2 != null) {
          this.g.add(d2);
          b1++;
        } 
      } 
    } 
    this.r = r() + r();
    this.s = r() + " " + r();
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.g.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList.iterator();
  }
  
  protected String l() {
    if (p()) {
      a(false);
      return this.o;
    } 
    this.o = this.n;
    do {
      this.n = this.e.a();
    } while (this.n != null && this.n.isEmpty() && this.n.indexOf(r()) == -1);
    this.p++;
    if (this.o == null)
      throw new f("No records available."); 
    if (this.n != null && this.n.startsWith("Date,Time")) {
      String str = this.o;
      q();
      this.n = null;
      this.o = str;
    } 
    if (this.g.size() > 0 && this.o.trim().equals("")) {
      this.o = "MARK Corrupt file blank record";
      System.out.println("Found a bad row");
    } 
    return this.o;
  }
  
  protected int b(String paramString) {
    return 0;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */